package com.devJDA.dominio;

public class Jugador {
    private String nombre;
    private String simbolo;


    public Jugador(String nombre) {
        setNombre(nombre);
        this.simbolo = "NA";
    }

    public void seleccionarPosicion(byte posicion){

    }

    public void cambiarSimbolo(String simbolo){
        setSimbolo(simbolo);
    }

    public void inciarManualmente(Jugador jugadorQueInicia){

    }
    private boolean simboloEsVacioONulo(String simbolo){
        return simbolo == null || simbolo.trim().equals("");
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
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
