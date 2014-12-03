package atividadejpa.mbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import atividadejpa.daos.AlunoDAORemote;
import atividadejpa.entidades.Aluno;

@ManagedBean(name="alunoMB")
@ApplicationScoped
public class AlunoMB {
	private List<Aluno> alunos;

	@EJB
	private AlunoDAORemote dao;

	public AlunoMB() {
		super();
	}

	public List<Aluno> getAlunos() {
		this.alunos = dao.getAlunos();
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
