package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseRegistraduria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class ResponseRegistraduria   {
  /**
   * Gets or Sets estadoCiudadano
   */
  public enum EstadoCiudadanoEnum {
    ACTIVO("activo"),
    
    DIFUNTO("difunto"),
    
    DUPLICADO("duplicado");

    private String value;

    EstadoCiudadanoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EstadoCiudadanoEnum fromValue(String text) {
      for (EstadoCiudadanoEnum b : EstadoCiudadanoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("estadoCiudadano")
  private EstadoCiudadanoEnum estadoCiudadano = null;

  @JsonProperty("fechaExpedicion")
  private LocalDate fechaExpedicion = null;

  @JsonProperty("lugarExpedicion")
  private String lugarExpedicion = null;

  public ResponseRegistraduria estadoCiudadano(EstadoCiudadanoEnum estadoCiudadano) {
    this.estadoCiudadano = estadoCiudadano;
    return this;
  }

  /**
   * Get estadoCiudadano
   * @return estadoCiudadano
   **/
  @Schema(description = "")
  
    public EstadoCiudadanoEnum getEstadoCiudadano() {
    return estadoCiudadano;
  }

  public void setEstadoCiudadano(EstadoCiudadanoEnum estadoCiudadano) {
    this.estadoCiudadano = estadoCiudadano;
  }

  public ResponseRegistraduria fechaExpedicion(LocalDate fechaExpedicion) {
    this.fechaExpedicion = fechaExpedicion;
    return this;
  }

  /**
   * Get fechaExpedicion
   * @return fechaExpedicion
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getFechaExpedicion() {
    return fechaExpedicion;
  }

  public void setFechaExpedicion(LocalDate fechaExpedicion) {
    this.fechaExpedicion = fechaExpedicion;
  }

  public ResponseRegistraduria lugarExpedicion(String lugarExpedicion) {
    this.lugarExpedicion = lugarExpedicion;
    return this;
  }

  /**
   * Get lugarExpedicion
   * @return lugarExpedicion
   **/
  @Schema(description = "")
  
    public String getLugarExpedicion() {
    return lugarExpedicion;
  }

  public void setLugarExpedicion(String lugarExpedicion) {
    this.lugarExpedicion = lugarExpedicion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRegistraduria responseRegistraduria = (ResponseRegistraduria) o;
    return Objects.equals(this.estadoCiudadano, responseRegistraduria.estadoCiudadano) &&
        Objects.equals(this.fechaExpedicion, responseRegistraduria.fechaExpedicion) &&
        Objects.equals(this.lugarExpedicion, responseRegistraduria.lugarExpedicion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estadoCiudadano, fechaExpedicion, lugarExpedicion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRegistraduria {\n");
    
    sb.append("    estadoCiudadano: ").append(toIndentedString(estadoCiudadano)).append("\n");
    sb.append("    fechaExpedicion: ").append(toIndentedString(fechaExpedicion)).append("\n");
    sb.append("    lugarExpedicion: ").append(toIndentedString(lugarExpedicion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
