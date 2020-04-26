package com.kuebiko.it.design.bidurFarm;

import com.kuebiko.it.design.bidurFarm.exception.NotYetImplementedException;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
//In chicken class load the value `HATCHING_PERIOD_MINS` = `incubation.period.minutes.chicken` from `src/main/resources/farm/bird.properties`

public class Chicken implements Bird {

    private final String name;
    private static final long HATCHING_PERIOD_MINS = 13;  //initialize();

    /*static long initialize() {
        Properties prop = new Properties();
        InputStream stream = Bird.class.getClassLoader().getResourceAsStream("bird.properties");
        if (stream == null) {
            System.out.println(" cannot find file!!");
        }
        try {
            prop.load(stream);
        } catch (Exception e) {
            throw new NotYetImplementedException("get from src/main/resources/bidurfarm/bird.properties");
        }
        String time = prop.getProperty("incubation.period.minutes.chicken");
        return Long.parseLong(time);
    }*/

    private List<Egg> eggs = new ArrayList<>(100);
    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public Egg lay() throws ExecutionException, InterruptedException {
        System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));
        eggs.add(new Egg(this));
        System.out.println(String.format("total egg count is %s", eggs.size()));
        hatchingEggScheduler();
        throw new NotYetImplementedException("add it to eggs after its laid");
    }
    public void hatchingEggScheduler(){
        Callable<Bird> birdCallable = () -> this;
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        Future<Bird> birdFuture = executorService.schedule(birdCallable, HATCHING_PERIOD_MINS, TimeUnit.SECONDS);
        Egg hatchedEgg = new Egg(()->birdFuture.get());
        writeInCsv(hatchedEgg.getBird().toString(),LocalDateTime.now().toString());
    }

    private void writeInCsv(String hatchedbird,String date) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter("src/main/resources/farm/egg.csv",true));
            String[] data = {hatchedbird,date};
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return  name;
    }
}
