package cinema;

import java.awt.Color;
import java.awt.Container; // Biblioteca para Container
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.*; // Simplificando a inclusão de bibliotecas.
import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *É uma subclasse da classe JFrame, tornando-se assim uma classe herdeira.
 *Classe para objetos do tipo interface, onde é feito toda a manipulação
 *de interface como janelas, dimensões, botões, ações e etc...
 *@see JFrame 
 *@author Filipi Vieira
 */
public class Interface extends JFrame {
    /**
    *Variável do tipo JLabel, uma sequência de texto curta referente ao nome
    */
    private JLabel lblNome;
    /**
    *Variável do tipo JTextField, referente ao campo de digitação do nome
    */
    private JTextField txtNome;
    /**
    *Variável do tipo JLabel, uma sequência de texto curta referente ao diretor
    */
    private JLabel lblDiretor;
    /**
    *Variável do tipo JTextField, referente ao campo de digitação do diretor
    */
    private JTextField txtDiretor;
    /**
    *Variável do tipo JLabel, uma sequência de texto curta referente ao ano
    */
    private JLabel lblAno;
    /**
    *Variável do tipo JTextField, referente ao campo de digitação do ano
    */
    private JTextField txtAno;
    /**
    *Variável do tipo JLabel, uma sequência de texto curta referente ao idioma
    */
    private JLabel lblIdioma;
    /**
    *Variável do tipo JLabel, uma sequência de texto curta referente ao gênero
    */
    private JLabel lblGenero;
    /**
    *Variável do tipo JComobox, uma caixa de seleção com opções de idiomas
    */
    private JComboBox cmbIdioma;
    /**
    *Variável do tipo JComobox, uma caixa de seleção com opções de gênero
    */
    private JComboBox cmbGenero;
    /**
    * Vetor do tipo String, que recebem valores que não serão modificados,
    * com opções "Dublado" e "Legendado" 
    */
    private final String[] idioma = {"Dublado", "Legendado"};
    /**
    * Vetor do tipo String, que recebem valores que não serão modificados,
    * com opções "Ação", "Suspense", "Drama" e etc... 
    */
    private final String[] genero = {"Ação", "Suspense", "Drama", "Comedia","Romance","Documentário"};
    /**
    *Variável do tipo JButton, referente ao botão de Ok
    */
    private JButton btnOK;
    /**
    *Variável do tipo Container, para manipulação de tela na interface
    */
    private Container cnt;
    
    public Interface() {
        
        // Configurando a janela
        setTitle("Tela Inicial");
        setSize(400,400);   
        cnt = getContentPane();
        cnt.setLayout(null);
        // Encerrando a aplicação quando fechamos a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Instanciando os botões   
        
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();
        
        lblDiretor = new JLabel("Diretor");
        txtDiretor = new JTextField();
        lblAno = new JLabel ("Ano");
        try {
            txtAno = new JFormattedTextField(new MaskFormatter("####"));
        }catch (ParseException e){
            e.printStackTrace();
        }  
         
        lblIdioma = new JLabel ("Idioma");
        cmbIdioma = new JComboBox(idioma);
        
        lblGenero = new JLabel ("Genero");
        cmbGenero = new JComboBox(genero);
        
        btnOK = new JButton("Cadastrar Filme");
  
        // Configurando na tela
        lblNome.setBounds(10,10,100,25);// x, y, altura, largura
        txtNome.setBounds(140,10,200,25);
        
        lblDiretor.setBounds(10,50,100,25);
        txtDiretor.setBounds(140,50,200,25);
        
        lblAno.setBounds(10,90,200,25);
        txtAno.setBounds(140,90,200,25);
        
        lblIdioma.setBounds(10,130,200,25);
        cmbIdioma.setBounds(140,130,200,25);
        
        lblGenero.setBounds(10,170,200,25);
        cmbGenero.setBounds(140,170,200,25);
        
        btnOK.setBounds(148,230,180,50);
        
        // Adicionando na tela
        cnt.add(lblNome);
        cnt.add(txtNome);
        
        cnt.add(lblDiretor);
        cnt.add(txtDiretor);
        
        cnt.add(lblAno);
        cnt.add(txtAno);
        
        cnt.add(lblIdioma);
        cnt.add(cmbIdioma);
        
        cnt.add(lblGenero);
        cnt.add(cmbGenero);
        
        cnt.add(btnOK);
        
        // Tornando os componentes visiveis
        setVisible(true);
        
        // Iiniciando as caixas de seleção com o valor nulo
        cmbIdioma.setSelectedItem(null);
        cmbGenero.setSelectedItem(null);
        
        // Configurando o evento que ocorrerá quando o usuário clicar no botão
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pegando as informações digitadas pelo usuário
                String nome = txtNome.getText();
                String diretor = txtDiretor.getText();
                String ano = txtAno.getText();
                String idioma = (String) cmbIdioma.getSelectedItem();
                String genero = (String) cmbGenero.getSelectedItem();
                Cinema c = new Cinema(nome, diretor, ano, idioma, genero);
                c.cadastrar();
                limpaCamposDigitacao();
            }          
        });          
    }    
    /**
    *Método que realiza a limpeza dos campos de digitação e reseta as caixas
    *de seleção 
    */
    private void limpaCamposDigitacao(){
        txtNome.setText("");
        txtDiretor.setText("");
        txtAno.setText("");
        cmbIdioma.setSelectedItem(null);
        cmbGenero.setSelectedItem(null);
    }
}
