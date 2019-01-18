package com.skillIndia.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;
import com.skillIndia.model.Establishment;

@Repository
public class EstablishmentDaoImpl implements EstablishmentDao{

	static Transaction tcx;
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
	this.sessionFactory = sf;
    }
    
    private static final Logger logger = LoggerFactory.getLogger(EstablishmentDaoImpl.class);
    
	@Override
	public void addEstablishment(Establishment establishment) {
		Session session = this.sessionFactory.openSession();
		tcx = session.beginTransaction();
		logger.info("Establishment details added successfully "+establishment);
		session.save(establishment);
		tcx.commit();
		session.close();
	}
	
	

	@Override
	public void updateEstablishment(Establishment p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEstablishmentByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourse(Course establishmentCourse) {
		Session session1 = this.sessionFactory.openSession();
		Transaction tx = session1.beginTransaction();
		session1.save(establishmentCourse);
		logger.info("Course added successfully "+establishmentCourse);
		tx.commit();
		session1.close();
	}
	
	

	@Override
	public void evaluateCandidate(Candidate candidateProgress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> listCourses(int EstId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="from Course c where c.establishmentId=:establishmentId";
		Query q=session.createQuery(query);
		q.setInteger("establishmentId", EstId);
		List<Course> courseList=q.list();
		System.out.println(courseList);
		tx.commit();
		session.close();
		return courseList;
	}
	
	@Override
	public List<Candidate> listCandidates() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Establishment returnEstablishment(Establishment establishment) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String USERIDEST = establishment.getUserIdEst();
		String ESTPASSWORD = establishment.getEstPassword();
		String query = "from Establishment e where e.userIdEst=:USERIDEST and e.estPassword=:ESTPASSWORD";
		org.hibernate.Query q = session.createQuery(query);
		q.setString("USERIDEST", USERIDEST);
		q.setString("ESTPASSWORD", ESTPASSWORD);
		List<Establishment> establishmentlist = q.list();
		Iterator<Establishment> canitr = establishmentlist.iterator();
		Establishment c = new Establishment();
		while (canitr.hasNext()) {
			c = (Establishment) canitr.next();
		}
		return c;
	}
	

	@Override
	public boolean loginEstablishment(Establishment establishment) {
		System.out.println("1");
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("2");
		String EmailId=establishment.getUserIdEst();
		String NewPassword=establishment.getEstPassword();
		System.out.println("2");
		String query="from Establishment e where e.userIdEst=:EmailId and e.estPassword=:NewPassword";
		org.hibernate.Query q = session.createQuery(query);
		System.out.println("3");
		q.setString("EmailId", EmailId);
		q.setString("NewPassword",NewPassword);
		System.out.println("3");
		List<Establishment> establishmentList=q.list();
		System.out.println("4");
		tx.commit();
		session.close();
		System.out.println("4");
		if(establishmentList.size()==0) {
			System.out.println("5");
		return false;}
		else {
			System.out.println("4");
			return true;
			
		}}

}
