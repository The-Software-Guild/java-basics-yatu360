package DogGenetics;

import java.util.*;

public class DogGenetics {


    public static void main(String[] args) {

        String [] breeds = {"German Shepard", "Dachshund", "Shiba Inu", "Great Dane", "Dalmation"};
        int [] percentage = new int[5];
        Random rand1 = new Random();
        int c = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your dog's name? ");
        String dogName = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+dogName+"'s prestigious background right here.");

        for (int i = 0; i < percentage.length-1; i++){
            if (c>0) {
                percentage[i] = rand1.nextInt(c) + 1;
                c -= percentage[i];
            }else{
                percentage[i] = 0;
            }
        }
        percentage[percentage.length-1] = c;
        shuffleArray(percentage);
        System.out.println(dogName + " "+ "is:");
        for (int j = 0; j<breeds.length; j++){
            System.out.printf("%d%% %s %n", percentage[j], breeds[j]);
        }

    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar) {

        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

}
