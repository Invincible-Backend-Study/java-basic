## 책
### 직접해 봅시다
1. 여러분의 이름을 출력할 Profile 클래스를 만들고, 그 클래스에 main() 메소드를 만들어보자
2. main 메소드에 'my name is ooo'
3. 'my age is ooo' 출력하도록 추가
4. 정상적으로 출력되는지 확인

```java
package C02.Profile;

public class Profile {
    public static void main(String[] args) {
        System.out.println("My name is Basak!");
        System.out.println("My age is 100");
    }
}
```
```python
My name is Basak!
My age is 100
```

---

### 정리해 봅시다
1. main() 메소드의 메소드 이름 앞에는 어떤 예약어들이 들어가나요?
- public, static, void


3. main() 메소드의 매개 변수에는 어떤 값이 들어가나요?
- string[] args


5. 만약 여러분들이 만든 클래스에 main() 메소드가 없다면, java 명령어로 그 클래스를 수행할 수 있나요?
- x


7. System.out.println() 메소드는 어떤 용도로 사용하나요?
- console에 string을 출력


9. System.out.print() 메소드는 System.out.println() 메소드와 어떤 차이가 있나요?
- print는 print + '\n' 이다.


11. // 는 무엇을 하는데 사용하는 기호인가요?
- 문자(//)이후에 오는 한줄을 주석처리!


13. \/*로 시작하고 \*/로 끝나는 사이에 있는 소스들은 어떻게 되나요?
- \/* 부터 \*/를 만날때까지 모두 주석처리

15. 메소드를 선언할 때 반드시 꼭 있어야 하는 세가지는 무엇인가요?
- return type, method name, (parameters), + body


