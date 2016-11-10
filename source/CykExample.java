import cyk.grammar.FncException;
import cyk.grammar.FncGrammar;
import cyk.handlers.FileHandler;

import java.io.IOException;

public class CykExample {

    public static void main(String[] args) {

        try {
            FncGrammar grammar = FileHandler.readFromFile(args[0]);

            System.out.println((grammar.isAccepted(args[1])) ? "SIM" : "NÃO");

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo ou o arquivo não está formatado corretamente.\n\t" +
                    "<arquivo_de_entrada> informado foi: " + args[0]);

        } catch (IndexOutOfBoundsException id) {
            System.out.println("Argumentos fornecidos inválido. Favor tentar\n\t<arquivo_de_entrada> <palavra>\n\t" +
                    "Argumentos informados: " + String.join(" | ", args));

        } catch (FncException j) {
            j.printStackTrace();
        }
    }
}
