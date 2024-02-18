package com.personal.app.features.message_start_app.data;

import com.personal.app.features.message_start_app.domain.MessageRepository;

//Importar clases necesarias
import java.io.File;
import java.io.IOException;

public class MessageDataRepository implements MessageRepository {

    private static final String FILE_TYPE = "run_fichero.txt";

    @Override
    public boolean firstExecute() {
        File file = new File(FILE_TYPE);
        if (!file.exists()) {
            try {
                file.createNewFile();
                //Intenta crear un nuevo archivo. Si el archivo se crea con éxito, return true
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            } //Si ocurre una excepción al intentar crear el archivo, return false
        }
        return false;
    }
}
