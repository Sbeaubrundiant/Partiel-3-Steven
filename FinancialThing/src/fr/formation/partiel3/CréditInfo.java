package fr.formation.partiel3;

import java.util.Scanner;

/**
 * @author BEAUBRUN EN FAMILLE DIANT Steven This class is used to retrieve
 *         credit informations to calcul it.
 */
public class CréditInfo {

    /**
     * @param args
     * @params Crédit : amount in euro duration in yeas rate percent
     */
    public static void main(String[] args) {
	double amount, duration, rate, reste = 0;
	String startingDay = " ";
	Scanner scCrédit = new Scanner(System.in);
	System.out.println("Please type your desired Amount : ");
	amount = scCrédit.nextDouble();
	System.out.println("Please type your Duration in years : ");
	duration = scCrédit.nextDouble();
	System.out.println("Please type your Rate insurance : ");
	rate = scCrédit.nextDouble();
	System.out.println("Type the starting day date on format YY/MM : ");
	startingDay = scCrédit.next();
	double totalCost = amount / duration + rate * amount / 100;
	for (int j = 1; j < duration; j++) {
	    for (double i = amount; i > 0; amount = amount - totalCost) {
		reste = amount - amount / duration - amount * (rate / 100);
		System.out.println("Year : " + j++);
		System.out.println("Borrowed " + i + "€" + " and " + reste
			+ "€ " + " left to pay " + " and your Total Cost is :"
			+ totalCost + " €");
		if (reste < totalCost) {
		    System.out.println(
			    reste + " € " + "is your last mensuality!");
		    scCrédit.close();
		    break;
		}
	    }
	}
    }
}
