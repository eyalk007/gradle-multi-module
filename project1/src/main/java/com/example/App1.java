package com.example;

import org.apache.commons.io.FileUtils;
import java.io.File;

public class App1 {
    public static void main(String[] args) {
        System.out.println("Project 1 using commons-io");
        File file = FileUtils.getFile("test.txt");
    }
}

