package com.example.demo2;

import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public class Test{
        private List<Integer> arr;

    }
    enum Month{
        MAY("Tháng 5"),
        JUNE ( "Tháng 6")
        ;

        private String value;
        Month(String s) {
            value = s;
        }

    }
    public static void main(String[] args) {
        System.out.println("HHHH");
        Pair<Integer, Integer> a = new Pair<Integer, Integer>(1,2);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        Pair<Integer, ArrayList<Integer>> b = new Pair<>(3,list);
        System.out.println("Key = "+ b.getKey());
        Iterator<Integer> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        for(Month m: Month.values()){
            System.out.println(m.value);
        }

        StudentBuilder studentBuilder = new StudentConcreteBuilder()
                .setFirstName("Tran")
                .setLastName("Quang Huy");

        System.out.println(studentBuilder.build());

        Map m ;

        //launch();
    }
}