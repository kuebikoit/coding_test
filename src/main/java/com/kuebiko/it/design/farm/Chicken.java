package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;
import com.opencsv.CSVWriter;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.MINUTES;
//* In chicken class load the value `HATCHING_PERIOD_MINS` = `incubation.period.minutes.chicken` from `src/main/resources/farm/bird.properties`

public class Chicken implements Bird {

    private final String name;

    private static final long HATCHING_PERIOD_MINS = initialize();

    private List<Egg> eggs = new ArrayList<>(100);


    public Chicken(String name) {
        this.name = name;
    }


    static long initialize() {

        Properties property = new Properties();
        try (InputStream input = new FileInputStream("C:\\Users\\bhask\\IdeaProjects\\secondTest\\coding_test\\src\\main\\resources\\farm\\bird.properties")) {
            property = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find bird.properties");
            }

            property.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Long.parseLong(property.getProperty("incubation.period.seconds.chicken"));
        // new NotYetImplementedException("get from src/main/resources/farm/bird.properties");
    }

    //* In chicken class implement method `lay()`, use `HATCHING_PERIOD_MINS` when the egg is laid in a way when that period expires the `isAlreadyHatched` is `true` in `Egg` class
    @Override
    public Egg lay() {
        System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));
        Egg egg = null;
        try {
            egg = new Egg(() -> new Chicken(name));
            eggs.add(egg);
            //sending the newBorningCallableBird to the Egg class, where it waits and then hatches and adding to the List
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        //After egg is laid, first thing put the laid egg inside the ArrayList above and send that egg into a scheduledThreadEgg for hatching after certain time.
        try {
                ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
                //makes scheduledTasks--> scheduledTask because, we will have to wait for 21 minutes before doing some task, and so ScheduledFuture returned type.

                ScheduledFuture<Bird> newBird = scheduled.schedule(() -> new Chicken(name), HATCHING_PERIOD_MINS, MINUTES);
                //here "()->new Chicken(name)" is a Callable. CallableTask which do not take any input and returns output a ChickenObject along with its name.
                //We need ChickenObject because a new Chicken is getting born.


                WriteIntoCSV(name.toString(), Instant.now());      //write into the .csv file for the recorded hatched Egg

        }catch(Exception e){
                e.printStackTrace();
            }
                //throw new NotYetImplementedException("add it to eggs after its laid");

                //For this, user have to "add" eggs to the List<Egg> made above, --> for this, we need egg variable which can be added done above ↑.

                System.out.println(String.format("total egg count is %s", eggs.size()));
      return egg;
    }

    ////A fileWriter needs to be created so that we can write the updates back to the "egg.csv" file
    public void WriteIntoCSV(String chickenName, Instant it) {
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\bhask\\IdeaProjects\\secondTest\\coding_test\\src\\main\\resources\\farm\\egg.csv", true);
             CSVWriter writer = new CSVWriter(fileWriter)) {
            String[] eggEntry = (String[]) eggs.toArray();
                writer.writeNext(eggEntry);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

