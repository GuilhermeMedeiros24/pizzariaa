package com.itb.inf2am.pizzariaa.controler;


// No spring é comum adicionarmos anotações (annotion) em classes, atributos e métodos
// Uma anotation é uma forma de adicionar informações (metados) ao seu código que podem
// Ser interpretadas pelo compilador ou em tempo de execução pro ferramentas e framewoks
// como o Spring// Uma annotation é uma palavra iniciada com '@' qual você coloca acima de uma classe, método,
// atributo o parâmetro, para dar instruções extars ao Java ou a algum framework sobre como
// aquele elemento deve ser tratado.

import com.itb.inf2am.pizzariaa.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoControler {

    List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabresa");
        p1.setDescricao("Pizza com muita calabresa e cebola");
        p1.setValorVenda(49.50);

        // Exercicio: Criar mais um objeto

        Produto p2 = new Produto();
        p2.setNome("Pizza de Calabreso");
        p2.setDescricao("Pizza com muita calabreso");
        p2.setValorVenda(69.24);

        // Adicionando o produto
        produtos.add(p1);
        produtos.add(p2);

        return produtos;

    }
}