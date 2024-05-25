package com.muhammet.Step5;

public class Runner {
    public static void main(String[] args) {
        Printer printer = MyFramework.INSTANCE.getPrinter("com.muhammet.Step5.ErrorPrinter",
                "com.muhammet.Step5.MessageProviderTR");
        printer.print();
    }
}
