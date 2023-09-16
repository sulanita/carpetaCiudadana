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
 * CrearCuenta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")


public class CrearCuenta   {
  /**
   * Gets or Sets operador
   */
  public enum OperadorEnum {
    _1("operador 1"),
    
    _2("operador 2"),
    
    N("operador n");

    private String value;

    OperadorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperadorEnum fromValue(String text) {
      for (OperadorEnum b : OperadorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Operador")
  private OperadorEnum operador = null;

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

  @JsonProperty("nombres")
  private String nombres = null;

  @JsonProperty("primerApellido")
  private String primerApellido = null;

  @JsonProperty("segundoApellido")
  private String segundoApellido = null;

  @JsonProperty("cuentaCorreoPersonal")
  private String cuentaCorreoPersonal = null;

  @JsonProperty("telefono")
  private Integer telefono = null;

  public CrearCuenta operador(OperadorEnum operador) {
    this.operador = operador;
    return this;
  }

  /**
   * Get operador
   * @return operador
   **/
  @Schema(description = "")
  
    public OperadorEnum getOperador() {
    return operador;
  }

  public void setOperador(OperadorEnum operador) {
    this.operador = operador;
  }

  public CrearCuenta identificacion(Integer identificacion) {
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

  public CrearCuenta tipoIdentificacion(TipoIdentificacionEnum tipoIdentificacion) {
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

  public CrearCuenta nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }

  /**
   * Get nombres
   * @return nombres
   **/
  @Schema(description = "")
  
    public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public CrearCuenta primerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
    return this;
  }

  /**
   * Get primerApellido
   * @return primerApellido
   **/
  @Schema(description = "")
  
    public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public CrearCuenta segundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
    return this;
  }

  /**
   * Get segundoApellido
   * @return segundoApellido
   **/
  @Schema(description = "")
  
    public String getSegundoApellido() {
    return segundoApellido;
  }

  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  public CrearCuenta cuentaCorreoPersonal(String cuentaCorreoPersonal) {
    this.cuentaCorreoPersonal = cuentaCorreoPersonal;
    return this;
  }

  /**
   * Get cuentaCorreoPersonal
   * @return cuentaCorreoPersonal
   **/
  @Schema(description = "")
  
    public String getCuentaCorreoPersonal() {
    return cuentaCorreoPersonal;
  }

  public void setCuentaCorreoPersonal(String cuentaCorreoPersonal) {
    this.cuentaCorreoPersonal = cuentaCorreoPersonal;
  }

  public CrearCuenta telefono(Integer telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
   **/
  @Schema(description = "")
  
    public Integer getTelefono() {
    return telefono;
  }

  public void setTelefono(Integer telefono) {
    this.telefono = telefono;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrearCuenta crearCuenta = (CrearCuenta) o;
    return Objects.equals(this.operador, crearCuenta.operador) &&
        Objects.equals(this.identificacion, crearCuenta.identificacion) &&
        Objects.equals(this.tipoIdentificacion, crearCuenta.tipoIdentificacion) &&
        Objects.equals(this.nombres, crearCuenta.nombres) &&
        Objects.equals(this.primerApellido, crearCuenta.primerApellido) &&
        Objects.equals(this.segundoApellido, crearCuenta.segundoApellido) &&
        Objects.equals(this.cuentaCorreoPersonal, crearCuenta.cuentaCorreoPersonal) &&
        Objects.equals(this.telefono, crearCuenta.telefono);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operador, identificacion, tipoIdentificacion, nombres, primerApellido, segundoApellido, cuentaCorreoPersonal, telefono);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearCuenta {\n");
    
    sb.append("    operador: ").append(toIndentedString(operador)).append("\n");
    sb.append("    identificacion: ").append(toIndentedString(identificacion)).append("\n");
    sb.append("    tipoIdentificacion: ").append(toIndentedString(tipoIdentificacion)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    primerApellido: ").append(toIndentedString(primerApellido)).append("\n");
    sb.append("    segundoApellido: ").append(toIndentedString(segundoApellido)).append("\n");
    sb.append("    cuentaCorreoPersonal: ").append(toIndentedString(cuentaCorreoPersonal)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
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
