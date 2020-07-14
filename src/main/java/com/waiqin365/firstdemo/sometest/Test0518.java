package com.waiqin365.firstdemo.sometest;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/18 10:09
 */
public class Test0518 {

    public static String JSON_STR = "[{\"cashValue\":0,\"createTime\":null,\"creatorId\":0,\"id\":0,\"inputType\":\"1\",\"itemDescribe\":\"\",\"itemDescribeJson\":\"[]\",\"itemId\":5,\"itemName\":\"海报\",\"modifyTime\":null,\"modifyierId\":0,\"pdIdStr\":\"\",\"pdSize\":0,\"pdValueDesc\":\"\",\"pdValueJson\":\"\",\"planId\":0,\"status\":\"\"},{\"cashValue\":0,\"createTime\":null,\"creatorId\":0,\"id\":0,\"inputType\":\"1\",\"itemDescribe\":\"\",\"itemDescribeJson\":\"[]\",\"itemId\":3,\"itemName\":\"海报DM\",\"modifyTime\":null,\"modifyierId\":0,\"pdIdStr\":\"\",\"pdSize\":0,\"pdValueDesc\":\"\",\"pdValueJson\":\"\",\"planId\":0,\"status\":\"\"},{\"cashValue\":\"32.00\",\"createTime\":null,\"creatorId\":0,\"id\":0,\"inputType\":\"1\",\"itemDescribe\":\"SKU数:15；排面数:20\",\"itemDescribeJson\":\"[{\\\"label_id\\\":\\\"sku_000000001\\\",\\\"label_name\\\":\\\"SKU数\\\",\\\"label_type\\\":\\\"1\\\",\\\"label_required\\\":\\\"1\\\",\\\"label_order\\\":1,\\\"label_options\\\":[],\\\"label_val\\\":\\\"15\\\",\\\"label_val_show\\\":\\\"15\\\"},{\\\"label_id\\\":\\\"pm_000000001\\\",\\\"label_name\\\":\\\"排面数\\\",\\\"label_type\\\":\\\"1\\\",\\\"label_required\\\":\\\"1\\\",\\\"label_order\\\":2,\\\"label_options\\\":[],\\\"label_val\\\":\\\"20\\\",\\\"label_val_show\\\":\\\"20\\\"}]\",\"itemId\":7,\"itemName\":\"货架陈列\",\"modifyTime\":null,\"modifyierId\":0,\"pdIdStr\":\"\",\"pdSize\":0,\"pdValueDesc\":\"配额商品01 62包；万贝多属性测试商品 26件；康师傅果粒橙 54瓶\",\"pdValueJson\":\"[{\\\"pd_name\\\":\\\"配额商品01\\\",\\\"pd_id\\\":\\\"7113598764891873920\\\",\\\"pd_val\\\":\\\"62\\\",\\\"unit_id\\\":\\\"4680054156428465520\\\",\\\"unit_name\\\":\\\"包\\\"},{\\\"pd_name\\\":\\\"万贝多属性测试商品\\\",\\\"pd_id\\\":\\\"8605675122583306209\\\",\\\"pd_val\\\":\\\"26\\\",\\\"unit_id\\\":\\\"9140939695514346861\\\",\\\"unit_name\\\":\\\"件\\\"},{\\\"pd_name\\\":\\\"康师傅果粒橙\\\",\\\"pd_id\\\":\\\"5021644959447588218\\\",\\\"pd_val\\\":\\\"54\\\",\\\"unit_id\\\":\\\"6966899572730588940\\\",\\\"unit_name\\\":\\\"瓶\\\"}]\",\"planId\":0,\"status\":\"\"}]";

    public static String EMPTY_STR = "";

    public static Gson gson = new Gson();

    public static void main(String[] args) {
//        List<CuxiaoPlanCashStandard> objList = new Gson().fromJson(JSON_STR, new TypeToken<List<CuxiaoPlanCashStandard>>() {
//        }.getType());
//        List<CuxiaoPlanCashStandard> list = GenericGson.json2List(JSON_STR);
//        for (CuxiaoPlanCashStandard cashStandard : list) {
//            System.out.println(cashStandard.getCashValue());
//        }
//        System.out.println("123");
//        GenericGson<Animal> genericGson = new GenericGson<>();
//        Animal animal = new Animal();
//        animal.setName("animal");
//        Animal animal1 = genericGson.getKet(animal);
//        System.out.println(animal1.getName());
//        List<Animal> list = JSONArray.parseArray(EMPTY_STR,Animal.class);
//        for (Animal animal:list){
//            System.out.println(animal.getName());
//        }
//        System.out.println("123");
//        Animal animal = new Animal();
//        animal.setName("bbiz");
//        List<Animal> list = getVoid(animal);
//        System.out.println(list.get(0));
    }

    public static <T> List<T> getVoid(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }

}
