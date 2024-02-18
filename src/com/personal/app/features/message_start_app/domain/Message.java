package com.personal.app.features.message_start_app.domain;

public class Message {

    //Atributo
    private final MessageRepository messageRepository;

    //Constructor
    public Message(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    //Método mostrar mensaje
    public void showMessage() {
        if (messageRepository.firstExecute()) {
            System.out.println("Primera vez");
        }//Si el método es true, entonces se ejecta el comando

    }

}
