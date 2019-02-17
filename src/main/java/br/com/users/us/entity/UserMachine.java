package br.com.users.us.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserMachine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUserMac;
	@Column
	public Long idMachine;
	@Column
	public Long idUser;
	
	public UserMachine(Long id_User, Long id_Machine) {
		this.idMachine = id_Machine;
		this.idUser = id_User;
	}
	
	public Long getIdUserMac() {
		return idUserMac;
	}


	public void setIdUserMac(Long idUserMac) {
		this.idUserMac = idUserMac;
	}

	
	
	
	
	
	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdMachine() {
		return idMachine;
	}

	public void setIdMachine(Long idMachine) {
		this.idMachine = idMachine;
	}

	
	

}
