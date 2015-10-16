/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author minutti
 */
public class Traductor {
    public String Traducir(String palabra,String idioma)
    {
        List<String> espanol = Arrays.asList("Hola", "Mundo", "Como", "Estas", "Tu", "Ventana", "Computadora", "Mesa");
        List<String> ingles = Arrays.asList("Hello", "World", "How", "Are", "You", "Window", "Computer", "Table");
        List<String> frances = Arrays.asList("Bonjour", "Monde", "Comment", "Sont", "Vous", "Fenêtres", "Ordinateur", "Tableau");
        List<String> aleman = Arrays.asList("Hallo", "Welt", "Wie", "Sind", "Sie", "Fenster", "Computer", "Tisch");
       
        //Ingles//
        if(idioma.equals("ingles"))
       {
        for(int n =0;n<espanol.size();n++)
        {
            if(palabra.toLowerCase().equals(espanol.get(n).toLowerCase()))
            {
                return ingles.get(n);
            }
        }
       }
        //Frances//
        else if(idioma.equals("frances"))
        {
            for(int n =0;n<espanol.size();n++)
            {
            if(palabra.toLowerCase().equals(espanol.get(n).toLowerCase()))
              {
                return frances.get(n);
              }
            }
        }
        //Aleman//
        else if(idioma.equals("aleman"))
        {
            for(int n =0;n<espanol.size();n++)
            {
            if(palabra.toLowerCase().equals(espanol.get(n).toLowerCase()))
              {
                return aleman.get(n);
              }
            }
        }
        
                    
            
            return "Esa palabra no se encontró";
        
        
     }
}

        
       
    
    
    

