package ClassesAndObjects.SimpleCalculator;

import java.util.*;

public class SimpleCalculator {

    private double result;

    SimpleCalculator(double op1, double op2, String task){
        if (task.equalsIgnoreCase("add")){
            add(op1, op2);
        }else if (task.equalsIgnoreCase("division")){
            division(op1, op2);
        }else if (task.equalsIgnoreCase("subtraction")){
            subtraction(op1, op2);
        }else if (task.equalsIgnoreCase("multiplication")){
            multiplication(op1, op2);
        }

    }

    SimpleCalculator(String task){
        if (task.equalsIgnoreCase("exit")){
            System.exit(0);
        }
    }

    private void add(double op1, double op2){
        this.result = op1 + op2;
    }

    private void division(double op1, double op2){
        this.result = op1 / op2;

    }

    private void subtraction(double op1, double op2){
        this.result = op1 - op2;
    }

    private void multiplication(double op1, double op2){
        this.result = op1 * op2;

    }

    public double getResult() {
        return result;
    }
}
