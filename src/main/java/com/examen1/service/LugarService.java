/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.Lugar;
import com.examen1.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Marcelo
 */
public class LugarService implements ILugarService {
    
    @Autowired
    private LugarRepository lugarRepository;
            
    @Override
    public List<Lugar> listLugar() {
        return (List<Lugar>)lugarRepository.findAll();
    }
    
}
