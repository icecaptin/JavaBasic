package Chapter08.polymorphism;
import java.util.*;

public class Test {
    static int[] weights = {2, 3, 5}; // 추가 무게
    static int[] counts = {10, 10, 10}; // 각 무게별 추가 개수
    static int[] curCount = new int[3]; // 현재까지 선택한 각 무게별 개수
    static boolean found = false; // 해를 찾았는지 여부
    static StringBuilder sb = new StringBuilder(); // 결과 문자열

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetWeight = scanner.nextInt();

        search(0, targetWeight);
        if (!found) {
            System.out.println("해를 찾을 수 없습니다.");
        } else {
            System.out.println(sb.toString() + ": " + sb.length() / 4);
        }
    }

    // 현재 선택한 개수에서 시작해서 재귀적으로 모든 조합을 찾아감
    static void search(int depth, int targetWeight) {
        if (depth == 3) {
            int weightSum = curCount[0] * weights[0] + curCount[1] * weights[1] + curCount[2] * weights[2];
            if (weightSum == targetWeight) {
                sb.append(Arrays.toString(curCount)).append(" ");
                found = true;
            }
            return;
        }

        for (int i = 1; i <= counts[depth]; i++) {
            curCount[depth] = i;
            search(depth + 1, targetWeight);
            if (found) {
                return;
            }
        }
    }
}

