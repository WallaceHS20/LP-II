package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public abstract String sendMessage(String msg);

    @Override
    public String toString() {
        return "Mensagem{" +
                "destinatario=" + destinatario +
                ", horaEnvio='" + horaEnvio + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
