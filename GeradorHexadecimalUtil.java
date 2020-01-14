package moduloImovel.util;

import java.util.UUID; // aqui importo a library para gerarUUID
/*
 * @author : Tiago Ribeiro Santos
 * Essa classe Gera uma String hexadecimal para armazenar na coluna CD_EMISSAO.
 */
public class GeradorHexadecimal {
	public static String gerador() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	
}
