package br.edu.up.models;

import java.time.LocalDateTime;

public class Passagem {

    public String numAssento;
    public String classeAssento;
    public LocalDateTime dataVoo;

     public Passagem(String numAssento, String classeAssento, LocalDateTime dataVoo) {
        this.numAssento = numAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
     }

    public String getNumAssento() {
        return numAssento;
    }
    public void setNumAssento(String numAssento) {
        this.numAssento = numAssento;
    }
    public String getClasseAssento() {
        return classeAssento;
    }
    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }
    public LocalDateTime getDataVoo() {
        return dataVoo;
    }
    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }

    @Override
    public String toString() {
        return "Passagem [numAssento=" + numAssento + ", classeAssento=" + classeAssento + ", dataVoo=" + dataVoo + "]";
    }

    
    
}
