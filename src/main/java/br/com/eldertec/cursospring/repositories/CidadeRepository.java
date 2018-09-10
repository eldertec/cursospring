package br.com.eldertec.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eldertec.cursospring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
