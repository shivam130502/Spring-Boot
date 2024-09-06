package com.Shivam.demoProject.config;

public class ColorPrinter {

    String color;

    public ColorPrinter(String color){
        this.color = "returns color";
        System.out.println(currentColor());
    }

    private String currentColor(){
        return this.color;
    }
}
