/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author laert
 */
public class MapJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner sc = new Scanner(System.in);
        
        Map<String, Integer> votos = new LinkedHashMap<>();
        
        System.out.println(" Digite  o caminho do arquivo :");
        String path = sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();
            while(line !=null){
                
                String [] fields = line.split(",");
                
                String nome = fields[0];
                int contador = Integer.parseInt(fields[1]);
                
                if(votos.containsKey(nome)){
                    
                    int votosSoma = votos.get(nome);
                    
                    votos.put(nome,contador + votosSoma);
                }else{
                    votos.put(nome, contador);
                }
                
                line = br.readLine();
            }
            
            for( String key : votos.keySet()){
                
                System.out.println(key + " : " + votos.get(key));
            }
        }catch(IOException E){
            System.out.println(" Error : " + E.getMessage());
        }
    }
     
}
