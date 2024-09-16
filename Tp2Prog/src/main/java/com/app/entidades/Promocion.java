package com.app.entidades;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Promocion {

    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;

    private TipoPromocion tipoPromocion;
    private HashSet<Articulo> promociones;
    private HashSet<Imagen> promoImagen;


}
