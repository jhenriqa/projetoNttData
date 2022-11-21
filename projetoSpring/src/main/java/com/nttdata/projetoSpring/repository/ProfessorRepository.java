package com.nttdata.projetoSpring.repository;

import com.nttdata.projetoSpring.model.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, String> {
    @Query("Select d from PROFESSOR d where d.cpf like :cpf")
    ProfessorEntity findProfessorByCpf(@Param("cpf") String cpf);
}
