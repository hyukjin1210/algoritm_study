package note;

public class desc {
    int total = 0;  //전역변수(객체변수)
    static String name = "짱구"; //전역변수(클래스변수)
    public void solution() {    //메서드
        int x = 10; //지역변수
        int y = 200; //지역변수 메서드의 실행이 끝나면 사라진다. == 값을 저장할 수 없다.
        int a = 10;

        System.out.println("메서드안의 지역변수다.");
    }

    public void solution2() {    //메서드
        int a = 10;
        int test = 200;

        total = a + test;

    }
    public static void main(String[] args) {
        desc desc = new desc(); //인스턴스 생성
        desc.solution();

//        System.out.println(x,y); //에러 이유: 변수 a와 test는 desc클래스안의 solution()메서드 안에서 구현한 지역변수이다.
//        지역변수는 해당 지역을 벗어나면 소실된다. 만약 지역변수의 데이터를 사용하고싶다면 방법이 있다.

        desc.solution2();   //클래스 안에있는 메서드 실행문 이 구문이 실행되면 solution2()메서드가 실행되면서 값을 total에 저장한다.
        System.out.println(desc.total); //결과적으로 desc에 선언한 전역변수 total의 값을 불러온다. 현재는 210

        System.out.println(name);   //클래스변수(static)는 따로 객체화를 해주지 않아도 바로 사용이 가능하다

        desc desc2 = new desc();    //객체화
        desc desc3 = new desc();
        System.out.println(desc2.hashCode());
        System.out.println(desc3.hashCode());

    }
}
