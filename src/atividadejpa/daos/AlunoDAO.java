package atividadejpa.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import atividadejpa.entidades.Aluno;

@Stateless
public class AlunoDAO implements AlunoDAORemote {
	@PersistenceContext(unitName = "AlunosEJB-DS")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Aluno> getAlunos() {
		Query query = em.createQuery("SELECT alunos FROM Aluno alunos");
		return query.getResultList();
	}

	@Override
	public boolean saveAluno(Aluno aluno) {
		/*try{
			em.persist(aluno);
		}catch(EntityExistsException e){
			return false;
		}
		return true;*/
		Query query = em
				.createNativeQuery("INSERT INTO Aluno (cpf, nome, matricula, email) "
						+ " VALUES(?,?,?,?)");

		query.setParameter(1, aluno.getCpf());
		query.setParameter(2, aluno.getNome());
		query.setParameter(3, aluno.getMatricula());
		query.setParameter(4, aluno.getEmail());
		return query.executeUpdate() > 0;
	}

	@Override
	public boolean existeAluno(Aluno aluno) {
		Query query = em
				.createQuery("SELECT aluno FROM Aluno aluno WHERE aluno.cpf = '"
						+ aluno.getCpf() + "'");
		Aluno hasAluno = (Aluno) query.getSingleResult();
		return hasAluno != null;
	}
}
