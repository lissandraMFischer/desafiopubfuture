import java.util.ArrayList;
import java.util.Scanner;

public class ListaC {
	private ArrayList <Conta> listac = new ArrayList <Conta>();
	private Scanner sc; 
	int id = 1;
	private Conta c1 = new Conta(0000, "","");

	public ListaC(){
	sc = new Scanner(System.in);
	listac = new ArrayList<Conta>();
	listac.add(c1);
	}
	public void adicionar(){
	char retorno;
	do{
	Conta conta = new Conta(0000, "", "");
	System.out.println("Você optou por cadastrar uma conta");
	System.out.println("Digite o saldo da conta:");
	conta.setSaldo(sc.nextFloat());
	System.out.println("Digite o tipo da conta");
	conta.setTipo(sc.next());
	System.out.println("Informe a instituição financeira");
	conta.setInstituicaoFinanceira(sc.next());
	listac.add(conta);
	System.out.println("A conta foi cadastrada com sucesso");
	do{
	System.out.println("Deseja cadastrar outra conta?");
	System.out.println("Para sim digite: s,  para  não digite: n");
	retorno = sc.next().charAt(0);
	}while(retorno != 's' && retorno != 'n');
	}while (retorno == 's');
	}
public void consultaDespesas(){
	char resposta;
	int aux=0;
	do{
		System.out.println("Você escolheu consultar um conta");
		System.out.println("Digite o nome do tipo da conta");
		String tipo= sc.next();
		for(int i=0; i < listac.size(); i++){
			Conta a = listac.get(i);
			if(a.toString().contains(tipo)){
				System.out.println(a);
				aux=1;
			}else{
				System.out.println("Conta não cadastrado");
			}
		}
			do{
				System.out.println("Deseja procurar outro conta?");
				System.out.println("Para sim digite: s,  para  não digite: n");
				resposta = sc.nextLine().charAt(0);

			}while(resposta != 's' && resposta != 'n');
		}while (resposta == 's');
}

	public String toString(){
		String msg = "As contas cadastradas são: /n";
		for (Conta conta: listac){
			msg += "";
			msg += conta;
			msg += "\n";
		}
		if(listac.size()==0){
			return "Nenhuma conta cadastrada";
		}
		return msg;
	}
	public void remover(){
		char resposta;
		int cont=0;
		do{
			System.out.println("Você escolheu remover uma conta");
			System.out.println("Digite o tipo da conta");
			String tipo= sc.nextLine();
			for(int i=0; i < listac.size(); i++){
				Conta a = listac.get(i);
				if(a.toString().contains(tipo)){
					listac.remove(i);
					cont=1;
				}
				if(cont==0){
					System.out.println("Conta não cadastrada");
				}
			}
		do{
		System.out.println("Deseja remover outra conta?");
		System.out.println("Para sim digite: s,  para  não digite: n");
		resposta = sc.nextLine().charAt(0);
		}while(resposta == 's' && resposta != 'n');
		}while (resposta == 's');
		}


}
