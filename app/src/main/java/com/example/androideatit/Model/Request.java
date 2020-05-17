package com.example.androideatit.Model;

import com.example.androideatit.Model.Order;

import java.util.List;

public class Request {
    private String phone;
    private String name;
    private String nim;
    private String address;
    private String total;
    private String status;
    private List<Order> foods; //list of food order

    public Request() {
    }

    public Request(String phone, String name, String nim, String address, String total, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.nim = nim;
        this.address = address;
        this.total = total;
        this.foods = foods;
        this.status = "0"; //0=Masih dalam antrian
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
