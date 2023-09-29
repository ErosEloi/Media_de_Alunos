package Application;

public class Estudante {

	public String Nome;
	public double Nota1, Nota2, Nota3;
	public double Total;

	public double Calcular_total() {
		return Total = (Nota1 + Nota2 + Nota3);
	}
	
	public double PontosFaltantes()
	{
		if (Calcular_total() < 60) {
			return 60.0 - Calcular_total();
		}else {
			return 0.0;
		}
	}
}
