package com.personal.app.features.message_open_app.presentation;

import com.personal.app.features.message_open_app.data.MessageDataRepository;
import com.personal.app.features.message_open_app.domain.Message10TimesUseCase;
import com.personal.app.features.message_open_app.domain.MessageUseCase;
import com.personal.app.features.message_open_app.domain.MessageRepository;

public class MainMessage {

    //Método mostrar mensaje
    public static void showWelcomeMessage() {
        MessageRepository messageRepository = new MessageDataRepository();
        MessageUseCase messageUseCase = new MessageUseCase(messageRepository);
        messageUseCase.showMessage();
    }

    public static void showMessageExecute10Times(){
        MessageRepository messageRepository = new MessageDataRepository();
        Message10TimesUseCase message10TimesUseCase = new Message10TimesUseCase(messageRepository);
        message10TimesUseCase.showMessage10Times();
    }

}
