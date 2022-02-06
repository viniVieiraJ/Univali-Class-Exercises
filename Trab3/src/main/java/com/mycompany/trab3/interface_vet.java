import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class interface_vet {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean acabou = false;
        int valorMenu;


        do{

            System.out.println("***********Sistema veterinário***********");
            System.out.println("1. Cadastrar \n2. Deletar \n3. Exibir \n4. Editar \n5. Iniciar novo Tratamento \n6. Fechar Programa  ");

            do {
                System.out.println("Selecione um item do menu");
                valorMenu = scanner.nextInt();
            }while(valorMenu > 6 || valorMenu < 1);//Mudar


            switch(valorMenu){
                case 1:
                    System.out.println("1. Cadastrar Cliente \n2. Cadastro Animal");
                    do {
                        System.out.println("Selecione um item do menu");
                        valorMenu = scanner.nextInt();
                    }while(valorMenu > 2 || valorMenu < 1);


                    switch(valorMenu){
                        case 1:
                            Controlador_vet.CadastroCliente();
                            break;
                        case 2:
                            Controlador_vet.CadastroAnimal();
                            break;

                    }
                    break;


                case 2:
                    System.out.println("1. Deletar Cliente \n2. Deletar Animal ");
                    do {
                        System.out.println("Selecione um item do  menu");
                        valorMenu = scanner.nextInt();
                    }while(valorMenu > 3 || valorMenu < 1);


                    switch(valorMenu){
                        case 1:
                            Controlador_vet.DeleteCliente();
                            break;
                        case 2:
                            Controlador_vet.DeleteAnimal();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Clientes e Animais\n2. Tratamentos, Consultas e Exames \n3. Cadastro do Cliente \n4. Cadastro do Animal");
                    do {
                        System.out.println("Selecione um item do  menu");
                        valorMenu = scanner.nextInt();
                    }while(valorMenu > 4 || valorMenu < 1);


                    switch(valorMenu){
                        case 1:
                            Controlador_vet.MostrarClientesEAnimais();
                            break;
                        case 2:
                            Controlador_vet.MostrarTratamentosConsultasExames();
                            break;
                        case 3:
                            Controlador_vet.MostrarCadastroCliente();
                            break;
                        case 4:
                            Controlador_vet.MostrarCadastroAnimal();
                            break;
                    }

                    break;
                case 4:
                    System.out.println("1. Editar Cliente \n2. Editar Animal");
                    do {
                        System.out.println("Selecione um item do menu");
                        valorMenu = scanner.nextInt();
                    }while(valorMenu > 2 || valorMenu < 1);


                    switch(valorMenu){
                        case 1:
                            Controlador_vet.EditarCliente();
                            break;
                        case 2:
                            Controlador_vet.EditarAnimal();
                            break;

                    }
                    break;

                case 5:
                    Controlador_vet.IniciarTratamento();
                    break;
                case 6:
                    acabou = true;
                    break;
            }




        }while(!acabou);

    }

}
