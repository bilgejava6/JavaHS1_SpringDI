package com.muhammet.Step3;

public class DefaultPrinter implements Printer{
    private Provider provider;
    @Override
    public void print() {
        System.out.println(provider.getMessage());
    }

    @Override
    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
