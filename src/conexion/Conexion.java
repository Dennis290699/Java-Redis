package conexion;

import redis.clients.jedis.Jedis;

public class Conexion {
	private Jedis jedis;

	public Conexion(String host, int port) {
		jedis = new Jedis(host, port);
	}

	public Jedis getJedis() {
		return jedis;
	}

	public void cerrarConexion() {
		if (jedis != null) {
			jedis.close();
		}
	}
}
