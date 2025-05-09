package com.springcloud.msvc.cursos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springcloud.msvc.cursos.entity.Curso;

public interface CursoRespository extends CrudRepository<Curso, Long> {
	
	

}
