import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import java.util.Enumeration;

/**
 * Created by user on 1/12/2018.
 */

public class Myclass {





    public static void findNumber (int [] arr) {
        int Key;
        int temp, value;
        Hashtable hash = new Hashtable();
        for (int i = 0; i < arr.length; i++) {
            if (hash.contains(arr[i])) {
                Key = arr[i];
                System.out.println(i+"="+Key);
                temp = (int) hash.get(Key);
                hash.put(Key, temp + 1);
                System.out.println(temp);
            } else {
                Key = arr[i];
                temp = 1;
                hash.put(Key, temp);
            }
        }


        Enumeration e = hash.keys();

        //iterate through Hashtable keys Enumeration
        while (e.hasMoreElements())
        {
            temp = (int)e.nextElement();

            System.out.println(e.nextElement());
        }
    }


    public static void  Armstrongnumber  (int number) {

        int  sum = 0, temp, remainder, digits = 0;


        temp =number;

        // Count number of digits

        while (temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = number;

        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }

        if (number == sum)
            System.out.println(number+ " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    static int power(int number, int r) {

        return  
    }

    public static void main(String[] args)

    {
        int [] array = {2,3,4,5,5,6,7};
        findNumber(array);
    }

}
