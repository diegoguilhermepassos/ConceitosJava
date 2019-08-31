package course;

public class Retangulo {
	public double altura;
	public double largura;

	public double area() {
		return (altura * largura);
	}

	public double perimetro() {
		return (altura + largura) * 2.0;
	}

	public double diagonal() {
		double x = altura * altura;
		double y = largura * largura;
		
		return Math.sqrt(x + y);
	}
}
