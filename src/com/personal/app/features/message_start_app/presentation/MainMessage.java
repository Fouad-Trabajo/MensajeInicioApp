package com.personal.app.features.message_start_app.presentation;

import com.personal.app.features.message_start_app.data.MessageDataRepository;
import com.personal.app.features.message_start_app.domain.Message;
import com.personal.app.features.message_start_app.domain.MessageRepository;

public class MainMessage {

    //Método mostrar mensaje
    public static void showWelcomeMessage() {
        MessageRepository messageRepository = new MessageDataRepository();
        Message message = new Message(messageRepository);
        message.showMessage();
    }

}
