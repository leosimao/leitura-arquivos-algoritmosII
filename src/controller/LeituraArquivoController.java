package controller;

import model.service.LeituraArquivoService;

import java.io.FileReader;

public class LeituraArquivoController {

    private LeituraArquivoService leituraArquivoService = new LeituraArquivoService();
    private FileReader leituraArquivo;

    public LeituraArquivoController(FileReader leituraArquivo){
        this.leituraArquivo = leituraArquivo;
        this.getMediaFinal();
    }
    public Double getMediaFinal(){
        return leituraArquivoService.getMediaCalculada(leituraArquivo);
    }
}
