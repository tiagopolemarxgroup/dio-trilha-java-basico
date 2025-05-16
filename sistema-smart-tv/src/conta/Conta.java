package conta;

public class Conta {
    private int numero;
    private String agencia;
    private String nomeCLiente;
    private double saldo;

    public Conta() {}
    public Conta(int numero, String agencia, String nomeCLiente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCLiente = nomeCLiente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCLiente='" + nomeCLiente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
