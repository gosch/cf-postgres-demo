package com.hackaton.mx.controller;

import com.hackaton.mx.data.Core;
import com.hackaton.mx.data.entity.ObjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 210068348 on 11/12/2016.
 */
@Controller
public class mycontroller {

    @Autowired
    Core core;

    @RequestMapping(value = "/save/{column1}/{column2}", method = RequestMethod.GET)
    public ResponseEntity<String> saveTable(@PathVariable String column1, @PathVariable Double column2) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(core.saveEntity(column1, column2), HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(value="get/{id}", method = RequestMethod.GET)
    public ResponseEntity<ObjectEntity> getTable(@PathVariable Integer id) {
        ResponseEntity<ObjectEntity> responseEntity = new ResponseEntity<>(core.getEntity(id), HttpStatus.OK);
        return responseEntity;
    }
}
