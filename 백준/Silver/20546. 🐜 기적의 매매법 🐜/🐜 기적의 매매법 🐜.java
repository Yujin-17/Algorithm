import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        int money = scanner.nextInt(); // 초기 현금
        int[] prices = new int[14];
        for (int i = 0; i < 14; i++) {
            prices[i] = scanner.nextInt();
        }

        // BNP 전략
        int junMoney = money;
        int junStock = 0;

        for (int i = 0; i < 14; i++) {
            if (junMoney >= prices[i]) {
                junStock += junMoney / prices[i];
                junMoney %= prices[i];
            }
        }

        // TIMING 전략
        int sungMoney = money;
        int sungStock = 0;

        int riseCount = 0;  // 상승 카운트
        int fallCount = 0;  // 하락 카운트
        for (int i = 1; i < 14; i++) {
            // 상승/하락 여부 계산
            if (prices[i] > prices[i - 1]) {
                riseCount++;
                fallCount = 0;
            } else if (prices[i] < prices[i - 1]) {
                fallCount++;
                riseCount = 0;
            } else {
                riseCount = 0;
                fallCount = 0;
            }

            // 3일 연속 상승 -> 전량 매도
            if (riseCount == 3) {
                sungMoney += sungStock * prices[i];
                sungStock = 0;
                riseCount = 0; // 초기화
            }

            // 3일 연속 하락 -> 전량 매수
            if (fallCount == 3) {
                if (sungMoney >= prices[i]) {
                    sungStock += sungMoney / prices[i];
                    sungMoney %= prices[i];
                }
                fallCount = 0; // 초기화
            }
        }

        // 최종 자산 계산
        int junTotal = junMoney + (junStock * prices[13]);
        int sungTotal = sungMoney + (sungStock * prices[13]);

        // 결과 출력
        if (junTotal > sungTotal) {
            System.out.println("BNP");
        } else if (junTotal < sungTotal) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
