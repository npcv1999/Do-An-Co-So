package com.example.congtimviecit;

public class Selected {

    private String tencty;

    // Image name (Without extension)
    private String tenhinh;

    private String luong;
    private String vitri;
    private String loaicv;

    public Selected(String tencty, String luong,String tenhinh, String loaicv ,String vitri) {
        this.tencty= tencty;
        this.luong= luong;
        this.vitri= vitri;
        this.loaicv= loaicv;
        this.tenhinh= tenhinh;

    }

    public String getTencty() {
        return tencty;
    }

    public void setTencty(String tencty) {
        this.tencty= tencty;
    }

    public String getTenhinh() {
        return tenhinh;
    }

    public void setTenhinh(String tenhinh) {
        this.tenhinh= tenhinh;
    }

    public String getLoaicv() {
        return loaicv;
    }

    public void setLoaicv(String loaicv) {
        this.loaicv= loaicv;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong= luong;
    }
    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri= vitri;
    }


    @Override
    public String toString()  {
        return this.tenhinh+"\nMức lương: "+ this.luong+" \nVị trí: "+ this.loaicv+"";
    }
}
