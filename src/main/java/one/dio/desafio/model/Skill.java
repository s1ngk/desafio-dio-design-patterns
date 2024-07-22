package one.dio.desafio.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Generated("jsonschema2pojo")
public class Skill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private Integer idx;
private Integer skillId;
private String status;
private Integer level;
private Integer chance;
private Integer casttime;
private Integer delay;
private Boolean interruptable;
private Boolean changeTo;
private Boolean condition;
private Boolean conditionValue;
private String sendType;
private Integer sendValue;

public Integer getIdx() {
return idx;
}

public void setIdx(Integer idx) {
this.idx = idx;
}

public Integer getSkillId() {
return skillId;
}

public void setSkillId(Integer skillId) {
this.skillId = skillId;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public Integer getLevel() {
return level;
}

public void setLevel(Integer level) {
this.level = level;
}

public Integer getChance() {
return chance;
}

public void setChance(Integer chance) {
this.chance = chance;
}

public Integer getCasttime() {
return casttime;
}

public void setCasttime(Integer casttime) {
this.casttime = casttime;
}

public Integer getDelay() {
return delay;
}

public void setDelay(Integer delay) {
this.delay = delay;
}

public Boolean getInterruptable() {
return interruptable;
}

public void setInterruptable(Boolean interruptable) {
this.interruptable = interruptable;
}

public Object getChangeTo() {
return changeTo;
}

public void setChangeTo(Boolean changeTo) {
this.changeTo = changeTo;
}

public Object getCondition() {
return condition;
}

public void setCondition(Boolean condition) {
this.condition = condition;
}

public Object getConditionValue() {
return conditionValue;
}

public void setConditionValue(Boolean conditionValue) {
this.conditionValue = conditionValue;
}

public Object getSendType() {
return sendType;
}

public void setSendType(String sendType) {
this.sendType = sendType;
}

public Object getSendValue() {
return sendValue;
}

public void setSendValue(Integer sendValue) {
this.sendValue = sendValue;
}


}