/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author ESTUDIANTE05
 */
public class Procesos {
    
    public int [][] llenar_matriz(){ ///Primer intento de generar la matriz (funciona pero de manera diferente) 
        
        int matriz [][] = new int [5][5];
        int contador = 0; /// Me lleva la cantidad de numeros que se repiten
     
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { ///Llena la matriz de 0 para arrancar con algo cargado
                matriz [i][j] = 0;
            }  
        }
       
        for (int i = 0; i < 5; i++) {  
            for (int j = 0; j < 5; j++) {   ///Este "ciclo es el encargado de rellenar la matriz con numeros del 1 al 16
               matriz [i][j] = (int)(Math.random()*16+1);
               
               do{
                   contador = 0; /// cuando el bucle dectecte que hay un numero que se repite tres veses se reinicia
                   
                   for (int k = 0; k < 5; k++) {
                       for (int l = 0; l < 5; l++) { /// Este "ciclo" funciona para comparar si en la pocion de la matriz el mismo numero se repite
                                                     /// osea compara xD
                           if (matriz[i][j] == matriz[k][l]){
                               contador +=1; ///Cada ves que un numero se repita el contrador se acumulara
                           }
                       }       
                   }
                    if(contador == 3 ){ ///La condicional me ayuda en caso de que un numero se repita 3 veses pues guarda otro numero lol
                        matriz [i][j] = (int)(Math.random()*16+1);
                    }
              } while(contador == 3); ///Se repetira por cada numero que se repita 3 veses
            }
            
        }
        return matriz;   
    }
    
    
    public int [][] generar_matriz(){ 
        
        int[][] matriz = new int[5][5];
        int parejas = 0;
        int control = 0;
        int fil;
        int col;
        boolean continuar;
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { ///LLena la matriz de 0 para despues ser remplazados
                matriz[i][j] = 0;
            }
        }

        while (parejas < 2) { ///Utilizamos un bucle el cual me llena la matriz de parejas
            while (control < 12) { /// El siguiente condicional funciona para tener un numero de parejas 
                
                continuar = true;
                
                while (continuar) { ///Si continuar es "true" el bucle se abrira
                    fil = (int) (Math.random() * 5);
                    col = (int) (Math.random() * 5); ///Rellenamos a fil y col con numeros aleatorios
                    
                    if (matriz[fil][col] == 0) { ///Aplicamos un condicional que nos remplace los 0 dentro de la matriz por los numeros aletorios dentro de fil y col
                        continuar = false; ///Si la condicion se cumple ponemos a continuar en false 
                        control++;
                        matriz[fil][col] = control;
                    }
                }
            }
            parejas++;
            control = 0;
        }
        return matriz;    
    }
    
    public int [][] generar_matriz_nivel_2(){
        
        int[][] matriz = new int[5][5];
        int parejas = 0;
        int control = 0;  ///Ps: el proceso llevado aca es el mismo que el anterior, el cambio viene en el numero de parejas que queda en la matriz, por ende el numero de 0 que queda en la matriz
        int fil;
        int col;
        boolean continuar;
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { ///LLena la matriz de 0 para despues ser remplazados
                matriz[i][j] = 0;
            }
        }

        while (parejas < 2) { ///Utilizamos un bucle el cual me llena la matriz de parejas
            while (control < 11) { /// El siguiente condicional funciona para tener un numero de parejas 
                
                continuar = true;
                
                while (continuar) { ///Si continuar es "true" el bucle se abrira
                    fil = (int) (Math.random() * 5);
                    col = (int) (Math.random() * 5); ///Rellenamos a fil y col con numeros aleatorios
                    
                    if (matriz[fil][col] == 0) { ///Aplicamos un condicional que nos remplace los 0 dentro de la matriz por los numeros aletorios dentro de fil y col
                        continuar = false; ///Si la condicion se cumple ponemos a continuar en false 
                        control++;
                        matriz[fil][col] = control;
                    }
                }
            }
            parejas++;
            control = 0;
        }
        return matriz;    
    }
    
    public int [][] generar_matriz_nivel_3(){
        
        int[][] matriz = new int[5][5];
        int parejas = 0;
        int control = 0;  ///Ps: el proceso llevado aca es el mismo que el anterior, el cambio viene en el numero de parejas que queda en la matriz, por ende el numero de 0 que queda en la matriz
        int fil;
        int col;
        boolean continuar;
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { ///LLena la matriz de 0 para despues ser remplazados
                matriz[i][j] = 0;
            }
        }

        while (parejas < 2) { ///Utilizamos un bucle el cual me llena la matriz de parejas
            while (control < 10) { /// El siguiente condicional funciona para tener un numero de parejas 
                
                continuar = true;
                
                while (continuar) { ///Si continuar es "true" el bucle se abrira
                    fil = (int) (Math.random() * 5);
                    col = (int) (Math.random() * 5); ///Rellenamos a fil y col con numeros aleatorios
                    
                    if (matriz[fil][col] == 0) { ///Aplicamos un condicional que nos remplace los 0 dentro de la matriz por los numeros aletorios dentro de fil y col
                        continuar = false; ///Si la condicion se cumple ponemos a continuar en false 
                        control++;
                        matriz[fil][col] = control;
                    }
                }
            }
            parejas++;
            control = 0;
        }
        return matriz;    
    }    
}
