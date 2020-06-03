package com.ihojose.umb.interpreter;

public abstract class Expresion {

    public abstract String uno();

    public abstract String cuatro();

    public abstract String cinco();

    public abstract String nueve();

    public abstract int multiplicador();

    public void interpreter(Context context) {
        if (context.input.startsWith(nueve())) {
            context.output += 9 * multiplicador();
            context.input = context.input.substring(2);
        } else if (context.input.startsWith(cuatro())) {
            context.output += 4 * multiplicador();
            context.input = context.input.substring(2);
        } else if (context.input.startsWith(cinco())) {
            context.output += 5 * multiplicador();
            context.input = context.input.substring(2);
        }

        while (context.input.startsWith(uno())) {
            context.output += 1 * multiplicador();
            context.input = context.input.substring(1);
        }
    }
}
