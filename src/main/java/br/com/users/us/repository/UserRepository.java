package br.com.users.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.users.us.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
