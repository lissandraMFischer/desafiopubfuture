import java.util.ArrayList;
import java.util.Scanner;

public class ListaD {
	private ArrayList <Despesas> listad = new ArrayList <Despesas>();
	private Scanner sc; 
	int id = 1;
	private Despesas d1 = new Despesas(0000, "","","","");

	public ListaD(){
	sc = new Scanner(System.in);
	listad = new ArrayList<Despesas>();
	listad.add(d1);
	}
	public void adicionar(){
	char retorno;
	do{
	Despesas despesas = new Despesas(0000, "", "", "", "");
	System.out.println("Você optou por cadastrar uma despesa");
	System.out.println("Digite o valor da despesa:");
	despesas.setValor(sc.nextFloat());
	System.out.println("Digite a data do recebimento");
	despesas.setDataPagamento(sc.next());
	System.out.println("Digite a data esperada para o recebimento");
	despesas.setDataPagamentoEsperado(sc.next());
	System.out.println("Digite a conta");
	despesas.setConta(sc.next());
	System.out.println("Digite o tipo da receita");
	despesas.setTipoDespesa(sc.next());
	listad.add(despesas);
	System.out.println("A receita foi cadastrada com sucesso");
	do{
	System.out.println("Deseja cadastrar outra receita?");
	System.out.println("Para sim digite: s,  para  não digite: n");
	retorno = sc.next().charAt(0);
	}while(retorno != 's' && retorno != 'n');
	}while (retorno == 's');
	}
public void consultaDespesas(){
	char resposta;
	int aux=0;
	do{
		System.out.println("Você escolheu consultar um despesa");
		System.out.println("Digite o nome do tipo da despesa");
		String tipo= sc.next();
		for(int i=0; i < listad.size(); i++){
			Despesas a = listad.get(i);
			if(a.toString().contains(tipo)){
				System.out.println(a);
				aux=1;
			}else{
				System.out.println("Despesa não cadastrado");
			}
		}
			do{
				System.out.println("Deseja procurar outro despesa?");
				System.out.println("Para sim digite: s,  para  não digite: n");
				resposta = sc.nextLine().charAt(0);

			}while(resposta != 's' && resposta != 'n');
		}while (resposta == 's');
}

	public String toString(){
		String msg = "As despesas cadastradas são: /n";
		for (Despesas despesas: listad){
			msg += "";
			msg += despesas;
			msg += "\n";
		}
		if(listad.size()==0){
			return "Nenhuma despesa cadastrada";
		}
		return msg;
	}
	public void remover(){
		char resposta;
		int cont=0;
		do{
			System.out.println("Você escolheu remover uma despesa");
			System.out.println("Digite o tipo da despesa");
			String tipo= sc.nextLine();
			for(int i=0; i < listad.size(); i++){
				Despesas a = listad.get(i);
				if(a.toString().contains(tipo)){
					listad.remove(i);
					cont=1;
				}
				if(cont==0){
					System.out.println("Despesa não cadastrada");
				}
			}
		do{
		System.out.println("Deseja remover outra despesa?");
		System.out.println("Para sim digite: s,  para  não digite: n");
		resposta = sc.nextLine().charAt(0);
		}while(resposta == 's' && resposta != 'n');
		}while (resposta == 's');
		}

	
}
