package pessoas;

public class Professor extends Pessoa{

	private final long matricula;
	private String depto;
	
	public Professor(String nome, long cpf, String depto, long matricula) {
		super(nome, cpf);
		this.depto = depto;
		this.matricula = matricula;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public long getMatricula() {
		return matricula;
	}
}
