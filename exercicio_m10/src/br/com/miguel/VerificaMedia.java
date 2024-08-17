package br.com.miguel;

import java.util.Scanner;

public class VerificaMedia {

    public static void main(String[] args) {
        VerificaMedia v = new VerificaMedia();
        v.recebeNota();
    }

    private void recebeNota() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe as notas do aluno: ");
        System.out.println("Português: ");
        float port = s.nextFloat();
        System.out.println("Matemática: ");
        float mate = s.nextFloat();
        System.out.println("Inglês: ");
        float ingl = s.nextFloat();
        System.out.println("Filosofia: ");
        float filo = s.nextFloat();
        float total = port + mate + ingl + filo;
        calculaMedia(total);
    }

    private void calculaMedia(float total){
        float mediaAluno = total / 4;
        situacaoAluno(mediaAluno);
    }

    private void situacaoAluno(float mediaAluno){
        if (mediaAluno >= 7){
            System.out.println("O aluno ficou APROVADO pois sua média foi " + mediaAluno);
        } else if (mediaAluno >= 5){
            System.out.println("O aluno ficou em RECUPERAÇÃO pois sua média foi " + mediaAluno);
        } else {
            System.out.println("O aluno ficou REPROVADO pois sua média foi " + mediaAluno);
        }
    }

}
