package br.com.eldertec.cursospring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.eldertec.cursospring.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat = new Categoria(1, "Informatica");
		Categoria cat1 = new Categoria(2, "Escritorio");
		
		List<Categoria> retorno = new ArrayList<>();
		
		retorno.add(cat);
		retorno.add(cat1);
		
		return retorno;
	}
}
