package TpObserverEjercicio3;

import java.util.List;

public interface Observer {
	public void update(List<Pregunta> preguntas, Observable sistemaDePreguntas);
	public void respondioCorrectamente();
	public void respondioIncorrectamente();
}
