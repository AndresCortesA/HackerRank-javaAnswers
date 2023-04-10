# HackerRank-javaAnswers
---
# Java Int to String

You are given an integer ***n***, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts ***n***
into a string ***s***

the code will print "Good job". Otherwise it will print "Wrong answer".

 ***n*** can range **-100** between **100** to inclusive.

Answer:  
```Java
package JavaIntToString;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= -100 && n <= 100) {
            String str = Integer.toString(n);
            System.out.println("Good job");
        } else{
            System.out.println("Wrong answer");
        }
    }
}
```

 
---
# Java Date and Time

The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, ***getDay***, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Example  
***month*** = 8  
***day*** = 14  
***year*** = 2017  

The method should return ***MONDAY***  as the day on that date. 

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:  

    int: month  
    int: day  
    int: year  

Returns  

    string: the day of the week in capital letters  

Input Format  

A single line of input containing the space separated month, day and year, respectively.

Answer:  
```Java
package JavaDateAndTime;

import java.util.Calendar;

public class Main {
    public static String findDay(int month, int day, int year) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(year, month-1, day);

        int days = calendario.get(Calendar.DAY_OF_WEEK);

        String[] dayOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY",};
        return dayOfWeek[days];
    }

    public static void main(String[] args) {
        System.out.println(findDay(8 ,5,2015));
    }
}
```
---
# Java Currency Formatter
Given a double-precision number, 5***payment***, denoting an amount of money, use the NumberFormat class'getCurrencyInstance method to convert ***payment*** into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:  
US: formattedPayment  
India: formattedPayment  
China: formattedPayment  
France: formattedPayment  
where ***formattedPayment*** is ***payment*** formatted according to the appropriate [Locale]'s(https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html) currency.