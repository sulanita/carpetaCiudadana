package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDocumento
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class ResponseDocumento   {
  @JsonProperty("idDocumento")
  private String idDocumento = null;

  @JsonProperty("tipoDocumento")
  private String tipoDocumento = null;

  @JsonProperty("estado")
  private String estado = null;

  public ResponseDocumento idDocumento(String idDocumento) {
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

  public ResponseDocumento tipoDocumento(String tipoDocumento) {
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

  public ResponseDocumento estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
   **/
  @Schema(description = "")
  
    public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDocumento responseDocumento = (ResponseDocumento) o;
    return Objects.equals(this.idDocumento, responseDocumento.idDocumento) &&
        Objects.equals(this.tipoDocumento, responseDocumento.tipoDocumento) &&
        Objects.equals(this.estado, responseDocumento.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumento, tipoDocumento, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDocumento {\n");
    
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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
