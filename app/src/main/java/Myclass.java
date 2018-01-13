import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import java.util.Enumeration;

/**
 * Created by user on 1/12/2018.
 */

public class Myclass {


    public static void findNumber(int[] arr) {
        int key = 0;
        int temp, value;
        boolean check = false;
        int max = Integer.MIN_VALUE;
        Hashtable hash = new Hashtable();


        for (int i = 0; i < arr.length; i++) {
            check = hash.containsKey(arr[i]);

            if (check) {
                key = arr[i];

                temp = (int) hash.get(key);
                hash.put(key, temp + 1);

            } else {
                key = arr[i];
                temp = 1;
                hash.put(key, temp);
            }
        }

        Enumeration Keyval = hash.keys();

        //iterate through Hashtable keys Enumeration
        while (Keyval.hasMoreElements()) {
            temp = (int) Keyval.nextElement();
            value = (int) hash.get(temp);
            if (max < value) {
                key = temp;
                max = value;

            }


        }

        System.out.println(key + " is most occurrence value in the array");


    }


    public static void ArmstrongNumber(int number) {

        int TotalSum = 0, temp = 0, digits = 0, remainder = 0;
        ///   Armstrong number
        //   let say  we have number  1234    since its 4 digits   1 ^4 + 2^4 +3^4 +4^4 == 1234 then it Armstrong number

        temp = number;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;

        while (temp != 0) {   // temp = 123 then %10 gives out  3 as remainder  temp going be 12
            remainder = temp % 10;

            //
            TotalSum = TotalSum + MathPower(remainder, digits);
            temp = temp / 10;
        }

        if (number == TotalSum)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    static int MathPower(int number, int power) {


        int result = 1;

        for (int i = 1; i <= power; i++)
            result = result * number;

        return result;
    }



    public static int FindNcube(int number)
    {
         // n^3 + (n-1)^3 + (n-2)^3 + ... + 1^3 = m
        int x= 0;
        int TotalSum = 0;
        while (true)
        {
            x += 1;
            TotalSum +=  Math.pow(x, 3);
            if (TotalSum >= number) {
                break;
            }
        }
        if (TotalSum == number) {
            return x;
        } else {
            return -1;
        }
    }


    public static void main(String[] args)

    {
        int[] array = {2, 3, 4, 5, 5, 6, 7};
        System.out.println("***********************************************");
        int result = FindNcube(1071225);
        System.out.println("\n");
        System.out.println(result+"");
         ArmstrongNumber(371);
        System.out.println("\n");
        findNumber(array);
        System.out.println("***********************************************");
    }

}
