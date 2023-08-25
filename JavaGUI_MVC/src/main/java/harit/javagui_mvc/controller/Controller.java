/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harit.javagui_mvc.controller;

import harit.javagui_mvc.model.Model;
import harit.javagui_mvc.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bossa
 */
public class Controller implements ActionListener {
    
    private Model m;
    private View v;
    
    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
        v.setVisible(true);
        
        
        //button
        v.getEnter().setActionCommand("Enter");
        v.getEnter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if(command.equals("Enter")) {
            m.setTmp(v.getjTextArea1().getText());
            //System.out.print(m.getTmp());
            int error = m.readFileAndCheck();
            if(error == -1) v.getjLabel33().setText("ERROR");
            
            v.getjLabel17().setText(String.valueOf(m.getReg()[0]));
            v.getjLabel18().setText(String.valueOf(m.getReg()[1]));
            v.getjLabel19().setText(String.valueOf(m.getReg()[2]));
            v.getjLabel20().setText(String.valueOf(m.getReg()[3]));
            v.getjLabel21().setText(String.valueOf(m.getReg()[4]));
            v.getjLabel22().setText(String.valueOf(m.getReg()[5]));
            v.getjLabel23().setText(String.valueOf(m.getReg()[6]));
            v.getjLabel24().setText(String.valueOf(m.getReg()[7]));
            v.getjLabel25().setText(String.valueOf(m.getReg()[8]));
            v.getjLabel26().setText(String.valueOf(m.getReg()[9]));
            v.getjLabel27().setText(String.valueOf(m.getReg()[10]));
            v.getjLabel28().setText(String.valueOf(m.getReg()[11]));
            v.getjLabel29().setText(String.valueOf(m.getReg()[12]));
            v.getjLabel30().setText(String.valueOf(m.getReg()[13]));
            v.getjLabel31().setText(String.valueOf(m.getReg()[14]));
            v.getjLabel32().setText(String.valueOf(m.getReg()[15]));
        }
    }
    
}
