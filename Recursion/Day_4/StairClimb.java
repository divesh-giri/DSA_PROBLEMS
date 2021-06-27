package Recursion.Day_4;

import java.util.ArrayList;

public class StairClimb {
    public static ArrayList<String> climb(int totalSteps, int currentStep)
    {
        if(currentStep >= totalSteps)
        {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        ArrayList<String> result = new ArrayList<>();
        for(int step=1; step<4; step++)
        {
            int newStep = currentStep + step;
            ArrayList<String> temp = climb(totalSteps, newStep);
            for(String s: temp)
            {
                result.add(step+s);
            }
        }
        return result;
            
    }
    public static void main(String[] args) {
        ArrayList<String> list = climb(4, 0);
        System.out.println(list);
    }
}
