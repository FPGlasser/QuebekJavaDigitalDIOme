package conta;

public abstract class conta{
    private Integer numero;
    private Double saldo;

    public conta(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return saldo;
    }

}