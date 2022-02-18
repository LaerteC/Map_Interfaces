/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicattion;

import entities.Contrato;
import entities.Parcelamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import services.ContratoService;
import services.OnlinePagamentoService;
import services.PaypalService;

/**
 *
 * @author laert
 */
public class ProgramaTeste {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println(" Entre com os dados do Contrato");
        System.out.println(" Número : ");
        Integer numero = sc.nextInt();

        System.out.println(" Data : (dd/MM/yyyy)");
        Date data = sdf.parse(sc.next());

        System.out.println(" Valor do Contrato");
        Double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.println(" Entre com a quantidade de Parcelas ");
        int N = sc.nextInt();
        
        ContratoService cs = new ContratoService(new PaypalService());

        cs.processContrato(contrato,N);
        
        
         System.out.println(" Parcelas");
         
         for(Parcelamento parcela : contrato.getParcelas()){
              System.out.println(parcela);
         }
        sc.close();
    }
}
