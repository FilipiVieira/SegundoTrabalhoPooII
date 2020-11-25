package cinema;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *Classe para objetos do tipo filme, é uma subclasse da classe 
 *TemplateMethodCadastroObj, herdando assim seus métodos abstratos 
 *@see TemplateMethodCadastroObj
 *@author Filipi Vieira
 */
public class Cinema extends TemplateMethodCadastroObj {
    /**
    *Variável do tipo String referente ao nome do filme
    */
    private String nome;
    /**
    *Variável do tipo String referente ao diretor do filme.
    */
    private String diretor;
    /**
    *Variável do tipo String referente ao ano em que o filme foi lançado.
    */
    private String ano;
    /**
    *Variável do tipo String referente ao idioma do filme.
    */
    private String idioma;
    /**
    *Variável do tipo String referente ao gênero do filme.
    */
    private String genero;
    
    public Cinema(String nome, String diretor, String ano, String idioma, String genero) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.idioma = idioma;
        this.genero = genero;
    }  
    /**
    *Este método serve para pegarmos as informações da variável nome que se refere ao nome do filme, 
    *que está definida como privada, então utilizamos o método getNome que é público, para então
    *termos acesso as informações da variável nome.<br> 
    *<b>Exemplo:</b><br>
    *<b>String nome = "Nome do Filme";</b><br>
    *<b>Classe c = new Classe();</b><br>
    *<b>c.getNome():</b><br>
    *@return retorna uma string com o valor contido na variável nome  "Nome do Filme" 
    */
    public String getNome() {
        return nome;
    }  
    /**
    *Este método serve para pegarmos as informações da variável diretor que se refere ao diretor do filme, 
    *esta variável está definida como privada, então utilizamos o método getDiretor que é público, para então
    *termos acesso as informações da variável diretor.<br> 
    *<b>Exemplo:</b><br>
    *<b>String diretor = "Diretor do Filme";</b><br>
    *<b>Classe c = new Classe();</b><br>
    *<b>c.getDiretor():</b><br>
    *@return retorna uma string com o valor contido na variável diretor  "Diretor do Filme" 
    */
    public String getDiretor() {
        return diretor;
    } 
    /**
    *Este método serve para pegarmos as informações da variável ano que 
    *se refere a data em que o filme foi lançado, esta variável está definida como 
    *privada, então utilizamos o método getAno que é público, para então
    *termos acesso as informações da variável ano.<br> 
    *<b>Exemplo:</b><br>
    *<b>String ano = "1990";</b><br>
    *<b>Classe c = new Classe();</b><br>
    *<b>c.getAno():</b><br>
    *@return retorna uma string com o valor contido na variável ano  "1990" 
    */
    public String getAno() {
        return ano;
    }
    /**
    *Este método serve para pegarmos as informações da variável idioma que se
    *refere aos idiomas em que o filme estará disponível, 
    *esta variável está definida como privada, então utilizamos o método getIdioma que é público, para então
    *termos acesso as informações da variável idioma.<br> 
    *<b>Exemplo:</b><br>
    *<b>String idioma = "Dublado";</b><br>
    *<b>Classe c = new Classe();</b><br>
    *<b>c.getIdioma():</b><br>
    *@return retorna uma string com o valor contido na variável idioma  "Dublado" 
    */
    public String getIdioma() {
        return idioma;
    }
     /**
    *Este método serve para pegarmos as informações da variável genero que se
    *refere ao gênero do filme, exemplo: Drama, Ação, Aventura e Etc... 
    *esta variável está definida como privada, então utilizamos o método 
    *getGenero que é público, para então termos acesso as informações 
    *da variável genero.<br> 
    *<b>Exemplo:</b><br>
    *<b>String genero = "Drama";</b><br>
    *<b>Classe c = new Classe();</b><br>
    *<b>c.getGenero():</b><br>
    *@return retorna uma string com o valor contido na variável genero  "Drama" 
    */
    public String getGenero() {
        return genero;
    }
    /**
    *Este método instancia a classe de conexão com o SGBD fazendo então a chamada
    *do método que irá inserir o cadastro em si no banco de dados.<br> 
    *<b>Exemplo:</b><br>
    *<b>Classe c = new Classe();</b><br>
    *<b>c.gravaFilme:</b><br> 
    * @see ConexaoBdSingleton
    */ 
    public void gravaFilme(){
        try {
            ConexaoBdSingleton.getInstance().insereFilme(this);
        }catch (SQLException ex) {
            Logger.getLogger(Cinema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    @Override
    public String toString() {
        return nome + ", " + diretor + ", " + ano + ", " + idioma + ", " + genero;
    }
    /**
    *Este é um método abstrato herdado da classe TemplateMethodCadastroObj
    *e implementado aqui, tendo em seu corpo o método <b>gravaFilme()</b> e 
    *o método <b>toString()</b><br> 
    *<b>Exemplo:</b><br>
    *<b>Classe c = new Classe();</b><br>
    *<b>c.cadastro():</b><br> 
    *@see TemplateMethodCadastroObj
    *@see Interface
    *@see gravaFilme()
    *@see toString()
    */
    @Override
    public void cadastro() {
        gravaFilme();
        //Impressão do objeto criado
        System.out.println(toString()); 
    }

}

