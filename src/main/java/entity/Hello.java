package entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "hello")
@Entity
public class Hello {
    @Id
    @GeneratedValue
    private Long id;

}
