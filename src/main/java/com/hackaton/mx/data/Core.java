package com.hackaton.mx.data;

import com.hackaton.mx.data.daos.ObjectEntityDao;
import com.hackaton.mx.data.entity.ObjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 210068348 on 11/12/2016.
 */
@Service
public class Core {

    @Autowired
    ObjectEntityDao entityDao;


    public String saveEntity(String column1, Double column2) {

        ObjectEntity objectEntity = new ObjectEntity();
        objectEntity.setColumn1(column1);
        objectEntity.setColumn2(column2);
        entityDao.save(objectEntity);
        return "Ok";
    }

    public ObjectEntity getEntity(Integer id) {
        return entityDao.findOne(id);
    }
}
