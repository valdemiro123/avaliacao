package fvs.edu.br.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.Services.FuncionarioService;
import fvs.edu.br.domain.Funcionario;

@RestController
@RequestMapping(value="/funcionario")
public class FuncionarioResources {

	@Autowired
	private FuncionarioService service;
	
    @RequestMapping(value="{/id}" , method=RequestMethod.GET) 
	public ResponseEntity<?>find(@PathVariable Integer id){
    	 Funcionario Func = service.buscar(id);
    	 
    	 return ResponseEntity.ok().body(Func);
    	
    }
	
	
	
}
