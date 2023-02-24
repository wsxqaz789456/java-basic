import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60}; //길이가 5인 int배열
        System.out.println(iArr); //메모리 값이 출력됨.

        for(int i=0;i<iArr.length;i++){
            System.out.println(iArr[i]); //반복문을 사용해 각각 출력
        }

        System.out.println(Arrays.toString(iArr)); // Arrays 클래스를 통해 출력

    }
}
