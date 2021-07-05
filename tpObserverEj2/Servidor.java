package tpObserverEj2;

public class Servidor implements Observer{
	private IInteresado listener;

	public Servidor(IInteresado listener) {
		this.listener = listener;
	}

	@Override
	public String update(ResultadoPartido partido) {
		return "DEPORTE : " + partido.getDeporte() + "RESULTADO : "+ partido.getResultado();
	}

	public void registrarInteresEnDeporte(String deporte) {
		this.listener.setInteresEnDeporte(deporte);
	}
	
	public void removeInteresEnDeporte(String deporte) {
		this.listener.removeInteresEnDeporte(deporte);
	}
}
