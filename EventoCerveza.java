package eventos;

public class EventoCerveza {
	private String id;
	private String nombre;
	private String descripcion;
	private String latitud;
	private String longitud;
	private String fechaCreacion;
	private String fechaActualizacion;
	private float temperatura; //field1
	private float presion; //field2
	private float altitud; //field3

	public EventoCerveza() {}

	public String getId() { return id; }
	public String getNombre() { return nombre; }
	public String getDescripcion() { return descripcion; }
	public String getLatitud() { return latitud; }
	public String getLongitud() { return longitud; }
	public String getFechaCreacion() { return fechaCreacion; }
	public String getFechaActualizacion() { return fechaActualizacion; }
	public float getTemperatura() { return temperatura; }
	public float getPresion() { return presion; }
	public float getAltitud() { return altitud; }

	public void setId(String id) { this.id = id; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public void setLatitud(String latitud) { this.latitud = latitud; }
	public void setLongitud(String longitud) { this.longitud = longitud; }
	public void setFechaCreacion(String fechaCreacion) { this.fechaCreacion = fechaCreacion; }
	public void setFechaActualizacion(String fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }
	public void setTemperatura(float temperatura) { this.temperatura = temperatura; }
	public void setPresion(float presion) { this.presion = presion; }
	public void setAltitud(float altitud) { this.altitud = altitud; }

	@Override
	public String toString() {
		return ("Nombre: " + getNombre() + "\n" +
				"Descripción: " + getDescripcion() + "\n" +
				"Localización geográfica: " + getLatitud() + "ºN, " + getLongitud() + "ºW" + "\n" +
				"Fecha de creación: " + getFechaCreacion() + "\n" +
				"Fecha de actualización: " + getFechaActualizacion() + "\n" +
				"Temperatura: " + getTemperatura() + "ºF" + "\n" +
				"Presión atmosférica: " + getPresion() + "inHg" + "\n" +
				"Altitud: " + getAltitud() + "ft" + "\n");
	}
}
