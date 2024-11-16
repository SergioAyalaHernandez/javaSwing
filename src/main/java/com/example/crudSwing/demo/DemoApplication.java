package com.example.crudSwing.demo;


import com.example.crudSwing.demo.swing.PersonUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        System.setProperty("java.awt.headless", "false");
        java.awt.EventQueue.invokeLater(() -> new PersonUI().setVisible(true));
    }
}
