package one.dio.desafio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpawnRepository extends CrudRepository<Spawn, Integer>{

}
