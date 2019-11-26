package com.nihui.springcloud.consumer.bean;

/**
 * @Classname HouseInfo
 * @Description TODO
 * @Date 2019/11/25 3:34 PM
 * @Created by nihui
 */
public class HouseInfo {
    private Long floor;
    private String city;
    private String street;
    private String village;


    public HouseInfo(Long floor, String city, String street, String village) {
        this.floor = floor;
        this.city = city;
        this.street = street;
        this.village = village;
    }

    public HouseInfo() {
    }

    public Long getFloor() {
        return floor;
    }

    public void setFloor(Long floor) {
        this.floor = floor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}
