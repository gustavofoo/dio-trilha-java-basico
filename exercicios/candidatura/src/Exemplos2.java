import java.util.concurrent.ThreadLocalRandom;

public class Exemplos2 {

    public static void main(String[] args) throws Exception {
        //exemplo 1
        System.out.println("Processo seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }

    static void SelecaoCandidatos(){
        String[] candidatos = {"STEVEN SPIELBERG", "QUENTIN TARANTINO", "ROBERT DENIRO", "TOM HANKS", "POCAHONTAS", "TARMAN", "EDGAR SCANDURRA", "FREDDY KRUGGER", "JUDITE", "BARRIGUINHA MOLE" };

        int candidtosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0
        while(candidtosSelecionados < 5){
            String candadito = candidatos = valorPretendido;
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido)
        }
    }

    static void valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidado");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardando o resultado do processo");
        
        }  
    }
}

