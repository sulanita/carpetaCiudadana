package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Operador
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class Operador   {
  @JsonProperty("idOperador")
  private String idOperador = null;

  @JsonProperty("nombreOperador")
  private String nombreOperador = null;

  @JsonProperty("correoAsociado")
  private String correoAsociado = null;

  public Operador idOperador(String idOperador) {
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

  public Operador nombreOperador(String nombreOperador) {
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

  public Operador correoAsociado(String correoAsociado) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operador operador = (Operador) o;
    return Objects.equals(this.idOperador, operador.idOperador) &&
        Objects.equals(this.nombreOperador, operador.nombreOperador) &&
        Objects.equals(this.correoAsociado, operador.correoAsociado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperador, nombreOperador, correoAsociado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operador {\n");
    
    sb.append("    idOperador: ").append(toIndentedString(idOperador)).append("\n");
    sb.append("    nombreOperador: ").append(toIndentedString(nombreOperador)).append("\n");
    sb.append("    correoAsociado: ").append(toIndentedString(correoAsociado)).append("\n");
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
