package Recursion.Day_4;

import java.util.ArrayList;

public class CoinChange {
    public static ArrayList<String> change(int[] coins, int target, int currentValue)
    {
        if(currentValue == target)
        {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        
        ArrayList<String> result = new ArrayList<>();
        for(int coin: coins)
        {
            int newvalue = currentValue + coin;
            if(newvalue>target)
                break;
            ArrayList<String> temp = change(coins, target, newvalue);
            for(String s: temp)
            {
                result.add(coin + s);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        ArrayList<String> list = change(coins , 10, 0);
        System.out.println(list);
    }
}
