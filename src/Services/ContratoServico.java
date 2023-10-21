package Services;

import java.time.LocalDate;
import entities.Contrato;
import entities.Parcela;
import interfaces.ServicoPagamento;

public class ContratoServico {
  private ServicoPagamento servicoPagamento;


  public ContratoServico(ServicoPagamento servicoPagamento) {
    this.servicoPagamento = servicoPagamento;
  }

  public void processarContrato(Contrato contrato, int meses) {
    double valorMes = contrato.getValor() / meses;
    for (int i = 1; i <= meses; i++) {
      double valorParcela = Math.pow(valorMes, i);
      LocalDate data = contrato.getData().plusMonths(i);
      contrato.getParcelas().add(new Parcela(data, valorParcela));
    }
  }
}
