package tpObserverEjercicio1;

public interface Observer {
	public abstract String avisarPorArticulo(IGeneroDeTexto articulo);
	public abstract Boolean estaInteresadoEn(String tipoDeArticulo);
}
