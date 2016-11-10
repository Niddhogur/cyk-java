package cyk.handlers;


import cyk.grammar.FncException;
import cyk.grammar.Grammar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FileHandler {
    public static Grammar readFromFile(String filePath) throws IOException, FncException {
        HashMap<String, ArrayList<String>> grammar = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();

        while (line != null) {
            String[] P = line.split(" -> "); //[0] contains the variable and [1] the production: "S -> AB"
            if (P[1].split(" ").length > 2)
                throw new FncException("A gramática informada não está na Fnc.");

            if (grammar.containsKey(P[0]))
                grammar.get(P[0]).add(String.join("", (CharSequence[]) P[1].split(" ")));
            else
                grammar.put(P[0], new ArrayList<>(Collections.singletonList(String.join("", (CharSequence[]) P[1].split(" ")))));

            line = br.readLine();
        }

        return new Grammar(grammar);
    }
}
