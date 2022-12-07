package pessoas;

public abstract class Pessoa {

	private String nome;
	private final long cpf;
	
	public Pessoa(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	
}
