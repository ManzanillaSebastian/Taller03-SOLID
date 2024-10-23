/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeccionC;

public class Compra {
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private List articulos;

    public Compra(Pago pago) {
        // inicializaciones
    }

    public Compra(PagoPayPal pagoPaypal) {
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
    private int tipoNotificacion;

    public void notificar(Pago pago) {
        if (tipoNotificacion == 1) {
            // enviarEmail();
        } else {
            // enviarSMS();
        }
    }
}

public class Pago{
    //atributo aqui
    public void realizarCobro(double monto){
        //cargar el monto de compra al medio de pago
    }
    public void calcularImpuestosFactura(){
        //calcular los impuestos asociados a la compra
    }
    public void generarFactura(){
        //generar una nueva factura
    }
}

public class PagoPayPal extends Pago{
    private boolean loggedIn; //conexión a cuenta PayPal
    @Override
    public void realizarCobro(double monto){
        if ( !loggedIn ){
            return;
        }
        //cargar el monto de compra al medio de pago
    }
}
        }
    }
}