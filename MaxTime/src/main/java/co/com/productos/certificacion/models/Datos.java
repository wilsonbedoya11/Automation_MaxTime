package co.com.productos.certificacion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
        public record Datos(@JsonProperty("proyecto") String proyecto,
                            @JsonProperty("proyecto_vacas") String proyecto_vacas,
                            @JsonProperty("tipo_hora") String tipo_hora,
                            @JsonProperty("tipo_hora") String tipo_hora_vacas,
                            @JsonProperty("servicio") String servicio,
                            @JsonProperty("actividad") String actividad,
                            @JsonProperty("actividad_vacas") String actividad_vacas,
                            @JsonProperty("horas") String horas,
                            @JsonProperty("comentario") String comentario,
                            @JsonProperty("comentario_vacas") String comentario_vacas,

                            @JsonProperty("fecha_vacaciones_inicio") String fecha_vacaciones_inicio,
                            @JsonProperty("fecha_vacaciones_fin") String fecha_vacaciones_fin

                            )
        {
}
