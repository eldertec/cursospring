package br.com.eldertec.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eldertec.cursospring.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
