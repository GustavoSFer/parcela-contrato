package entities;

import java.time.LocalDate;

public class Parcela {
  private LocalDate data;
  private double valor;

  public Parcela(LocalDate data, double valor) {
    this.data = data;
    this.valor = valor;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }



}
