package one.dio.desafio.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Generated("jsonschema2pojo")
@Entity
public class Monstro {
@Id
private Integer id;
private String dbname;
private String name;
private String sprite;
@OneToOne
private Stats stats;
@ElementCollection
private List<String> spawnSet;
@ElementCollection
private List<String> slaves;
@OneToMany
private List<Metamorphosi> metamorphosis;
@ElementCollection
private List<String> sounds;
@ElementCollection
private List<Integer> questObjective;
@OneToMany
private List<Drop> drops;
@ElementCollection
private List<String> mapDrops;
@ElementCollection
private List<String> mvpdrops;
@OneToMany
private List<Spawn> spawn;
@OneToMany
private List<Skill> skill;
@ElementCollection
private Map<String, Integer> propertyTable;
//@OneToOne
//private PropertyTable propertyTable;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getDbname() {
return dbname;
}

public void setDbname(String dbname) {
this.dbname = dbname;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getSprite() {
return sprite;
}

public void setSprite(String sprite) {
this.sprite = sprite;
}

public Stats getStats() {
return stats;
}

public void setStats(Stats stats) {
this.stats = stats;
}

public List<String> getSpawnSet() {
return spawnSet;
}

public void setSpawnSet(List<String> spawnSet) {
this.spawnSet = spawnSet;
}

public List<String> getSlaves() {
return slaves;
}

public void setSlaves(List<String> slaves) {
this.slaves = slaves;
}

public List<Metamorphosi> getMetamorphosis() {
return metamorphosis;
}

public void setMetamorphosis(List<Metamorphosi> metamorphosis) {
this.metamorphosis = metamorphosis;
}

public List<String> getSounds() {
return sounds;
}

public void setSounds(List<String> sounds) {
this.sounds = sounds;
}

public List<Integer> getQuestObjective() {
return questObjective;
}

public void setQuestObjective(List<Integer> questObjective) {
this.questObjective = questObjective;
}

public List<Drop> getDrops() {
return drops;
}

public void setDrops(List<Drop> drops) {
this.drops = drops;
}

public List<String> getMapDrops() {
return mapDrops;
}

public void setMapDrops(List<String> mapDrops) {
this.mapDrops = mapDrops;
}

public List<String> getMvpdrops() {
return mvpdrops;
}

public void setMvpdrops(List<String> mvpdrops) {
this.mvpdrops = mvpdrops;
}

public List<Spawn> getSpawn() {
return spawn;
}

public void setSpawn(List<Spawn> spawn) {
this.spawn = spawn;
}

public List<Skill> getSkill() {
return skill;
}

public void setSkill(List<Skill> skill) {
this.skill = skill;
}

public Map<String, Integer> getPropertyTable() {
    return propertyTable;
}

public void setPropertyTable(Map<String, Integer> propertyTable) {
    this.propertyTable = propertyTable;
}

//public PropertyTable getPropertyTable() {
//return propertyTable;
//}

//public void setPropertyTable(PropertyTable propertyTable) {
//this.propertyTable = propertyTable;
//}


}