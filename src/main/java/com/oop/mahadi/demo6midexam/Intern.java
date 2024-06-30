package com.oop.mahadi.demo6midexam;

public class Intern {
    int id;
    String internName,uniName,paymentStatus;

    public Intern() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id=" + id +
                ", internName='" + internName + '\'' +
                ", uniName='" + uniName + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Intern(int id, String internName, String uniName, String paymentStatus) {
        this.id = id;
        this.internName = internName;
        this.uniName = uniName;
        this.paymentStatus = paymentStatus;
    }
}
