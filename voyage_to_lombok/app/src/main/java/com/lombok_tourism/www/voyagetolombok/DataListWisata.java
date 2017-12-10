package com.lombok_tourism.www.voyagetolombok;

public class DataListWisata {
    public int item_image;
    public String item_title;
    public String item_subtitle;
    public String item_deskripsi;
    public String item_jarak_tempuh;
    public String item_wktu_prjlnan;
    public String item_tlpn;
    public String item_web;

    public DataListWisata(int item_image, String item_title, String item_subtitle, String item_deskripsi,
                          String item_jarak_tempuh, String item_wktu_prjlnan, String item_tlpn, String item_web)
    {
        this.item_image = item_image;
        this.item_title = item_title;
        this.item_subtitle = item_subtitle;
        this.item_deskripsi = item_deskripsi;
        this.item_jarak_tempuh = item_jarak_tempuh;
        this.item_wktu_prjlnan = item_wktu_prjlnan;
        this.item_tlpn = item_tlpn;
        this.item_web = item_web;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getItem_subtitle() {
        return item_subtitle;
    }

    public void setItem_subtitle(String item_subtitle) {
        this.item_subtitle = item_subtitle;
    }

    public String getItem_deskripsi() {
        return item_deskripsi;
    }

    public void setItem_deskripsi(String item_deskripsi) {
        this.item_deskripsi = item_deskripsi;
    }

    public String getItem_jarak_tempuh() {
        return item_jarak_tempuh;
    }

    public void setItem_jarak_tempuh(String item_jarak_tempuh) {
        this.item_jarak_tempuh = item_jarak_tempuh;
    }

    public String getItem_wktu_prjlnan() {
        return item_wktu_prjlnan;
    }

    public void setItem_wktu_prjlnan(String item_wktu_prjlnan) {
        this.item_wktu_prjlnan = item_wktu_prjlnan;
    }

    public String getItem_tlpn() {
        return item_tlpn;
    }

    public void setItem_tlpn(String item_tlpn) {
        this.item_tlpn = item_tlpn;
    }

    public String getItem_web() {
        return item_web;
    }

    public void setItem_web(String item_web) {
        this.item_web = item_web;
    }
}
