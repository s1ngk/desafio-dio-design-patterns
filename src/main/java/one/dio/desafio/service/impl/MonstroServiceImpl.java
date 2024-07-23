package one.dio.desafio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import one.dio.desafio.model.Drop;
import one.dio.desafio.model.DropRepository;
import one.dio.desafio.model.Monstro;
import one.dio.desafio.model.MonstroRepository;
import one.dio.desafio.model.Skill;
import one.dio.desafio.model.SkillRepository;
import one.dio.desafio.model.Spawn;
import one.dio.desafio.model.SpawnRepository;
import one.dio.desafio.model.Stats;
import one.dio.desafio.model.StatsRepository;
import one.dio.desafio.service.ApiService;
import one.dio.desafio.service.MonstroService;

@Service
public class MonstroServiceImpl implements MonstroService {
    @Autowired
    private MonstroRepository monstroRepository;
    @Autowired
    private StatsRepository statsRepository;
    @Autowired
    private DropRepository dropRepository;
    @Autowired
    private SpawnRepository spawnRepository;
    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private ApiService apiService;
    @Value("${apiKey}")
    String apiKey;


    @Override
    public Monstro buscarPorId(Long id){
        Monstro  monstro = apiService.consultarMonstro(id, apiKey);
        List<Drop> dropDoMonstro =  monstro.getDrops();
        List<Spawn> spawnDoMonstro = monstro.getSpawn();
        Stats statsMonstro = monstro.getStats();
        List<Skill> skillMonstro = monstro.getSkill();
        Integer idMonstro = monstro.getId();
        statsMonstro.setId(idMonstro);
        statsRepository.save(statsMonstro);
        dropRepository.saveAll(dropDoMonstro);
        spawnRepository.saveAll(spawnDoMonstro);
        skillRepository.saveAll(skillMonstro);
        monstroRepository.save(monstro);
        return monstro;
    }
}
