package com.devJDA.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tablero {
    private Map<Byte, Casilla> tablero = new HashMap<>();


    private void inicializar(){
        for (byte i = 1; i <= 9 ; i++) {
            tablero.put(i, new Casilla(i));
        }
    }

    public Map<Byte, Casilla> getTablero() {
        Map <Byte, Casilla> tableroClon = new HashMap<>();
        for (byte i = 1; i <= 9 ; i++) {
            tableroClon.put(i, tablero.get(i).getCasilla());
        }
        return tableroClon;
    }
    private boolean ternaEsValida (byte posicionUno, byte posicionDos, byte posicionTres) {

        List<Casilla> casillas = new ArrayList<>();

        casillas.add(tablero.get(posicionUno));
        casillas.add(tablero.get(posicionDos));
        casillas.add(tablero.get(posicionTres));

        return casillas.stream().map(Casilla::getSimbolo).distinct().count() == 1 && casillas.get(0).estaMarcada();
    }

}

