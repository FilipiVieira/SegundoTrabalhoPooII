package cinema;

import java.sql.SQLException;

/**
 *Classe principal que faz a chamada da classe interface, através de uma 
 *instância com o objeto cadastro
 *@author Filipi Vieira
 */
public class Main {

    public static void main(String[] args) throws SQLException {
         System.out.println(ConexaoBdSingleton.getInstance());
         Interface cadastro = new Interface();
    }
    
}
