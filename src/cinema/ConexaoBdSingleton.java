package cinema;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *Classe que realiza conexão com o SGBD, utilizando todas as importações 
 *necessárias para conexão com o mesmo e também seguindo o padrão de projeto
 *<b>SINGLETON</b>
 *@author Filipi Vieira
 */
public class ConexaoBdSingleton {
    private static ConexaoBdSingleton conexaoBdSingleton = new ConexaoBdSingleton();
    private static final String URL = "jdbc:mysql://localhost:3306/cinema"; 
    
    private ConexaoBdSingleton(){
        
    }
    /**
    *Método stático que nos da acesso a instância da classe ConexaoBdSingleton
    *seguindo dessa forma o padrão <b>SINGLETON</b>.<br>
    *<b>Exemplo:<br>
    *ConexaoBdSingleton.getInstance()<br>
    *e para acessar o método da classe utilizamos:<br>
    *ConexaoBdSingleton.getInstance().insereFilme(this)</b>
    *@return Retorna a variável conexaoBdSingleton do tipo ConexaoBdSingleton, 
    *que é uma unica instância da classe ConexaoBdSingleton garantindo assim
    *o padrão <b>SINGLETON</b>
    */
    public static ConexaoBdSingleton getInstance() {
        return conexaoBdSingleton;
    }
    
    /**
    *Este método realiza a inserção do filme no banco de dados, utilizando 
    *comandos em SQL, exemplo: INSERT, UPDATE, DELETE, CREATE TABLE, Etc...<br>
    *<b>Exemplo:</b><br>
    *<b>ConexaoBdSingleton.getInstance().insereFilme(this)</b><br> 
    *@param c recebe como parâmetro uma instância da classe Cinema, para acesso
    *das variáveis privadas da classe através do método get.
    * @see Cinema
    */
    public void insereFilme(Cinema c) throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(URL,"root","");
            String insereNovo = "INSERT INTO FILMES (NOME,DIRETOR,ANO,IDIOMA,GENERO) VALUES ('" +c.getNome()+"','"+c.getDiretor()+"','"+c.getAno()+"','"+c.getIdioma()+"','"+c.getGenero()+"')";
            Statement comandoSql = (Statement) con.createStatement();
            
            comandoSql.execute(insereNovo);   
            con.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

