package HeartyHearts;

import java.util.*;

public class HeartyHearts {

    public static void healthCheck(int age){
        int maxHeartRate = 220 - age;
        int lower = (int)Math.round(maxHeartRate*0.5);
        int upper = (int)Math.round(maxHeartRate*0.85);
        System.out.println("Your maximum heart rate should be "+maxHeartRate+" beats per minute");
        System.out.println("Your target HR Zone is "+lower+" - "+upper+" beats per minute");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        healthCheck(age);
    }
}
