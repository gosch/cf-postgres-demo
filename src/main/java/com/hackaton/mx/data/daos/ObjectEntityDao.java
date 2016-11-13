package com.hackaton.mx.data.daos;

import com.hackaton.mx.data.entity.ObjectEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 210068348 on 11/12/2016.
 */

public interface ObjectEntityDao extends CrudRepository<ObjectEntity, Integer> {
}
