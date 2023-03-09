/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Marcelo
 */
@Entity
@Table (name="boleto")
public class boletos implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String costo;
    private String fecha;
    private String capacidad_maxima;
    private String numero_de_sala;
    
    @ManyToOne
    @JoinColumn (name = "lugar_id")
    private Lugar lugar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(String capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public String getNumero_de_sala() {
        return numero_de_sala;
    }

    public void setNumero_de_sala(String numero_de_sala) {
        this.numero_de_sala = numero_de_sala;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }



 
}
