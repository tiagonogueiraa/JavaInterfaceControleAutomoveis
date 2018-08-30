/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author alunoces
 */
public class Automovel {
    
    private String placa;
    private String modelo;
    private String dataFabricacao;
    private String motor;
    private float  valor;
    private String categoria;
    
    public Automovel(){
        
    }

    public Automovel(String placa, String modelo, String dataFabricacao, String motor, float valor, String categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
        this.motor = motor;
        this.valor = valor;
        this.categoria = categoria;
    }
    
    public float calcularImposto(int aliquota)
    {
        return (aliquota/100f) * valor + (0.3f*valor);
    }
    
    public float calcularValorTotal(int aliquota)
    {
        return valor + (0.05f*valor) + calcularImposto(aliquota);
    }
    
    public String getAutomovel()
    {
        String str = "";
        str += "Placa: " + placa + "\n";
        str += "Modelo: " + modelo + "\n";
        str += "Data de Fabricação: " + dataFabricacao + "\n";
        str += "Motor: " + motor + "\n";
        str += "Valor: " + valor + "\n";
        str += "Categoria: " + categoria + "\n";
        
        return str;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}
