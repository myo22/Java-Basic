package com.example.ex;

public class Hello2 {
    static int i;
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화한다.
    }
    public static void main(String[] args){
        System.out.println("Hello");
    }
}
// **중요**
// javac Hello2.java
// java Hello2
// 순서: JVM이 CLASSPATH에서 Hello2를 찾아서 읽어들이면서 정보를 메모리(Metaspace)에 올린다 -> 읽어들일때 클래스 필드(static필드)나 클래스 메소드(static메소드)가 있다면 사용 가능하도록 메모리에 올린다.
// static블록의 코드가 실행된다 -> JVM은 main메소드를 찾고 실행합니다(main 메소드도 static 하기때문에 인스턴스 만들지 않고 실행가능한 것)
// 클래스가 저장된 HDD(하드 디스크)나 SSD는 Ram보다 속도가 느리기 때문에 매번 보조 기억장치에서 읽어들이는 건 성능을 저하시키기 때문이다.
// 메소그 안에 선언된 변수들은 메소드가 실행될 때 메모리에 생성되었다가, 메소드가 종료될 때 사라진다.

// 추상화: 중요한 것은 남기고, 불필요한 것은 제거한다. ex) 책상 -> 누가 바라보느냐에 따라 다르다.
// 서점 주인이 고객에게 이름과 전화번호는 물어볼 수 있지만 몸무게를 물어보면 미친사람소리를 듣는다. -> 헬스클럽이라면? 몸무게는 물어볼 수 있다.
// 같은 고객이지만 어디 고객이냐에 따라서 가져야 할 정보가 다르다. -> 그러나 미래를 대비해서 모든 정보를 담을 필요가 없다.
// 우리에게 당장 필요한 정보와 기능만 가지도록 하는게 추상화이다.

// 캡슐화: 관련된 것을 잘 모아서 가지고 있는 것. 잘 모아서 가지고 있을수록 응집도가 높다고 표현한다.
// ex) Math 클래스는 수학과 관련된 기능만 잘 가지고 있다. -> 클래스 이름만 안다면 수학과 관련된 기능을 쓸 수 있다.