package com.devJDA.dominio;

import java.util.HashMap;
import java.util.Map;

public class Tablero {
    private Map<Byte, Casilla> tablero = new HashMap<>();


    private void inicializar(){
        for (byte i = 1; i <= 9 ; i++) {
            tablero.put(i, new Casilla(i));
        }
    }
//dfsdfsd
    public Map<Byte, Casilla> getTablero() {
        Map <Byte, Casilla> tableroClon = new HashMap<>();
        for (byte i = 1; i <= 9 ; i++) {
            tableroClon.put(i, tablero.get(i).getCasilla());
        }
        return tableroClon;
    }
}
