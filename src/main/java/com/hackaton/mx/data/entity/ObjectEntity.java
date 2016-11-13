package com.hackaton.mx.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by 210068348 on 11/12/2016.
 */
@Entity
public class ObjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String column1;
    private Double column2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public Double getColumn2() {
        return column2;
    }

    public void setColumn2(Double column2) {
        this.column2 = column2;
    }
}
