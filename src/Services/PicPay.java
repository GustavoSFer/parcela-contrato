package Services;

import interfaces.ServicoPagamento;

public class PicPay implements ServicoPagamento {
  private final double juros = 0.01;
  private final double taxa = 0.02;

  @Override
  public double jutosMensal() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double taxa() {
    // TODO Auto-generated method stub
    return 0;
  }

}
