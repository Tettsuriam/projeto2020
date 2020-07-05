package Curso_java;

import java.util.Locale;

public class projeto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double texto = 10.1234;
		
		System.out.printf("%.4f\n",texto);
		System.out.println("Olá mundo");
		Locale.setDefault(Locale.US);
		System.out.println(texto);
		System.out.printf("%.4f\n",texto);
	}

}
