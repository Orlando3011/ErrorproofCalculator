public class FactorialCalculator {
    private long argument;

    public long getArgument() {
        return argument;
    }

    public void setArgument(long argument) {
        this.argument = argument;
    }

    private long calculateMichalWasik() {
        long result = argument;
        return result;
    }

    private long calculateMichalPatyna() {
        //tu idzie kod
        long result = argument;
        return result;
    }

    private long calculateDominikSzafraniec() {
        long result = argument;
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
