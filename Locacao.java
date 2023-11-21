package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Locacao {
	private Date dtLocacao;
	private Date dtDevolucao;
	private double pagamento;
	private double calcao;
	private Set<Condicao> condicoes = new HashSet<>();

	public double calcularPagamento(Date dtLocacao, Date dtDevolucao) {
		return 0;
	}

	public double calcularCalcao(Date dtLocacao, Date dtDevolucao) {
		return 0;
	}

	public Date getDtLocacao() {
		return dtLocacao;
	}

	public void setDtLocacao(Date dtLocacao) {
		this.dtLocacao = dtLocacao;
	}

	public Date getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	public double getCalcao() {
		return calcao;
	}

	public void setCalcao(double calcao) {
		this.calcao = calcao;
	}

	public Set<Condicao> getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(Set<Condicao> condicoes) {
		this.condicoes = condicoes;
	}

	public Locacao(Date dtLocacao, Date dtDevolucao, double pagamento, double calcao, Set<Condicao> condicoes) {
		super();
		this.dtLocacao = dtLocacao;
		this.dtDevolucao = dtDevolucao;
		this.pagamento = pagamento;
		this.calcao = calcao;
		this.condicoes = condicoes;
	}

}
