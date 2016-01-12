/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor.dao.impl;

import com.github.ipan97.application.penjualan.motor.dao.AbstractDao;
import com.github.ipan97.application.penjualan.motor.dao.MotorDao;
import com.github.ipan97.application.penjualan.motor.model.Motor;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ifan
 */
@Repository
public class MotorDaoImpl extends AbstractDao implements MotorDao{

	@Override
	public void save(Motor m) {
		getSession().persist(m);
	}

	@Override
	public Motor getMotorByCode(String code) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Motor getMotor() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Motor getMotorByType(String type) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Motor> getAllByCode(String code) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Motor> getAllByType(String type) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Motor> getMotors() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
