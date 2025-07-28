package mvvm.viewmodel;
import java.util.ArrayList;
import java.util.List;
import mvvm.model.Tarefa;

public class TarefaViewModel {
    private List<Tarefa> tarefas = new ArrayList<>();
    public void adicionar(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
