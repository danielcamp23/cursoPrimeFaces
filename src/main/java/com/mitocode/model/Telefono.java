package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "telefono")
public class Telefono {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cogigo;
    
    @Column(name = "numero")
    private String numero;
    
    @ManyToOne/*muchos telefonos pueden corresponder a una sola persona*/
    @JoinColumn(name = "codigoPersonFk", nullable = false)
    private Persona persona;
            

    public int getCogigo() {
        return cogigo;
    }

    public void setCogigo(int cogigo) {
        this.cogigo = cogigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
