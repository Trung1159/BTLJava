/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.repository.impl;

import com.ndt.pojos.User;
import com.ndt.repository.UserRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author TUN
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
            
    @Override
    public boolean addUser(User user) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        
        try {
            session.save(user);
            System.out.println("123dfyhhghgjfhghgg");
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
            System.out.println("21321421443964369346");
        }
        return false;
    }

    @Override
    public List<User> getUsers(String username) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root root = query.from(User.class);
        query = query.select(root);
        
        if (!username.isEmpty()) {
            Predicate p = builder.equal(root.get("username").as(String.class), username.trim());
            query = query.where(p);
        }
        
        Query q = session.createQuery(query);
        return q.getResultList();
    }

    @Override
    public List<User> getUsers() {
        // Get user using hql
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("from User");
        return q.getResultList();
    }

    @Override
    public User updateRoleUser(String role, int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        User user = session.get(User.class, id);
        user.setUserRole(role);
        session.update(user);
        return user;
    }


//    @Override
//    public User getUserByUsername(String username) {
//        Session session = this.sessionFactory.getObject().getCurrentSession();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = builder.createQuery(User.class);
//        Root root = query.from(User.class);
//        query = query.select(root);
//        
//        if (!username.isEmpty()) {
//            Predicate p = builder.equal(root.get("username").as(String.class), username.trim());
//            query = query.where(p);
//        }
//        
//        Query q = session.createQuery(query);
//        return (User) q.getResultList();
//    }
    
}
