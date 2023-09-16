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
 * Registraduria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class Registraduria   {
  @JsonProperty("identificacion")
  private Integer identificacion = null;

  /**
   * Gets or Sets tipoIdentificacion
   */
  public enum TipoIdentificacionEnum {
    CC("CC"),
    
    CE("CE"),
    
    PE("PE"),
    
    PP("PP");

    private String value;

    TipoIdentificacionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoIdentificacionEnum fromValue(String text) {
      for (TipoIdentificacionEnum b : TipoIdentificacionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("tipoIdentificacion")
  private TipoIdentificacionEnum tipoIdentificacion = null;

  @JsonProperty("fechaExpedicion")
  private LocalDate fechaExpedicion = null;

  public Registraduria identificacion(Integer identificacion) {
    this.identificacion = identificacion;
    return this;
  }

  /**
   * Get identificacion
   * @return identificacion
   **/
  @Schema(description = "")
  
    public Integer getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(Integer identificacion) {
    this.identificacion = identificacion;
  }

  public Registraduria tipoIdentificacion(TipoIdentificacionEnum tipoIdentificacion) {
    this.tipoIdentificacion = tipoIdentificacion;
    return this;
  }

  /**
   * Get tipoIdentificacion
   * @return tipoIdentificacion
   **/
  @Schema(description = "")
  
    public TipoIdentificacionEnum getTipoIdentificacion() {
    return tipoIdentificacion;
  }

  public void setTipoIdentificacion(TipoIdentificacionEnum tipoIdentificacion) {
    this.tipoIdentificacion = tipoIdentificacion;
  }

  public Registraduria fechaExpedicion(LocalDate fechaExpedicion) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registraduria registraduria = (Registraduria) o;
    return Objects.equals(this.identificacion, registraduria.identificacion) &&
        Objects.equals(this.tipoIdentificacion, registraduria.tipoIdentificacion) &&
        Objects.equals(this.fechaExpedicion, registraduria.fechaExpedicion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificacion, tipoIdentificacion, fechaExpedicion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registraduria {\n");
    
    sb.append("    identificacion: ").append(toIndentedString(identificacion)).append("\n");
    sb.append("    tipoIdentificacion: ").append(toIndentedString(tipoIdentificacion)).append("\n");
    sb.append("    fechaExpedicion: ").append(toIndentedString(fechaExpedicion)).append("\n");
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
