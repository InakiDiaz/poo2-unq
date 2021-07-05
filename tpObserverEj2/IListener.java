package tpObserverEj2;

public interface IListener {
	public void update(ResultadoPartido partido);
	public Boolean estaInteresado(ResultadoPartido partido);
}
