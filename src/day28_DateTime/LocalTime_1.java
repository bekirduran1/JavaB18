package day28_DateTime;

import java.time.LocalTime;

public class LocalTime_1 {
    public static void main(String[] args) {

        LocalTime time1=LocalTime.now();

        System.out.println(time1);


      LocalTime time2=LocalTime.of(5,1,23);

        System.out.println(time2);



    }


}
