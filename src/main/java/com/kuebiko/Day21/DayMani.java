package Day21;
//I am defining my own enum
//only one public class in java file
 enum Days {
    MON, TUE, WED, THU, FRI, SAT
}
public class DayMani{
    public static void main(String[] args) {
        Days d;// d is enum type Days
        d=Days.MON;
        d=Days.SAT;
        //d=Days.SUN
        if(d==Days.SAT){
            System.out.println(d);
        }
        System.out.println(d.ordinal());
    }

}
