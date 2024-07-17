import controller.InputFileController;
import model.service.OutputFileService;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IniciarProjeto {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src\\resources\\notas_alunos.txt";
        FileReader leituraArquivo = new FileReader(filePath);
        InputFileController leituraController = new InputFileController(leituraArquivo);
    }
}