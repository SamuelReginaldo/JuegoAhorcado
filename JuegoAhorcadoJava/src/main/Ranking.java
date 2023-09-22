package main;

import java.util.Date;

public class Ranking {
    
    private String nomJugador;
    private int punts;
    private Date data;

    public Ranking(String nomJugador, int punts, Date data) {
        this.nomJugador = nomJugador;
        this.punts = punts;
        this.data = data;
    }

    public String getNomJugador() {
        return nomJugador;
    }

    public void setNomJugador(String nomJugador) {
        this.nomJugador = nomJugador;
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Ranking{" + "nomJugador=" + nomJugador + ", punts=" + punts + ", data=" + data + '}';
    }
    
    
    
    
}
