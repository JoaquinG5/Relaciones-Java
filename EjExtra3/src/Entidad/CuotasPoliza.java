package Entidad;


import Enum.EnumMetodosDePago;
import java.util.Date;

public class CuotasPoliza {

    private EnumMetodosDePago metodosDePago;
    
    private Integer numeroCuota;

    private double montoTotalCuota;

    private Boolean pagoRealizado;

    private Date fechaDeVencimiento;

    public CuotasPoliza() {
    }

    public CuotasPoliza(EnumMetodosDePago metodosDePago, Integer numeroCuota, double montoTotalCuota, Boolean pagoRealizado, Date fechaDeVencimiento) {
        this.metodosDePago = metodosDePago;
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagoRealizado = pagoRealizado;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public EnumMetodosDePago getMetodosDePago() {
        return metodosDePago;
    }

    public void setMetodosDePago(EnumMetodosDePago metodosDePago) {
        this.metodosDePago = metodosDePago;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public Boolean getPagoRealizado() {
        return pagoRealizado;
    }

    public void setPagoRealizado(Boolean pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    @Override
    public String toString() {
        return "CuotasPoliza{" + "metodosDePago=" + metodosDePago + ", numeroCuota=" + numeroCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagoRealizado=" + pagoRealizado + ", fechaDeVencimiento=" + fechaDeVencimiento + '}';
    }

}