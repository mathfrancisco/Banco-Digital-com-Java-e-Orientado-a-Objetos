package OpenBank.Prodution;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    protected String nome;
    private List<Conta> contas;
    List<Cliente> clientes = new ArrayList<>();

    public Banco() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void mostrarClientes() {
        System.out.println(this.clientes);
    }
}
