package atividadejpa.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	private String cpf, nome, matricula, email;

	public Aluno() {
		super();
	}

	public Aluno(String cpf, String nome, String matricula, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}

	@Id
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@NotEmpty
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
			+ "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9]"
			+ "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9]"
			+ "(?:[a-z0-9-]*[a-z0-9])?", message = "Email inválido")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
