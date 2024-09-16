package com.app.entidades;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedida {
    private Long id;
    private String denominacion;
}
