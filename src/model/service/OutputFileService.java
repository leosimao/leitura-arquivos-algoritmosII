package model.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class OutputFileService {
    private final String pathOutputFile = "src\\resources\\output\\nota_aluno_formatada_" + LocalDate.now() + ".txt";

    public OutputFileService(){
        this.criarArquivo();
    }
    private void criarArquivo(){
        File novoArquivo = new File(this.pathOutputFile);
        try {
            novoArquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
