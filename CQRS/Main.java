package cqrs;
import cqrs.model.Pedido;
import cqrs.command.AtualizarPedidoCommand;
import cqrs.query.ConsultarPedidosQuery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = new Pedido("Pendente");
        pedidos.add(pedido);

        new ConsultarPedidosQuery().listar(pedidos);
        new AtualizarPedidoCommand().executar(pedido, "Concluído");
        new ConsultarPedidosQuery().listar(pedidos);
    }
}
