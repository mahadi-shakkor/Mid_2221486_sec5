package com.oop.mahadi.demo6midexam;

import java.util.ArrayList;

public class Trainee {


    int id;
    ArrayList<String> trainingList=new ArrayList<>();

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", trainingList=" + trainingList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(ArrayList<String> trainingList) {
        this.trainingList = trainingList;
    }

    public Trainee() {
    }

    public Trainee(int id, ArrayList<String> trainingList) {
        this.id = id;
        this.trainingList = trainingList;
    }
}
