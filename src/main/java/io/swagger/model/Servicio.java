package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Servicio
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class Servicio   {
  @JsonProperty("idServicio")
  private String idServicio = null;

  /**
   * Tipo de servicio
   */
  public enum TipoServicioEnum {
    ESTANDAR("estandar"),
    
    PREMIUM("premium");

    private String value;

    TipoServicioEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoServicioEnum fromValue(String text) {
      for (TipoServicioEnum b : TipoServicioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("tipoServicio")
  private TipoServicioEnum tipoServicio = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  public Servicio idServicio(String idServicio) {
    this.idServicio = idServicio;
    return this;
  }

  /**
   * Get idServicio
   * @return idServicio
   **/
  @Schema(description = "")
  
    public String getIdServicio() {
    return idServicio;
  }

  public void setIdServicio(String idServicio) {
    this.idServicio = idServicio;
  }

  public Servicio tipoServicio(TipoServicioEnum tipoServicio) {
    this.tipoServicio = tipoServicio;
    return this;
  }

  /**
   * Tipo de servicio
   * @return tipoServicio
   **/
  @Schema(description = "Tipo de servicio")
  
    public TipoServicioEnum getTipoServicio() {
    return tipoServicio;
  }

  public void setTipoServicio(TipoServicioEnum tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  public Servicio nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Servicio descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
   **/
  @Schema(description = "")
  
    public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicio servicio = (Servicio) o;
    return Objects.equals(this.idServicio, servicio.idServicio) &&
        Objects.equals(this.tipoServicio, servicio.tipoServicio) &&
        Objects.equals(this.nombre, servicio.nombre) &&
        Objects.equals(this.descripcion, servicio.descripcion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idServicio, tipoServicio, nombre, descripcion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicio {\n");
    
    sb.append("    idServicio: ").append(toIndentedString(idServicio)).append("\n");
    sb.append("    tipoServicio: ").append(toIndentedString(tipoServicio)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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
