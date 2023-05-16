package Clases;

import java.sql.Time;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Corredor extends Thread {

    private JLabel etiqueta;
    private long timepoLlegada;
    private long timepoInicio;
    private long timepototal;
    private int posicion;
    private boolean pausado;

    public Corredor() {
    }

    public Corredor(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Corredor(JLabel etiqueta, long timepoLlegada, long timepoInicio, int posicion) {
        this.etiqueta = etiqueta;
        this.timepoLlegada = timepoLlegada;
        this.timepoInicio = timepoInicio;
        this.posicion = posicion;
    }

    public Corredor(JLabel etiqueta, long timepoLlegada, long timepoInicio, long timepototal, int posicion) {
        this.etiqueta = etiqueta;
        this.timepoLlegada = timepoLlegada;
        this.timepoInicio = timepoInicio;
        this.timepototal = timepototal;
        this.posicion = posicion;
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

    public synchronized void pausar() {
        setPausado(true);
    }

    public synchronized void reanudar() {
        setPausado(false);
        notify();
    }

    @Override
    public void run() {

        if (!Thread.currentThread().isInterrupted()) {
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
                    int x = etiqueta.getLocation().x + 15; // Ajusta el valor 10 según tus necesidades
                    int y = etiqueta.getLocation().y; // Mantén la misma posición vertical

                    etiqueta.setLocation(x, y);

                    // Pausa durante un tiempo aleatorio
                    Thread.sleep(velocidad);

                    if (etiqueta.getLocation().getX() >= 780) {
                        break;
                    }
                }

                timepoLlegada = System.currentTimeMillis();

                timepototal = timepoLlegada - timepoInicio;

                SimpleDateFormat formato = new SimpleDateFormat("mm:ss.SSS");

                System.out.println(String.valueOf(formato.format(new Date(timepototal))));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
