package sturctural.decorator;

// 커피의 기본 재료를 구현
public class ConcreteComponent implements Component {

    // 커피의 기본재료인 에스프레스로 정의
    @Override
    public String add() {
        return "에스프레소";
    }
}
