package creational.singleton;

public class Print {

    public static void main(String[] args) {
        Printer printer1 = Printer.getInstance(); // 인스턴스 최초 생성
        Printer printer2 = Printer.getInstance(); // 인스턴스가 존재하기 때문에 기존의 인스턴스 사용

        printer1.print("첫번째 프린트");
        System.out.println(printer1.getPrintCount());

        printer2.print("두번째 프린트");
        System.out.println(printer2.getPrintCount());
    }
}
