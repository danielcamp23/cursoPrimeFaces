package com.mitocode.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="codigoFk", nullable = false)
    private Persona codigo;
    
    @Column(name = "usuario")
    private String usuario;
    
    @Column(name = "clave")
    private String clave;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "estado")
    private short estado = 1;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Persona getCodigo() {
        return codigo;
    }

    public void setCodigo(Persona codigo) {
        this.codigo = codigo;
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
