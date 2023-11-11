
package examen1p1_miaelvir;

import java.util.Scanner; 
import java.util.Random; 

public class Examen1P1_MiaElvir {

    static Scanner baboy = new Scanner(System.in); 
    public static void main(String[] args) {
        Random ran = new Random(); 
        
        System.out.println("----- Menu -----");
        System.out.println("1. Fight of Flight");
        System.out.println("2. Tri fuerza");
        System.out.println("3. Salir del menu");
        int opcion = baboy.nextInt(); 
        
        while (opcion > 0 && opcion < 3){
            switch (opcion){

                case 1: 
                    
                    //int random = new Random().nextInt(ramgo); 
                    // random = new Random().nextInt((6-1)+1)+1; 
                    // random = new random.nexINt(origen, bound)
                    
                    
                    int balas = 25; 
                    int num_r_z = ran.nextInt(15, 30);
                    int distancia_z = num_r_z; 
                    int vida_zombie = 25; 
                    char resp = 's'; 
                    
                    
                    
                    System.out.println("Ingrese maestria");
                    System.out.println("1. Principiante (0% de hit extra + extra damage)");
                    System.out.println("2. Intermedio (5% de hit extra + extra damage)");
                    System.out.println("3. Experto (15% de hit extra + extra damage)");
                    int maestria = baboy.nextInt(); 
                    
                    while ((resp == 's' || resp == 'S') && (vida_zombie > 0) && (balas > 0) && (distancia_z > 0)){
                        int daño = ran.nextInt(1, 7);
                        int dist_avanza = ran.nextInt(3, 5);
                        int probabilidad = ran.nextInt(1, 100); 
                        
                        
                            
                        System.out.println("El zombie se encuentra a: "+distancia_z+" metros!");
                        System.out.println(" ");
                        System.out.println("EL jugador cuenta con "+balas+" balas");
                        System.out.println(" ");
                        
                        if (vida_zombie > 0 || balas > 0 || distancia_z > 0){
                            
                            if (maestria == 1){
                                if (probabilidad <= 65){
                                    vida_zombie -= daño; 
                                    if (vida_zombie < 0){
                                        vida_zombie = 0; 
                                    }
                                    System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+daño+"!");
                                    System.out.println(" ");
                                }else{
                                    distancia_z -= dist_avanza;
                                    if (distancia_z < 0){
                                        distancia_z = 0; 
                                    }
                                    System.out.println("Has fallado! El zombie se encuentra a "+distancia_z);
                                    System.out.println(" ");
                                }
                            }else if (maestria == 2){
                                if (probabilidad <= 70){
                                    vida_zombie -= daño; 
                                    if (vida_zombie < 0){
                                        vida_zombie = 0; 
                                    }
                                    System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+daño+"!");
                                    System.out.println(" ");
                                }else{
                                    distancia_z -= dist_avanza;
                                    if (distancia_z < 0){
                                        distancia_z = 0; 
                                    }
                                    System.out.println("Has fallado! El zombie se encuentra a "+distancia_z);
                                    System.out.println(" ");
                                }

                            }else if (maestria == 3){
                                if (probabilidad <= 80){
                                    vida_zombie -= daño;   
                                    if (vida_zombie < 0){
                                        vida_zombie = 0; 
                                    }
                                    System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+daño+"!");
                                    System.out.println(" ");
                                }else{
                                    distancia_z -= dist_avanza;
                                    if (distancia_z < 0){
                                        distancia_z = 0; 
                                    }
                                    System.out.println("Has fallado! El zombie se encuentra a "+distancia_z);
                                    System.out.println(" ");
                                }

                            }
                            
                            System.out.println("Vida restante del zombie: "+vida_zombie);
                            System.out.println("El zombie se encuentra a "+distancia_z+" metros");
                            System.out.println(" ");
                            balas--; 
                            
                        }else{
                            
                            
                           
                        }
                        
                        
                        System.out.println("Listo para la siguiente ronda ? [S/N]: ");
                        resp = baboy.next().charAt(0); 
                        System.out.println(" ");
                        
                    }// fin while 
                    
                    if (vida_zombie == 0){
                        System.out.println("YOU WIN, has logrado vencer al zombie");
                    }else if (balas == 0){
                        System.out.println("Perdiste, te has quedado sin balas");
                    }else if (distancia_z == 0){
                        System.out.println("Game Over, la distancia se redujo a 0!");
                    }
                    
                    
                    
                    break; 

                case 2:
                    
                    System.out.println("Trifuerza");
                    //mis lagrimas van insertadas aqui 
                    
                    trifuerza();
                    
                    break; 



            }//fin switch
            System.out.println(" ");
            System.out.println("----- Menu -----");
            System.out.println("1. Fight of Flight");
            System.out.println("2. Tri fuerza");
            System.out.println("3. Salir del menu");
            opcion = baboy.nextInt(); 

            
        }//fin while
        
       
        
        
        
    }//main
    
    public static void trifuerza(){
        
        
        
                    System.out.println("Ingrese tamaño (Debe ser mayor a 20): ");
                    int tam = baboy.nextInt(); 
                    
                    int tam2 = tam /2; 
                    int tam3 = tam2 + 1; 
                    
                    while (tam2 % 2 == 0){
                        System.out.println("Error, vuelva a ingresarlo: ");
                        tam = baboy.nextInt(); 
                        tam2 = tam /2; 
                        tam3 = tam2 + 1; 
                    }
                    
                    for ( int i = 0; i < tam3; i++){
                        for (int j = 0; j <= tam; j++){
                            if ((j <= tam2 + i && j >= tam2) || (j >= tam2 - i && j <= tam2) || (i == tam3 - 1 && j <= tam+1)){
                                System.out.print("*");  
                            }else if (i==j){
                                System.out.print(" ");
                            }else {
                                System.out.print(" ");
                            }
                        }//for interno
                        System.out.println(" ");
                    }//for externo
                    
                    
    
    }
    
}//fin clase
