package com.example.calculator;

public class App {
    public static void main(String[] args) {
        Calculatorio calculatorio = new Calculatorio();
        boolean exit = true;
        while (exit) {
            calculatorio.longIO();
            calculatorio.operationIO();
            calculatorio.resultSaveIO();
            exit = calculatorio.exitIO();
        }
    }
}