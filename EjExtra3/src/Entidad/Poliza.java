package Entidad;

import Enum.EnumMetodosDePago;

import java.util.Date;


public class Poliza {

    private Cliente cliente;
    
    private Vehiculo vehiculo;
    
    private Integer numeroPoliza;

    private Date fechaInicioPoliza;

    private Date fechaFinPoliza;

    private Integer cantidadCuotas;

    private double montoTotalAsegurado;

    private String tipoCobertura;

    private Boolean granizo;

    private Double montoMaximoGranizo;
    
    private EnumMetodosDePago metodosDePago;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer numeroPoliza, Date fechaInicioPoliza, Date fechaFinPoliza, Integer cantidadCuotas, double montoTotalAsegurado, String tipoCobertura, Boolean granizo, Double montoMaximoGranizo, EnumMetodosDePago metodosDePago) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaFinPoliza = fechaFinPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.tipoCobertura = tipoCobertura;
        this.granizo = granizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.metodosDePago = metodosDePago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(Date fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public Date getFechaFinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechaFinPoliza(Date fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public EnumMetodosDePago getMetodosDePago() {
        return metodosDePago;
    }

    public void setMetodosDePago(EnumMetodosDePago metodosDePago) {
        this.metodosDePago = metodosDePago;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", numeroPoliza=" + numeroPoliza + ", fechaInicioPoliza=" + fechaInicioPoliza + ", fechaFinPoliza=" + fechaFinPoliza + ", cantidadCuotas=" + cantidadCuotas + ", montoTotalAsegurado=" + montoTotalAsegurado + ", tipoCobertura=" + tipoCobertura + ", granizo=" + granizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", metodosDePago=" + metodosDePago + '}';
    }

  

    
    
    
    
    
}
