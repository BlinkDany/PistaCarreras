/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author blink
 */
public class Cronometro extends Thread {

    JLabel etqietatimepo;
    private int miliseg;
    private int seg;
    private int min;
    private int hor;
    private boolean estado;
    private boolean pausado;

    public Cronometro() {
    }

    public Cronometro(JLabel etqietatimepo, int miliseg, int seg, int min, int hor, boolean estado, boolean pausado) {
        this.etqietatimepo = etqietatimepo;
        this.miliseg = miliseg;
        this.seg = seg;
        this.min = min;
        this.hor = hor;
        this.estado = estado;
        this.pausado = pausado;
    }

    public Cronometro(JLabel etqietatimepo) {
        this.etqietatimepo = etqietatimepo;
    }

    public int getMiliseg() {
        return miliseg;
    }

    public void setMiliseg(int miliseg) {
        this.miliseg = miliseg;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHor() {
        return hor;
    }

    public void setHor(int hor) {
        this.hor = hor;
    }

    public JLabel getEtqietatimepo() {
        return etqietatimepo;
    }

    public void setEtqietatimepo(JLabel etqietatimepo) {
        this.etqietatimepo = etqietatimepo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isPausado() {
        return pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    public synchronized void pausarCronometro() {
        setPausado(true);
    }

    public synchronized void reanudarCronometro() {
        setPausado(false);
        notify();
    }
    
    @Override
    public void run() {

        while (isEstado() == true) {
        try {
            synchronized (this) {
                
                if (isPausado() == true) {
                    
                    wait(); // El hilo espera hasta que se llame a notify()
                    
                }
            }

            sleep(1);

                if (miliseg == 1000) {
                    miliseg = 0;
                    seg++;
                }
                if (seg == 60) {

                    miliseg = 0;
                    seg = 0;
                    min++;
                }
                if (min == 60) {
                    miliseg = 0;
                    seg = 0;
                    min = 0;
                }

                etqietatimepo.setText(min + " : " + seg + " : " + miliseg);
                miliseg++;

            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
