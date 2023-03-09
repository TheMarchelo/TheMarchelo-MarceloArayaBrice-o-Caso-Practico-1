/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.boletos;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public interface IBoletoService {
    public List<boletos> getBoletoId(boletos boleto);
    public void saveboleto(boletos boleto);
    public void delete (boletos boleto);
    public boletos getBoleto(boletos boleto);

    public List<boletos> getAllBoleto();
}
