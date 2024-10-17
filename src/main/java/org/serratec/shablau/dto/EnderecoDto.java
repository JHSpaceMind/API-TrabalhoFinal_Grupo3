package org.serratec.shablau.dto;

public record EnderecoDto(
		Long id_endereco,
		String cep,
		String rua,
		String bairro,
		String cidade,
		String numero,
		String complemento,
		String uf
		) {

}