package com.ihojose.umb.interpreter;

public class ExpresionUno extends Expresion {
    @Override
    public String uno() {
        return "I";
    }

    @Override
    public String cuatro() {
        return "IV";
    }

    @Override
    public String cinco() {
        return "V";
    }

    @Override
    public String nueve() {
        return "IX";
    }

    @Override
    public int multiplicador() {
        return 1;
    }
}
