package Curso_java;

import java.util.Scanner;

public class calculaAreaCirculo {
	
	public static double calculo (double rai) {
		double are = 0;
		rai = Math.pow(rai, 2);
		are = rai*3.14159;
		
		return are;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dp = new Scanner(System.in);
		double raio=0;
		double res;
		
		System.out.println("\t*** calculo de area***\n");
		System.out.println("IMPORTANTE: este programa foi feito para calcular\na area de um circulo. para isso é preciso que informe\no raio do circulo cuja area deseja calcular.\n\n");
		
		
		System.out.println("informe o raio do circulo:\t");
		raio = dp.nextDouble();
		res = calculo(raio);
		System.out.printf("\narea do circulo: %.4f ",res);
		
		dp.close();
	}

}
