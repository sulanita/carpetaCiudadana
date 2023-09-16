package io.swagger.api;

import io.swagger.model.Operador;
import io.swagger.model.Registraduria;
import io.swagger.model.RequestOperadorCiudadano;
import io.swagger.model.ResponseOperadorCiudadano;
import io.swagger.model.ResponseRegistraduria;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")
@RestController
public class OperadorApiController implements OperadorApi {

    private static final Logger log = LoggerFactory.getLogger(OperadorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OperadorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Operador> operadorAgregarPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Operador body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Operador>(objectMapper.readValue("{\n  \"idOperador\" : \"idOperador\",\n  " +
                                                                                   "\"nombreOperador\" : " +
                                                                                   "\"nombreOperador\",\n  " +
                                                                                   "\"correoAsociado\" : \"\"\n}", Operador.class), HttpStatus.CREATED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Operador>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Operador>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseOperadorCiudadano> operadorAsociarPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RequestOperadorCiudadano body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseOperadorCiudadano>(objectMapper.readValue("{\n  \"idOperador\" : " +
                                                                                                    "\"idOperador\"," +
                                                                                                    "\n  " +
                                                                                                    "\"tipoIdentificacion\" : \"CC\",\n  \"nombreOperador\" : \"nombreOperador\",\n  \"identificacion\" : 0,\n  \"cuentaCorreo\" : \"\"\n}", ResponseOperadorCiudadano.class), HttpStatus.CREATED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseOperadorCiudadano>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseOperadorCiudadano>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Operador> operadorConsultarTipoIdIdentificacionGet(@Parameter(in = ParameterIn.PATH, description = "Tipo de identificación del usuario a consultar", required=true, schema=@Schema()) @PathVariable("tipoId") String tipoId,@Parameter(in = ParameterIn.PATH, description = "Identificación del usuario a consultar", required=true, schema=@Schema()) @PathVariable("identificacion") String identificacion) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Operador>(objectMapper.readValue("{\n  \"idOperador\" : \"idOperador\",\n  " +
                                                                                   "\"nombreOperador\" : " +
                                                                                   "\"nombreOperador\",\n  \"correoAsociado\" : \"\"\n}", Operador.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Operador>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Operador>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseRegistraduria> operadorVerificarRegistraduriaPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Registraduria body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseRegistraduria>(objectMapper.readValue("{\n  \"fechaExpedicion\" : " +
                                                                                                "\"2000-01-23\",\n  " +
                                                                                                "\"lugarExpedicion\" : \"lugarExpedicion\",\n  \"estadoCiudadano\" : \"activo\"\n}", ResponseRegistraduria.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseRegistraduria>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseRegistraduria>(HttpStatus.NOT_IMPLEMENTED);
    }

}
