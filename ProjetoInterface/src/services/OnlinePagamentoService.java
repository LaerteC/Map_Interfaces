/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author laert
 */
public interface OnlinePagamentoService {
    
    double taxaPagamento(double quantidade);
    double juros(double quantidade, int meses);
    
}
