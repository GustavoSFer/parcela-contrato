package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entities.Contrato;

public class SistemaPrincipal {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre com os dados da parcela");
    System.out.print("Número do contrato: ");
    int numero = sc.nextInt();
    System.out.print("Data do contrato (dd/mm/aaaa): ");
    LocalDate data = LocalDate.parse(sc.next(), dtf);
    System.out.print("Valor do contrato: ");
    double valor = sc.nextDouble();

    Contrato contrato = new Contrato(numero, data, valor);

    sc.close();
  }

}
