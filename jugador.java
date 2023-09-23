/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #4
Eliazar Canastuj
carnet: 23384
*/


public class jugador{
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int lanzamientos;


    public jugador(String nombre, String pais, int faltas, int golesDirectos, int lanzamientos){
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.lanzamientos = lanzamientos;
    }

    //metodos
    public String getNombre(){
        return this.nombre;
    }

    public String getPais(){
        return this.pais;
    }

    public int getFaltas(){
        return this.faltas;
    }

    public int getGolesD(){
        return this.golesDirectos;
    }

    public int getLanzamientos(){
        return this.lanzamientos;
    }

}