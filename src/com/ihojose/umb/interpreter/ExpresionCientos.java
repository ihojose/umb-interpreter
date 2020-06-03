package com.ihojose.umb.interpreter;

public class ExpresionCientos extends Expresion {

    @Override
    public String uno() {
        return "C";
    }

    @Override
    public String cuatro() {
        return "CD";
    }

    @Override
    public String cinco() {
        return "CM";
    }

    @Override
    public String nueve() {
        return "D";
    }

    @Override
    public int multiplicador() {
        return 100;
    }
}
