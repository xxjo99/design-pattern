# 옵저버 패턴

- 객체의 상태 변화를 관찰하는 관찰자(옵저버)들을 객체에 등록하여 상태 변화가 있을 때마다, 객체가 직접 등록된 옵저버에게 통지하도록 하는 패턴
- 어떤 객체의 상태가 변할 때 그와 연관된 객체들에게 알림을 보내는 패턴

![img.png](img.png)

- Observer : 데이터의 변경을 통보받는 인터페이스
- ConcreteObserver : ConcreteSubject의 변경을 통보받는 클래스
- Subject : ConcreteObserver 객체를 관리
- ConcreteSubject : 변경 관리 대상이 되는 데이터가 있는 클래스

### 장점

1. 실시간으로 한 객체의 변경사항을 다른 객체에 전파 가능


2. 느슨한 결합으로 시스템이 유연하고, 객체간의 의존성을 제거 가능


### 단점

1. 너무 많이 사용할 경우 상태 관리가 어려워짐


2. observer를 제때 제거해주지 않으면 메모리 누수가 발생할 수 있음

### 결론

- 이벤트에 대한 처리를 자주해야 하는 프로그램에 유용