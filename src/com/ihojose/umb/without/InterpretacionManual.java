package com.ihojose.umb.without;

public class InterpretacionManual {
    public int interpretar(String numero) {
        return switch (numero) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> {
                if (numero.startsWith("CM")) {
                    yield 500 + interpretar(numero.substring(2));
                } else if (numero.startsWith("CD")) {
                    yield 400 + interpretar(numero.substring(2));
                } else if (numero.startsWith("XL")) {
                    yield 40 + interpretar(numero.substring(2));
                } else if (numero.startsWith("XC")) {
                    yield 90 + interpretar(numero.substring(2));
                } else if (numero.startsWith("D")) {
                    yield 900 + interpretar(numero.substring(1));
                } else if (numero.startsWith("L")) {
                    yield 50 + interpretar(numero.substring(1));
                } else if (numero.startsWith("X")) {
                    yield 10 + interpretar(numero.substring(1));
                } else if (numero.startsWith("C")) {
                    yield 100 + interpretar(numero.substring(1));
                }

                yield 0;
            }
        };
    }
}
