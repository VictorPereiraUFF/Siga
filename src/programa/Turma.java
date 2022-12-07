package programa;

import pessoas.Disciplina;
import pessoas.Professor;

public class Turma {
	
	private Disciplina disciplina;
	private Professor professor;
	private final String codigoTurma;
	
	public Turma(Disciplina disciplina, Professor professor, String codigoTurma) {
		super();
		this.disciplina = disciplina;
		this.professor = professor;
		this.codigoTurma = codigoTurma;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getCodigoTurma() {
		return codigoTurma;
	}

}
