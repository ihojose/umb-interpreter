package com.ihojose.umb;

import com.ihojose.umb.interpreter.*;

public class Main {

    public static void main(String[] args) {
        String romano = "LVIIX";
        Interpretador interpretador = new Interpretador(romano);

        System.out.println(interpretador.interpretar());
    }
}
