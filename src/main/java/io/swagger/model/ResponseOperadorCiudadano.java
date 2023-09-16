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
 * ResponseOperadorCiudadano
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class ResponseOperadorCiudadano   {
  @JsonProperty("idOperador")
  private String idOperador = null;

  @JsonProperty("nombreOperador")
  private String nombreOperador = null;

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

  @JsonProperty("identificacion")
  private Integer identificacion = null;

  @JsonProperty("cuentaCorreo")
  private String cuentaCorreo = null;

  public ResponseOperadorCiudadano idOperador(String idOperador) {
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

  public ResponseOperadorCiudadano nombreOperador(String nombreOperador) {
    this.nombreOperador = nombreOperador;
    return this;
  }

  /**
   * Get nombreOperador
   * @return nombreOperador
   **/
  @Schema(description = "")
  
    public String getNombreOperador() {
    return nombreOperador;
  }

  public void setNombreOperador(String nombreOperador) {
    this.nombreOperador = nombreOperador;
  }

  public ResponseOperadorCiudadano tipoIdentificacion(TipoIdentificacionEnum tipoIdentificacion) {
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

  public ResponseOperadorCiudadano identificacion(Integer identificacion) {
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

  public ResponseOperadorCiudadano cuentaCorreo(String cuentaCorreo) {
    this.cuentaCorreo = cuentaCorreo;
    return this;
  }

  /**
   * Get cuentaCorreo
   * @return cuentaCorreo
   **/
  @Schema(description = "")
  
    public String getCuentaCorreo() {
    return cuentaCorreo;
  }

  public void setCuentaCorreo(String cuentaCorreo) {
    this.cuentaCorreo = cuentaCorreo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseOperadorCiudadano responseOperadorCiudadano = (ResponseOperadorCiudadano) o;
    return Objects.equals(this.idOperador, responseOperadorCiudadano.idOperador) &&
        Objects.equals(this.nombreOperador, responseOperadorCiudadano.nombreOperador) &&
        Objects.equals(this.tipoIdentificacion, responseOperadorCiudadano.tipoIdentificacion) &&
        Objects.equals(this.identificacion, responseOperadorCiudadano.identificacion) &&
        Objects.equals(this.cuentaCorreo, responseOperadorCiudadano.cuentaCorreo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperador, nombreOperador, tipoIdentificacion, identificacion, cuentaCorreo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseOperadorCiudadano {\n");
    
    sb.append("    idOperador: ").append(toIndentedString(idOperador)).append("\n");
    sb.append("    nombreOperador: ").append(toIndentedString(nombreOperador)).append("\n");
    sb.append("    tipoIdentificacion: ").append(toIndentedString(tipoIdentificacion)).append("\n");
    sb.append("    identificacion: ").append(toIndentedString(identificacion)).append("\n");
    sb.append("    cuentaCorreo: ").append(toIndentedString(cuentaCorreo)).append("\n");
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
