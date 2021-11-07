package proyectoejemplo.dto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class SueldoDto {

	// Datos
	private int horasPorDia;
	private int diasTrabajados;
	private double pagoHora;
	// Resultado
	private double totalIngresos;
	private double renta;
	private double totalNeto;

	public SueldoDto() {
	}

	public SueldoDto(int horasPorDia, int diasTrabajados, double pagoHora) {
		this.horasPorDia = horasPorDia;
		this.diasTrabajados = diasTrabajados;
		this.pagoHora = pagoHora;
	}

	public int getHorasPorDia() {
		return horasPorDia;
	}

	public void setHorasPorDia(int horasPorDia) {
		this.horasPorDia = horasPorDia;
	}

	public int getDiasTrabajados() {
		return diasTrabajados;
	}

	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}

	public double getPagoHora() {
		return pagoHora;
	}

	public void setPagoHora(double pagoHora) {
		this.pagoHora = pagoHora;
	}

	public double getTotalIngresos() {
		return totalIngresos;
	}

	public void setTotalIngresos(double totalIngresos) {
		this.totalIngresos = totalIngresos;
	}

	public double getRenta() {
		return renta;
	}

	public void setRenta(double renta) {
		this.renta = renta;
	}

	public double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(double totalNeto) {
		this.totalNeto = totalNeto;
	}

}
