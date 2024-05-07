package app;

import conexion.Conexion;
import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Conexion con la direcci�n y puerto de Redis
        Conexion conexion = new Conexion("localhost", 6379);
        
        // Obtener el cliente Jedis de la conexi�n
        Jedis jedis = conexion.getJedis();
        
        // Realizar una operaci�n b�sica, como guardar una clave-valor
        jedis.set("clave", "valor");
        
        // Obtener el valor de la clave
        String valor = jedis.get("clave");
        System.out.println("Valor de la clave: " + valor);
        
        // Cerrar la conexi�n
        conexion.cerrarConexion();
    }
}

