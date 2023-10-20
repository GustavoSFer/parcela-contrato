package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
  private int numero;
  private Date data;
  private double valor;
  private List<Parcela> parcelas = new ArrayList<>();

  public Contrato(int numero, Date data, double valor) {
    super();
    this.numero = numero;
    this.data = data;
    this.valor = valor;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public List<Parcela> getParcelas() {
    return parcelas;
  }


}
