/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Contrato;
import entities.Parcelamento;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author laert
 */
public class ContratoService {
    
    private OnlinePagamentoService onlinePagamentoService;
    
    public ContratoService(OnlinePagamentoService onlinePagamentoService){
        
        this.onlinePagamentoService = onlinePagamentoService;
    }
    
    public void processContrato(Contrato contrato, int meses){
        double parcelaBasica = contrato.getTotalValor() / meses;
        
        for(int i = 1; i <= meses; i++){
            
            double parcelaAtualizada = parcelaBasica + onlinePagamentoService.juros(parcelaBasica, i);
            
            double parcelaTotal = parcelaAtualizada + onlinePagamentoService.taxaPagamento(parcelaAtualizada);
            
            Date vencimento =adicionaMeses(contrato.getDate(), i);
            
            contrato.getParcelas().add(new Parcelamento(vencimento,parcelaTotal));
        }
    }
    
    private Date adicionaMeses(Date data, int n){
        
        Calendar calendario = Calendar.getInstance();
        
        calendario.setTime(data);
        calendario.add(Calendar.MONTH, n);
        
        return calendario.getTime();
    }
}
