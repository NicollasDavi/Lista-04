import java.util.Scanner;
import br.edu.up.Models.*;

import controller.SeguroController;
import model.SeguroModel;
import view.SeguroView;

public class Programa {
    public static void main(String[] args) {
        SeguroModel model = new SeguroModel();
        SeguroView view = new SeguroView();
        SeguroController controller = new SeguroController(model, view);
        controller.iniciar();
    }
}