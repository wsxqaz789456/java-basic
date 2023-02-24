import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr2 = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12}, {21, 22}};
        int[][] arr2D2 = {{11, 12}, {21, 22}};

        System.out.println(Arrays.toString(arr)); //배열을 문자열로 출력
        System.out.println(Arrays.deepToString(arr2D)); //2차원 이상 배열은 deepToString

        System.out.println(Arrays.equals(arr, arr2)); // 배열이 같은 지 비교
        System.out.println(Arrays.deepEquals(arr2D, arr2D2)); // 2차원 이상 배열이 같은지 비교

        int[] arr3 = Arrays.copyOf(arr, 3); // arr3 = [0,1,2]
        int[] arr4 = Arrays.copyOf(arr, 7); // arr4 = [0,1,2,3,4,0,0]

        //배열의 정렬
        Arrays.sort(arr);
    }
}
