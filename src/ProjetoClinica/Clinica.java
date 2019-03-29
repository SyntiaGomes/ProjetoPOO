package ProjetoClinica;

public class Clinica {

    public static void main (String args[]){
        Paciente paciente = new Paciente();
        paciente.nome = "Maria de Jesus";
        paciente.endereco = "Barcarena";
        paciente.numeroCartao = "654654";

        Medico medico = new Medico();
        medico.nome = "João Carlos";
        medico.especialidade = "Cardiologista";
        medico.crm = "987487";

        AtendimentoMedico atendimentoMedico = new AtendimentoMedico();
        atendimentoMedico.dataConsulta = "29/03/2019";
        atendimentoMedico.paciente = paciente;
        atendimentoMedico.medico = medico;




    }
}
