package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.triangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX = 0;
		double areaY = 0;
		double p = 0;
		
		triangulo x, y;
		x = new triangulo();
		y = new triangulo();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		
		areaX = x.area();
		
		areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
