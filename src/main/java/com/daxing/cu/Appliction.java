package com.daxing.cu;

import com.person.factory.core.FactoryApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Appliction {

    public static void main(String[] args) {
        SpringApplication.run(Appliction.class, args);
//        FactoryApplication.run("mysql","com.mysql.jdbc.Driver","root", "x5", "jdbc:mysql://localhost:3306/cdx?useSSL=false&serverTimezone=UTC","com.daxing.cu","cdx");
    }

}
