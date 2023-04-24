package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	@Id
	@Column(name = "cod_usua")
	private int id;
	
	@Column(name = "nom_usua")
	private String first_name;
	
	@Column(name = "ape_usua")
	private String last_name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate_user() {
		return date_user;
	}

	public void setDate_user(String date_user) {
		this.date_user = date_user;
	}

	public int getId_type() {
		return id_type;
	}

	public void setId_type(int id_type) {
		this.id_type = id_type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "usr_usua")
	private String user;
	
	@Column(name = "cla_usua")
	private String password;
	
	@Column(name = "fna_usua")
	private String date_user;
	
	@Column(name = "idtipo")
	private int id_type;
	
	@Column(name = "est_usua")
	private int status;
}
