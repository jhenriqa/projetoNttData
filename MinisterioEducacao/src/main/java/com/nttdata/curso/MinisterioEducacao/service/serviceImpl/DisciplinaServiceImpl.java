package com.nttdata.curso.MinisterioEducacao.service.serviceImpl;


import com.nttdata.curso.MinisterioEducacao.model.AlunoEntity;
import com.nttdata.curso.MinisterioEducacao.model.DisciplinaEntity;
import com.nttdata.curso.MinisterioEducacao.repository.DisciplinaRepository;
import com.nttdata.curso.MinisterioEducacao.service.DisciplinaService;
import com.nttdata.curso.MinisterioEducacao.validator.AlunoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

    @Autowired
    public DisciplinaRepository disciplinaRepository;
    @Autowired
    private AlunoValidator alunoValidator;

    @Override
    public List<DisciplinaEntity> findAll() {
        return disciplinaRepository.findAll();
    }

    @Override
    public void save(DisciplinaEntity disciplina) {
        disciplinaRepository.save(disciplina);
    }

    @Override
    public void delete(DisciplinaEntity disciplina) {
        disciplinaRepository.delete(disciplina);
    }

    @Override
    public DisciplinaEntity validaDisciplina(DisciplinaEntity disciplina) {
            return alunoValidator.validaDisciplina(disciplina);
        }

    @Override
    public DisciplinaEntity findDisciplinaById(Integer id){
        return disciplinaRepository.findDisciplinaById(id);
    }
}
