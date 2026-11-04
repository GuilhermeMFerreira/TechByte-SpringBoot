package com.dt2.techbyte.controllers;


import com.dt2.techbyte.entity.produto_ti;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class produto_ti_Controller {
    @GetMapping("Produto")
    public produto_ti mostrar(){
        produto_ti p = new produto_ti("Palaca de videio","bua pá jogo",1499.99);
        return p;
    }
}
