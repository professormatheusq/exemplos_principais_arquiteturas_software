package mvc;
import mvc.controller.LoginController;
import mvc.view.TelaLogin;

public class Main {
    public static void main(String[] args) {
        LoginController controller = new LoginController();
        TelaLogin view = new TelaLogin();
        boolean sucesso = controller.autenticar("123");
        if (sucesso) view.mostrarMensagem("Login realizado com sucesso!");
        else view.mostrarMensagem("Senha incorreta.");
    }
}
