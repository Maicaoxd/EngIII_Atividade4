package entity;

import java.util.HashSet;
import java.util.Set;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private Set<Locacao> locacoes = new HashSet<>();

	public void verificarAno(String ano) {

	}

	public void manutencaoCarro() {

	}

	public Carro(String marca, String modelo, int ano, Set<Locacao> locacoes) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.locacoes = locacoes;
	}

	public String getMarca() {
		return marca;
	}

	public Set<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(Set<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}