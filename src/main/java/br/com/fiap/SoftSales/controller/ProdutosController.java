package br.com.fiap.SoftSales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProdutosController {
    
    @RequestMapping(
    method = RequestMethod.GET, 
    path = "/produtos",
    produces = "application/json")

    @ResponseBody
    public String index(){
        return"""
            [
                {
                    "id": 1,
                    "nome": "Mouse Logitech G Pro X",
                    "valor": 700.00
                }
            ]
                """;
    }


}
