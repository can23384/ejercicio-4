/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #4
Eliazar Canastuj
carnet: 23384
*/


import java.util.*;


public class main{

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList<portero> porteros = new ArrayList<portero>();
        ArrayList<extremo> extremos = new ArrayList<extremo>();
        ArrayList<jugador> jugadores = new ArrayList<jugador>();

        boolean hola = true;

        while(hola){
            System.out.println("------------------------");
            System.out.println("Elija una opcion: ");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Mostrar todos los jugadores registrados en el campeonato");
            System.out.println("3. Los 3 mejores porteros en función de su efectividad.");
            System.out.println("4. La cantidad de extremos con más de un 85% de efectividad.");
            System.out.println("5. salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            System.out.println("------------------------");

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el tipo de jugador portero/extremo: ");
                    String tipo = teclado.nextLine();

                    System.out.println("Ingrese el nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.println("Ingrese el pais: ");
                    String pais = teclado.nextLine();

                    System.out.println("Ingrese las faltas: ");
                    int faltas = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese los goles directos: ");
                    int golesD = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese los lanzamientos: ");
                    int lanzamientos = teclado.nextInt();
                    teclado.nextLine();

                    if(tipo.equals("portero")){
                        System.out.println("Ingrese las paradas: ");
                        int paradas = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Ingrese los goles recibidos: ");
                        int golesRE = teclado.nextInt();
                        teclado.nextLine();

                        portero portero = new portero(nombre, pais, faltas, golesD, lanzamientos, paradas, golesRE);
                        porteros.add(portero);
                        jugadores.add(portero);
                    }
                    else if(tipo.equals("extremo")){
                        System.out.println("Ingrese los pases: ");
                        int pases = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Ingrese las asistencias: ");
                        int asistencias = teclado.nextInt();
                        teclado.nextLine();

                        extremo extremo = new extremo(nombre, pais, faltas, golesD, lanzamientos, pases, asistencias);
                        extremos.add(extremo);
                        jugadores.add(extremo);
                    }
                    else{
                        jugador jugador = new jugador(nombre, pais, faltas, golesD, lanzamientos);
                        jugadores.add(jugador);
                    }

                    break;
                
                case 2:
                    for(jugador jugador : jugadores){
                        System.out.println("Jugador: "+jugador.getNombre());
                    }
                    for(portero portero : porteros){
                        System.out.println("Jugador: "+portero.getNombre());
                    }
                    break;

                case 3:
                    ArrayList<portero> mejores_porteros = new ArrayList<portero>();
                    for (portero portero : porteros) {
                        if (mejores_porteros.size() < 3) {
                            mejores_porteros.add(portero);
                        } else {
                            for (int i = 0; i < 3; i++) {
                                if (portero.getNivel() > mejores_porteros.get(i).getNivel()) {
                                    mejores_porteros.set(i, portero);
                                    System.out.println(portero.getNivel());
                                    break;
                                }
                            }
                        }
                    }
                    for (portero portero : porteros) {
                        System.out.println("Jugadror: "+portero.getNombre()+"    Efectividad: "+portero.getNivel()+"%");
                    }
                    break;

                case 4:
                    int cantidad = 0;

                    for(extremo extremo : extremos){
                        if(extremo.getNivel() > 85){
                            cantidad++;
                            System.out.println("Jugadror: "+extremo.getNombre()+"    Efectividad: "+extremo.getNivel()+"%");
                        }
                    }
                    System.out.println("Cantidad de extremos con más de un 85% de efectividad: "+cantidad);
                    break;

                case 5:
                    hola = false;
                    break;
            }

        }


    }
}