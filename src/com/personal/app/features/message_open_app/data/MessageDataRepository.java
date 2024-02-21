package com.personal.app.features.message_open_app.data;

import com.personal.app.features.message_open_app.domain.MessageRepository;

//Importar clases necesarias
import java.io.File;
import java.io.IOException;

public class MessageDataRepository implements MessageRepository {
    private static final String FILE_TYPE = "run_fichero";
    private static final String FILES_TYPES= "execute_fichero";

    private File file= new File(FILE_TYPE);
    private int contador = 1;

    //Mensaje primera ejecución del programa
    @Override
    public boolean firstExecute() {

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


    //Mensaje por ejecutar 10 veces el programa
    @Override
    public int execute10Times() {


        if (contador < 10) {
            contador++;
            file = new File(FILE_TYPE + contador);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return contador;
    }



}
