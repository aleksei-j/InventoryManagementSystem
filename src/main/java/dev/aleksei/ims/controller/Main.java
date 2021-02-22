package dev.aleksei.ims.controller;

import dev.aleksei.ims.input.InputAcceptor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            InputAcceptor.getInfo(scanner);
            InputAcceptor.showInfo(scanner);
        }
    }
}
