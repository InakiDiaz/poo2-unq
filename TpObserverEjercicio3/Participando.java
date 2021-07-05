package TpObserverEjercicio3;

public class Participando extends EstadoDeParticipacion {

	@Override
	public void responder(Pregunta pregunta, int respuesta, Participante participante) {
		pregunta.seleccionarRespuesta(respuesta);
		participante.enviarRespuesta(pregunta);
	}

}
