package com.example.face_recognition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FaceRecognitionApplication {

    public static void main(String[] args) {
        System.out.println("args = " + args);
        SpringApplication.run(FaceRecognitionApplication.class, args);
    }

}
