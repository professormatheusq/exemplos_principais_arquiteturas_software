package cqrs.command;
import cqrs.model.Pedido;

public class AtualizarPedidoCommand {
    public void executar(Pedido pedido, String novoStatus) {
        pedido.atualizarStatus(novoStatus);
    }
}
