package Entidad;

public class Vehiculo {

    private String marca;

    private String modelo;

    private Integer numeroMotor;

    private String chasis;

    private Integer anio;

    private String color;

    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer numeroMotor, String chasis, Integer anio, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.anio = anio;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", anio=" + anio + ", color=" + color + ", tipo=" + tipo + '}';
    }
}
