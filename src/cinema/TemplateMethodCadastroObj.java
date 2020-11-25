package cinema;
/**
*Classe abstrata que possuí um modelo para cadastro de objetos, contendo um 
*método abstrato, seguindo o padrão de projeto TEMPLATE METHOD
*@author Filipi Vieira
*/
public abstract class TemplateMethodCadastroObj {
    /**
    *Assinatura do método abstrato, que tem que ser implementado na classe
    *herdeira.
    */
    public abstract void cadastro();
    /**
    *Este método faz a chamada do método abstrato cadastro().
    *@see cadastro()
    */
    public final void cadastrar(){
        cadastro();
    }
}
