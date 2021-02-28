package hello.core.singleton;

public class SingletonService {


    //자기 자신은 내부에 private static으로 가진다. - static 영역에 딱 하나만 생성된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }


    //private 생성자를 통해 외부 class에서 new로 생성이 안되게 함.
    private SingletonService() {    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
