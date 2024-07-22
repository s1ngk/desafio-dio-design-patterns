package one.dio.desafio.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import one.dio.desafio.model.Monstro;

@FeignClient(name = "Monster", url = "https://www.divine-pride.net/api")
public interface ApiService {
    // Monstro consultarMonstro(@PathVariable("id") Long id, @PathVariable("apiKey"), String apiKey);
    @GetMapping("/database/Monster/{id}?apiKey={apiKey}")
    @ResponseBody
    Monstro consultarMonstro(@PathVariable Long id, @PathVariable String apiKey);
}
