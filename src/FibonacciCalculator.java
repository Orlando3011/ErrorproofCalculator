public class FibonacciCalculator {
    private long element;

    public long getElement() {
        return element;
    }

    public void setElement(long element) {
        this.element = element;
    }

    private long calculateMichalWasik() {
        long el1 = 0;
        long el2 = 1;
        long counter = 2;
        long result;
        long tmp;
        if(element == 1) result = el1;
        else if(element == 2) result = el2;
        else {
            while(counter <= element) {
                tmp = el2;
                el2 = el2 + el1;
                el1 = tmp;
                counter = counter + 1;
            }
            result = el2;
        }
        System.out.println("Michał Wąsik, Fibonacci wynik: " + result);
        return result;
    }

    private long calculateMichalPatyna() {
        //tu idzie kod
        long result = element;
        return result;
    }

    private long calculateDominikSzafraniec() {
        //tu idzie kod
        long result = element;
        return result;
    }

    public void compareResults() {
        long resultMW = calculateMichalWasik();
        long resultMP = calculateMichalPatyna();
        long resultDS = calculateDominikSzafraniec();

        if(resultDS == resultMP && resultDS == resultMW) {
            System.out.println("Wszystkie wyniki są takie same i wynoszą: " + resultDS);
        }

        else if(resultDS == resultMP) {
            System.out.println("Co najmniej dwa wyniki są takie same, czyli: " + resultDS);
        }

        else if(resultDS == resultMW) {
            System.out.println("Co najmniej dwa wyniki są takie same, czyli: " + resultDS);
        }

        else if(resultMP == resultMW) {
            System.out.println("Co najmniej dwa wyniki są takie same, czyli: " + resultMW);
        }

        else {
            System.out.println("Każdy wynik jest inny - nie udało się rozwiązać zadania.");
        }
    }
}
