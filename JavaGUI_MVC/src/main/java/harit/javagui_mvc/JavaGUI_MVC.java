/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package harit.javagui_mvc;

import harit.javagui_mvc.controller.Controller;
import harit.javagui_mvc.model.Model;
import harit.javagui_mvc.view.View;

/**
 *
 * @author bossa
 */
public class JavaGUI_MVC {

    public static void main(String[] args) {
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Model m = new Model();
                View v = new View();
                new Controller(m, v);
            }
        });
    }
}
