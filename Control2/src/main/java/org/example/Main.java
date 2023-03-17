package org.example;

import org.example.controller.Controller;
import org.example.data.Prize;
import org.example.data.PrizesList;
import org.example.data.Toy;
import org.example.data.ToysList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Prize toy1 = new Toy(1,"Кукла", 4, (byte) 50);
        Prize toy2 = new Toy(2,"Машинка", 2, (byte) 20);
        Prize toy3 = new Toy(3,"Мягкая игрушка", 6, (byte) 70);

        List<Prize> prizes = new ArrayList<>();
        prizes.add(toy1);
        prizes.add(toy2);

        ToysList toysList = new ToysList(prizes);
        toysList.addPrize(toy3);
        toysList.deletePrize(toy1);

        Controller controller = new Controller(toysList);
        controller.start();
    }
}