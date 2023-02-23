public class PrintEx1 {

    public static void main(String[] args){
        //println()의 단점 - 출력형식 지정불가
        //1.실수의 자리를 표현 불가능
        System.out.println(10/3); //3.3333으로 출력되지 않음, 정수 나누기 정수이기 때문에 정수로 출력
        //실수로 값을 얻기 위해서는 숫자 하나를 실수로 바꾸어야 함.
        System.out.println(10.0/3);

        //2. 10진수로만 출력된다. - 8이나 16진수로 출력하려면? printf() 사용
        System.out.println(0x1A); // 26

        //printf("지시자(출력형식)", 출력값)
        //지시자 %d 10진수, %o 8진수, %c char, %s string ...
        //여러개의 지시자를 사용할 경우 지시자의 갯수 만큼 값을 적어줘야함
        //지시자 뒤에 붙는 \n ,%n은 개행문자로 줄바꿈을 실시해줌.

        System.out.printf("%.2f%n", 10.0 / 3); //"%.2f" 소수점 둘째자리까지

        System.out.printf("%d%n", 0x1A); //"%d" 10진수
        System.out.printf("%x%n", 0x1A); //"%x" 16진수

        System.out.printf("[%5d}%n", 10); //자릿수 [   10}
        System.out.printf("[%-5d}%n", 10);//왼쪽 정렬 [10   }
        System.out.printf("[%05d}%n", 10);//빈칸에 0 [00010}
    }

}
