import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{

    static final double SALARIO_BASE = 2000.0;
    public static void main(String[] args) throws Exception {
        // System.out.println("processo seletivo");
        // analisarCandidato(2000);
        // analisarCandidato(3000);
        // analisarCandidato(1000);
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"MÁRCIA", "FERNANDO","ANNY", "ALDO", "PRISCILA", "ZÉLIA", "ARNALDO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1800, 2200);
            System.out.println("O candidato "+ candidato + " solicitou este valor: "+ salarioPretendido);
            if(SALARIO_BASE >= salarioPretendido) {
                System.out.println("O candidato "+ candidato + " foi selecioando para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }

    static void analisarCandidato(double salarioPretendido){
        

        if(SALARIO_BASE > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if((SALARIO_BASE == salarioPretendido)){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
