package controller;

import model.service.InputFileService;

import java.io.FileReader;

public class InputFileController {

    private InputFileService inputFileService;

    public InputFileController(FileReader leituraArquivo){
        this.inputFileService = new InputFileService(leituraArquivo);
    }
    public void getMediaDisciplinaAno(){
        inputFileService.getMediaDisciplina();
    }
}
