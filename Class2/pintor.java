package Class2;

public class pintor {
    public String nome;
    public String cidade;
    public int valor_hora;

    public pintor(){

    }

    public pintor(String nome, String cidade, int valor_hora){
        this.nome = nome;
        this.cidade = cidade;
        this.valor_hora = valor_hora;

    } 

    public double calcularPagamentoTotal(double horas){
            return horas * this.valor_hora;
    }



}
