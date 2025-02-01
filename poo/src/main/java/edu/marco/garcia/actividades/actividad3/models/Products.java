package edu.marco.garcia.actividades.actividad3.models;

public class Products {
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public void muestraProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo (IVA incluido): " + (costo) * 1.16);
    }

    public Double calcularPrecio(Double utilidad) {
        Double precioAntesDeImpuesto = costo * (1 + utilidad / 100);
        Double precioFinal = precioAntesDeImpuesto + (precioAntesDeImpuesto * (impuesto / 100));
        return precioFinal;
    }

    public static String compararProductos(Products p1, Products p2, Double utilidad) {
        Double precio1 = p1.calcularPrecio(utilidad);
        Double precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return "El producto con mayor precio de venta es: " + p1.getCodigo();
        } else if (precio2 > precio1) {
            return "El producto con mayor precio de venta es: " + p2.getCodigo();
        } else {
            return "Los dos productos tienen el mismo precio de venta";
        }
    }
}

