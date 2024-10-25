/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeccionC;

public class Compra {
    private Pago pago;
    private List articulos;

    public Compra(Pago pago) {
    // inicializaciones
    }

    public void agregarArticulo(Articulo articulo) {
    // agregar un artículo a la compra
    }

    public void removerArticulo(Articulo articulo) {
    // remover un artículo de la compra
    }
}



public class Notificacion {
    private TipoNotificacion tipoNotificacion;

    public void notificar(Pago pago) {
    tipoNotificacion.notificar(Pago pago);
    }
}

public interface TipoNotificacion{
    public void notificar(Pago pago);
}

public abstract class Pago{
    //atributo aqui
    public void realizarCobro(double monto){
    //cargar el monto de compra al medio de pago
    }
}

public abstract class PagoElectronico extends Pago{
    //atributo aqui
    protected boolean loggedIn;
}

public class GeneradorFactura{
    public void calcularImpuestosFactura(){
    //calcular los impuestos asociados a la compra
    }
    public void generarFactura(){
    //generar una nueva factura
    }
}

public class PagoPayPal extends PagoElectronico{
    public void iniciarSesion(){
        loggedIn = true;
    }
    
    @Override
    public void realizarCobro(double monto){
    iniciarSesion();
    //cargar el monto de compra al medio de pago
    }
}