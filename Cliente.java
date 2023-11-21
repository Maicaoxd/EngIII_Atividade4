package entity;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	private String nome;
	private String cnh;
	private String cpf;
	private Set<Locacao> locacoes = new HashSet<>();

	public void validarCnh(String cnh) {

	}

	public void validarCpf(String cpf) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Set<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(Set<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	public Cliente(String nome, String cnh, String cpf, Set<Locacao> locacoes) {
		super();
		this.nome = nome;
		this.cnh = cnh;
		this.cpf = cpf;
		this.locacoes = locacoes;
	}

}
