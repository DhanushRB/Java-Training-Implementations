public class triperfect {
        public static void main(String[] args) {
            int num = 120;
            int sum = 0;


            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (num == 3 * sum) {
                System.out.println(num + " is a Triperfect number.");
            } else {
                System.out.println(num + " is not a Triperfect number.");
            }
        }
    }


