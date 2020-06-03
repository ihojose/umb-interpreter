package com.ihojose.umb.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Interpretador extends Context {

    public Interpretador(String input) {
        super(input);
    }

    /**
     * Interpretador de números
     *
     * @return número resultante.
     */
    public int interpretar() {

        // Construímos el árbol
        List<Expresion> arbol = new ArrayList<>() {{
            add(new ExpresionMiles());
            add(new ExpresionCientos());
            add(new ExpresionDieses());
            add(new ExpresionUno());
        }};

        // Lo interpretamos
        for (Expresion expresion : arbol) {
            expresion.interpreter(this);
        }

        return this.output;
    }
}
