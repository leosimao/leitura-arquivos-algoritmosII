import controller.LeituraArquivoController;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IniciarProjeto {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src\\resources\\notas_alunos.txt";
        FileReader leituraArquivo = new FileReader(filePath);
        LeituraArquivoController leituraController = new LeituraArquivoController(leituraArquivo);
    }
}