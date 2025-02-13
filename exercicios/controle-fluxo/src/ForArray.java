public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"STEVEN SPIELBERG", "QUENTIN TARANTINO", "ROBERT DENIRO", "TOM HANKS", "POCAHONTAS" };

        for(int x=0; x < alunos.length; x++){
            System.out.println("O aluno do índice x = " + x + " é " + alunos[x]);
        }

        //forma abreviada
        for(String aluno : alunos){
            System.out.println("O nome do aluno é " + aluno);
        }
    }

}
