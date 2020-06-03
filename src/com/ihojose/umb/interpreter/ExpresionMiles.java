package com.ihojose.umb.interpreter;

public class ExpresionMiles extends Expresion {
    @Override
    public String uno() {
        return "M";
    }

    @Override
    public String cuatro() {
        return " ";
    }

    @Override
    public String cinco() {
        return " ";
    }

    @Override
    public String nueve() {
        return " ";
    }

    @Override
    public int multiplicador() {
        return 1000;
    }
}
