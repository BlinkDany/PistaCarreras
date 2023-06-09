package Clases;

import Vista.PistaCarreras;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JLabel;

public class Corredor extends Thread {

    private JLabel etiqueta;
    private long timepoLlegada;
    private long timepoInicio;
    private long timepototal;
    private int posicion;
    private boolean pausado;
    private static int posicionGlobal;
    private Icon icono;

    public Corredor() {
    }

    public Corredor(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Corredor(JLabel etiqueta, long timepoLlegada, long timepoInicio, long timepototal, int posicion, boolean pausado) {
        this.etiqueta = etiqueta;
        this.timepoLlegada = timepoLlegada;
        this.timepoInicio = timepoInicio;
        this.timepototal = timepototal;
        this.posicion = posicion;
        this.pausado = pausado;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    public long getTimepoLlegada() {
        return timepoLlegada;
    }

    public void setTimepoLlegada(long timepoLlegada) {
        this.timepoLlegada = timepoLlegada;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public long getTimepoInicio() {
        return timepoInicio;
    }

    public void setTimepoInicio(long timepoInicio) {
        this.timepoInicio = timepoInicio;
    }

    public long getTimepototal() {
        return timepototal;
    }

    public void setTimepototal(long timepototal) {
        this.timepototal = timepototal;
    }

    public boolean isPausado() {
        return pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }

    public synchronized void pausar() {
        setPausado(true);
    }

    public synchronized void reanudar() {
        setPausado(false);
        notify();
    }

    @Override
    public void run() {

        try {

            timepoInicio = System.currentTimeMillis();

            while (true) {

                synchronized (this) {

                    if (pausado) {

                        wait();
                    }

                }

                int velocidad = (int) (Math.random() * 401) + 100;

                // Mover el corredor hacia la derecha
                int x = etiqueta.getLocation().x + 30; // Ajusta el valor 10 según tus necesidades
                int y = etiqueta.getLocation().y; // Mantén la misma posición vertical

                etiqueta.setLocation(x, y);

                // Pausa durante un tiempo aleatorio
                Thread.sleep(velocidad);

                if (etiqueta.getLocation().getX() >= 780) {
                    PistaCarreras.crono.setEstado(false);
                    break;
                }
            }

            timepoLlegada = System.currentTimeMillis();
            timepototal = timepoLlegada - timepoInicio;

            SimpleDateFormat formato = new SimpleDateFormat("mm:ss.SSS");
            System.out.println(formato.format(new Date(timepototal)));

            synchronized (Corredor.class) {
                posicion = ++posicionGlobal;
            }

            PistaCarreras p = new PistaCarreras();
            p.Pos();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
