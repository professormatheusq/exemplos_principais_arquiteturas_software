package mvvm;
import mvvm.viewmodel.TarefaViewModel;
import mvvm.view.TelaTarefas;

public class Main {
    public static void main(String[] args) {
        TarefaViewModel viewModel = new TarefaViewModel();
        TelaTarefas view = new TelaTarefas();
        viewModel.adicionar("Estudar arquitetura MVVM");
        viewModel.adicionar("Fazer exercícios práticos");
        view.exibir(viewModel.getTarefas());
    }
}
