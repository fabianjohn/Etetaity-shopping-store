package com.fabcode.etaity.dao;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fabcode.etaity.entity.Account;





@Component
@Repository
public class AccountDAO {
	
	@Autowired
    private SessionFactory sessionFactory;

    public Account findAccount(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return  session.find(Account.class, userName);
    }

	public Object save(Account user) {
		Session session = this.sessionFactory.getCurrentSession();
		
		return session.save(session);
	}

	public Account findByUserName(String userName) {
		Session session = this.sessionFactory.getCurrentSession();
		
		return null;
	}

}
