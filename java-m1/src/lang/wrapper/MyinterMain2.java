package lang.wrapper;

public class MyinterMain2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = find(arr, 4);  // 예시로 4를 찾는 경우
        System.out.println(result);
    }

    private static int find(int[] arr, int v) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                return i;  // 값 v가 배열에 있으면 그 인덱스를 반환
            }
        }
        return -1;  // 값이 배열에 없으면 -1 반환
    }
}
