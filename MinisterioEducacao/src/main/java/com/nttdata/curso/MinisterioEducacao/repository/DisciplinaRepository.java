package com.nttdata.curso.MinisterioEducacao.repository;

import com.nttdata.curso.MinisterioEducacao.model.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<DisciplinaEntity,Long> {

    @Query("select d from DISCIPLINA d where d.id =:id")
    DisciplinaEntity findDisciplinaById(Integer id);
}
