package br.com.users.us.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long idUser;

	@Column
	public String nome;

	@Column
	public String email;

	@Column
	public String senha;

	@Column
	public Date dataCriacao;

	@OneToOne
	private Profile Profile;

	public User() {

	}

	public User(String nome, String email, String senha, Date dataCriacao, Profile profile) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataCriacao = dataCriacao;
		this.Profile = profile;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Profile getProfile() {
		return Profile;
	}

	public void setProfile(Profile profile) {
		Profile = profile;
	}

}