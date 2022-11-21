package com.nttdata.curso.MinisterioEducacao.validator;

import com.nttdata.curso.MinisterioEducacao.model.AlunoEntity;
import com.nttdata.curso.MinisterioEducacao.model.DisciplinaEntity;
import com.nttdata.curso.MinisterioEducacao.repository.AlunoRepository;
import com.nttdata.curso.MinisterioEducacao.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlunoValidator {
    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public AlunoValidator() {
    }

    public AlunoEntity validaAluno(AlunoEntity aluno) {
            if (aluno.getIdade() - aluno.getEscolaridade() != 5 &&
                    aluno.getIdade() > 6 && aluno.getIdade() < 17 &&
                    aluno.getEscolaridade() > 1  && aluno.getEscolaridade() > 12) {
                this.alunoRepository.delete(aluno);
                return null;
            } else {
                return aluno;
            }
    }

    public DisciplinaEntity validaDisciplina(DisciplinaEntity disciplinaEntity) {
        List<DisciplinaEntity> disciplinaList = disciplinaRepository.findAll();

        for (DisciplinaEntity disciplina : disciplinaList) {
            if (disciplina.getTitulo().equals(disciplinaEntity.getTitulo()) && disciplina.getArea().equals(disciplinaEntity.getArea())) {
                this.disciplinaRepository.delete(disciplinaEntity);
                return null;
            }
        }
        return disciplinaEntity;
    }

}
