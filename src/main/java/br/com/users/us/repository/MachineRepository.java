package br.com.users.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.users.us.entity.Machine;

@Repository
public interface MachineRepository  extends JpaRepository<Machine, Long>{

}

