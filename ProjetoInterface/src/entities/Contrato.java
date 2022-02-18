/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author laert
 */
public class Contrato {
    
    private Integer numero;
    private Date date;
    private Double totalValor;
    
    List<Parcelamento> parcelas = new ArrayList<>();
    
    public Contrato(){
        
    }
    public Contrato(Integer numero,Date date, Double totalValor){
        super();
        this.numero = numero;
        this.date = date;
        this.totalValor = totalValor;
        
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(Double totalValor) {
        this.totalValor = totalValor;
    }
    
    public List<Parcelamento> getParcelas(){
        return parcelas;
    }
    
      
}
