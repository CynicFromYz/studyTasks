package com.waiqin365.firstdemo.sometest;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/19 10:25
 */
public class ShopInfo {
    public String shopId;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    private class InnerShop{
        String shopId;
        String getMe(){
            return shopId;
        }
    }
}
