import model.QuestaoSimples;
import model.QuestaoMultiplaEscolha;
import model.QuestaoComDica;

import java.util.ArrayList;
import java.util.Scanner;

public class Prova {
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String r;
		
		/*QuestaoSimples prova[] = new QuestaoSimples[3];
		
		prova[0] = new QuestaoSimples(1, "Quem descrobriu o Brasil?", "Pedro Alvares Cabral");
		prova[1] = new QuestaoMultiplaEscolha(2, "Qual a molecula da agua?", "H20","HB20","HGC","HH2C", "H2O");
		prova[2] = new QuestaoComDica(3, "Qual a linguagem do curso?", "Java", "Comeca com Ja e termina com Va");
		*/
		
		ArrayList<QuestaoSimples> prova = new ArrayList<QuestaoSimples>();
		prova.add(new QuestaoSimples(1, "Quem descrobriu o Brasil?", "Pedro Alvares Cabral"));
		prova.add(new QuestaoMultiplaEscolha(2, "Qual a molecula da agua?", "H2O","HB20","HGC","HH2C", "H2O"));
		prova.add(new QuestaoComDica(3, "Qual a linguagem do curso?", "Java", "Comeca com Ja e termina com Va"));
		
		int pontos=0;
		String resposta;
		for(QuestaoSimples q: prova) {
			System.out.println(q.toString());
			resposta = teclado.nextLine();
			if(q.corrigir(resposta)) {
				pontos++;
			}
			else {
				System.out.println("Eroooooou");
			}
		}
	System.out.println("Voce fez "+pontos+" pontos");
	}

}
