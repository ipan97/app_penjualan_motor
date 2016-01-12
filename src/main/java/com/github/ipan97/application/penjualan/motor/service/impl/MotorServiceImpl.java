/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor.service.impl;

import com.github.ipan97.application.penjualan.motor.dao.MotorDao;
import com.github.ipan97.application.penjualan.motor.model.Motor;
import com.github.ipan97.application.penjualan.motor.service.MotorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ifan
 */
@Service("motorService")
@Transactional
public class MotorServiceImpl implements MotorService{
	@Autowired
	private MotorDao motorDao;
	@Override
	public void save(Motor m) {
		motorDao.save(m);
	}

	@Override
	public Motor getMotorByCode(String code) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Motor getMotorByType(String code) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Motor> getMotorAllByCode(String code) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Motor> getMotorAllByType(String type) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Motor> getMotors() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
