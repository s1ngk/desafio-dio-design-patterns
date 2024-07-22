package one.dio.desafio.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Generated("jsonschema2pojo")
public class MagicAttack {
@Id
private Integer id;
private Integer minimum;
private Integer maximum;

public Integer getMinimum() {
return minimum;
}

public void setMinimum(Integer minimum) {
this.minimum = minimum;
}

public Integer getMaximum() {
return maximum;
}

public void setMaximum(Integer maximum) {
this.maximum = maximum;
}

}