package one.dio.desafio.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Generated("jsonschema2pojo")
public class Metamorphosi {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private Integer amount;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getAmount() {
return amount;
}

public void setAmount(Integer amount) {
this.amount = amount;
}

}