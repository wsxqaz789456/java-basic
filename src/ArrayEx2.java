public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[5]; //길이가 5인 int 배열
        int tmp = arr.length;   //arr.length의 값은 5이고 tmp에 5가 저장된다.
        //배열은 한번 생성하면 그 길이를 바꿀 수 없다.

        int[] score = {50, 60, 70, 80, 90}; //배열의 선언과 동시에 초기화
        System.out.println(score);
    }
}
