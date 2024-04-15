package org.hibernate.jpamodelgen.test.moduleinfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Value {

    @Id
    private Integer id;

    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
