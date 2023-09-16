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
 * RequestPedirDocumentos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class RequestPedirDocumentos   {
  @JsonProperty("tipoDocumento")
  private String tipoDocumento = null;

  @JsonProperty("idEntidad")
  private Integer idEntidad = null;

  @JsonProperty("nombreEntidad")
  private String nombreEntidad = null;

  /**
   * Gets or Sets tipoEntidad
   */
  public enum TipoEntidadEnum {
    GOBIERNO("Gobierno"),
    
    PRIVADA("Privada"),
    
    MIXTA("Mixta");

    private String value;

    TipoEntidadEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoEntidadEnum fromValue(String text) {
      for (TipoEntidadEnum b : TipoEntidadEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("tipoEntidad")
  private TipoEntidadEnum tipoEntidad = null;

  public RequestPedirDocumentos tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  /**
   * Get tipoDocumento
   * @return tipoDocumento
   **/
  @Schema(description = "")
  
    public String getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public RequestPedirDocumentos idEntidad(Integer idEntidad) {
    this.idEntidad = idEntidad;
    return this;
  }

  /**
   * Get idEntidad
   * @return idEntidad
   **/
  @Schema(description = "")
  
    public Integer getIdEntidad() {
    return idEntidad;
  }

  public void setIdEntidad(Integer idEntidad) {
    this.idEntidad = idEntidad;
  }

  public RequestPedirDocumentos nombreEntidad(String nombreEntidad) {
    this.nombreEntidad = nombreEntidad;
    return this;
  }

  /**
   * Get nombreEntidad
   * @return nombreEntidad
   **/
  @Schema(description = "")
  
    public String getNombreEntidad() {
    return nombreEntidad;
  }

  public void setNombreEntidad(String nombreEntidad) {
    this.nombreEntidad = nombreEntidad;
  }

  public RequestPedirDocumentos tipoEntidad(TipoEntidadEnum tipoEntidad) {
    this.tipoEntidad = tipoEntidad;
    return this;
  }

  /**
   * Get tipoEntidad
   * @return tipoEntidad
   **/
  @Schema(description = "")
  
    public TipoEntidadEnum getTipoEntidad() {
    return tipoEntidad;
  }

  public void setTipoEntidad(TipoEntidadEnum tipoEntidad) {
    this.tipoEntidad = tipoEntidad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPedirDocumentos requestPedirDocumentos = (RequestPedirDocumentos) o;
    return Objects.equals(this.tipoDocumento, requestPedirDocumentos.tipoDocumento) &&
        Objects.equals(this.idEntidad, requestPedirDocumentos.idEntidad) &&
        Objects.equals(this.nombreEntidad, requestPedirDocumentos.nombreEntidad) &&
        Objects.equals(this.tipoEntidad, requestPedirDocumentos.tipoEntidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, idEntidad, nombreEntidad, tipoEntidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPedirDocumentos {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    idEntidad: ").append(toIndentedString(idEntidad)).append("\n");
    sb.append("    nombreEntidad: ").append(toIndentedString(nombreEntidad)).append("\n");
    sb.append("    tipoEntidad: ").append(toIndentedString(tipoEntidad)).append("\n");
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
