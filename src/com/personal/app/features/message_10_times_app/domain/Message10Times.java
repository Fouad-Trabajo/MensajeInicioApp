package com.personal.app.features.message_10_times_app.domain;

import java.util.Scanner;

public class Message10Times {


    //Atributo de tipo Interface
    private final Message10TimesRepository message10TimesRepository;

    //Constructor
    public Message10Times(Message10TimesRepository message10TimesRepository) {
        this.message10TimesRepository = message10TimesRepository;
    }

    public void showMessage10Times() {
        Scanner sc = new Scanner(System.in);
        if (message10TimesRepository.open10Times() == 10) {
            System.out.println("Veo que te gusta la app, ¿Quieres votarnos?");
            String respuesta = sc.next();
            while (respuesta.equals("si")) {
                System.out.println("¿Cuantas estrellas nos das?");
                double respuesta2 = sc.nextDouble();
                if (respuesta2 > 4.5) {
                    System.out.println("Gracias por las " + respuesta2 + " estrellas. 😁😁😁😁");
                } else {
                    System.out.println("Enserio solo " + respuesta2 + " estrellas...");
                }
                break;
            }
        }
    }
}
