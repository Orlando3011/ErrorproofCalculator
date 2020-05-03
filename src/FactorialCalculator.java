public class FactorialCalculator {
    private long argument;

    public long getArgument() {
        return argument;
    }

    public void setArgument(long argument) {
        this.argument = argument;
    }

    private long calculateMichalWasik() {
        long counter = 1;
        long result = 1;
        while (counter <= argument) {
            result = result * counter;
            counter = counter + 1;
        }
        System.out.println("Michał Wąsik, silnia wynik: " + result);
        return result;
    }

    /**
     * Działa dla n <= 5
     *
     * @return byte
     */
    byte calculateMichalPatyna() {
        byte result = 1;
        for (byte i = 1; i <= argument; ++i) {
            result *= i;
        }
        System.out.println("Michał Patyna, silnia wynik: " + result);
        return result;
    }

    private long calculateDominikSzafraniecRec(long element) {
        long result = 0;
        try {
            if (element < 0)
                result = 0;
            else if (element == 0)
                result = 1;
            else
                result = element * calculateDominikSzafraniecRec(element - 1);
        } catch (Exception e) {
            System.out.println(" \n @@@@@@@@ Stack is full!!! @@@@@@@@@ \n");
            e.printStackTrace();
        }
        return result;
    }

    private long calculateDominikSzafraniec(long element) {
        long result = calculateDominikSzafraniecRec(element);
        System.out.println("Dominik Szafraniec, silnia wynik: " + result);
        return result;
    }

    public void compareResults() {
        long resultMW = calculateMichalWasik();
        long resultMP = calculateMichalPatyna();
        long resultDS = calculateDominikSzafraniec(argument);

        if (resultDS == resultMP && resultDS == resultMW) {
            System.out.println("Wszystkie wyniki są takie same i wynoszą: " + resultDS);
        } else if (resultDS == resultMP) {
            System.out.println("Co najmniej dwa wyniki są takie same, czyli: " + resultDS);
        } else if (resultDS == resultMW) {
            System.out.println("Co najmniej dwa wyniki są takie same, czyli: " + resultDS);
        } else if (resultMP == resultMW) {
            System.out.println("Co najmniej dwa wyniki są takie same, czyli: " + resultMW);
        } else {
            System.out.println("Każdy wynik jest inny - nie udało się rozwiązać zadania.");
        }
    }

}
