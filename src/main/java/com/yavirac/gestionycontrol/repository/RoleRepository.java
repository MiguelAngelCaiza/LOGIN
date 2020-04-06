package com.yavirac.gestionycontrol.repository;

import com.yavirac.gestionycontrol.models.ERole;
import com.yavirac.gestionycontrol.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
