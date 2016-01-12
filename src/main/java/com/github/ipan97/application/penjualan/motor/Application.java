/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor;

import com.github.ipan97.application.penjualan.motor.configuration.ApplicationConfiguration;
import com.github.ipan97.application.penjualan.motor.model.Motor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ifan
 */
public class Application {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	}
	private void outputMotor(Motor motor){
		System.out.println("Kode Motor "+motor.getCodeMotor());
		System.out.println("Type Motor "+motor.getTypeMotor());
		System.out.println("Jenis Motor "+motor.getJenisMotor());
		System.out.println("Warna Motor "+motor.getWarnaMotor());
		System.out.println("Harga Motor "+motor.getHargaMotor());
	}
}
