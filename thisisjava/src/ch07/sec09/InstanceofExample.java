package ch07.sec09;
//변수가 참조하는 객체의 타입 확인할때, instanceof 연산자 사용
// boolean result = 객체 instanceof 타입;
//instanceof 의 좌항의 객체가 우항의 타입이면 true, 아니면 false
public class InstanceofExample {
    //main() 메소드에서 바로 호출하기위해 정적 메소드 선언
    public static void personInfo(Person person){
        System.out.println("name:" + person.name);
        person.walk();

        //person 이 참조하는 객체가 Student 타입인지 확인
        if(person instanceof Student){
            //Student 객체일 경우 강제 타입 변환
            Student student = (Student) person;
            //Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo:"+student.studentNo);
            student.study();
        }

        //person 이 참조하는 객체가 Student타입일 경우
        //student변수에 대입(타입변환발생)
        /*if(person instanceof Student student){
            System.out.println("studentNo:" + student.studentNo);
            student.study();
        }*/ //자바12부터 사용
    }

    public static void main(String[] args){
        //Person 객체를 매개값으로 제공하고 personInfo()메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);
        System.out.println();

        //Student객체를 매개값으로 제공하고 personInfo()메소드 호출
        Person p2 = new Student("김길동",10);
        personInfo(p2);
    }
}
