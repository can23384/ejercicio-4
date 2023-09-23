/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #4
Eliazar Canastuj
carnet: 23384
*/

public class extremo extends jugador{
    private int pases;
    private int asistencias;

    public extremo(String nombre, String pais, int faltas, int golesDirectos, int lanzamientos, int pases, int asistencias){
        super(nombre, pais, faltas, golesDirectos, lanzamientos);
        this.pases = pases;
        this.asistencias = asistencias;
    }


//    metodos
    public int getPases(){
        return this.pases;
    }

    public int getAsistencias(){
        return this.asistencias;
    }

    public float getNivel(){
        return ((this.pases+this.asistencias-this.faltas)*100/(this.pases+this.asistencias+this.faltas))+this.golesDirectos*100/this.lanzamientos;
    }
}