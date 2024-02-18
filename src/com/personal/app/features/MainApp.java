package com.personal.app.features;

import com.personal.app.features.message_10_times_app.presentation.MainMessage10Times;
import com.personal.app.features.message_start_app.presentation.MainMessage;

public class MainApp {
    public static void main(String[] args) {

        //Llamada al método de mensaje de bienvenida
        MainMessage.showWelcomeMessage();

        //Llamada al método de abrir la aplicación 10 veces
        MainMessage10Times.showMessage10Times();
    }
}