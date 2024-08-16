package ContaBanco;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaTerminal cliente = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        cliente.setNomeCliente(scanner.nextLine());
        System.out.println("Por favor, digite o número da Agência: ");
        cliente.setAgencia(scanner.nextLine());
        System.out.println("Por favor, digite o número da Conta: ");
        cliente.setNumeroConta(scanner.nextInt());
        System.out.println("Por favor, digite o seu saldo: ");
        cliente.setSaldo(scanner.nextDouble());
        scanner.close();

        cliente.addClientes(cliente);

        System.out.println("Olá " + cliente.getNomeCliente() + " obrigado por criar uma conta" +
                " em nosso banco, sua agência é " + cliente.getAgencia() + ", " +
                "conta " + cliente.getNumeroConta() + " e seu saldo: "  + cliente.getSaldo() +
                " já está disponível para saque!");
        }
    }
