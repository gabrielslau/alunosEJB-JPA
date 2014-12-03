package atividadejpa.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import atividadejpa.entidades.Aluno;

@Stateless
public class AlunoDAO implements AlunoDAORemote {
	@PersistenceContext(unitName="atividadejpa")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Aluno> getAlunos() {
		Query query = em.createQuery("SELECT a FROM Aluno a");
		return query.getResultList();
	}
}
