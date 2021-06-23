package Recursion.Day_2;

import java.util.ArrayList;

public class DiceGame{

    public static ArrayList<String> diceRoll(int current, int endValue)
    {
        // termination condition
        if(current==endValue)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        // boundary handling
        if(current>endValue)
            return new ArrayList<>();

        ArrayList<String> result = new ArrayList<>();

        for(int dice=1; dice<=6; dice++)
        {
            int newValue = current + dice;
            ArrayList<String> temp = diceRoll(newValue, endValue);
            for(String s: temp)
            {
                result.add(dice+s);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> list = diceRoll(0, 10);
        System.out.println(list);
    }
}