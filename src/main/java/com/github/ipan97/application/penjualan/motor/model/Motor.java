/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor.model;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ifan
 */
@Entity
@Table(name = "m_motor")
public class Motor {

	private static final long serialVersionUID = -7798448292038151187L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	@Column(name = "code_motor", length = 10, unique = true)
	private String codeMotor;
	@Column(name = "jenis_motor", length = 20, nullable = false)
	private String jenisMotor;
	@Column(name = "type_motor", length = 20, nullable = false)
	private String typeMotor;
	@Column(name = "warna_motor", length = 25, nullable = false)
	private String warnaMotor;
	@Column(name = "harga_motor")
	private BigDecimal hargaMotor;

	public String getCodeMotor() {
		return codeMotor;
	}

	public void setCodeMotor(String codeMotor) {
		this.codeMotor = codeMotor;
	}

	public String getJenisMotor() {
		return jenisMotor;
	}

	public void setJenisMotor(String jenisMotor) {
		this.jenisMotor = jenisMotor;
	}

	public String getTypeMotor() {
		return typeMotor;
	}

	public void setTypeMotor(String typeMotor) {
		this.typeMotor = typeMotor;
	}

	public String getWarnaMotor() {
		return warnaMotor;
	}

	public void setWarnaMotor(String warnaMotor) {
		this.warnaMotor = warnaMotor;
	}

	public BigDecimal getHargaMotor() {
		return hargaMotor;
	}

	public void setHargaMotor(BigDecimal hargaMotor) {
		this.hargaMotor = hargaMotor;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.codeMotor);
		hash = 97 * hash + Objects.hashCode(this.jenisMotor);
		hash = 97 * hash + Objects.hashCode(this.typeMotor);
		hash = 97 * hash + Objects.hashCode(this.warnaMotor);
		hash = 97 * hash + Objects.hashCode(this.hargaMotor);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Motor other = (Motor) obj;
		if (!Objects.equals(this.codeMotor, other.codeMotor)) {
			return false;
		}
		if (!Objects.equals(this.jenisMotor, other.jenisMotor)) {
			return false;
		}
		if (!Objects.equals(this.typeMotor, other.typeMotor)) {
			return false;
		}
		if (!Objects.equals(this.warnaMotor, other.warnaMotor)) {
			return false;
		}
		if (!Objects.equals(this.hargaMotor, other.hargaMotor)) {
			return false;
		}
		return true;
	}

}
