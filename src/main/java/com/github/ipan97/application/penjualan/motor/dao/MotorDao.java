/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor.dao;

import com.github.ipan97.application.penjualan.motor.model.Motor;
import java.util.List;

/**
 *
 * @author ifan
 */
public interface MotorDao {
	void save(Motor m);
	Motor getMotorByCode(String code);

	Motor getMotor();

	Motor getMotorByType(String type);

	List<Motor> getAllByCode(String code);

	List<Motor> getAllByType(String type);

	List<Motor> getMotors();

}
