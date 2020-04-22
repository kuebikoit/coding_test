package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.utils.FilePath;
import com.opencsv.CSVWriter;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
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

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                '}';
    }

    static long initialize() {
        Long incubationChicken = 0l;
        try (InputStream input = new FileInputStream(FilePath.Property_FilePath)) {
            Properties prop = new Properties();
            prop.load(input);
            incubationChicken = Long.parseLong(prop.getProperty("incubation.period.minutes.chicken"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return incubationChicken;
    }

    public Bird getHatchedBird(Future<Bird> birdFuture) throws ExecutionException, InterruptedException {
        return birdFuture.get();
    }

    //test
    @Override
    public Egg lay() throws ExecutionException, InterruptedException, IOException {
        System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        Future<Bird> birdFuture = scheduler.schedule(() -> new Chicken(name), HATCHING_PERIOD_MINS, TimeUnit.SECONDS);
        Egg egg = new Egg(() -> getHatchedBird(birdFuture));
        writeInCsvFile(FilePath.CSV_FilePath, egg.getBird().toString(), LocalDateTime.now());
        eggs.add(egg);
        System.out.println(String.format("total egg count is %s", eggs.size()));
        return egg;
    }

    public static void writeInCsvFile(String filePath, String birdType, LocalDateTime hatchedTime) throws IOException {

        try (FileWriter outputfile = new FileWriter(filePath, true);
             CSVWriter writer = new CSVWriter(outputfile)) {
            String[] data = {birdType, hatchedTime.toString()};
            writer.writeNext(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

