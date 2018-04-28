package com.mitocode.controller;

import com.mitocode.ejb.CategoriaFacadeLocal;
import com.mitocode.model.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CategoriaController implements Serializable{
    
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private Categoria categoria;

    public CategoriaController() {
       System.out.println("constructor!!!");
        categoria = new Categoria();
    //    categoriaEJB = new CategoriaFacadeLocal();
                
    }
    
    
    /*
    @PostConstruct
    public void init(){
        System.out.println("new categoria()");
        categoria = new Categoria();
    }*/

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    public void registrar(){
        System.out.println("guardando...");
        try{
            categoriaEJB.create(categoria);
        }
        catch(Exception e){
            //mensaje
            System.out.println("Error");
        }
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

