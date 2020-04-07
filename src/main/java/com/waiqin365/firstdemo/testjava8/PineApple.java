package com.waiqin365.firstdemo.testjava8;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/3/26 13:43
 */
public class PineApple implements Comparable{
    private Float weight;
    private String country;

    public PineApple(float weight){
        this.weight = weight;
    }

    public PineApple(float weight,String country){
        this.weight = weight;
        this.country = country;
    }

    public PineApple() {

    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PineApple{" +
                "weight=" + weight +
                ", country='" + country + '\'' +
                '}';
    }

    public static void printWhatYouSet(String str){
        System.out.println(str);
    }

    @Override
    public int compareTo(Object o) {
        return this.getWeight().compareTo(((PineApple)o).getWeight());
    }
}
