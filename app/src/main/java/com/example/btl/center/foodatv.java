package com.example.btl.center;

import java.io.Serializable;

public class foodatv implements Serializable {
    private int imgfood;
    private String foodname;
    private String congthuc;
    private String congthuc1;
    private String way;
    private String way1;
    private String motafood;


    public foodatv(int imgfood, String foodname, String congthuc, String congthuc1, String way, String way1, String motafood) {
        this.imgfood = imgfood;
        this.foodname = foodname;
        this.congthuc = congthuc;
        this.congthuc1 = congthuc1;
        this.way = way;
        this.way1 = way1;
        this.motafood = motafood;
    }

    public int getImgfood() {
        return imgfood;
    }

    public void setImgfood(int imgfood) {
        this.imgfood = imgfood;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getCongthuc() {
        return congthuc;
    }

    public void setCongthuc(String congthuc) {
        this.congthuc = congthuc;
    }

    public String getCongthuc1() {
        return congthuc1;
    }

    public void setCongthuc1(String congthuc1) {
        this.congthuc1 = congthuc1;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getWay1() {
        return way1;
    }

    public void setWay1(String way1) {
        this.way1 = way1;
    }

    public String getMotafood() {
        return motafood;
    }

    public void setMotafood(String motafood) {
        this.motafood = motafood;
    }
}
