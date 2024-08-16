package ContaBanco;

import java.util.ArrayList;
import java.util.List;

public class ContaTerminal {
    private String agencia, nomeCliente;
    private int numeroConta;
    private double saldo;

    private List<ContaTerminal> clientes= new ArrayList<>();


    public ContaTerminal(String agencia, String nomeCliente, int numeroConta, double saldo) {
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaTerminal() {
    }

    public void addClientes(ContaTerminal novoCliente){
        clientes.add(novoCliente);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
