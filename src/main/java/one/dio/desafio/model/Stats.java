package one.dio.desafio.model;

import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;

@Entity
@Generated("jsonschema2pojo")
public class Stats {
@Id
private Integer id;
private Integer attackRange;
private Integer level;
private Integer health;
private Integer sp;
private Integer str;
private Integer _int;
private Integer vit;
private Integer dex;
private Integer agi;
private Integer luk;
private Integer rechargeTime;
private Integer atk1;
private Integer atk2;
/*@OneToOne
private Attack attack;
@OneToOne
private MagicAttack magicAttack;*/
@ElementCollection
private Map<String, Integer> attack;
@ElementCollection
private Map<String, Integer> magicAttack;
private Integer defense;
private Integer baseExperience;
private Integer jobExperience;
private Integer aggroRange;
private Integer escapeRange;
private Double movementSpeed;
private Double attackSpeed;
private Double attackedSpeed;
private Integer element;
private Integer scale;
private Integer race;
private Integer magicDefense;
private Integer hit;
private Integer flee;
private String ai;
private Integer mvp;
private Integer _class;
private Integer attr;
private Integer res;
private Integer mres;


public void setId(Integer id) {
    this.id = id;
}

public Integer getAttackRange() {
return attackRange;
}

public void setAttackRange(Integer attackRange) {
this.attackRange = attackRange;
}

public Integer getLevel() {
return level;
}

public void setLevel(Integer level) {
this.level = level;
}

public Integer getHealth() {
return health;
}

public void setHealth(Integer health) {
this.health = health;
}

public Integer getSp() {
return sp;
}

public void setSp(Integer sp) {
this.sp = sp;
}

public Integer getStr() {
return str;
}

public void setStr(Integer str) {
this.str = str;
}

public Integer getInt() {
return _int;
}

public void setInt(Integer _int) {
this._int = _int;
}

public Integer getVit() {
return vit;
}

public void setVit(Integer vit) {
this.vit = vit;
}

public Integer getDex() {
return dex;
}

public void setDex(Integer dex) {
this.dex = dex;
}

public Integer getAgi() {
return agi;
}

public void setAgi(Integer agi) {
this.agi = agi;
}

public Integer getLuk() {
return luk;
}

public void setLuk(Integer luk) {
this.luk = luk;
}

public Integer getRechargeTime() {
return rechargeTime;
}

public void setRechargeTime(Integer rechargeTime) {
this.rechargeTime = rechargeTime;
}

public Integer getAtk1() {
return atk1;
}

public void setAtk1(Integer atk1) {
this.atk1 = atk1;
}

public Integer getAtk2() {
return atk2;
}

public void setAtk2(Integer atk2) {
this.atk2 = atk2;
}

/*public Attack getAttack() {
return attack;
}

public void setAttack(Attack attack) {
this.attack = attack;
}

public MagicAttack getMagicAttack() {
return magicAttack;
}

public void setMagicAttack(MagicAttack magicAttack) {
this.magicAttack = magicAttack;
}*/


public Integer getDefense() {
return defense;
}

public Map<String, Integer> getAttack() {
    return attack;
}

public void setAttack(Map<String, Integer> attack) {
    this.attack = attack;
}

public Map<String, Integer> getMagicAttack() {
    return magicAttack;
}

public void setMagicAttack(Map<String, Integer> magicAttack) {
    this.magicAttack = magicAttack;
}

public void setDefense(Integer defense) {
this.defense = defense;
}

public Integer getBaseExperience() {
return baseExperience;
}

public void setBaseExperience(Integer baseExperience) {
this.baseExperience = baseExperience;
}

public Integer getJobExperience() {
return jobExperience;
}

public void setJobExperience(Integer jobExperience) {
this.jobExperience = jobExperience;
}

public Integer getAggroRange() {
return aggroRange;
}

public void setAggroRange(Integer aggroRange) {
this.aggroRange = aggroRange;
}

public Integer getEscapeRange() {
return escapeRange;
}

public void setEscapeRange(Integer escapeRange) {
this.escapeRange = escapeRange;
}

public Double getMovementSpeed() {
return movementSpeed;
}

public void setMovementSpeed(Double movementSpeed) {
this.movementSpeed = movementSpeed;
}

public Double getAttackSpeed() {
return attackSpeed;
}

public void setAttackSpeed(Double attackSpeed) {
this.attackSpeed = attackSpeed;
}

public Double getAttackedSpeed() {
return attackedSpeed;
}

public void setAttackedSpeed(Double attackedSpeed) {
this.attackedSpeed = attackedSpeed;
}

public Integer getElement() {
return element;
}

public void setElement(Integer element) {
this.element = element;
}

public Integer getScale() {
return scale;
}

public void setScale(Integer scale) {
this.scale = scale;
}

public Integer getRace() {
return race;
}

public void setRace(Integer race) {
this.race = race;
}

public Integer getMagicDefense() {
return magicDefense;
}

public void setMagicDefense(Integer magicDefense) {
this.magicDefense = magicDefense;
}

public Integer getHit() {
return hit;
}

public void setHit(Integer hit) {
this.hit = hit;
}

public Integer getFlee() {
return flee;
}

public void setFlee(Integer flee) {
this.flee = flee;
}

public String getAi() {
return ai;
}

public void setAi(String ai) {
this.ai = ai;
}

public Integer getMvp() {
return mvp;
}

public void setMvp(Integer mvp) {
this.mvp = mvp;
}

public Integer getClass_() {
return _class;
}

public void setClass_(Integer _class) {
this._class = _class;
}

public Integer getAttr() {
return attr;
}

public void setAttr(Integer attr) {
this.attr = attr;
}

public Integer getRes() {
return res;
}

public void setRes(Integer res) {
this.res = res;
}

public Integer getMres() {
return mres;
}

public void setMres(Integer mres) {
this.mres = mres;
}

}