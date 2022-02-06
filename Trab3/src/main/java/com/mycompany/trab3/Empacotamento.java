import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Empacotamento {
    // serialização: gravando o objetos no arquivo binário "nomeArq"
    public static void gravarArquivoBinario(ArrayList<Object> lista, String nomeArq) {
        File arq = new File(nomeArq); // cria arquivo para saida
        try {
            arq.delete();
            arq.createNewFile();
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq)); // objeto de gravacao
            objOutput.writeObject(lista);
            objOutput.close();
        } catch(IOException erro) { // falha na escrita do arq
            System.out.printf("Erro: %s", erro.getMessage());
        }
    }
    // desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
    public static ArrayList<Object> lerArquivoBinario(String nomeArq) {
        ArrayList<Object> lista = new ArrayList();
        try {
            File arq = new File(nomeArq);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<Object>)objInput.readObject();
                objInput.close();
            }
        } catch(IOException erro1) { // falha na leitura do arquivo
            System.out.printf("Erro: %s", erro1.getMessage());
        } catch(ClassNotFoundException erro2) { // falha ref classpath
            System.out.printf("Erro: %s", erro2.getMessage());
        }
        return(lista);
    }
}
