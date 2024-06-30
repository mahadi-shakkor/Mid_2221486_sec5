package com.oop.mahadi.demo6midexam;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewController {


    private void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();

    }


    @FXML
    private CheckBox chack1;

    @FXML
    private CheckBox chack2;

    @FXML
    private CheckBox chack3;

    @FXML
    private CheckBox chack4;

    @FXML
    private ComboBox<String> com1;

    @FXML
    private ComboBox<String> com3;

    @FXML
    private ComboBox<String> cpm2;

    @FXML
    private TextField name;

    @FXML
    private TextField payment;

    @FXML
    private TableColumn<Demotable, String> c1;

    @FXML
    private TableColumn<Demotable, String> c10;

    @FXML
    private TableColumn<Demotable, String> c11;

    @FXML
    private TableColumn<Demotable, String> c2;

    @FXML
    private TableColumn<Demotable, String> c3;

    @FXML
    private TableColumn<Demotable, String> c4;

    @FXML
    private TableColumn<Demotable, String> c5;

    @FXML
    private TableColumn<Demotable, String> c6;

    @FXML
    private TableColumn<Demotable, String> c7;

    @FXML
    private TableColumn<Demotable, String> c8;

    @FXML
    private TableColumn<Demotable, String> c9;
    @FXML
    private TableView<Demotable> tableView;

    @FXML
    private TextArea textarea1;

    @FXML
    private TextField uniname;
    ArrayList<Trainee> arrTrainee=new ArrayList<>();

HashSet<String> hasSet=new HashSet<>();
    @FXML
    void Add(ActionEvent event) {
        ArrayList<String> aaa=new ArrayList();

        if (chack1.isSelected()){
            aaa.add("couse1");


        }
        if (chack2.isSelected()){
            aaa.add("couse2");


        }
        if (chack3.isSelected()){
            aaa.add("couse3");


        }
        if (chack4.isSelected()){
            aaa.add("couse4");


        }

        if (!hasSet.contains(com1.getValue())){

            Trainee t=new Trainee(Integer.parseInt(com1.getValue()),aaa);
            arrTrainee.add(t);
            hs3.put(com1.getValue(),t);
            hasSet.add(com1.getValue());






        }
        else {
            showAlert("already add ","select another one fron ID com");
        }








    }

    @FXML
    void Show(ActionEvent event) {

        for (Trainee t:arrTrainee){
            String x="";
            Intern i=new Intern();
            i=hs2.get(Integer.toString(t.getId()));
            tableView.getItems().add(new Demotable(
                    t.getId()+ "",i.getUniName()+"",i.getPaymentStatus()+"",
                    t.getTrainingList()+ "",t.getTrainingList().size()+"",x+"",
                    x+ "",x+"",x+"",
                    x+ "",x+""





            ));

        }




    }
ArrayList<Intern> arr1=new ArrayList<>();
    ArrayList<Intern> arr2=new ArrayList<>();
HashMap<String,Intern> hs1=new HashMap<>();
    HashMap<String,Intern> hs2=new HashMap<>();

    HashMap<String,Trainee> hs3=new HashMap<>();

    ArrayList<Intern> arr3=new ArrayList<>();

    @FXML
    void initialize() {

        c1.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C1"));
        c2.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C2"));
        c3.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C3"));
        c4.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C4"));
        c5.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C5"));
        c6.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C6"));
        c7.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C7"));
        c8.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C8"));
        c9.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C9"));
        c10.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C10"));
        c11.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C11"));
        arr1.add(new Intern(1212,"abu","Iub","Unpaid"));
        arr1.add(new Intern(112,"abuqw","nus","paid"));
        arr1.add(new Intern(125512,"asdfabu","bra","Unpaid"));
        arr1.add(new Intern(125412,"aadbu","iub","Unpaid"));
        arr1.add(new Intern(1332212,"aadasbu","nus","Unpaid"));
        arr1.add(new Intern(12212,"abafafu","nra","paid"));
        arr1.add(new Intern(1234212,"aadfadfbu","du","Unpaid"));
        arr1.add(new Intern(1223423412,"afafabu","iub","paid"));
        arr1.add(new Intern(122312,"abafafu","nuu","Unpaid"));
        arr1.add(new Intern(1256212,"aafsafbu","iit","paid"));
        com3.getItems().addAll("Unpaid","paid");
for (Intern t:arr1){
    cpm2.getItems().add(t.getUniName());

    com1.getItems().add(Integer.toString(t.getId()));
    hs2.put(Integer.toString(t.getId()),t);



}
//            public Intern(int id, String internName, String uniName, String paymentStatus) {





        }

    @FXML
    public void sel(ActionEvent actionEvent) {
        name.setText(hs2.get(com1.getValue()).getInternName());
        uniname.setText(hs2.get(com1.getValue()).getUniName());
        payment.setText(hs2.get(com1.getValue()).getPaymentStatus());

    }

    @FXML
    public void Serch(ActionEvent actionEvent) {
Integer x=0;
        for (Trainee t:arrTrainee){
          Intern i=new Intern();
          i=hs1.get(t.getId());

            if  ((i.equals(cpm2.getValue()))&&
            (i.getPaymentStatus().equals(com3.getValue()))){
                x+=1;


            }

        }

        textarea1.setText(""+x);
    }
}
