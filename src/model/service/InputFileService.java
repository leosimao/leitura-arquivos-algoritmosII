package model.service;

import model.dto.DadosArquivoDTO;
import model.dto.DisciplinaAnoDTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InputFileService {

    private List<DadosArquivoDTO> leituraArquivos;

    public InputFileService(FileReader leituraArquivo){
        this.leituraArquivos = converterArquivoToDadoArquivo(leituraArquivo);
    }

    public Double getMediaDisciplinaAno(){

        return 0.0;
    }

    private List<DadosArquivoDTO> converterArquivoToDadoArquivo(FileReader arquivo) {
        BufferedReader leituraArquivo = new BufferedReader(arquivo);
        String linhaLida;
        List<DadosArquivoDTO> listaDadosArquivoDto = new ArrayList<>();
        try {
            leituraArquivo.readLine();
            while ((linhaLida = leituraArquivo.readLine()) != null) {
                String[] valoresLinha = linhaLida.split(",");
                listaDadosArquivoDto.add(new DadosArquivoDTO(valoresLinha));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaDadosArquivoDto;
    }

    private void converterDadosArquivosToDisciplinaAno(List<DadosArquivoDTO> dadosArquivo){
        List<Integer> anosVigente = dadosArquivo.stream().map(DadosArquivoDTO::getAnoVigente)
                .distinct()
                .collect(Collectors.toList());
    }
}
