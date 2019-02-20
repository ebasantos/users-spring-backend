	package br.com.users.us.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public Long idProfile;

	@Column
	public String nome;
	
	public Profile() {

    }

	public Profile(String nome) {
		this.nome = nome;

	}

	public Long getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Long idProfile) {
		this.idProfile = idProfile;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	}