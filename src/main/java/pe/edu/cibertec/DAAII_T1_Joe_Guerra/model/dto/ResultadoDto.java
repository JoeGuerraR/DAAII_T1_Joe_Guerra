package pe.edu.cibertec.DAAII_T1_Joe_Guerra.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResultadoDto {
    private Boolean respuesta;
    private String mensaje;
}