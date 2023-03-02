package com.devJDA.dominio;

public class Casilla {
    private byte posicion;
    private String simbolo;



    private Casilla(byte posicion, String simbolo) {
        this.simbolo = simbolo;
        this.posicion = posicion;
    }

    public Casilla(byte posicion) {
       setPosicion(posicion);
       this.simbolo = "";
    }

    public void marcar(String simbolo){
        if(estaMarcada()){
            throw new RuntimeException("No es posible marcar, casilla ocupada" + getSimbolo());
        }
        setSimbolo(simbolo);
    }

    private boolean cadenaEsVaciaONula(String cadena) {
        return (cadena == null || "".intern() == cadena.trim().intern());
    }
    public boolean estaMarcada(){
        return (!cadenaEsVaciaONula(simbolo));
    }
    public String getSimbolo() {

        return simbolo;
    }

    private void setSimbolo(String simbolo) {
        if(cadenaEsVaciaONula(simbolo)){
            throw new RuntimeException("No es posible colocar un simbolo vacio o nulo");
        }
        if(simbolo.trim().length() != 1){
            throw new RuntimeException("No es posible utilizar simbolos de mas de un caracter");
        }
        this.simbolo = simbolo.trim();
    }

    public byte getPosicion() {
        return posicion;
    }

    private void setPosicion(byte posicion) {
        if(posicion < 1 || posicion > 9){
            throw new RuntimeException("No es posible asignar la posicion, fuera de rango");
        }
        this.posicion = posicion;
    }

    public Casilla getCasilla(){
        return new Casilla(getPosicion(),getSimbolo());
    }

}
