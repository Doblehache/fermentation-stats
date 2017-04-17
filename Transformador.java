package eventos;

import org.mule.api.annotations.ContainsTransformerMethods;
import org.mule.api.annotations.Transformer;
import org.mule.module.json.JsonData;

import eventos.EventoCerveza;

@ContainsTransformerMethods
public class Transformador {

	@Transformer
	public EventoCerveza JsonDataToEventoCerveza(JsonData obj) throws Exception {
		EventoCerveza evento = new EventoCerveza();

		evento.setNombre(obj.getAsString("channel/name"));
		evento.setDescripcion(obj.getAsString("channel/description"));
		evento.setLatitud(obj.getAsString("channel/latitude"));
		evento.setLongitud(obj.getAsString("channel/longitude"));

		evento.setTemperatura(Float.parseFloat(obj.getAsString("feeds[6]/field1")));
		evento.setPresion(Float.parseFloat(obj.getAsString("feeds[6]/field2")));
		evento.setAltitud(Float.parseFloat(obj.getAsString("feeds[6]/field3")));

		evento.setFechaCreacion(obj.getAsString("channel/created_at"));
		evento.setFechaActualizacion(obj.getAsString("channel/updated_at"));

		System.out.println("Evento transformado: " + evento);
		return evento;
	}
}
