package atividadejpa.mbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import atividadejpa.daos.AlunoDAORemote;
import atividadejpa.entidades.Aluno;

@ManagedBean(name = "alunoMB")
@ApplicationScoped
public class AlunoMB {
	private List<Aluno> alunos;
	private String cpf, nome, matricula, email, mensagem;

	@EJB
	private AlunoDAORemote dao;

	public AlunoMB() {
		super();
		mensagem = "";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public boolean isTemMensagem() {
		return !this.mensagem.isEmpty();
	}

	public String add() {
		if (!this.cpf.isEmpty() && !this.nome.isEmpty() && !this.matricula.isEmpty()) {
			Aluno aluno = new Aluno(cpf, nome, matricula, email);
			if (!dao.existeAluno(aluno)) {
				dao.saveAluno(aluno);
				this.alunos.add(aluno);
				this.setMensagem("Aluno cadastrado com sucesso!");
				return "index.jsp";
			} else {
				this.setMensagem("O usuário informado já existe, escolha outro!");
			}
		} else {
			this.setMensagem("É necessário informar todos os parâmetros solicitados!");
		}
		return "add.jsp";
	}

	public List<Aluno> getAlunos() {
		this.alunos = dao.getAlunos();
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
