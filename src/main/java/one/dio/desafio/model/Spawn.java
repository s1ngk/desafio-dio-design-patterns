package one.dio.desafio.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Generated("jsonschema2pojo")
public class Spawn {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String mapname;
private Integer amount;
private Integer respawnTime;

public String getMapname() {
return mapname;
}

public void setMapname(String mapname) {
this.mapname = mapname;
}

public Integer getAmount() {
return amount;
}

public void setAmount(Integer amount) {
this.amount = amount;
}

public Integer getRespawnTime() {
return respawnTime;
}

public void setRespawnTime(Integer respawnTime) {
this.respawnTime = respawnTime;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

}