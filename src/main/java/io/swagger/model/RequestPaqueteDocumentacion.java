package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPaqueteDocumentacion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class RequestPaqueteDocumentacion   {
  @JsonProperty("tipoDocumento")
  private String tipoDocumento = null;

  @JsonProperty("entidadSolicitante")
  private String entidadSolicitante = null;

  public RequestPaqueteDocumentacion tipoDocumento(String tipoDocumento) {
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

  public RequestPaqueteDocumentacion entidadSolicitante(String entidadSolicitante) {
    this.entidadSolicitante = entidadSolicitante;
    return this;
  }

  /**
   * Get entidadSolicitante
   * @return entidadSolicitante
   **/
  @Schema(description = "")
  
    public String getEntidadSolicitante() {
    return entidadSolicitante;
  }

  public void setEntidadSolicitante(String entidadSolicitante) {
    this.entidadSolicitante = entidadSolicitante;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPaqueteDocumentacion requestPaqueteDocumentacion = (RequestPaqueteDocumentacion) o;
    return Objects.equals(this.tipoDocumento, requestPaqueteDocumentacion.tipoDocumento) &&
        Objects.equals(this.entidadSolicitante, requestPaqueteDocumentacion.entidadSolicitante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, entidadSolicitante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPaqueteDocumentacion {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    entidadSolicitante: ").append(toIndentedString(entidadSolicitante)).append("\n");
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
