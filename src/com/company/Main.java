package com.company;

import java.util.Scanner;

public class Main {
    static double numUm;
    static double numDois;
    static String palavraUm;
    static String palavraDois;
    static int Resp;
    public static void main(String[] args)
    {
        System.out.println("Ola meu Professor preferido!");
        System.out.println("Digite o que deseja fazer: ");
        System.out.println("1 - para Somar dois números.");
        System.out.println("2 - para Subtrair dois números.");
        System.out.println("3 - para Multiplicar dois números.");
        System.out.println("4 - para Dividir dois números.");
        System.out.println("5 - para Concatenar duas palavras.");
        Scanner scannerResp = new Scanner(System.in);
        Resp = scannerResp.nextInt();
        while(Resp != 0)
        {
            while(Resp != 1 & Resp != 2 & Resp != 3 & Resp != 4 & Resp != 5)
            {
                System.out.println("DIGITE UM NÚMERO VÁLIDO");
                //System.out.println("Digite o que deseja fazer: ");
                System.out.println("1 - para Somar dois números.");
                System.out.println("2 - para Subtrair dois números.");
                System.out.println("3 - para Multiplicar dois números.");
                System.out.println("4 - para Dividir dois números.");
                System.out.println("5 - para Concatenar duas palavras.");
                Scanner scannerRepeticao = new Scanner(System.in);
                Resp = scannerRepeticao.nextInt();
            }
            if(Resp == 1)
            {
                System.out.println("Digite o primeiro numero: ");
                Scanner scannerNumUm = new Scanner(System.in);
                numUm = scannerNumUm.nextDouble();
                System.out.println("Digite o segundo numero: ");
                Scanner scannerNumDois = new Scanner(System.in);
                numDois = scannerNumDois.nextDouble();
                System.out.println("A Soma do " + numUm + " com o " + numDois +" é igual a: " + (numUm+numDois));
            }
            if(Resp == 2)
            {
                System.out.println("Digite o primeiro numero: ");
                Scanner scannerNumUm = new Scanner(System.in);
                numUm = scannerNumUm.nextDouble();
                System.out.println("Digite o segundo numero: ");
                Scanner scannerNumDois = new Scanner(System.in);
                numDois = scannerNumDois.nextDouble();
                System.out.println("A Subtração do " + numUm + " com o " + numDois +" é igual a: " + (numUm-numDois));
            }
            if(Resp == 3)
            {
                System.out.println("Digite o primeiro numero: ");
                Scanner scannerNumUm = new Scanner(System.in);
                numUm = scannerNumUm.nextDouble();
                System.out.println("Digite o segundo numero: ");
                Scanner scannerNumDois = new Scanner(System.in);
                numDois = scannerNumDois.nextDouble();
                System.out.println("A Multiplicação do " + numUm + " com o " + numDois +" é igual a: " + (numUm*numDois));
            }
            if(Resp == 4)
            {
                System.out.println("Digite o primeiro numero: ");
                Scanner scannerNumUm = new Scanner(System.in);
                numUm = scannerNumUm.nextDouble();
                System.out.println("Digite o segundo numero: ");
                Scanner scannerNumDois = new Scanner(System.in);
                numDois = scannerNumDois.nextDouble();
                System.out.println("A Divisão do " + numUm + " com o " + numDois +" é igual a: " + (numUm/numDois));
            }
            if(Resp == 5)
            {
                System.out.println("Digite a primeira palavra: ");
                Scanner scannerPalavUm = new Scanner(System.in);
                palavraUm = scannerPalavUm.nextLine();
                System.out.println("Digite a segunda palavra: ");
                Scanner scannerPalavDois = new Scanner(System.in);
                palavraDois = scannerPalavDois.nextLine();
                System.out.println("A Concatenação da palavra " + palavraUm + " com a " + palavraDois +" é igual a: " + palavraUm+palavraDois);
            }
            System.out.println("VAMOS FAZER NOVAMENTE!!");
            System.out.println("Digite o que deseja fazer, ou digite 0 para SAIR ");
            System.out.println("1 - para Somar dois números.");
            System.out.println("2 - para Subtrair dois números.");
            System.out.println("3 - para Multiplicar dois números.");
            System.out.println("4 - para Dividir dois números.");
            System.out.println("5 - para Concatenar duas palavras.");
            Scanner scannerRepeticao = new Scanner(System.in);
            Resp = scannerRepeticao.nextInt();
        }
        System.out.println("TCHAU PROFESSOR QUERIDO!!!");
    }
}
