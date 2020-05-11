package model;

public class QuestaoSimples {
	protected String  enunciado;
	protected String  resposta;
	protected int     num;
	
	
	public QuestaoSimples(int num, String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.num 	   = num;
		this.resposta  = resposta;
	}
	
	public boolean corrigir(String r) {
		return r.equals(resposta);
	}

	
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String toString() {
		return "Questão"+ num +"."+ enunciado;
	}
	
	
}



