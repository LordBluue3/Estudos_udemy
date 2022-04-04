package modulo10.vetores.exercicio;

import modulo10.vetores.produtos.Quartos;

import java.util.Scanner;

public class Alugar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos vão ser alugados?");
        int quartos = sc.nextInt();
        Quartos []vect = new Quartos[10];

        for(int i = 1; i <= quartos; i++){
            System.out.println("Aluguel #"+i);
            System.out.println("Digite o nome:");
            String nome = sc.next();
            System.out.println("Digite o email:");
            String email = sc.next();
            System.out.println("Digite o numero do quarto:");
            int quarto = sc.nextInt();
            vect[quarto] = new Quartos(nome, email, quarto);
        }
        System.out.println("Quartos alugados:");
        for (Quartos itens  : vect) {
            if(itens != null){
                String formatar = itens.getQuarto()+": "+itens.getNome()+", "+itens.getEmail();
                System.out.println(formatar);
            }
        }
        sc.close();
    }
}
