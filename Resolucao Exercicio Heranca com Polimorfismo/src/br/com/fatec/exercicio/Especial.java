/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.exercicio;

/**
 *
 * @author Rafael
 */
public class Especial extends Corrente {
    private CartaoCredito cartaoCredito; //agregação
    private float limite;

    @Override
    public boolean retirar(float valor) {
        
        if(super.getSaldo() + this.limite >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        else 
            return false;
    }
    
    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Especial(Correntista correntista) {
        super(correntista);
        //instancia o objeto para a agregação
        cartaoCredito = new CartaoCredito();
    }

    public Especial(CartaoCredito cartaoCredito, Correntista correntista) {
        super(correntista);
        this.cartaoCredito = cartaoCredito;
    }


}
