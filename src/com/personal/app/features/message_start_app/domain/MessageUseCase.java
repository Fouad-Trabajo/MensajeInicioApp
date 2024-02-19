package com.personal.app.features.message_start_app.domain;

public class MessageUseCase {

    //Atributo
    private final MessageRepository messageRepository;

    //Constructor
    public MessageUseCase(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    //Método mostrar mensaje
    public void showMessage() {
        if (messageRepository.firstExecute()) {
            System.out.println("Primera vez");
        }//Si el método es true, entonces se ejecta el comando

    }

}
