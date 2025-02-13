public class Exemplos {
    
    public static void main(String[] args) throws Exception {
        //exemplo 1
        System.out.println("Processo seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
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
