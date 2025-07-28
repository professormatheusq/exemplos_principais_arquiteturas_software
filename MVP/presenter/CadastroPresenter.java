package mvp.presenter;
import mvp.model.Usuario;
import mvp.view.TelaCadastro;

public class CadastroPresenter {
    private Usuario usuario;
    private TelaCadastro view;

    public CadastroPresenter(TelaCadastro view) {
        this.view = view;
        this.usuario = new Usuario();
    }

    public void salvarUsuario(String nome) {
        usuario.setNome(nome);
        view.exibirMensagem("Usuário cadastrado: " + nome);
    }
}
