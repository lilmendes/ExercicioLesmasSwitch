package pacote;
import java.util.Scanner;
public class LesmasProblem {

	public static void main(String[] args) {
// Problema: utilize a estrutura do switch / case para formular uma questão / resposta conforme descrito abaixo:
//Questão 01: Indique, entre as opções abaixo, um animal considerado invertebrado:
//(a) lesmas
//(b) ostras
//(c) cachorro
//(d) gato
//caso o valor indicado da alternativa esteja correto, deve ser apresentado na tela "alternativa correta" e a pontuação de valor 1 deverá ser atribuída.
//Caso contrário, deve ser apresentado na tela "alternativa errada" e o valor zero deverá ser atribuído na pontuação.
//Se o usuário escolher um valor de alternativa diferente das quatro opções apresentadas o resultado apresentado deve ser: "alternativa não existe".
	
	 Scanner sc = new Scanner(System.in); // CÓDIGO PARA PEGAR DADOS DO CONSOLE.	
		 
	 
	 char resposta; // DEFININDO VARIÁVEIS.
	 int pontuacao;
	 
	 System.out.println("Questão 01: Indique, entre as opções abaixo, um animal considerado invertebrado:"
	            + "\n (a) Lesmas"
				+ "\n (b) Moluscos"
				+ "\n (c) Cachorro"
				+ "\n (d) Gato"
		        + "\n\n Responda aqui-> ");  
	 
	 resposta = sc.next().charAt(0);
	 
	
	switch(resposta){ //IMPLEMENTANDO SWITCH PARA ORGANIZAR CONDIÇÕES.
	    
	
	    case 'a': case 'b':
	        pontuacao = 1;
	    	System.out.println ("Alternativa correta!!! Sua pontuação é " + pontuacao + ".") ;
		 		
		break;
	   		
	    case 'c': case 'd':
			pontuacao = 0;
		   System.out.println ("Alternativa incorreta!!! Sua pontuação é " + pontuacao + "." );
			break;			
	    
	    
	    default:
	    	System.out.print("Alternativa não existe!!!");
	     break;
	
		    	}	
	
	   sc.close();
	
	}

}
