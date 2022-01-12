import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	
	private ArrayList <Receitas> lista = new ArrayList <Receitas>();
	private Scanner sc; 
	int id = 1;
	private Receitas r1 = new Receitas(0000, "","","","","");

	public Lista(){
	sc = new Scanner(System.in);
	lista = new ArrayList<Receitas>();
	lista.add(r1);
	}
	public void adicionar(){
	char retorno;
	do{
	Receitas receitas = new Receitas(0000, "", "", "", "", "");
	System.out.println("Você optou por cadastrar uma receita");
	System.out.println("Digite o valor da receita:");
	receitas.setValor(sc.nextFloat());
	System.out.println("Digite a data do recebimento");
	receitas.setDataRecebimento(sc.next());
	System.out.println("Digite a data esperada para o recebimento");
	receitas.setDataRecebimentoEsperado(sc.next());
	System.out.println("Digite a descrição da receita");
	receitas.setDescricao(sc.next());
	System.out.println("Digite a conta");
	receitas.setConta(sc.next());
	System.out.println("Digite o tipo da receita");
	receitas.setTipoReceita(sc.next());
	lista.add(receitas);
	System.out.println("A receita foi cadastrada com sucesso");
	do{
	System.out.println("Deseja cadastrar outra receita?");
	System.out.println("Para sim digite: s,  para  não digite: n");
	retorno = sc.next().charAt(0);
	}while(retorno != 's' && retorno != 'n');
	}while (retorno == 's');
	}
public void consultaReceitas(){
	char resposta;
	int aux=0;
	do{
		System.out.println("Você escolheu consultar um receita");
		System.out.println("Digite o nome do tipo da receita");
		String tipo= sc.next();
		for(int i=0; i < lista.size(); i++){
			Receitas a = lista.get(i);
			if(a.toString().contains(tipo)){
				System.out.println(a);
				aux=1;
			}else{
				System.out.println("Receita não cadastrado");
			}
		}
			do{
				System.out.println("Deseja procurar outro receita?");
				System.out.println("Para sim digite: s,  para  não digite: n");
				resposta = sc.nextLine().charAt(0);

			}while(resposta != 's' && resposta != 'n');
		}while (resposta == 's');
}

	public String toString(){
		String msg = "As receitas cadastradas são: /n";
		for (Receitas receitas: lista){
			msg += "";
			msg += receitas;
			msg += "\n";
		}
		if(lista.size()==0){
			return "Nenhuma receita cadastrada";
		}
		return msg;
	}
	public void remover(){
		char resposta;
		int cont=0;
		do{
			System.out.println("Você escolheu remover uma receita");
			System.out.println("Digite o tipo da receita");
			String tipo= sc.nextLine();
			for(int i=0; i < lista.size(); i++){
				Receitas a = lista.get(i);
				if(a.toString().contains(tipo)){
					lista.remove(i);
					cont=1;
				}
				if(cont==0){
					System.out.println("Receita não cadastrada");
				}
			}
		do{
		System.out.println("Deseja remover outra receita?");
		System.out.println("Para sim digite: s,  para  não digite: n");
		resposta = sc.nextLine().charAt(0);
		}while(resposta == 's' && resposta != 'n');
		}while (resposta == 's');
		}

}
