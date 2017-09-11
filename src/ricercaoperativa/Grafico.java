/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ricercaoperativa;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author utente
 */
public class Grafico extends JPanel{
    
    double limiteSinistro;
    double limiteDestro;
    double coefficiente2;
    double coefficiente1;
    double coefficiente0;
    boolean isLineare;//true=lineare;false=parabolico
    
    //<editor-fold defaultstate="collapsed" desc=" Metodi SET ">
    public void setLimiteSinistro(double limiteSinistro){
        this.limiteSinistro=limiteSinistro;
    }
    public void setLimiteDestro(double limiteDestro){
        this.limiteDestro=limiteDestro;
    }
    public void setCoefficiente2(double coefficiente){
        this.coefficiente2=coefficiente;
    }
    public void setCoefficiente1(double coefficiente){
        this.coefficiente1=coefficiente;
    }
    public void setCoefficiente0(double coefficiente){
        this.coefficiente0=coefficiente;
    }
    public void setLineare(){
        isLineare=true;
    }
    public void setParabolico(){
        isLineare=false;
    }
    //</editor-fold>
    
    
    public Grafico (){
        System.out.println("GRAFICO CREATO");
        System.out.println("X: "+getWidth()+"\n"
                + "Y: "+getHeight());
        repaint();
    }
    public void Grafico(int w,int h){
        this.setSize(w,h);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(getWidth()/2, getHeight()/2, 40, 40);
    }
}
