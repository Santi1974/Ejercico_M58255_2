package com.app;

import com.app.entidades.*;
import com.app.repositorios.InMemoryRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Promocion> promocionRepo = new InMemoryRepository<>();
        InMemoryRepository<Articulo> articuloRepo = new InMemoryRepository<>();

        UnidadMedida porcionesOcho = UnidadMedida.builder()
                .id(1L)
                .denominacion("8 porciones")
                .build();

        UnidadMedida porcionesCuatro = UnidadMedida.builder()
                .id(2L)
                .denominacion("4 porciones")
                .build();
        UnidadMedida litro = UnidadMedida.builder()
                .id(3L)
                .denominacion("1 Litro")
                .build();

        Imagen imagen1 = Imagen.builder()
                .id(1L)
                .denominacion("Pizza grande Hawaiana")
                .build();

        Imagen imagen2 = Imagen.builder()
                .id(2L)
                .denominacion("Pizza grande Napolitana")
                .build();

        Imagen imagen3 = Imagen.builder()
                .id(3L)
                .denominacion("Pizza grande Muzza")
                .build();

        Imagen imagen4 = Imagen.builder()
                .id(4L)
                .denominacion("Pizza chica Hawaiana")
                .build();

        Imagen imagen5 = Imagen.builder()
                .id(5L)
                .denominacion("Pizza chica Napolitana")
                .build();

        Imagen imagen6 = Imagen.builder()
                .id(6L)
                .denominacion("Pizza chica Muzza")
                .build();

        Imagen imagen7 = Imagen.builder()
                .id(7L)
                .denominacion("Cerveza Andes")
                .build();

        Imagen imagen8 = Imagen.builder()
                .id(8L)
                .denominacion("Cerveza Quilmes")
                .build();

        TipoPromocion imahappy1 = TipoPromocion.happyHour;
        TipoPromocion imahappy2 = TipoPromocion.happyHour;
        TipoPromocion verano1 = TipoPromocion.Verano;
        TipoPromocion verano2 = TipoPromocion.Verano;
        TipoPromocion invierno = TipoPromocion.Invierno;
        TipoPromocion invierno2 = TipoPromocion.Invierno;

        Articulo cerveza1 = Articulo.builder()
                .id(1L)
                .denominacion("Cerveza Andes")
                .precioCompra(100.0)
                .precioVenta(250.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen7)
                .unidadMedida(litro)
                .build();
        articuloRepo.save(cerveza1);

        Articulo cerveza2 = Articulo.builder()
                .id(2L)
                .denominacion("Cerveza Quilmes")
                .precioCompra(90.0)
                .precioVenta(200.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen8)
                .unidadMedida(litro)
                .build();
        articuloRepo.save(cerveza2);

        Articulo pizzaHawaGrande = Articulo.builder()
                .id(3L)
                .denominacion("Pizza grande Hawaiana")
                .precioCompra(500.0)
                .precioVenta(1000.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen1)
                .unidadMedida(porcionesOcho)
                .build();
        articuloRepo.save(pizzaHawaGrande);

        Articulo pizzaHawaChica = Articulo.builder()
                .id(4L)
                .denominacion("Pizza chica Hawaiana")
                .precioCompra(300.0)
                .precioVenta(600.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen4)
                .unidadMedida(porcionesCuatro)
                .build();
        articuloRepo.save(pizzaHawaChica);

        Articulo pizzaNapoGrande = Articulo.builder()
                .id(5L)
                .denominacion("Pizza Grande Napolitana")
                .precioCompra(550.0)
                .precioVenta(1100.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen2)
                .unidadMedida(porcionesOcho)
                .build();

        articuloRepo.save(pizzaNapoGrande);

        Articulo pizzaNapoChica = Articulo.builder()
                .id(6L)
                .denominacion("Pizza chica Napolitana")
                .precioCompra(350.0)
                .precioVenta(700.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen5)
                .unidadMedida(porcionesCuatro)
                .build();
        articuloRepo.save(pizzaNapoChica);

        Articulo pizzaMuzzaGrande = Articulo.builder()
                .id(7L)
                .denominacion("Pizza grande Muzzarella")
                .precioCompra(400.0)
                .precioVenta(800.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen3)
                .unidadMedida(porcionesOcho)
                .build();
        articuloRepo.save(pizzaMuzzaGrande);

        Articulo pizzaMuzzaChica = Articulo.builder()
                .id(8L)
                .denominacion("Pizza chica Muzzarella")
                .precioCompra(250.0)
                .precioVenta(500.0)
                .stockActual(20)
                .stockMaximo(50)
                .imagen(imagen6)
                .unidadMedida(porcionesCuatro)
                .build();
        articuloRepo.save(pizzaMuzzaChica);

                HashSet<Imagen> imagenesHappyHour = new HashSet<>();
                imagenesHappyHour.add(imagen1);
                imagenesHappyHour.add(imagen3);
                imagenesHappyHour.add(imagen8);

                HashSet<Articulo> articulosPromo1 = new HashSet<>();
                articulosPromo1.add(pizzaHawaGrande);
                articulosPromo1.add(pizzaMuzzaGrande);
                articulosPromo1.add(cerveza2);

                Promocion happyHourPromo = Promocion.builder()
                .id(1L)
                        .denominacion("Promo HappyHour")
                        .tipoPromocion(imahappy1)
                        .precioPromocional(1600.0)
                .descripcionDescuento("15 % DE DESCUENTO")
                .fechaDesde(LocalDate.of(2024,9,2))
                .fechaHasta(LocalDate.of(2024,10,2))
                        .horaDesde(LocalTime.of(21,0))
                        .horaHasta(LocalTime.of(12,0))
                .promoImagen(imagenesHappyHour)
                .promociones(articulosPromo1)
                .build();

                 HashSet<Imagen> imagenesVeranoPromo = new HashSet<>(Arrays.asList(imagen4,imagen2,imagen7,imagen8));
                 HashSet<Articulo> articulosVeranoPromo = new HashSet<>(Arrays.asList(pizzaHawaChica,pizzaNapoGrande,cerveza1,cerveza2));

                Promocion veranoPromo = Promocion.builder()
                        .id(2L)
                        .tipoPromocion(verano1)
                        .denominacion("Promo Verano")
                        .descripcionDescuento("20 % DE DESCUENTO")
                        .precioPromocional(1500.0)
                        .fechaDesde(LocalDate.of(2024,9,2))
                        .fechaHasta(LocalDate.of(2024,10,2))
                        .horaDesde(LocalTime.of(21,0))
                        .horaHasta(LocalTime.of(12,0))
                        .promoImagen(imagenesVeranoPromo)
                        .promociones(articulosVeranoPromo)
                        .build();

                 HashSet<Imagen> imagenesInviernoPromo = new HashSet<>(Arrays.asList(imagen1,imagen6,imagen8));
                 HashSet<Articulo> articulosInviernoPromo = new HashSet<>(Arrays.asList(pizzaHawaGrande,pizzaMuzzaChica,cerveza2));

                 Promocion inviernoPromo = Promocion.builder()
                .id(3L)
                .denominacion("Promo Invierno")
                .precioPromocional(1400.0)
                .tipoPromocion(invierno2)
                .descripcionDescuento("20 % DE DESCUENTO")
                .fechaDesde(LocalDate.of(2024,9,2))
                .fechaHasta(LocalDate.of(2024,10,2))
                .horaDesde(LocalTime.of(21,0))
                .horaHasta(LocalTime.of(12,0))
                .promoImagen(imagenesInviernoPromo)
                .promociones(articulosInviernoPromo)
                .build();


        promocionRepo.save(happyHourPromo);
        promocionRepo.save(veranoPromo);
        promocionRepo.save(inviernoPromo);

        System.out.println("-----------Lista de promociones--------------");
        List<Promocion> promocionList = promocionRepo.findAll();
        promocionList.forEach(System.out::println);

        System.out.println("-----------------");
        System.out.println("--------------Lista de articulos--------------");
        List<Articulo> articuloList = articuloRepo.findAll();
        articuloList.forEach(System.out::println);

        Optional<Promocion> promoVerano = promocionRepo.findById(2L);
        System.out.println("Promo verano con validez : ");
        System.out.println("Desde: "+ promoVerano.get().getFechaDesde());
        System.out.println("Hasta: "+ promoVerano.get().getFechaHasta());
        System.out.println("Horas: "+ promoVerano.get().getHoraDesde()+ " hasta las : "+ promoVerano.get().getHoraHasta());

        System.out.println("Promocion mas economica: ");
        Optional<Promocion> masEconomica = promocionRepo.findById(3L);
        System.out.println(masEconomica.get());
    }
}