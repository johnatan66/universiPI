package model;

public class QuestaoComDica extends QuestaoSimples {
	private String dica;
	
	public QuestaoComDica(int num, String enunciado, String resposta, String dica) {
		super(num, enunciado, resposta);
		this.dica = dica;
	}
	
	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
	public String toString() {
		return "Questão"+ num +"."+ enunciado+"\n"
				+"DICA: "+dica;
	}

}
