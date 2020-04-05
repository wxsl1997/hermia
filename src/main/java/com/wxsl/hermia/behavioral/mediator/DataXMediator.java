package com.wxsl.hermia.behavioral.mediator;

import com.google.common.collect.Maps;

import java.util.Map;

import static com.wxsl.hermia.behavioral.mediator.DataBaseType.ELASTICSEARCH;
import static com.wxsl.hermia.behavioral.mediator.DataBaseType.MYSQL;

public class DataXMediator implements Mediator {


    private Map<DataBaseType, BaseDataBase> dataBaseMap = Maps.newHashMap();

    @Override
    public void register(BaseDataBase dataBase) {
        dataBaseMap.put(dataBase.dataBaseType(), dataBase);
    }

    @Override
    public void sync(BaseDataBase dataBase, String data) {
        if (MYSQL.equals(dataBase.dataBaseType())) {
            dataBaseMap.get(ELASTICSEARCH).insert(data);
            dataBaseMap.get(DataBaseType.REDIS).insert(data);
        }
        if (ELASTICSEARCH.equals(dataBase.dataBaseType())) {
            dataBaseMap.get(MYSQL).insert(data);
        }
    }

    @Override
    public void display() {
        dataBaseMap.values().forEach(BaseDataBase::display);
    }
}
