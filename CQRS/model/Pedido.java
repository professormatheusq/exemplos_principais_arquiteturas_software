package cqrs.model;
public class Pedido {
    private String status;
    public Pedido(String status) { this.status = status; }
    public String getStatus() { return status; }
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}
