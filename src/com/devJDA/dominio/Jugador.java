package com.devJDA.dominio;

public class Jugador {
    private String nombre;
    private String simbolo;


    public Jugador(String nombre) {
        setNombre(nombre);
        this.simbolo = "NA";
    }

    public byte seleccionarPosicion(byte posicion){
        if(posicionEsCorrecta(posicion)) {
            return posicion;
        }
        throw new RuntimeException("Error, posicion fuera de rango");
    }

    public void cambiarSimbolo(String simbolo){
        setSimbolo(simbolo);
    }

    public Jugador inciarManualmente(Jugador jugadorQueInicia) {
        if (jugadorEsCorrecto(jugadorQueInicia)) {
            return jugadorQueInicia;
        }
        throw new RuntimeException("Error, jugador es nulo");
    }
    private boolean simboloEsVacioONulo(String simbolo){
        return simbolo == null || simbolo.trim().equals("");
    }
    private boolean posicionEsCorrecta(byte posicion){
        if(posicion >1 && posicion <=9){
            return true;
        }
        return false;
    }
    private boolean jugadorEsCorrecto(Jugador jugador){
        if(jugador != null){
            return true;
        }
        return false;
    }
    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    private void setSimbolo(String simbolo) {
        if(simboloEsVacioONulo(simbolo)){
            throw new RuntimeException("No es posible asignar un avatar vacio o nulo");
        }
        if(simbolo.trim().length() != 1){
            throw new RuntimeException("No es posible asignar avatar de mas de 1 caracter");
        }
        this.simbolo = simbolo.trim();
    }

    private void setNombre(String nombre) {
        if(simboloEsVacioONulo(nombre)){
            throw new RuntimeException("Error, por favor asigne un nombre");
        }
        this.nombre = nombre.trim();
    }




}
