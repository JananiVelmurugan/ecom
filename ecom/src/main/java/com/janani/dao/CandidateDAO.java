package com.janani.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.janani.model.Candidate;

@Repository
public class CandidateDAO {

	private SessionFactory sessionFactory;
	Session session = this.sessionFactory.getCurrentSession();

	public void save(Candidate candidate) {
		session.persist(candidate);
	}

	public void update(Candidate candidate) {
		session.update(candidate);
	}

	public List<Candidate> list() {
		List<Candidate> candidates = session.createQuery("from candidate").getResultList();
		return candidates;
	}

	public Candidate findById(Integer id) {
		Candidate candidate = session.load(Candidate.class, new Integer(id));
		return candidate;
	}

	public void delete(Integer id) {
		Candidate candidate = session.load(Candidate.class, new Integer(id));
		if (null != candidate) {
			session.delete(candidate);
		}
	}

}
