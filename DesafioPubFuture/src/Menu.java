import java.util.Scanner;

public class Menu {
	private Lista lista = new Lista();
	private ListaD listaD = new ListaD();
	private ListaC listaC = new ListaC();
	public void Perguntas(){
	int operacao;
	int escolha;
	Scanner sc = new Scanner(System.in);
	do{
		System.out.println(" Sistema de controle de finanças pessoais");
		System.out.println(" Escolha a operação desejada:");
		System.out.println("1 – Receitas ");
		System.out.println("2 - Despesas ");
		System.out.println("3 – Contas");  

	operacao=sc.nextInt();
	
	if(operacao == 1){
			System.out.println(" Escolha a operação desejada nas receitas:");
			System.out.println("1 – Cadastrar ");
			System.out.println("2 - Consultar ");
			System.out.println("3 – Remover"); 
			
			escolha=sc.nextInt();
			if(escolha == 1){
			lista.adicionar();
			}
			if(escolha == 2){
			lista.consultaReceitas();
			}
			if(escolha == 3){
			lista.remover();
			}
			
	}
	
	if(operacao == 2){
		System.out.println(" Escolha a operação desejada nas receitas:");
		System.out.println("1 – Cadastrar ");
		System.out.println("2 - Consultar ");
		System.out.println("3 – Remover"); 
		
		escolha=sc.nextInt();
		if(escolha == 1){
		listaD.adicionar();
		}
		if(escolha == 2){
		listaD.consultaDespesas();
		}
		if(escolha == 3){
		listaD.remover();
		}
		
		}
	
	if(operacao == 3){
		System.out.println(" Escolha a operação desejada nas receitas:");
		System.out.println("1 – Cadastrar ");
		System.out.println("2 - Consultar ");
		System.out.println("3 – Remover"); 
		
		escolha=sc.nextInt();
		if(escolha == 1){
		listaD.adicionar();
		}
		if(escolha == 2){
		listaD.consultaDespesas();
		}
		if(escolha == 3){
		listaD.remover();
		}
		}
	
	}while (operacao <9 | operacao>9);
	sc.close();
	}

}
