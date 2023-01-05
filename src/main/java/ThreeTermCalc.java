public class ThreeTermCalc {

    private int firstTerm;
    private int secondTerm;
    private int thirdTerm;
    private double multipliedSum;

    public ThreeTermCalc(int firstTerm, int secondTerm, int thirdTerm) {
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;
        this.thirdTerm = thirdTerm;
        multipliedSum = MultipliedNum(firstTerm, thirdTerm);
    }

    private double MultipliedNum(int firstTerm, int thirdTerm) {
        if(firstTerm == 0)
            return thirdTerm;
        else
            return (double) firstTerm * thirdTerm;
    }

    public void Calc() {
        // This is very inefficient method
        int i = Integer.MIN_VALUE;
        while(i != Integer.MAX_VALUE) {
            if(i != 0)
                if(secondTerm == i + (multipliedSum / i)) {
                    if(firstTerm == 0 || firstTerm == 1) {
                        System.out.println("(x + " + i + ")(x + " + (multipliedSum / i) + ")");
                    } else {
                        System.out.println(firstTerm + "x^2 + " + i + "x + " + (multipliedSum / i) + "x + " + thirdTerm);
                    }
                }
            i++;
        }
    }

}
