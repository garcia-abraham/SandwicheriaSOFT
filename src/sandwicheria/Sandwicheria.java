/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwicheria;

import Modelo.*;
import Vista.*;



public class Sandwicheria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Negocio negocio = new Negocio(4234, "El Kun", "Monotributista", "La Banda");
        
        Empleado empleado1 = new Empleado(34546, 5678943, "Abraham ", "Garcia");
        Empleado empleado2 = new Empleado(36479, 3849639, "Pedro", "Alfonso");
        
        empleado1.setUsuario("Predicador");
        empleado1.setContraseña("123");
        
        empleado2.setUsuario("Chau");
        empleado2.setContraseña("Machado");
        
        Rubro rubro1 = new Rubro("Sandwicheria");
        Rubro rubro2 = new Rubro("Bebidas");

        
        Producto producto1 = new Producto(1, "Milanesa", 50, false, 24,rubro1, true);
        Producto producto2 = new Producto(2, "Lomito", 45, false, 10,rubro1, true);
      

        
        
        Agregado agregado1 = new Agregado(3, "Mayonesa", 0, true, 0, rubro1, false);
        Agregado agregado2 = new Agregado(4, "Mostaza", 0, true, 0, rubro1, false);
        Agregado agregado3 = new Agregado(5, "Pollo", 15, true, 0, rubro1, false);
        Agregado agregado4 = new Agregado(6, "Papas fritas", 30, true, 0, rubro1, false);
        Agregado agregado5 = new Agregado(7, "Ketchup", 0, true, 0, rubro1, false);
        Agregado agregado6 = new Agregado(8, "Queso", 10, true, 0, rubro1, false);
        Agregado agregado7 = new Agregado(9, "Coca-cola", 15, true, 0, rubro2, false);
        producto1.agregarAgregadoHabilitado(agregado1);
        producto1.agregarAgregadoHabilitado(agregado2);
        producto1.agregarAgregadoHabilitado(agregado5);
        producto1.agregarAgregadoHabilitado(agregado7);        
        producto1.agregarAgregadoDeshabilitado(agregado3);
        producto1.agregarAgregadoDeshabilitado(agregado4);
        producto1.agregarAgregadoDeshabilitado(agregado6);       
        producto2.agregarAgregadoHabilitado(agregado1);
        producto2.agregarAgregadoHabilitado(agregado5);
        producto2.agregarAgregadoHabilitado(agregado6);
        producto2.agregarAgregadoDeshabilitado(agregado4);
        
        negocio.getProductos().add(producto1);
        negocio.getProductos().add(producto2);
        
        negocio.getEmpleados().add(empleado1);
        negocio.getEmpleados().add(empleado2);
        
        
        
        Controlador.LoginService service = new Controlador.LoginService();
        Controlador.ILoginService port = service.getSGEAuthService();
        //Autorizacion object = port.solicitarAutorizacion("7D8B2CDC-82DF-4A0C-81D8-231AB1AD10FC");
        //System.out.print(object.getCuit() + " " + object.getSign().getValue() + " " + object.getToken().getValue());
        
        
        TPV terminal = new TPV(1, negocio);
        
        Login login = new Login(terminal);
        
    }

    
}
