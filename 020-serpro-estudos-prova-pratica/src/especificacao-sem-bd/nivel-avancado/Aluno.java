// Adicionar novos alunos com informações como nome, idade e curso.

public class Aluno {
	private String nome;
	private Integer idade;
	private String curso;

	public Aluno(String nome, Integer idade, String curso) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "[nome="+nome+",idade="+idade+",curso="+curso+"]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getIdade() {
		return this.idade;
	}

	public String getCurso() {
		return this.curso;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Aluno)) return false;
		Aluno alunoM = (Aluno) object;
		return this.nome.equals(alunoM.getNome());
	}
}