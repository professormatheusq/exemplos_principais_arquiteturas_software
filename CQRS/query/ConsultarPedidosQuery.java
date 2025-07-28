package cqrs.query;
import java.util.List;
import cqrs.model.Pedido;

public class ConsultarPedidosQuery {
    public void listar(List<Pedido> pedidos) {
        System.out.println("Pedidos:");
        for (Pedido p : pedidos) {
            System.out.println("- " + p.getStatus());
        }
    }
}
