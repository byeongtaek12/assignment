package com.example.calculator;

public class App {
    public static void main(String[] args) {
        Calculatorio calculatorio = new Calculatorio();
        boolean exit = true;
        while (exit) {
            calculatorio.longInput();
            calculatorio.operationInput();
            calculatorio.resultSaveInput();
            calculatorio.exitInput();
        }
    }
}