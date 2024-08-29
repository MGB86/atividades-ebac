package br.com.miguel;

import br.com.miguel.domain.Pessoa;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Separador {

    //Tarefa - Organizar em métodos

    public static void main(String[] args){
        coletaNomeSexo();
    }

    private static void coletaNomeSexo() {
        Scanner s = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        System.out.println("Olá você agora ira cadastrar o nome da pessoa e o seu sexo\nTecle (Enter) para prosseguir \nOu caso queira parar digite (Sair): ");
        while(true){
            String input = s.nextLine();
            if(input.equalsIgnoreCase("sair")){
                break;
            } else {
                while(true){
                    System.out.println("Digite o nome completo: ");
                    String nomeMinusculo = s.nextLine();
                    String nome = capitalize(nomeMinusculo);
                    if (nome.equalsIgnoreCase("sair")){
                        List<Pessoa> masculino = new ArrayList<Pessoa>();
                        List<Pessoa> feminino = new ArrayList<Pessoa>();

                        for (Pessoa pessoa : pessoas){
                            if (pessoa.getSexo() == 'M'){
                                masculino.add(pessoa);
                            } else if (pessoa.getSexo() == 'F'){
                                feminino.add(pessoa);
                            }
                        }
                        System.out.println("******* Lista masculina *******");
                        for (Pessoa homem : masculino) {
                            System.out.println(homem.getNome());
                        }

                        System.out.println("******* Lista feminina *******");
                        for (Pessoa mulher : feminino) {
                            System.out.println(mulher.getNome());
                        }
                        break;
                    }
                    char sexo;
                    while (true){
                        System.out.println("Digite o sexo da pessoa (M/F): ");
                        sexo = s.nextLine().toUpperCase().charAt(0);

                        if (sexo == 'M' || sexo == 'F'){
                            break;
                        } else {
                            System.out.println("Entrada inválida. Por favor, digite 'M' ou 'F'.");
                        }
                    }
                    Pessoa pessoa = new Pessoa(nome, sexo);
                    pessoa.setNome(nome);
                    pessoa.setSexo(sexo);

                    pessoas.add(pessoa);
                }
            }
        }
    }
    public static String capitalize(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }}
