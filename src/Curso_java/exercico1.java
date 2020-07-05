package Curso_java;

import java.util.Locale;

public class exercico1 {

	public static void main(String[] args) {

		String prod1 = "computador";
		String prod2 = "mesinha";

		int idade = 20;
		int codigo = 9173;

		char sexo = 'M';

		double pre1 = 2700.00;
		double pre2 = 550.00;
		double _8ca = 2.34256780;

		System.out.printf("o %s custa R$%.2f\no %s custa R$%.2f\n\n", prod1, pre1, prod2, pre2);

		System.out.printf("o codigo do cliente é %d, sua idade é: %d anos e seu genero é: %c\n\n", codigo, idade, sexo);

		System.out.printf("numero com 8 digitos %.8f \nnumero com 3 digitos %.3f\n\n", _8ca, _8ca);

		Locale.setDefault(Locale.US);

		System.out.printf("numero com ponto em vez de virgula\n%.8f", _8ca);
		
		

	}

}
