/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor.service;

import com.github.ipan97.application.penjualan.motor.model.Motor;
import java.util.List;

/**
 *
 * @author ifan
 */
public interface MotorService {
	void save(Motor m);
	Motor getMotorByCode(String code);
	Motor getMotorByType(String code);
	List<Motor> getMotorAllByCode(String code);
	List<Motor> getMotorAllByType(String type);
	List<Motor> getMotors();
}
