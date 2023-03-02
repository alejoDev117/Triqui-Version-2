package com.devJDA.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tablero {
    private Map<Byte, Casilla> tablero = new HashMap<>();

    public Tablero(){
        inicializar();
    }

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

    public void marcarEnTablero(byte posicion, String simbolo){
       if(tablero.get(posicion).estaMarcada()){
           throw new RuntimeException("No es posible marcar en tablero, casilla ocupada");
       }
       tablero.get(posicion).marcar(simbolo);
    }

     boolean ternaEsValida (byte posicionUno, byte posicionDos, byte posicionTres) {

        List<Casilla> casillas = new ArrayList<>();

        casillas.add(tablero.get(posicionUno));
        casillas.add(tablero.get(posicionDos));
        casillas.add(tablero.get(posicionTres));

        return casillas.stream().map(Casilla::getSimbolo).distinct().count() == 1 && casillas.get(0).estaMarcada();
    }
    public byte casillasMarcadas(){
        byte casillasConMarca = 0;
        for (int i = 1; i <=9 ; i++) {
            if(getTablero().get(i).estaMarcada()){
                casillasConMarca +=1;
            }
        }
        return casillasConMarca;
    }
}
