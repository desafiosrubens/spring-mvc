package br.com.casadocodigo.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.model.Produto;
import br.com.casadocodigo.loja.model.TipoPreco;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("/produtos/form")
	public ModelAndView  form() {
		System.out.println("Entrando no formulario");
		ModelAndView modelAndView = new ModelAndView("produtos/form"); 
		modelAndView.addObject("tipos", TipoPreco.values());
		return  modelAndView ;
	}
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
	    System.out.println(produto);
	    produtoDAO.gravar(produto);
	    return "produtos/ok";
	}

}
