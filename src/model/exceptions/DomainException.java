package model.exceptions;

public class DomainException extends RuntimeException {
    // Exception obrigado o tratamento de exceções,
    // RuntimeException não obriga e se não tratado,
    // pode quebrar o programa
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
