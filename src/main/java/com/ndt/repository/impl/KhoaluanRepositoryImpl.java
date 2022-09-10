/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.repository.impl;

import com.ndt.repository.KhoaluanRepository;
import java.util.List;
import javax.persistence.Query;
import com.ndt.pojos.Khoaluan;
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
public class KhoaluanRepositoryImpl implements KhoaluanRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    

    @Override
    public List<Khoaluan> getKhoaluans() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From Khoaluan");
        
        return q.getResultList();
    }
    
}
