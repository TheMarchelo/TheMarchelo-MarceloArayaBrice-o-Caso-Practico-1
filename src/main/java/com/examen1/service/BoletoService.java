/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.boletos;
import com.examen1.repository.BoletosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Marcelo
 */

@Service
public class BoletoService implements IBoletoService{
    
   @Autowired
    private BoletosRepository boletosRepository; 
   
    @Override
    public List<boletos> getAllBoleto(){
        return (List<boletos>)boletosRepository.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public List<boletos> getBoletoId(boletos boleto) {
        return (List<boletos>) boletosRepository.findAll();
    }

    @Override
    @Transactional
    public void saveboleto(boletos boleto) {
        boletosRepository.save(boleto);
    }

    @Override
    @Transactional
    public void delete(boletos boleto) {
        boletosRepository.delete(boleto);
    }
/*
    @Override
    @Transactional (readOnly = true)
    public boletos getBoleto(boletos boleto) {
       return boletosRepository.findById(boletos.getId().orElse(null));
    }*/

    @Override
    @Transactional (readOnly = true)
    public boletos getBoleto(boletos boleto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
