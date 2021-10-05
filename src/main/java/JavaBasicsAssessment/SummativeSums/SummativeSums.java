package JavaBasicsAssessment.SummativeSums;

import java.util.*;

public class SummativeSums {

    public static void main(String[] args) {

      int [] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
      int [] arr2 = { 999, -60, -77, 14, 160, 301 };
      int [] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
      int [] arr_sum = {Arrays.stream(arr1).sum(), Arrays.stream(arr2).sum(), Arrays.stream(arr3).sum()};

      for (int i = 1; i<4; i++){
          System.out.printf("#%d Array Sum: %d%n", i, arr_sum[i-1] );
      }


    }
}
