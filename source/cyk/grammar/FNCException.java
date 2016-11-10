package cyk.grammar;

/**
 * Exceção lançada se uma gramática não está na forma normal de Chomsky.
 */
public class FncException extends Exception {

    public FncException(String s) {
        super(s);
    }
}
