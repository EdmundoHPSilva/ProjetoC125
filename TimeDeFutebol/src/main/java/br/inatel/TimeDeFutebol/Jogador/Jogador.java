package br.inatel.TimeDeFutebol.Jogador;

public class Jogador {

    //membros
    private int idade;
    private double peso, altura;
    private String nome, posicao;

    //construtor
    public Jogador(String nome, String posicao){
        nome = this.nome;
        posicao = this.posicao;

    }

    //metodos
    public void correr(){
        System.out.println("O jogador está correndo!");
    }
    public void chutar(){
        System.out.println("O jogador está chutando!");
    }
    public void cobrarLateral(){
        System.out.println("O jogador está cobrando lateral!");
    }
     public void cobrarFalta(){
        System.out.println("O jogador está cobrando falta!");
    }

    //getters
    public String getNome() {
        return nome;
    }
    public String getPosicao() {
        return posicao;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    public int getIdade() {
        return idade;
    }
}
