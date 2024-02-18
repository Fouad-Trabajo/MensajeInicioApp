package com.personal.app.features.message_10_times_app.data;

import com.personal.app.features.message_10_times_app.domain.Message10TimesRepository;

import java.io.File;
import java.io.IOException;

public class Message10TimesDataRepository implements Message10TimesRepository {

    private static final String FILE_TYPE="open10Times.txt";



    @Override
    public int open10Times() {
        int count = 1;
        File file = new File(FILE_TYPE + count + ".txt");
        while (file.exists()) {
            count++;
            file = new File(FILE_TYPE + count + ".txt");
        }
        if (count < 10) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return count;
    }


}
