/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.git.exercicio.git;

/**
 *
 * @author Isak
 */
public class PaymentTransaction {
    private AccountEntry accountEntry;

    public PaymentTransaction() {
    }

    public AccountEntry getAccountEntry() {
        return accountEntry;
    }

    public void setAccountEntry(AccountEntry accountEntry) {
        this.accountEntry = accountEntry;
    }
    
}
