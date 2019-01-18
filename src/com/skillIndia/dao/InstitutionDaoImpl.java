package com.skillIndia.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skillIndia.model.Institution;

@Repository
public class InstitutionDaoImpl implements InstitutionDao {

	private static final Logger logger = 
			LoggerFactory.getLogger(InstitutionDaoImpl.class);

			private SessionFactory sessionFactory;

			@Autowired
			public void setSessionFactory(SessionFactory sf) {
			this.sessionFactory = sf;
			}

			@Override
			public void addInstitution(Institution p) {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(p);
			logger.info("Institution saved successfully, Institution Details= " + p);
			}

			@Override
			public void updateInstitution(Institution p) {
			Session session = 
			this.sessionFactory
			.getCurrentSession();
			session.update(p);
			logger.info("Institution updated successfully, " + "Institution Details=" + p);
			}

			@Override
			public void removeInstitutionByName(String name) {
			Session session = this.sessionFactory.getCurrentSession();
			Institution p = 
			(Institution) session.load(Institution.class, new String(name));
			if (null != p) {
			session.delete(p);
			}
			else {
			logger.error
			("Institution NOT deleted, with Institution Id=" +name);
			}
			logger.info("Institution deleted successfully, Institution details=" + p);
			}

			@Override
			public Institution getInstitutionByName(String institutionName) {
				// TODO Auto-generated method stub
				return null;
			}

}
