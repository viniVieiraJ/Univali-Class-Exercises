package com.mycompany.atividade3;
import java.util.Scanner;

public class ProgramaTeste 
{
   
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    Paciente[] pacientes = new Paciente[4];
    boolean finalizar = false;
    
    do
    {

        System.out.println("1. Cadastro");
        System.out.println("2. Relatório");
        System.out.println("3. Sair");
        int opcao = sc.nextInt();
        
        switch(opcao)
        {
            case 1:
                for(int i = 0; i <= 3; i++)
                {
                    if(pacientes[i] == null)
                    {                       
                        System.out.println("Digite o nome do paciente:");
                        String nome = sc.next();
                        System.out.println("Digite o número do paciente:");
                        int telefone = sc.nextInt();
                        
                        System.out.println("Digite 1 para Assegurado e 2 para Não Assegurado:");
                        if(sc.nextInt() == 1)
                        {
                            PacienteAssegurado novoPaciente = new PacienteAssegurado(nome, telefone);
                            novoPaciente.lerSeguro();
                            pacientes[i] = novoPaciente;
                        }else
                        {
                            PacienteNaoAssegurado novoPaciente = new PacienteNaoAssegurado(nome, telefone);
                            novoPaciente.lerPagamento();
                            pacientes[i] = novoPaciente;     
                        }                                                       
                    }
                    if(i == 3)
                    {
                        System.out.println("Todos os pacientes já foram cadastrados.");
                        break;
                    }
                }
                break;
            case 2:
                for(int i = 0; i <= 3; i++)
                {
                    if(pacientes[i] != null)
                    {
                        System.out.println(pacientes[i].toString());
                    }
                }
                break;
            case 3:
                finalizar = true;
                break;
        }
        
    }while(!finalizar);
}  
}
