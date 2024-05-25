package com.muhammet.Step2;

public class Print {
    public void printMessage(MessageType type){
        switch (type){
            case STANDART -> System.out.println("Merhaba dünya!");
            case ERROR -> System.err.println("Merhaba dünya!");
        }
    }
}
