public class FibonacciCalculator {
    private long element;

    public long getElement() {
        return element;
    }

    public void setElement(long element) {
        this.element = element;
    }

    private long calculateMichalWasik() {
        long result = element;
        return element;
    }

    private long calculateMichalPatyna() {
        //tu idzie kod
        long result = element;
        return element;
    }

    private long calculateDominikSzafraniec() {
        //tu idzie kod
        long result = element;
        return element;
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
