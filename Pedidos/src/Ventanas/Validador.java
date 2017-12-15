/*
 * Copyright (C) 2017 john
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Ventanas;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author john
 */
public class Validador {

    public Validador() {
    }
    
    public void ValidadorNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e){
            char k = e.getKeyChar();
        if(!(k >= 97 && k <= 122) && !(k >= 65 && k <= 90) && k!= 8 && k!=32) { 
             e.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);}
        }
        });
    };
    public void ValidadorLetras(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            
        public void keyTyped(KeyEvent e){
            char c = e.getKeyChar();
        if(( (c<'0' || c>'9') && c !=8 )){ 
            e.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);}
        }
        });
        
    };
    public void ValidarVacio(String s , Component a ){
    if (s.isEmpty()){
            JOptionPane.showMessageDialog(a, "Existe Algun Campo Vacío", "Error!", JOptionPane.ERROR_MESSAGE);    
        }
    }
    
    
}
