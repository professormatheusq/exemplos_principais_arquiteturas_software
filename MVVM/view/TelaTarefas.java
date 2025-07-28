package mvvm.view;
import java.util.List;
import mvvm.model.Tarefa;

public class TelaTarefas {
    public void exibir(List<Tarefa> tarefas) {
        System.out.println("Tarefas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println("- " + tarefa.getDescricao());
        }
    }
}
