package pwo.lab13.app;

import java.util.Arrays;
import java.util.Objects;

public class ProcessArgs {

    /*
    Wyszukuje w tablicy stringów pozycję, która może być
    zinterpretowana jako wartość typu ProcessData.Action.
    Wielkość czcionki nie ma znaczenia. Obowiązuje
    pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca
    wartość UNDEFINE.
    */
    public static ProcessData.Action getAction(String[] args) {
        final String[] lowerCaseArgs = Arrays.stream(args)
            .map(String::toLowerCase)
            .toArray(String[]::new);

        for (String arg : lowerCaseArgs) {
            switch (arg) {
                case "max":
                    return ProcessData.Action.MAX;
                case "sum":
                    return ProcessData.Action.SUM;
            }
        }
        return ProcessData.Action.UNDEFINE;
    }

    /*
    Wyszukuje w tablicy stringów pozycje, które mogą być
    zinterpretowane jako liczby. Tworzy z tych liczb
    tablicę. Jeżeli nie ma liczb to zwraca pustą tablicę.
    */
    public static double[] getNumbers(String[] args) {
        return Arrays.stream(args)
            .map(arg -> {
                try {
                    return Double.parseDouble(arg);
                } catch (NumberFormatException e) {
                    return null;
                }
            })
            .filter(Objects::nonNull)
            .mapToDouble((boxed) -> boxed)
            .toArray();
    }

}
