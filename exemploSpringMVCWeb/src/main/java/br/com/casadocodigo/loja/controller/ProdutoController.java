package br.com.casadocodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.model.Produto;
@Controller
public class ProdutoController {
	@RequestMapping("/produtos/form")
	public String form() {
		System.out.println("Entrando no formulario");
		return "produtos/form";
	}
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
	    System.out.println(produto);
	    return "produtos/ok";
	}

}
