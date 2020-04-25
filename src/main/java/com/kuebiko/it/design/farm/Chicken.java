package com.kuebiko.it.design.farm;

import au.com.bytecode.opencsv.CSVWriter;
import com.kuebiko.it.design.farm.exception.NotYetImplementedException;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.*;

public class Chicken implements Bird {

    private final String name;

    private static final long HATCHING_PERIOD_MINS = initialize();

    private List<Egg> eggs = new ArrayList<>(100);

    public Chicken(String name) {
        this.name = name;
    }

    static long initialize() {
        InputStream is;
        Properties prop = null;
        try {
            prop = new Properties();
            is = new FileInputStream(new File("src/main/resources/farm/bird.properties"));
            prop.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Long.parseLong(prop.getProperty("incubation.period.minutes.chicken"));
    }

    @Override
    public Egg lay() throws Exception {
        System.out.println(String.format("%s laid an egg at %s", name, LocalDateTime.now()));

        Egg egg = new Egg(this::Onhatching);
        String time = LocalDateTime.now().toString();
        System.out.println(String.format("%s hatch an egg at %s", egg.getBird(), time));
        eggs.add(egg);


        //Writing egg type and hatched time to the egg.csv file
        File file = new File("src/main/resources/farm/egg.csv");
        CSVWriter writer = new CSVWriter(new FileWriter(file, true));
        String[] record = {String.valueOf(egg.getBird()),  time};
        writer.writeNext(record);

        writer.close();



        return egg;

        //System.out.println(String.format("total egg count is %s", eggs.size()));
    }

    private Chicken Onhatching(){
        try {
            TimeUnit.MINUTES.sleep(HATCHING_PERIOD_MINS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                '}';
    }


}
