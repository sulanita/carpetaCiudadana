/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PaqueteDocumentacion;
import io.swagger.model.RequestPedirDocumentos;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-15T21:09:20.478863961Z[GMT]")
@Validated
public interface PedirApi {

    @Operation(summary = "Pedir documentos", description = "", tags={ "Entidad" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Solicitud de documentos emitidos a la entidad", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PaqueteDocumentacion.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized") })
    @RequestMapping(value = "/pedir/documentos",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<PaqueteDocumentacion> pedirDocumentosPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RequestPedirDocumentos body);

}

