package one.dio.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.dio.desafio.model.Monstro;
import one.dio.desafio.service.MonstroService;

@RestController
@RequestMapping("monstros")
public class MonstroRestController {
    @Autowired
    private MonstroService monstroService;

    @GetMapping("/{id}")
    public ResponseEntity<Monstro> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(monstroService.buscarPorId(id));
    }
}
