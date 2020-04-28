package com.kuebiko.it.design.farm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Chicken implements Bird {

    private final String name;

    private static final long HATCHING_PERIOD_MINS = initialize();

    private List<Egg> eggs = new ArrayList<>(100);

    public Chicken(String name) {
        this.name = name;
    }

    //initialized method
    static long initialize() {
        FileInputStream fileInputStream = null;
        Properties properties = null;
        try {
            fileInputStream = new FileInputStream("src/main/resources/farm/bird.properties");
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        String incubation_period = properties.getProperty("incubation.period.minutes.chicken");
        long timer = Integer.parseInt(incubation_period);
        return timer;
    }


    @Override
    public Egg lay() {
        System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));
        Egg egg = new Egg(this::chickenCallable);
        System.out.println("hatched egg" + egg.getBird().toString());

        return egg;

//        throw new NotYetImplementedException("add it to eggs after its laid");

        //System.out.println(String.format("total egg count is %s", eggs.size()));
    }

    private Chicken chickenCallable(){
        try {
            Thread.sleep(HATCHING_PERIOD_MINS*1000);
            return this;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                '}';
    }


}
