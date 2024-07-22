package one.dio.desafio.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Generated("jsonschema2pojo")
@Entity
public class Drop {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private Integer itemId;
private Integer chance;
private Boolean stealProtected;
private String serverTypeName;
private String optionGroup;

public Integer getItemId() {
return itemId;
}

public void setItemId(Integer itemId) {
this.itemId = itemId;
}

public Integer getChance() {
return chance;
}

public void setChance(Integer chance) {
this.chance = chance;
}

public Boolean getStealProtected() {
return stealProtected;
}

public void setStealProtected(Boolean stealProtected) {
this.stealProtected = stealProtected;
}

public Object getServerTypeName() {
return serverTypeName;
}

public void setServerTypeName(String serverTypeName) {
this.serverTypeName = serverTypeName;
}

public String getOptionGroup() {
return optionGroup;
}

public void setOptionGroup(String optionGroup) {
this.optionGroup = optionGroup;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

}