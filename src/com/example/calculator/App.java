package com.example.calculator;

public class App {
    public static void main(String[] args) {
        Calculatorio calculatorio = new Calculatorio();
        boolean exit = true;
        while (exit) {
            calculatorio.calculateAndAboutResultSave();
            exit = calculatorio.exitIO();
        }
    }
}