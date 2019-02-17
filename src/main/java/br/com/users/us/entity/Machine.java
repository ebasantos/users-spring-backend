package br.com.users.us.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Machine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idMachine;
	@Column
	public String descricao;
	@Column
	public String cod_Machine;
	
	
	public Machine(String descricao, String cod_Machine) {
		this.descricao = descricao;
		this.cod_Machine = cod_Machine;
	}
	
	public Long getId_Machine() {
		return idMachine;
	}

	public void setId_Machine(Long id_Machine) {
		this.idMachine = id_Machine;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCod_Machine() {
		return cod_Machine;
	}

	public void setCod_Machine(String cod_Machine) {
		this.cod_Machine = cod_Machine;
	}

	
	
	
}
