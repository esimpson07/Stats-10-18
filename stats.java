// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int sumProfit = 0;
        int baseLine = 3000;
        int revs = 3000;
        for(int a = 0; a < revs; a ++) {
            int passengers = 17;
            int profit = 0;
            for(int i = 0; i < 17; i ++) {
                if(Math.random() < 0.08 && passengers > 15) {
                    passengers --;
                } else {
                    profit += 200;
                }
            }
            if(passengers > 15) {
                profit -= 450;
            }
            sumProfit += profit;
        }
        sumProfit = (int)((double)(sumProfit) / (double)(revs));
        System.out.println(sumProfit);
    }
}
