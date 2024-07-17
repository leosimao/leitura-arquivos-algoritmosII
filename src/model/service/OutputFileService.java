package model.service;

import java.io.File;
import java.io.IOException;

public class OutputFileService {
    private final String pathOutputFile = "src\\resources\\output\\teste2.txt";

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
