import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Controlador_vet {
    private static Scanner scanner = new Scanner(System.in);

    public static void CadastroCliente(){
        ArrayList<Object> dados =  Empacotamento.lerArquivoBinario("clientes.dat");

        System.out.println("Preencha os dados do Cliente");

        System.out.println("Nome do Cliente");
        String nome = scanner.nextLine();

        for(Object item: dados){
            if(((Cliente)item).getNom_cli().equalsIgnoreCase(nome)){
                System.out.println("Cliente já cadastrado");
                return;
            }
        }


        System.out.println("Endereço");
        String endereco = scanner.nextLine();
        System.out.println("Telefone");
        String tel = scanner.nextLine();
        System.out.println("cep");

        long cep = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();


        Cliente cliente = new Cliente(nome, endereco, tel, cep, email);
        dados.add(cliente);

        Empacotamento.gravarArquivoBinario(dados, "clientes.dat");

        System.out.println("Cliente Cadastrado com sucesso");

    }

    public static void CadastroAnimal(){
        ArrayList<Object> dadosCliente =  Empacotamento.lerArquivoBinario("clientes.dat");
        Object clienteAtual = null;

        System.out.println("Qual Nome do cliente");

        String clienteNome = scanner.nextLine();


        for (int i = 0; i < dadosCliente.size(); i++) {
            if (((Cliente)dadosCliente.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dadosCliente.get(i);
            }
        }


        if(clienteAtual == null){
            System.out.println("Cliente não existe");
            return;
        }

        System.out.println("Nome do animal");
        String nome = scanner.nextLine();

        for(Object item: ((Cliente)clienteAtual).getAnimais()){
            if(((Animal)item).getNome_animal().equalsIgnoreCase(nome)){
                System.out.println("Animal já cadastrado");
                return;
            }
        }


        System.out.println("Idade do animal");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sexo do animal");
        String sexo = scanner.nextLine();
        System.out.println("Espécie do animal");
        String especie = scanner.nextLine();



        Especie e = new Especie(especie);

        Animal animal = new Animal(nome, idade, sexo, e);


        ((Cliente)clienteAtual).adicionaAnimal(animal);

        Empacotamento.gravarArquivoBinario(dadosCliente, "clientes.dat");

        System.out.println("Animal Cadastrado com sucesso");
    }

    public static void DeleteCliente(){
        ArrayList<Object> dados =  Empacotamento.lerArquivoBinario("clientes.dat");

        System.out.println("Digite o nome do cliente que deseja excluir.");
        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dados.size(); i++)
        {
            if (((Cliente)dados.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                dados.remove(i);
                System.out.println(clienteNome + " removido!");
                Empacotamento.gravarArquivoBinario(dados, "clientes.dat");
                return;
            }
        }

        System.out.println("Cliente não encontrado.");


    }

    public static void DeleteAnimal(){
        ArrayList<Object> dados =  Empacotamento.lerArquivoBinario("clientes.dat");
        Object clienteAtual = null;

        System.out.println("Digite o nome do cliente responsável pelo animal:");
        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dados.size(); i++)
        {
            if (((Cliente)dados.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dados.get(i);
            }
        }

        if(clienteAtual == null)
        {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.println("Digite o nome do animal que deseja remover:");
        String animalNome = scanner.nextLine();

        for (int i = 0; i < ((Cliente)clienteAtual).getAnimais().size(); i++) {
            if ((((Cliente)clienteAtual).getAnimais().get(i)).getNome_animal().equalsIgnoreCase(animalNome)) {
                ((Cliente)clienteAtual).getAnimais().remove(i);
                Empacotamento.gravarArquivoBinario(dados, "clientes.dat");
                System.out.println(animalNome + " removido!");
                return;
            }
        }

        System.out.println("Animal não existe");

    }

    public static void IniciarTratamento(){
        ArrayList<Object> dadosCliente =  Empacotamento.lerArquivoBinario("clientes.dat");
        Object clienteAtual = null;
        Object AnimalAtual = null;

        //Cliente
        System.out.println("Qual Nome do cliente");

        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dadosCliente.size(); i++) {
            if (((Cliente)dadosCliente.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dadosCliente.get(i);
            }
        }


        if(clienteAtual == null){
            System.out.println("Cliente não existe");
            return;
        }


        //Aluno
        System.out.println("Qual Nome do Animal");

        String AnimalNome = scanner.nextLine();

        for (int i = 0; i < ((Cliente)clienteAtual).getAnimais().size(); i++) {

            if ((((Cliente)clienteAtual).getAnimais().get(i)).getNome_animal().equalsIgnoreCase(AnimalNome)) {
                AnimalAtual = (((Cliente)clienteAtual).getAnimais().get(i));

            }

        }


        if(AnimalAtual == null){
            System.out.println("Animal não existe");
            return;
        }

        Tratamento tratamento = new Tratamento(new Date(), new Date(), ((Animal)AnimalAtual));

        System.out.println("Qual o histórico da consulta ");
        String historicoConsulta = scanner.nextLine();

        System.out.println("Qual o resumo da consulta ");
        String resumoConsulta = scanner.nextLine();

        Consulta consulta = new Consulta(new Date(), historicoConsulta, resumoConsulta, tratamento, new Veterinario("Julia", "Rua Olavo", "48 9966565"));



        String resultado;
        do {
            System.out.println("A consulta tem exames? (S/N)" );
            resultado = scanner.nextLine();



        }while(!resultado.toLowerCase().equals("s") && !resultado.toLowerCase().equals("n"));

        if(resultado.toLowerCase().equals("s")){

            do{

                System.out.println("Descrição do exame:");
                String desc = scanner.nextLine();
                Exame exame = new Exame(desc);
                consulta.addExame(exame);
                System.out.println("Mais um exame? (S)");
                resultado = scanner.nextLine();


            }while(resultado.toLowerCase().equals("s"));

        }
        tratamento.adicionarConsulta(consulta);
        ((Animal)AnimalAtual).adicionaTratamento((tratamento));
        Empacotamento.gravarArquivoBinario(dadosCliente, "clientes.dat");

        System.out.println("Tratamento adicionado");

    }

    public static void MostrarClientesEAnimais(){
        ArrayList<Object> dados =  Empacotamento.lerArquivoBinario("clientes.dat");

        if(dados.size() == 0) {
            System.out.println("Nenhum cadastro encontrado");
            return;
        }

        for(Object item: dados){
            System.out.println("Nome: " + ((Cliente)item).getNom_cli());
            System.out.println("---Animais---");
            try {
                for (Animal animal : ((Cliente) item).getAnimais()) {

                    System.out.println(animal.getEspecie().getNom_esp() + ": " + animal.getNome_animal());
                }

            }catch(Exception NullPointerException){

            }


            System.out.println("-------------");
        }
    }

    public static void MostrarTratamentosConsultasExames(){
    
        ArrayList<Object> dadosCliente =  Empacotamento.lerArquivoBinario("clientes.dat");
        
        if(dadosCliente.size() == 0) System.out.println("Nenhum cadastro encontrado");
        Object clienteAtual = null;
        Object AnimalAtual = null;
        ArrayList<Tratamento> tratamentoAnimal = null;

        //Cliente
        System.out.println("Qual Nome do cliente");

        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dadosCliente.size(); i++) {
            if (((Cliente)dadosCliente.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dadosCliente.get(i);
            }
        }


        if(clienteAtual == null){
            System.out.println("Cliente não existe");
            return;
        }


        //Aluno
        System.out.println("Qual Nome do Animal");

        String AnimalNome = scanner.nextLine();

        for (int i = 0; i < ((Cliente)clienteAtual).getAnimais().size(); i++) {

            if ((((Cliente)clienteAtual).getAnimais().get(i)).getNome_animal().equalsIgnoreCase(AnimalNome)) {
                AnimalAtual = (((Cliente)clienteAtual).getAnimais().get(i));
                tratamentoAnimal = (((Cliente)clienteAtual).getAnimais().get(i).getTratamentos());
            }

        }

        if(AnimalAtual == null){
            System.out.println("Animal não existe");
            return;
        }

        System.out.println("\n************************");
        for(Tratamento tratamento : tratamentoAnimal)
        {
        System.out.println("\n--tratamento--");
        System.out.println("Inicio de Tratamento: " + tratamento.getDat_ini() + "\nFinal de Tratamento: " + tratamento.getDat_fin() + "\n");
                
        if (!tratamento.getConsultas().isEmpty())
        {
            System.out.println("\n--Consulta--");
            for(Consulta consulta : tratamento.getConsultas()) {

                System.out.println("Veterinario " + consulta.getVeterinario().getNom_vet() + "\nHistorico: " + consulta.getHistorico() + "\nResumo: " + consulta.getResumo() + "\n");
                
                if (!consulta.getExames().isEmpty())
                {
                    System.out.println("\n--Exame-- ");
                    for(Exame exame : consulta.getExames()) {

                    System.out.println("Descrição Exame: " + exame.getDes_exame());
                    }
                }
                System.out.println("************************\n");
            }
        }
        }
    }

    public static void MostrarCadastroCliente(){
        ArrayList<Object> dadosCliente =  Empacotamento.lerArquivoBinario("clientes.dat");
        Object clienteAtual = null;

        //Cliente
        System.out.println("Qual Nome do cliente");
        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dadosCliente.size(); i++) {
            if (((Cliente)dadosCliente.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dadosCliente.get(i);
            }
        }


        if(clienteAtual == null){
            System.out.println("Cliente não existe");
            return;
        }

        System.out.println(clienteAtual);

    }

    public static void MostrarCadastroAnimal(){
        ArrayList<Object> dadosCliente =  Empacotamento.lerArquivoBinario("clientes.dat");

        if(dadosCliente.size() == 0) System.out.println("Nenhum cadastro encontrado");
        Object clienteAtual = null;
        Object AnimalAtual = null;

        //Cliente
        System.out.println("Qual Nome do cliente");

        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dadosCliente.size(); i++) {
            if (((Cliente)dadosCliente.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dadosCliente.get(i);
            }
        }


        if(clienteAtual == null){
            System.out.println("Cliente não existe");
            return;
        }


        //Aluno
        System.out.println("Qual Nome do Animal");

        String AnimalNome = scanner.nextLine();

        for (int i = 0; i < ((Cliente)clienteAtual).getAnimais().size(); i++) {

            if ((((Cliente)clienteAtual).getAnimais().get(i)).getNome_animal().equalsIgnoreCase(AnimalNome)) {
                AnimalAtual = (((Cliente)clienteAtual).getAnimais().get(i));
            }

        }

        if(AnimalAtual == null){
            System.out.println("Animal não existe");
            return;
        }

        System.out.println(AnimalAtual);
    }

    public static void EditarCliente(){
        ArrayList<Object> dadosCliente =  Empacotamento.lerArquivoBinario("clientes.dat");
        Object clienteAtual = null;

        //Cliente
        System.out.println("Qual Nome do cliente");
        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dadosCliente.size(); i++) {
            if (((Cliente)dadosCliente.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dadosCliente.get(i);
            }
        }

        if(clienteAtual == null){
            System.out.println("Cliente não existe");
            return;
        }

        System.out.println("\n----Digite 0 para manter o valor anterior----\n");
        System.out.println("Endereço ( " + ((Cliente)clienteAtual).getEnd_cli() + " )");
        String endereco = scanner.nextLine();
        if(endereco.equals("0")){
            endereco = ((Cliente)clienteAtual).getEnd_cli();
        }
        System.out.println("Telefone ( " + ((Cliente)clienteAtual).getTel_cli() + " )");
        String tel = scanner.nextLine();
        if(tel.equals("0")){
            tel = ((Cliente)clienteAtual).getTel_cli();
        }
        System.out.println("cep ( " + ((Cliente)clienteAtual).getCep_cli() + " )");
        long cep = scanner.nextLong();
        scanner.nextLine();
        if(cep == 0){
            cep = ((Cliente)clienteAtual).getCep_cli();
        }
        System.out.println("Email ( " + ((Cliente)clienteAtual).getEmail_cli() + " )");
        String email = scanner.nextLine();
        if(email.equals("0")){
            email = ((Cliente)clienteAtual).getEmail_cli();
        }

        ((Cliente)clienteAtual).AlterarValores(endereco, tel, cep, email);
        Empacotamento.gravarArquivoBinario(dadosCliente, "clientes.dat");
        System.out.println("\n Cliente editado com sucesso \n");
    }

    public static void EditarAnimal(){
        ArrayList<Object> dadosCliente =  Empacotamento.lerArquivoBinario("clientes.dat");

        if(dadosCliente.size() == 0) System.out.println("Nenhum cadastro encontrado");
        Object clienteAtual = null;
        Object AnimalAtual = null;

        //Cliente
        System.out.println("Qual Nome do cliente");

        String clienteNome = scanner.nextLine();

        for (int i = 0; i < dadosCliente.size(); i++) {
            if (((Cliente)dadosCliente.get(i)).getNom_cli().equalsIgnoreCase(clienteNome)) {
                clienteAtual = dadosCliente.get(i);
            }
        }


        if(clienteAtual == null){
            System.out.println("Cliente não existe");
            return;
        }


        //Aluno
        System.out.println("Qual Nome do Animal");

        String AnimalNome = scanner.nextLine();

        for (int i = 0; i < ((Cliente)clienteAtual).getAnimais().size(); i++) {
            if ((((Cliente)clienteAtual).getAnimais().get(i)).getNome_animal().equalsIgnoreCase(AnimalNome)) {
                AnimalAtual = (((Cliente)clienteAtual).getAnimais().get(i));
            }
        }

        if(AnimalAtual == null){
            System.out.println("Animal não existe");
            return;
        }

        System.out.println("\n----Digite 0 para manter o valor anterior----\n");
        System.out.println("Idade ( " + ((Animal)AnimalAtual).getIdade_animal() + " )");
        int idade = scanner.nextInt();
        scanner.nextLine();
        if(idade == 0){
            idade = ((Animal)AnimalAtual).getIdade_animal();
        }
        System.out.println("Sexo ( " + ((Animal)AnimalAtual).getSexo_animal() + " )");
        String sexo = scanner.nextLine();
        if(sexo.equals("0")){
            sexo = ((Animal)AnimalAtual).getSexo_animal();
        }
        System.out.println("Espécie ( " + ((Animal)AnimalAtual).getEspecie() + " )");
        String especie = scanner.nextLine();

        if(especie.equals("0")){
            especie = ((Animal)AnimalAtual).getEspecie().getNom_esp();
        }


        ((Animal)AnimalAtual).AlterarValores(idade, sexo, new Especie(especie));
        Empacotamento.gravarArquivoBinario(dadosCliente, "clientes.dat");
        System.out.println("\nAnimal editado com sucesso \n");
    }
}
