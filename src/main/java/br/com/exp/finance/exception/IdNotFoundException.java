package br.com.exp.finance.exception;

public class IdNotFoundException extends Exception{
    public IdNotFoundException(Long id) {
        super("Não encontrado ativo com id: " + id);
    }
}
