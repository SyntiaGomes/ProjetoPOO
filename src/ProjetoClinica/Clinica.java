package ProjetoClinica;

import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        Atendimento atendimento = new Atendimento();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do paciente: ");
        paciente.nome = sc.nextLine();
        System.out.println("Informe a idade do paciente: ");
        paciente.idade = sc.nextInt();
        System.out.println("informe o CPF do paciente; ");
        paciente.cpf = sc.nextInt();
        System.out.println("Informe o RG do Paciente: ");
        paciente.rg = sc.nextInt();
        System.out.println("Informe o CEP do Paciente: ");
        paciente.cep = sc.nextInt();
        System.out.println("Informe o Endereco do paciente");
        paciente.endereco = sc.nextLine();
        paciente.endereco = sc.nextLine();
        System.out.println("Informe o complemento: ");
        paciente.complemento = sc.nextLine();


        System.out.println("Informe o nome do medico");
        medico.nome = sc.nextLine();
        System.out.println("Informe a especialidade do medico: ");
        medico.especialidade = sc.nextLine();
        System.out.println("Informe o CRM do medico: ");
        medico.cadProfissional = sc.nextLine();

        System.out.println("Informe o horario de inicio do atendimento: ");
        atendimento.horaInicio = sc.nextLine();
        System.out.println("Informe o horario de termino do atendimento: ");
        atendimento.horaFinal = sc.nextLine();
        System.out.println("Informe o diagnositico: ");
        atendimento.diagnostico = sc.nextLine();



    }
}