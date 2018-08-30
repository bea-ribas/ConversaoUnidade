package com.company;

public class ConversaoUnidade {

    public static void main(String[] args){}

    public static double conversorCelsiusFarenheit (double c){
        double f = (1.8 * c) + 32;
        return f;

    }

    public static double conversorQuilometroHoraMetroSegundo (double kmh){
        double ms = kmh / 3.6 ;
        return ms;

    }

    public static double conversorMetroQuilometro (double m){
        double km = m / 1000 ;
        return km;

    }

    public static double conversorMinutoDia (double min){
        double dia = min / 1440;
        return dia;

    }
}
