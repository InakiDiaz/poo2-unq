package tpObserverEj2;

import java.util.List;

public class aisjdiasosolodeporte implements IListener, IInteresado{

	protected Observer 		observer;
	protected List<String>	preferenciasDeportes;
	
	public aisjdiasosolodeporte(Observer observer) {
		this.observer = observer;
	}
	
	@Override
	public Boolean estaInteresado(ResultadoPartido partido) {
		return this.estaInteresadoEnDeporte(partido.getDeporte());
	}

	@Override
	public void update(ResultadoPartido partido) {
		this.observer.update(partido);
		
	}
	
	protected boolean estaInteresadoEnDeporte(String deporte) {
		return this.preferenciasDeportes.contains(deporte);
	}

	@Override
	public void setInteresEnDeporte(String deporte) {
		this.preferenciasDeportes.add(deporte);
		
	}

	@Override
	public void removeInteresEnDeporte(String deporte) {
		this.preferenciasDeportes.remove(deporte);
	}

	@Override
	public void setInteresEnContrincante(String deporte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeInteresEnContrincante(String deporte) {
		// TODO Auto-generated method stub
		
	}

}
