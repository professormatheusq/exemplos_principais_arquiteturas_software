package mvp;
import mvp.presenter.CadastroPresenter;
import mvp.view.TelaCadastro;

public class Main {
    public static void main(String[] args) {
        TelaCadastro view = new TelaCadastro();
        CadastroPresenter presenter = new CadastroPresenter(view);
        presenter.salvarUsuario("Maria Oliveira");
    }
}
