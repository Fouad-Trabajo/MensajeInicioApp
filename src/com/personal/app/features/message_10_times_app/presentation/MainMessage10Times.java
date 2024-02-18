package com.personal.app.features.message_10_times_app.presentation;

import com.personal.app.features.message_10_times_app.data.Message10TimesDataRepository;
import com.personal.app.features.message_10_times_app.domain.Message10Times;
import com.personal.app.features.message_10_times_app.domain.Message10TimesRepository;


public class MainMessage10Times {

    public static void showMessage10Times(){
        Message10TimesRepository message10TimesRepository= new Message10TimesDataRepository();
        Message10Times message10Times = new Message10Times(message10TimesRepository);
        message10Times.showMessage10Times();
    }
}
