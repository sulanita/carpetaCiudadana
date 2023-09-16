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
 * RequestOperadorCiudadano
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class RequestOperadorCiudadano   {
  @JsonProperty("idOperador")
  private String idOperador = null;

  @JsonProperty("correoAsociado")
  private String correoAsociado = null;

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

  public RequestOperadorCiudadano idOperador(String idOperador) {
    this.idOperador = idOperador;
    return this;
  }

  /**
   * Get idOperador
   * @return idOperador
   **/
  @Schema(description = "")
  
    public String getIdOperador() {
    return idOperador;
  }

  public void setIdOperador(String idOperador) {
    this.idOperador = idOperador;
  }

  public RequestOperadorCiudadano correoAsociado(String correoAsociado) {
    this.correoAsociado = correoAsociado;
    return this;
  }

  /**
   * Get correoAsociado
   * @return correoAsociado
   **/
  @Schema(description = "")
  
    public String getCorreoAsociado() {
    return correoAsociado;
  }

  public void setCorreoAsociado(String correoAsociado) {
    this.correoAsociado = correoAsociado;
  }

  public RequestOperadorCiudadano identificacion(Integer identificacion) {
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

  public RequestOperadorCiudadano tipoIdentificacion(TipoIdentificacionEnum tipoIdentificacion) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestOperadorCiudadano requestOperadorCiudadano = (RequestOperadorCiudadano) o;
    return Objects.equals(this.idOperador, requestOperadorCiudadano.idOperador) &&
        Objects.equals(this.correoAsociado, requestOperadorCiudadano.correoAsociado) &&
        Objects.equals(this.identificacion, requestOperadorCiudadano.identificacion) &&
        Objects.equals(this.tipoIdentificacion, requestOperadorCiudadano.tipoIdentificacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperador, correoAsociado, identificacion, tipoIdentificacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestOperadorCiudadano {\n");
    
    sb.append("    idOperador: ").append(toIndentedString(idOperador)).append("\n");
    sb.append("    correoAsociado: ").append(toIndentedString(correoAsociado)).append("\n");
    sb.append("    identificacion: ").append(toIndentedString(identificacion)).append("\n");
    sb.append("    tipoIdentificacion: ").append(toIndentedString(tipoIdentificacion)).append("\n");
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
