public class ArrayEx1 {

    public static void main(String[] args) {
        //배열의 선언과 생성
        //배열 선언 방법: 타입[] 변수이름
        //ex) int[] score; String[] name;
        int[] score;           //int타입의 배열을 다루기 위한 참조변수 score선언
        score = new int[5];    //int타입의 값 5개를 저장할 수 있는 배열 생성

        int[] point = new int[5];// 배열의 선언과 생성을 동시에
        point[3] = 100;
        int value = point[3];
        System.out.println(value); //100
    }
}
