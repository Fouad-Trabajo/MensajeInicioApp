package com.personal.app.features.message_open_app.domain;

public interface MessageRepository {
    boolean firstExecute();

    int execute10Times();

    /*
     *  Método booleano (verdadero/falso) para saber si es la
     *  primera vez que se abre la aplicación
     */

}
