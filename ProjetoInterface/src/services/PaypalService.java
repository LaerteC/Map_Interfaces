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
public class PaypalService implements OnlinePagamentoService{

    private static final double TAXA_PAGAMENTO = 0.02;
    private static final double JUROS_MENSAL = 0.01;
            
    @Override
    public double taxaPagamento(double quantia) {
         
        return quantia * TAXA_PAGAMENTO;
    }

    @Override
    public double juros(double quantia, int meses) {
        
        return quantia * meses * JUROS_MENSAL;
    }
    
    
}
