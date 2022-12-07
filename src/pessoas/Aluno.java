package pessoas;

public class Aluno extends Pessoa {

	private final long dre;
	private double cra;
	private int creditosAluno;

	public Aluno(String nome, long cpf, long dre, double cra, int creditosAluno) {
		super(nome, cpf);
		this.dre = dre;
		this.cra = cra;
		this.creditosAluno = creditosAluno;
	}

	public double getCra() {
		return cra;
	}

	public int getCreditosAluno() {
		return creditosAluno;
	}

	public void setCreditosAluno(int creditosAluno) {
		this.creditosAluno = creditosAluno;
	}

	public long getDre() {
		return dre;
	}

	
}
