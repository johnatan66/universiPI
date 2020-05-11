package model;

public class QuestaoMultiplaEscolha extends QuestaoSimples {
	private String A, B, C, D;
	
	public QuestaoMultiplaEscolha(int num, String enunciado, String resposta, String A, String B, String C, String D) {
		super(num, enunciado, resposta);
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
	}
	
	public String toString() {
		return "Questão"+ num +"."+ enunciado+"\n"
				+"A) "+A+"\n"
				+"B) "+B+"\n"
				+"C) "+C+"\n"
				+"D) "+D;
	}
	

}
