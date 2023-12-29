package creational.singleton;

public class Printer {
    private static Printer printer = null;
    private int printCount;

    // 기본 생성자에 private를 적용시켜 생성을 불가능하게 만듦
    private Printer () {
        printCount = 0;
    }

    // getInstance를 통해서만 생성 가능
    // 생성된 값이 존재한다면 해당 인스턴스를 리턴
    public static Printer getInstance() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    public int getPrintCount() {
        return printCount;
    }

    public void addPrintCount() {
        this.printCount++;
    }

    public void print(String input) {
        System.out.println(input);
        addPrintCount();
    }

}
