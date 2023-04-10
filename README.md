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
Given a [double-precision](https://en.wikipedia.org/wiki/Double-precision_floating-point_format) number, ***payment***, denoting an amount of money, use the [NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html) class'[getCurrencyInstance](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-) method to convert ***payment*** into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:  
  
US: formattedPayment  
India: formattedPayment  
China: formattedPayment  
France: formattedPayment  
  
where ***formattedPayment*** is ***payment*** formatted according to the appropriate [Locale](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)'s currency.  
  
**Note**: India does not have a built-in Locale, so you must [construct one](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-) where the language is en (i.e., English).  
  
**Constraints**  
**0 <= payment <= 10^9
  
**Output Format**  
On the first line, print US: u where **u** is ***payment** formatted for US currency.  
On the second line, print India: i  **i** is ***payment*** formatted for Indian currency.  
On the third line, print China: c where **c** is ***payment*** formatted for Chinese currency.  
On the fourth line, print France: f, where **f** is ***payment*** formatted for French currency.    
  
**Sample Input**  
**12324,134**

**Sample Output**  

US: $12,324.13  
India: Rs.12,324.13  
China: ￥12,324.13  
France: 12 324,13 €  
```Java
package JavaCurrencyFormatter;

import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double payment = scn.nextDouble();
        scn.close();

        //Formatos de moneda adecuada para que funcione
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indianFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chineseFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        //Los transformamos en strings para mostrarlos por pantalla
        String us = usFormat.format(payment);
        String india = indianFormat.format(payment);
        String china = chineseFormat.format(payment);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }



}
```
