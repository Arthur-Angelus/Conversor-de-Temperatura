package model;

public class Temperatura {

	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}

	public double converterParaFahreinheit() {
		double fahreinheit = celsius * 1.8 + 32;
		return fahreinheit;
	}

	public String[] mostrarTemperaturaKelvin() {
		return (null);
	}

	public void teste() {
		System.out.println("Fahrenheit: " + converterParaFahreinheit());
	}
	
}
