package com.example.androideatit.Model;

public class User {
    private String NIM;
    private String Nama;
    private String Password;
    private String Phone;

    public User() {
    }

    public User(String NIM, String nama, String password) {
        this.NIM = NIM;
        Nama = nama;
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
