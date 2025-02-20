package ru.netology;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name) {

        super("Игрок с таким именем не зарегистрирован: " + name);
    }
}
