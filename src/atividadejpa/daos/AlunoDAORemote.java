package atividadejpa.daos;

import java.util.List;

import javax.ejb.Remote;

import atividadejpa.entidades.Aluno;

@Remote
public interface AlunoDAORemote {
	public List<Aluno> getAlunos();
	public boolean saveAluno(Aluno aluno);
	public boolean existeAluno(Aluno aluno);
}
