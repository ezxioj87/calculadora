package es.aytos.example;
import es.aytos.main.client.CalculadoraStub.*;
import es.aytos.main.client.CalculadoraStub;
public class Main {

 public static void main(String[] args) throws Exception {
 CalculadoraStub stub = new CalculadoraStub();
 Sumar operacion = new Sumar();
 SumarResponse response = null;
 Restar operacion1 = new Restar();
 RestarResponse response1 = null;
 Multiplicar operacion2 = new Multiplicar();
 MultiplicarResponse response2 = null;
 Dividir operacion3 = new Dividir();
 DividirResponse response3 = null;
 // Establecemos los parámetros de la operación
 operacion.setArgs0(100);
 operacion.setArgs1(200);
 operacion1.setArgs0(200);
 operacion1.setArgs1(200);
 operacion2.setArgs0(5);
 operacion2.setArgs1(200);
 operacion3.setArgs0(200);
 operacion3.setArgs1(100);
 // Invocamos el WS
 response = stub.sumar(operacion);
 response1 = stub.restar(operacion1);
 response2 = stub.multiplicar(operacion2);
 response3 = stub.dividir(operacion3);
 // Mostramos el resultado
 System.out.println(response.get_return());
 System.out.println(response1.get_return());
 System.out.println(response2.get_return());
 System.out.println(response3.get_return());
 }
}
