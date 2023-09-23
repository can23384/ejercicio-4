/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #4
Eliazar Canastuj
carnet: 23384
*/

public class portero extends jugador{
    private int paradas;
    private int golesRecibidos;


    public portero(String nombre, String pais, int faltas, int golesDirectos, int lanzamientos, int paradas, int golesRecibidos){
        super(nombre, pais, faltas, golesDirectos, lanzamientos);
        this.paradas = paradas;
        this.golesRecibidos = golesRecibidos;
    }


//    metodos
    public int getParadas(){
        return this.paradas;
    }

    public int getGolesRecibidos(){
        return this.golesRecibidos;
    }

    public float getNivel(){
        return ((this.paradas - this.golesRecibidos) * 100/(this.paradas + this.golesRecibidos)) + this.golesDirectos*100/this.lanzamientos;
    }
}