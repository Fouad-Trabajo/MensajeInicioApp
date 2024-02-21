package com.personal.app.features;

import com.personal.app.features.message_open_app.presentation.MainMessage;

public class MainApp {
    public static void main(String[] args) {

        //Llamada al método de mensaje de bienvenida
        MainMessage.showWelcomeMessage();

        //Llamada al método de abrir la aplicación 10 veces
        MainMessage.showMessageExecute10Times();
    }
}