package com.mr.common.utils.mongodb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;


import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MongoDBUtuls<T> {
    @Autowired
    private MongoTemplate mongoTemplate;


    public void save(Object par,String collectionName){


        mongoTemplate.save(par,collectionName);



    }


    public T findInfo(T entity,Query query ,String collectionName){


        T demo = (T) mongoTemplate.findOne(query,entity.getClass(),collectionName);


        return demo;

    }

    public List<T> findInfoAll(T entity, Query query,String collectionName){


        List<T> demo = (List<T>) mongoTemplate.find(query,entity.getClass(),collectionName);


        return demo;

    }


    public void update(Query query, Update update ,String collectionName){

        mongoTemplate.updateFirst(query,update,collectionName);
    }





}
