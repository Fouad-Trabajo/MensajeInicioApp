package com.personal.app.features.message_open_app.domain;

import java.util.Scanner;

public class Message10TimesUseCase {
    public final MessageRepository messageRepository;


    public Message10TimesUseCase(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void showMessage10Times() {
        if (messageRepository.execute10Times() == 10) {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Te gustaría votarnos?");
            String respuesta = sc.next();
            if (respuesta.equals("si")) {
                System.out.println("¿Cuantas estrellas nos otorgas?");
                double respuesta2 = sc.nextDouble();
                System.out.println("Gracias por las " + respuesta2 + " estrellas XD");
            }
        }
    }

}
