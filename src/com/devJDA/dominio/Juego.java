package com.devJDA.dominio;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;

    private Jugador proximoTurno;
    private boolean JuegoEnCurso;
    private Tablero tablero;

    public void simbolosPorDefecto(){
        jugador1.setSimbolo("X");
        jugador2.setSimbolo("O");
    }

    public void cambiarTurno(){
        if(proximoTurno.equals(jugador1)){
            proximoTurno = jugador2;
        }else{
            proximoTurno = jugador1;
        }
        }
}
