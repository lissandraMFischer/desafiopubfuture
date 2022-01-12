import java.util.*;
public class Despesas {
	private float valor;
	private String dataPagamento;
	private String dataPagamentoEsperado;
	private String conta;
	private String tipoDespesa;
	
	public Despesas(float valor, String dataPagamento, String dataPagamentoEsperado, String conta, String tipoDespesa) {
		setValor(valor);
		setDataPagamento(dataPagamento);
		setDataPagamentoEsperado(dataPagamentoEsperado);
		setConta(conta);
		setTipoDespesa(tipoDespesa);


	}
	public void setValor(float valor) {
		this.valor=valor;
	}
	public float getValor() {
		return valor;
	}

	public void setDataPagamento (String dataPagamento) {
		this.dataPagamento=dataPagamento;
	}
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamentoEsperado (String dataPagamentoEsperado) {
		this.dataPagamentoEsperado=dataPagamentoEsperado;
	}
	public String getDataPagamentoEsperado() {
		return dataPagamentoEsperado;
	}
	public void setConta (String conta) {
		this.conta=conta;
	}
	public String getConta() {
		return conta;
	}
	
	public void setTipoDespesa (String tipoDespesa) {
		this.tipoDespesa=tipoDespesa;
	}
	public String getTipoDespesa() {
		return tipoDespesa;
	}
	
	
	public String toString() {
		return  "\n Despesa:"+
				"\n Valor:"+valor+
				"\n Data de recebimento: "+dataPagamento+
				"\n Data de recebimento Esperado: "+dataPagamentoEsperado+
				"\n Conta: "+conta+
				"\n Tipo de receita: "+tipoDespesa; 
	}
}
