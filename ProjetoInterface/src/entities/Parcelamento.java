/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author laert
 */
public class Parcelamento {
    
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date vencimento; 
    private Double quantidade;
   
    public Parcelamento(){
        
    }
    
    public Parcelamento(Date vencimento,Double quantidade){
        super();
        this.vencimento = vencimento;
        this.quantidade = quantidade;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Parcelamento{" + "vencimento=" + sdf.format(vencimento) + " - , quantidade= " + String.format("%.2f",quantidade) + '}';
    }
    
    
}
