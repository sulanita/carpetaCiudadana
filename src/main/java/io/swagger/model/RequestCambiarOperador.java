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
 * RequestCambiarOperador
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class RequestCambiarOperador   {
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

  @JsonProperty("idOperadorAnterior")
  private String idOperadorAnterior = null;

  @JsonProperty("operadorAnterior")
  private String operadorAnterior = null;

  @JsonProperty("idOperadorNuevo")
  private String idOperadorNuevo = null;

  @JsonProperty("operadorNuevo")
  private String operadorNuevo = null;

  public RequestCambiarOperador identificacion(Integer identificacion) {
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

  public RequestCambiarOperador tipoIdentificacion(TipoIdentificacionEnum tipoIdentificacion) {
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

  public RequestCambiarOperador idOperadorAnterior(String idOperadorAnterior) {
    this.idOperadorAnterior = idOperadorAnterior;
    return this;
  }

  /**
   * Get idOperadorAnterior
   * @return idOperadorAnterior
   **/
  @Schema(description = "")
  
    public String getIdOperadorAnterior() {
    return idOperadorAnterior;
  }

  public void setIdOperadorAnterior(String idOperadorAnterior) {
    this.idOperadorAnterior = idOperadorAnterior;
  }

  public RequestCambiarOperador operadorAnterior(String operadorAnterior) {
    this.operadorAnterior = operadorAnterior;
    return this;
  }

  /**
   * Get operadorAnterior
   * @return operadorAnterior
   **/
  @Schema(description = "")
  
    public String getOperadorAnterior() {
    return operadorAnterior;
  }

  public void setOperadorAnterior(String operadorAnterior) {
    this.operadorAnterior = operadorAnterior;
  }

  public RequestCambiarOperador idOperadorNuevo(String idOperadorNuevo) {
    this.idOperadorNuevo = idOperadorNuevo;
    return this;
  }

  /**
   * Get idOperadorNuevo
   * @return idOperadorNuevo
   **/
  @Schema(description = "")
  
    public String getIdOperadorNuevo() {
    return idOperadorNuevo;
  }

  public void setIdOperadorNuevo(String idOperadorNuevo) {
    this.idOperadorNuevo = idOperadorNuevo;
  }

  public RequestCambiarOperador operadorNuevo(String operadorNuevo) {
    this.operadorNuevo = operadorNuevo;
    return this;
  }

  /**
   * Get operadorNuevo
   * @return operadorNuevo
   **/
  @Schema(description = "")
  
    public String getOperadorNuevo() {
    return operadorNuevo;
  }

  public void setOperadorNuevo(String operadorNuevo) {
    this.operadorNuevo = operadorNuevo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCambiarOperador requestCambiarOperador = (RequestCambiarOperador) o;
    return Objects.equals(this.identificacion, requestCambiarOperador.identificacion) &&
        Objects.equals(this.tipoIdentificacion, requestCambiarOperador.tipoIdentificacion) &&
        Objects.equals(this.idOperadorAnterior, requestCambiarOperador.idOperadorAnterior) &&
        Objects.equals(this.operadorAnterior, requestCambiarOperador.operadorAnterior) &&
        Objects.equals(this.idOperadorNuevo, requestCambiarOperador.idOperadorNuevo) &&
        Objects.equals(this.operadorNuevo, requestCambiarOperador.operadorNuevo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificacion, tipoIdentificacion, idOperadorAnterior, operadorAnterior, idOperadorNuevo, operadorNuevo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCambiarOperador {\n");
    
    sb.append("    identificacion: ").append(toIndentedString(identificacion)).append("\n");
    sb.append("    tipoIdentificacion: ").append(toIndentedString(tipoIdentificacion)).append("\n");
    sb.append("    idOperadorAnterior: ").append(toIndentedString(idOperadorAnterior)).append("\n");
    sb.append("    operadorAnterior: ").append(toIndentedString(operadorAnterior)).append("\n");
    sb.append("    idOperadorNuevo: ").append(toIndentedString(idOperadorNuevo)).append("\n");
    sb.append("    operadorNuevo: ").append(toIndentedString(operadorNuevo)).append("\n");
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
