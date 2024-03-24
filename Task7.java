// url https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java

public class Task7 {
        public static String createPhoneNumber(int[] numbers) {
            String phoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                    numbers[0], numbers[1], numbers[2],
                    numbers[3], numbers[4], numbers[5],
                    numbers[6], numbers[7], numbers[8], numbers[9]);
            return phoneNumber;
            // or
//
//            String phoneNumber2 = "(" + numbers[0] + numbers[1] + numbers[2] + ") " +
//                    numbers[3] + numbers[4] + numbers[5] + "-" +
//                    numbers[6] + numbers[7] + numbers[8] + numbers[9];

        }
}
