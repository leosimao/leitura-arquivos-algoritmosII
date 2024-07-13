package model.service;

import model.dto.DadosArquivoDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivoService {

    public Double getMediaCalculada(FileReader arquivo){
        List<DadosArquivoDTO> leituraArquivo = converterArquivoToDadoArquivo(arquivo);

        return 0.0;
    }

    private static List<DadosArquivoDTO> converterArquivoToDadoArquivo(FileReader arquivo) {
        BufferedReader leituraArquivo = new BufferedReader(arquivo);
        String linhaLida;
        List<DadosArquivoDTO> listaDadosArquivoDto = new ArrayList<>();
        try {
            leituraArquivo.readLine();
            while ((linhaLida = leituraArquivo.readLine()) != null) {
                String[] valoresLinha = linhaLida.split(",");
                listaDadosArquivoDto.add(new DadosArquivoDTO(valoresLinha));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return listaDadosArquivoDto;
    }
}
