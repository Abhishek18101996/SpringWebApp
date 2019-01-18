package com.skillIndia.dao;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;

@Repository
public class CandidateDaoImpl implements CandidateDao{

	static Transaction tcx;
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
	this.sessionFactory = sf;
    }
    
    private static final Logger logger = LoggerFactory.getLogger(CandidateDaoImpl.class);
    
	@Override
	public void addCandidate(Candidate candidate) {
		Session session = this.sessionFactory.openSession();
		tcx = session.beginTransaction();
		logger.info("Candidate details added successfully "+candidate);
		session.save(candidate);
		tcx.commit();
		session.close();
	}

	@Override
	public boolean verifyCandidate(String EmailId, String newPassword) {
		Session session = this.sessionFactory.openSession();
		String query = "from Candidate where EmailId=:EmailId and newPassword=:newPassword";
		System.out.println("query");
		org.hibernate.Query q = session.createQuery(query);
		q.setString("EmailId", EmailId);
		q.setString("newPassword", newPassword);
		List<Candidate> candidateList = q.list();
		if(candidateList.size()==0) {
		return false;
		}
		session.close();
		return true;
	}

	@Override
	public Candidate returnCandidate(Candidate candidate) {
		
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String EmailId = candidate.getEmailId();
		String NewPassword = candidate.getNewPassword();
		String query = "from Candidate c where c.EmailId=:EmailId and c.newPassword=:NewPassword";
		org.hibernate.Query q = session.createQuery(query);
		q.setString("EmailId", EmailId);
		q.setString("NewPassword", NewPassword);
		List<Candidate> candidatelist = q.list();
		Iterator<Candidate> canitr = candidatelist.iterator();
		Candidate c = new Candidate();
		while (canitr.hasNext()) {
			c = (Candidate) canitr.next();
		}
		return c;
	}

	

	@Override
	public boolean loginCandidate(Candidate candidate) {
		System.out.println("1");
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("2");
		String EmailId=candidate.getEmailId();
		String NewPassword=candidate.getNewPassword();
		String query="from Candidate c where c.EmailId=:EmailId and c.newPassword=:NewPassword";
		org.hibernate.Query q = session.createQuery(query);
		System.out.println("3");
		q.setString("EmailId", EmailId);
		q.setString("NewPassword",NewPassword);
		System.out.println("3");
		List<Candidate> candidateList=q.list();
		System.out.println("4");
		tx.commit();
		session.close();
		if(candidateList.size()==0)
		return false;
		else
			return true;
	}

	@Override
	public List<Course> browseCourse() {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="from Course";
		org.hibernate.Query q = session.createQuery(query);
		
		//q.setString("courseName", courseName);
		List<Course> course=q.list();
		tx.commit();
		session.close();
		return course;
	}

	
	
	@Override
	public List<Course> listCourse(int UserId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="select e.ESTNAME,e.DOMAIN,c.";
		org.hibernate.Query q = session.createQuery(query);
		q.setInteger("candidateId", UserId);
		List<Course> courseList=q.list();
		tx.commit();
		session.close();
		return courseList;
	}

	@Override
	public void applyCourse(Course course,int candidateId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = (Candidate)session.get(Candidate.class, candidateId);
		candidate.setCourse(course);
		session.saveOrUpdate(candidate);
		tx.commit();
		session.close();
	}

}
