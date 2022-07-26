package co.com.sofka.api;

import co.com.sofka.model.baraja.Baraja;
import co.com.sofka.model.juego.Juego;
import co.com.sofka.usecase.baraja.crearbaraja.CrearBarajaUseCase;
import co.com.sofka.usecase.baraja.enviarbajara.EnviarBajaraUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class HandlerBaraja {
    private final CrearBarajaUseCase crearBarajaUseCase;

    private final EnviarBajaraUseCase enviarBajaraUseCase;


    public Mono<ServerResponse> crearBarajaGETUseCase(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(crearBarajaUseCase.crearBaraja(), Baraja.class);
    }

    public Mono<ServerResponse> listarBarajaGETUseCase(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(enviarBajaraUseCase.enviarBaraja() , Juego.class);
    }

}
