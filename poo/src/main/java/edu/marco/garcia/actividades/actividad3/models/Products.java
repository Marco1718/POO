package edu.marco.garcia.actividades.actividad3.models;

public class Products {
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;
/**
 * Registra el codigo del nuevo producto
 * @return código del producto
 */
    public String getCodigo() {
        return codigo;
    }
/**
 * Registra cual es el tipo del nuevo producto
 * @return tipo del producto
 */
    public String getTipo() {
        return tipo;
    }
/**
 * Registra el costo del nuevo producto
 * @return tipo del producto
 */
    public Double getCosto() {
        return costo;
    }
/**
 * Establece el codigo dado por el usuario
 * @param codigo código único del producto registrado
 */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
/**
 * Establece el tipo del producto
 * @param tipo Tipo del producto
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/**
 * Establece el costo del producto registrado
 * @param costo costo en un valor numérico
 */
    public void setCosto(Double costo) {
        this.costo = costo;
    }

/**
 * muestra los detalles del producto, incluyendo el costo con Iva
 */
    public void muestraProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo (IVA incluido): " + (costo) * 1.16);
    }
/**
 * Calcula el precio de un producto según su costo, utilidad e impuestos
 * @param utilidad Porcentaje de utilidad que le asigna el usuario
 * @return precio final del producto
 */
    public Double calcularPrecio(Double utilidad) {
        Double precioAntesDeImpuesto = costo * (1 + utilidad / 100);
        Double precioFinal = precioAntesDeImpuesto + (precioAntesDeImpuesto * (impuesto / 100));
        return precioFinal;
    }
/**
 * Compara el precio de 2 productos deseados
 * @param p1 El primer producto que se comparará
 * @param p2 el segundo producto que se comparará
 * @param utilidad Porcentaje de utilidad para ambos productos dado por el usuario
 * @return Da un mensaje indicador de cúal es el producto con mayor precio de venta o si son iguales
 */
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

