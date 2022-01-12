
public class Conta {

	private float saldo;
	private String tipo;
	private String instituicaoFinanceira;
	
	
	public Conta(float saldo, String tipo, String instituicaoFinanceira) {
		setSaldo(saldo);
		setTipo(tipo);
		setInstituicaoFinanceira(instituicaoFinanceira );

	}
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	public float getSaldo() {
		return saldo;
	}

	public void setTipo (String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setInstituicaoFinanceira (String instituicaoFinanceira) {
		this.instituicaoFinanceira=instituicaoFinanceira;
	}
	public String getInstituicaoFinanceira() {
		return instituicaoFinanceira;
	}
		
	public String toString() {
		return  "\n Receita:"+
				"\n Valor:"+saldo+
				"\n Data de recebimento: "+tipo+
				"\n Data de recebimento Esperado: "+instituicaoFinanceira; 
	
}
}