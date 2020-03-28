/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package br.lgomesd.projetointegrador;

import java.awt.List;
import java.sql.*;

/**
 *
 * @author lgome
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Especialidade e = new Especialidade();
        
        //e.Cadastrar("Nutricionista");
        e.Excluir("Nutricionista");
        //e.Cadastrar("Destista");
        //e.Cadastrar("Bombeiro");
        //e.Excluir("Advogado");
        //List Consultar = e.Consultar();
        //for (int i = 0; i < Consultar.countItems(); i++)
        //    System.out.println(Consultar.getItem(i));
        //System.out.println(Consultar.getItems());
        e.Consultar();
        
        
        
        
               
        
    }
    
}
