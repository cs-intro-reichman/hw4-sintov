public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] findPrime = new boolean[n+1];
        findPrime[0] = false;
        findPrime[1] = false;
        for (int i=2; i<findPrime.length; i++){
            findPrime[i] = true;
        }
        int primeCheck = 2;
        int currentLocation = 2;
        int countPrimes = 0;
        System.out.println("prime numbers up to " + n + ":");
        while (primeCheck < findPrime.length){
            if (findPrime[primeCheck]) {
                System.out.println(primeCheck);
                countPrimes ++;
                while (currentLocation < findPrime.length) {
                    if (currentLocation % primeCheck == 0){
                        findPrime[currentLocation] = false;
                    }
                    currentLocation ++;
                }
            }
            primeCheck++;
            currentLocation = primeCheck;
        }
        double perPrime = ((double)countPrimes/(double)n)*100.0;
        System.out.println("There are " + countPrimes + " prime numbers between 2 and " + n + " (" + (int)perPrime + "% are primes)");
        
        // Replace this statement with your code
    }
}