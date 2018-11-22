
package com.curso.mongo.model;

import com.mongodb.BasicDBObject;
import java.util.Date;

public class Campeon {
    private String nombre;
    private int edad;
    private String sexo;
    private int tipo;
    private double precio;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private Date fechaEliminacion;

    public Campeon() {
    }

    public Campeon(String nombre, int edad, String sexo, int tipo, double precio, Date fechaCreacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tipo = tipo;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

   // conversion de objeto java a objeto BasicDBOBject
    
    
}
