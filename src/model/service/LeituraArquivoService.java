package model.service;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraArquivoService {

    public static Double getMediaCalculada(FileReader arquivo){
        BufferedReader leituraArquivo = arquivoBuffered(arquivo);


        return 0.0;
    }

    private static BufferedReader arquivoBuffered(FileReader arquivo) {
        BufferedReader leituraArquivo = new BufferedReader(arquivo);
        String linhaLida;
        try {
            while ((linhaLida = leituraArquivo.readLine()) != null) {
                System.out.println(linhaLida);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return new BufferedReader(arquivo);
    }
}
