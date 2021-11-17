package com.company;

public class Main {
    public static void main(String[] args) {
        Vokzal vokzal = new Vokzal("Киевский","пл.Киевского вокзала 1");
        vokzal.name = "Киевский";
        vokzal.address = "пл.Киевского вокзала 1";
        System.out.println("Имя вокзала:" + vokzal.name + " адрес:" + vokzal.address);
        Ticket ticket = new Ticket("Санкт-Петербург", "6000");
        ticket.city = "Санкт-Петербург";
        ticket.Price = "6000";
        System.out.println("Город:" + ticket.city + " цена:" + ticket.Price);
        Пассажир пассажир = new Пассажир ("Александр", "33");
        пассажир.name = "Александр";
        пассажир.age = "33";
        System.out.println("Имя:" + пассажир.name + " возраст:" + пассажир.age);
        Vagon vagon = new Vagon("4", "9");
        vagon.mesto = "4";
        vagon.number = "9";
        System.out.println("Место:" + vagon.mesto + " номер вагона:" + vagon.number);


    }
}
