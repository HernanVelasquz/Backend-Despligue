package co.com.sofka.usecase.tarjeta.listartarjeta;

import co.com.sofka.model.tarjeta.Tarjeta;
import co.com.sofka.model.tarjeta.gateways.TarjetaRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class ListarTarjetasUseCase {
    private final TarjetaRepository tarjetaRepository;

    public Flux<Tarjeta> listarTarjetas() {
        return tarjetaRepository.findAll();
    }
}
