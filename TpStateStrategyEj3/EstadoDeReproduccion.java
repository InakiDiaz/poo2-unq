package TpStateStrategyEj3;

public abstract class EstadoDeReproduccion {
	public abstract void reproducirPara(ReproductorMP3 reproductor, Song cancion);
	public abstract void stopearPara(ReproductorMP3 reproductor);
	public abstract void pausarPara(ReproductorMP3 reproductor);
}
