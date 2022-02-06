import java.io.FileReader;
import java.util.Scanner;

public class ExerA     {

    public static void main(String[] args)  {


        try(Scanner arquivo = new Scanner(new FileReader("C:/Users/vinic/Documents/NetBeansProjects/ExercicioArquivos/src/main/java/com/mycompany/exercicioarquivos/arquivo.txt"))){


            while(arquivo.hasNext()){

                int filial = Integer.parseInt(arquivo.next());
                double valor = Double.parseDouble(arquivo.next());

            }


        }catch(Exception e){
            System.out.println(e);

        }


    }
}