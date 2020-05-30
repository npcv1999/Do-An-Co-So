package com.example.congtimviecit;

public class Ungvien {
    private String tenungvien;
    private String tenhinh;
    public Ungvien(String tenungvien, String tenhinh){
        this.tenungvien = tenungvien;
        this.tenhinh=tenhinh;
    }
    public String getTenungvien() {
        return tenungvien;
    }

    public void setTenungvieny(String tenungvien) {
        this.tenungvien = tenungvien;
    }

    public String getTenhinh() {
        return tenhinh;
    }

    public void setTenhinh(String tenhinh) {
        this.tenhinh= tenhinh;
    }

}
