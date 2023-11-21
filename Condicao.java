package entity;

public class Condicao {
	private String tipo;
	private String local;
	private double multa;

	public void verificarCondicao(String tipo, String local) {

	}

	public double calcularMulta(Condicao condicao) {
		return 0;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public Condicao(String tipo, String local, double multa) {
		super();
		this.tipo = tipo;
		this.local = local;
		this.multa = multa;
	}
	
}
