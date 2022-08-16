/**
 * It creates a class called Automovel.
 */
public class Automovel {
    // Creating the variables that will be used in the class.
    public String nome_do_proprietario;
    public String modelo;
    public String placa;
    public int ano;

    // A constructor.
    public Automovel(String nome_do_proprietario, String modelo, String placa, int ano){
        this.nome_do_proprietario = nome_do_proprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    // Getters and setters.
    public String getNome_do_proprietario() {
        return nome_do_proprietario;
    }

    public void setNome_do_proprietario(String nome_do_proprietario) {
        this.nome_do_proprietario = nome_do_proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    } 
}
