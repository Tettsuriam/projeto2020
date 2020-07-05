package entidades;

public class triangulo {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double cont = 0;
		double area = 0;
		
		cont = (a + b + c) / 2;
		area = Math.sqrt(cont *(cont - a)* (cont - b) * (cont-c));
		
		return area;
	}
}
