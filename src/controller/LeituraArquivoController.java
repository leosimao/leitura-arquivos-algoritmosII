package controller;

import model.service.LeituraArquivoService;

import java.io.FileReader;

public class LeituraArquivoController {

    public Double getMediaFinal(FileReader arquivo){
        return LeituraArquivoService.getMediaFinal(arquivo);
    }
}
