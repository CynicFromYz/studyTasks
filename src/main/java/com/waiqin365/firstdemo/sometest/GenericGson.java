package com.waiqin365.firstdemo.sometest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/18 10:40
 */
public class GenericGson<T> {

    static Gson gson = new Gson();

    public static <V> List<V> json2List(String json,V v) {
        List<V> list= gson.fromJson(json, new TypeToken<List<V>>() {
        }.getType());
        return list;
    }

    public T getKet(T t){
        return t;
    }

    public <T> T genericMethod(Class<T> tClass)throws InstantiationException ,
            IllegalAccessException{
        T instance = tClass.newInstance();
        return instance;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
       GenericGson genericGson = new GenericGson();
       Animal animal = (Animal)genericGson.genericMethod(Animal.class);

       List<? extends Animal> animals = new ArrayList<>();
       List<? super Animal> animals_su = new ArrayList<>();
       animals_su.add(new Animal());
       animals_su.add(new Cat());
       int a = 5*4*10;


    }
}
