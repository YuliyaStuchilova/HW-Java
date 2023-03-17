package org.example.controller;

import org.example.data.ToysList;

import java.util.Scanner;

public class Controller {

    private ToysList toysList;

    public Controller(ToysList toysList) {
        this.toysList = toysList;
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: \n");
            System.out.println("1. Загрузить список игрушек из файла\n");
            System.out.println("3. Сохранить игрушки в файл\n");
            System.out.println("4. Выйти из программы");

            switch (sc.nextInt()) {
                case 1:
                    toysList.readPrize();
                    break;
                case 2:
                    toysList.savePrize();
                    break;
                case 3:
                    sc.close();
                    return;
            }

        }
    }
}
