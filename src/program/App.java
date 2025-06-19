package program;

import entities.ConversaoResultado;
import entities.Conversor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conversor converter = new Conversor();
        Scanner ler = new Scanner(System.in);
        String opcao ="yes";
        while(opcao.equals("yes")){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("olá!, Seja bem-vindo/a ao conversor de moedas\n ");
            System.out.println("ARS - Peso argentino\n" +
                    "BOB - Boliviano boliviano\n" +
                    "BRL - Real brasileiro\n" +
                    "CLP - Peso chileno\n" +
                    "COP - Peso colombiano\n" +
                    "USD - Dólar americano");
            System.out.println("Qual moeda vai converter: ");
            var moedaBase = ler.nextLine();
            System.out.println("Para Qual moeda vai ser convertida");
            var moedaConverte = ler.nextLine();
            System.out.println("Qual valor vai converter:");
            var totalParaConverter = ler.nextDouble();
            ConversaoResultado resultado = converter.converteMoeda(moedaBase,moedaConverte,totalParaConverter);
            System.out.println(resultado);
            System.out.println("Deseja continuar:(yes/not)");
            ler.nextLine();
            opcao=ler.nextLine();
        }
       // ConversaoResultado resultado = converter.converteMoeda("EUR","GBP",50);
        //System.out.println(resultado);
        ler.close();
    }
}
