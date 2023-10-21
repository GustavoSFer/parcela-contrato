package Services;

import interfaces.ServicoPagamento;

public class PicPay implements ServicoPagamento {
  private final double juros = 0.01;
  private final double taxa = 0.02;

  @Override
  public double jutosMensal(double valor, int meses) {
    return valor * juros * meses;
  }

  @Override
  public double taxa(double valor) {
    return valor * taxa;
  }


}
