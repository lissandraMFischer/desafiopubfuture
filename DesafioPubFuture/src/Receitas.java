import java.util.*;

public class Receitas {
	private float valor;
	private String dataRecebimento;
	private String dataRecebimentoEsperado;
	private String descricao;
	private String conta;
	private String tipoReceita;
	
	public Receitas(float valor, String dataRecebimento, String dataRecebimentoEsperado, String descricao, String conta, String tipoReceita) {
		setValor(valor);
		setDataRecebimento(dataRecebimento);
		setDataRecebimentoEsperado(dataRecebimentoEsperado);
		setDescricao(descricao);
		setConta(conta);
		setTipoReceita(tipoReceita);


	}
	public void setValor(float valor) {
		this.valor=valor;
	}
	public float getValor() {
		return valor;
	}

	public void setDataRecebimento (String dataRecebimento) {
		this.dataRecebimento=dataRecebimento;
	}
	public String getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimentoEsperado (String dataRecebimentoEsperado) {
		this.dataRecebimentoEsperado=dataRecebimentoEsperado;
	}
	public String getDataRecebimentoEsperado() {
		return dataRecebimentoEsperado;
	}
	public void setDescricao (String descricao) {
		this.descricao=descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setConta (String conta) {
		this.conta=conta;
	}
	public String getConta() {
		return conta;
	}
	
	public void setTipoReceita (String tipoReceita) {
		this.tipoReceita=tipoReceita;
	}
	public String getTipoReceita() {
		return tipoReceita;
	}
	
	
	public String toString() {
		return  "\n Receita:"+
				"\n Valor:"+valor+
				"\n Data de recebimento: "+dataRecebimento+
				"\n Data de recebimento Esperado: "+dataRecebimentoEsperado+
				"\n Descrição: "+descricao+
				"\n Conta: "+conta+
				"\n Tipo de receita: "+tipoReceita; 
	}
}
