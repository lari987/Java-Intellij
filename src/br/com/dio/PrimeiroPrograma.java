package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args){
        Gato gato = new Gato(null,null,null);
        System.out.println(gato);
        Livro livro1 = new Livro("rainha vermelha", 390);
        System.out.println(livro1);

        /*int a = 5;
        int b = 10;
        System.out.println("Hello World! " + (a + b));*/
    }
    static class Livro{
        private String nome;
        private int npag;

        public Livro(String nome, int npag) {
            this.nome = nome;
            this.npag = npag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNpag() {
            return npag;
        }

        public void setNpag(Integer npag) {
            this.npag = npag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", npag=" + npag +
                    '}';
        }
    }

}
