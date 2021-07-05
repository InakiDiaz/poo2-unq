package TpObserverEjercicio3;

public interface Observable {
	public void solicitarParticipacion(Observer participante);

	public void recibirRespuesta(Observer participante, Pregunta pregunta);
}
