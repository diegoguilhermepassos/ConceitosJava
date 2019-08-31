package course;

public class ConversorMoeda {
	public static double IOF = 0.06;

	public static double conversaoDolarReal(double totalDinheiro, double valorDolar) {
		return totalDinheiro * valorDolar * (1.0 + IOF);

	}
}
