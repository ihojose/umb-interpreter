package com.ihojose.umb.interpreter;

public class ExpresionDieses extends Expresion {

    @Override
    public String uno() {
        return "X";
    }

    @Override
    public String cuatro() {
        return "XL";
    }

    @Override
    public String cinco() {
        return "L";
    }

    @Override
    public String nueve() {
        return "XC";
    }

    @Override
    public int multiplicador() {
        return 10;
    }
}
