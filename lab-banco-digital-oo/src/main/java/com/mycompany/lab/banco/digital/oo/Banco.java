package com.mycompany.lab.banco.digital.oo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void imprimirContasClientes() {
        System.out.println("=== " + this.nome + " ===");
        System.out.println("Contas cadastradas no banco: ");
        for (Conta conta : this.contas) {
            System.out.println(conta);
        }
        System.out.println("Clientes cadastrados no banco: ");
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente);
        }
    }
}
