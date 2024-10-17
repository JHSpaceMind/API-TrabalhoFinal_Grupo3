package org.serratec.shablau.controller;

import org.serratec.shablau.dto.PedidoDto;
import org.serratec.shablau.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.validation.Valid;

public class PedidoController {
	@Autowired PedidoService servico;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PedidoDto cadastrarPedido(@RequestBody @Valid PedidoDto pedidoDto) { 
		Pedido pedidoEntity = servico.salvarPedido(pedidoDto.toEntity()); 
		return PedidoDto.toDto(pedidoEntity);
	}
	
	/* EXEMPLO
	 * {
	 "data_pedido": "2024-10-16",
	 "data_entrega": "2024-10-20",
	 "data_envio": "2024-10-17",
	 "status_pedido": "PROCESSANDO",
	 "valor_total": 150.0,
	 "cliente": {
	"email": "cliente@email.com",
	"nome_completo": "João Silva",
	"cpf": "12345678900",
	"telefone": "11999999999",
	"data_nascimento": "1990-01-01",
	"cep": "01001000",
	"numero": 123,
	"complemento": "Apto 45"
  }
}
*/
}
