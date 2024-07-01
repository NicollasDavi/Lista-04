import Controller.*;
import View.*;

public class App {
    public static void main(String[] args) {
        SeguroController controller = new SeguroController();
        SeguroView view = new SeguroView(controller);
        view.exibirMenu();
    }
}