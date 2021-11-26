
package exemplo;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int opcao;
        Conta ct = new Conta();
        System.out.println("-------BancoSA---------");
        System.out.print("Digite o numero da conta:");
        ct.numero= scan.nextInt();
        //System.out.print("Nome:");
        //ct.nome_titular= scan.toString();
        System.out.print("Valor inicial conta: R$ ");
        ct.saldo= scan.nextDouble();
        System.out.println("Numero da conta: " +ct.numero+" "+"Saldo: R$ "+ ct.saldo);
        
        
        do{
            System.out.println("-------BancoSA---------");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("0- Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            
            if(opcao==1){
                System.out.print("Digite o valor do deposito: ");
                double deposito= scan.nextDouble();
                System.out.println("Valor depositado R$ "+deposito);
                ct.depositar(deposito);               
            }else if(opcao==2){
                System.out.print("Digite o valor do saque: ");
                double saque= scan.nextDouble();
                boolean resp=ct.sacar(saque);
                if(resp==true){
                    System.out.println("Valor sacado R$ "+saque);
                    System.out.println("Saque efetuado com sucesso");
                }else{
                    System.out.println("Saque não efetuado");
                }
            }
        
        }while(opcao != 0);
    }
    
}
