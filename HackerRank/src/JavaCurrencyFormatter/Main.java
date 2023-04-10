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
