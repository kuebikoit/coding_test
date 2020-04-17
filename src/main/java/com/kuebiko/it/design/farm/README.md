# Coding Test 04/16/2020

## Instructions
* In chicken class load the value `HATCHING_PERIOD_MINS` = `incubation.period.minutes.chicken` from `src/main/resources/farm/bird.properties`
* In chicken class implement method `lay()`, use `HATCHING_PERIOD_MINS` when the egg is laid in a way when that period expires the `isAlreadyHatched` is `true` in `Egg` class
* Every time the egg is hatched write the record to `src/main/resources/farm/egg.csv`
* Use library [Opencsv](http://opencsv.sourceforge.net/) for writing to csv file. 
* Run `FarmRunner` class to demonstrate the program during the test phase of the maven lifecycle.
