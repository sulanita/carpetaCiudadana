package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaqueteDocumentacion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class PaqueteDocumentacion   {
  @JsonProperty("idPaquete")
  private Long idPaquete = null;

  @JsonProperty("entidad")
  private String entidad = null;

  @JsonProperty("tipoDocumento")
  private String tipoDocumento = null;

  public PaqueteDocumentacion idPaquete(Long idPaquete) {
    this.idPaquete = idPaquete;
    return this;
  }

  /**
   * Get idPaquete
   * @return idPaquete
   **/
  @Schema(description = "")
  
    public Long getIdPaquete() {
    return idPaquete;
  }

  public void setIdPaquete(Long idPaquete) {
    this.idPaquete = idPaquete;
  }

  public PaqueteDocumentacion entidad(String entidad) {
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

  public PaqueteDocumentacion tipoDocumento(String tipoDocumento) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaqueteDocumentacion paqueteDocumentacion = (PaqueteDocumentacion) o;
    return Objects.equals(this.idPaquete, paqueteDocumentacion.idPaquete) &&
        Objects.equals(this.entidad, paqueteDocumentacion.entidad) &&
        Objects.equals(this.tipoDocumento, paqueteDocumentacion.tipoDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPaquete, entidad, tipoDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaqueteDocumentacion {\n");
    
    sb.append("    idPaquete: ").append(toIndentedString(idPaquete)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
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
