package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestDocumento
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class RequestDocumento   {
  @JsonProperty("idDocumento")
  private String idDocumento = null;

  @JsonProperty("tipoDocumento")
  private String tipoDocumento = null;

  @JsonProperty("contenidoDocumento")
  private byte[] contenidoDocumento = null;

  @JsonProperty("entidad")
  private String entidad = null;

  @JsonProperty("fecha")
  private OffsetDateTime fecha = null;

  public RequestDocumento idDocumento(String idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }

  /**
   * Get idDocumento
   * @return idDocumento
   **/
  @Schema(description = "")
  
    public String getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(String idDocumento) {
    this.idDocumento = idDocumento;
  }

  public RequestDocumento tipoDocumento(String tipoDocumento) {
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

  public RequestDocumento contenidoDocumento(byte[] contenidoDocumento) {
    this.contenidoDocumento = contenidoDocumento;
    return this;
  }

  /**
   * Get contenidoDocumento
   * @return contenidoDocumento
   **/
  @Schema(description = "")
  
    public byte[] getContenidoDocumento() {
    return contenidoDocumento;
  }

  public void setContenidoDocumento(byte[] contenidoDocumento) {
    this.contenidoDocumento = contenidoDocumento;
  }

  public RequestDocumento entidad(String entidad) {
    this.entidad = entidad;
    return this;
  }

  /**
   * Get entidad
   * @return entidad
   **/
  @Schema(description = "")
  
    public String getEntidad() {
    return entidad;
  }

  public void setEntidad(String entidad) {
    this.entidad = entidad;
  }

  public RequestDocumento fecha(OffsetDateTime fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getFecha() {
    return fecha;
  }

  public void setFecha(OffsetDateTime fecha) {
    this.fecha = fecha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDocumento requestDocumento = (RequestDocumento) o;
    return Objects.equals(this.idDocumento, requestDocumento.idDocumento) &&
        Objects.equals(this.tipoDocumento, requestDocumento.tipoDocumento) &&
        Objects.equals(this.contenidoDocumento, requestDocumento.contenidoDocumento) &&
        Objects.equals(this.entidad, requestDocumento.entidad) &&
        Objects.equals(this.fecha, requestDocumento.fecha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumento, tipoDocumento, contenidoDocumento, entidad, fecha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDocumento {\n");
    
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    contenidoDocumento: ").append(toIndentedString(contenidoDocumento)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
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
