/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ifan
 */
public abstract class AbstractDao {
	
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	private void persist(Object entity) {
		getSession().persist(entity);
	}

	private void delete(Object entity) {
		getSession().delete(entity);
	}
}
