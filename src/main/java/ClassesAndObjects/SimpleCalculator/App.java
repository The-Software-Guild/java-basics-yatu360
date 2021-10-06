package ClassesAndObjects.SimpleCalculator;

import java.sql.SQLOutput;
import java.util.*;

public class App {

    public static void main(String[] args) {
        boolean done = false;
        Scanner input = new Scanner(System.in);
        SimpleCalculator a;

        while (!done){
                System.out.println("Enter Operand 1: ");
                int op1 = input.nextInt();
                System.out.println("Enter Operand 2: ");
                int op2 = input.nextInt();
                System.out.println("Enter Operand operator (add, multiplication, division, substraction):  ");
                String logic = input.nextLine();
                a = new SimpleCalculator(op1, op2, logic);
            }
        }



}
