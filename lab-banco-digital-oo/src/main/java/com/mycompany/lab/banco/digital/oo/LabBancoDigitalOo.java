package com.mycompany.lab.banco.digital.oo;

import java.util.ArrayList;
import java.util.List;

public class LabBancoDigitalOo {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Leo's Bank");

        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Leonardo");
        cliente1.setCpf("11111111111");
        cliente1.setEndereco("Rua ficticia, 000");
        clientes.add(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Leandro");
        cliente2.setCpf("22222222222");
        cliente2.setEndereco("Rua ficticia, 000");
        clientes.add(cliente2);

        List<Conta> contas = new ArrayList<>();

        Conta contaC1 = new ContaCorrente(cliente1);
        Conta contaP1 = new ContaPoupanca(cliente1);
        contas.add(contaC1);
        contas.add(contaP1);

        Conta contaC2 = new ContaCorrente(cliente2);
        Conta contaP2 = new ContaPoupanca(cliente2);
        contas.add(contaC2);
        contas.add(contaP2);

        banco.setContas(contas);
        banco.setClientes(clientes);

        contaC1.depositar(100);
        contaC1.transferir(50, contaP1);

        contaC2.depositar(200);
        contaC2.transferir(100, contaP2);

        banco.imprimirContasClientes();
        contaC1.imprimirExtrato();
        contaP1.imprimirExtrato();
        contaC2.imprimirExtrato();
        contaP2.imprimirExtrato();
        
    }
}
