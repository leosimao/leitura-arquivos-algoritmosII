package model.service;

import model.dto.DadosArquivoDTO;
import model.dto.DesempenhoAlunoDTO;
import model.dto.DisciplinaAnoDTO;
import model.dto.DisciplinaDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InputFileService {

    private List<DadosArquivoDTO> leituraArquivos;
    private DisciplinaDTO notasDisciplinas;
    private List<DisciplinaAnoDTO> notasDisciplinasAnos;
    private List<DesempenhoAlunoDTO> notasDesempenhoAlunos;

    public InputFileService(FileReader leituraArquivo){
        this.leituraArquivos = converterArquivoToDadoArquivo(leituraArquivo);
        this.notasDisciplinas = this.converterDadosArquivosToDisciplina(leituraArquivos);
        this.notasDisciplinasAnos = this.converterDadosArquivosToDisciplinaAno(leituraArquivos);
        this.notasDesempenhoAlunos = this.converterDadosArquivosToDesempenhoAluno(leituraArquivos);
    }

    public void getMediaDisciplinaAno(){

    }

    public void getMedianaDisciplinaAno(){
    }

    public void getDesvioPadraoDisciplinaAno(){
    }

    public void getMediaDisciplina(){
    }

    public void getMedianoDisciplina(){
    }

    public void getDesvioPadraoDisciplina(){

    }

    public void getDesempenhoAluno(){
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

    private List<DisciplinaAnoDTO> converterDadosArquivosToDisciplinaAno(List<DadosArquivoDTO> dadosArquivo){
        return dadosArquivo.stream()
                .collect(Collectors.groupingBy(DadosArquivoDTO::getAnoVigente))
                .entrySet().stream()
                .map(fluxoMap -> new DisciplinaAnoDTO(fluxoMap.getKey(), this.converterNotasToLinha(fluxoMap.getValue())))
                .collect(Collectors.toList());
    }

    private DisciplinaDTO converterDadosArquivosToDisciplina(List<DadosArquivoDTO> dadosArquivo){
        return new DisciplinaDTO(this.converterNotasToLinha(dadosArquivo));
    }

    private List<DesempenhoAlunoDTO> converterDadosArquivosToDesempenhoAluno(List<DadosArquivoDTO> dadosArquivo){
        return dadosArquivo.stream()
                .collect(Collectors.groupingBy(DadosArquivoDTO::getIdAluno))
                .entrySet().stream()
                .map(fluxoMap -> new DesempenhoAlunoDTO(fluxoMap.getKey(), this.converterNotasToLinha(fluxoMap.getValue())))
                .collect(Collectors.toList());
    }

    private Map<String, List<Integer>> converterNotasToLinha(List<DadosArquivoDTO> dadosArquivoFiltrado){
        Map<String, List<Integer>> mapNotas = new HashMap<>();
        mapNotas.putIfAbsent("notaMateria1", dadosArquivoFiltrado.stream()
                .map(DadosArquivoDTO::getNotaMateria1)
                .collect(Collectors.toList()));

        mapNotas.putIfAbsent("notaMateria2", dadosArquivoFiltrado.stream()
                .map(DadosArquivoDTO::getNotaMateria2)
                .collect(Collectors.toList()));

        mapNotas.putIfAbsent("notaMateria3", dadosArquivoFiltrado.stream()
                .map(DadosArquivoDTO::getNotaMateria3)
                .collect(Collectors.toList()));

        mapNotas.putIfAbsent("notaMateria4", dadosArquivoFiltrado.stream()
                .map(DadosArquivoDTO::getNotaMateria3)
                .collect(Collectors.toList()));

        return mapNotas;
    }

    private Map<String, Integer> getMedia(Map<String, List<Integer>> mapNotas){
        Map<String, Integer> mediaCalculada = new HashMap<>();
        for(Map.Entry<String, List<Integer>> mapNota : mapNotas.entrySet()){
            String chaveMap = mapNota.getKey();
            List<Integer> valoresMap = mapNota.getValue();
            int somaValores = 0;
            for (int valor: valoresMap) {
                somaValores += valor;
            }

            int calculoMedia = somaValores / valoresMap.size();

            mediaCalculada.put(chaveMap, calculoMedia);
        }

        return mediaCalculada;
    }

}
