## 배열의 기본값

- 배열 선언(초기화)시 크기가 지정되어야 한다.
    - 중간에 배열 크기를 증감시킬 순 없다.
- 기본 자료형 배열의 기본값은 각 자료형의 기본값과 동일
- 지역변수의 경우 초기화를 하지 않으면 사용이 불가능하지만, 배열은 크기만 정해주면 사용이 가능하다.
- 기본값
    - 0, 0.0, false, `\u0000`
    - 참고로 참조자료형의 경우 null이 초기값이다.

`[Ljava.lang.String;@1540e19d`

- [L: [배열객체, L참조자료형
- java.langString: Type
- @1123123: 고유번호 → 써먹을데가없다? 해쉬 비교?

- 당연하지만 메소드체이닝은 참조자료형에만 사용할 수 있다.

### Java5 Style For loop

- index를 알 필요가 없을때 좋다

```java
for(type name : items) {
}ㄱ
```

---

## 책

### 직접해 봅시다

```java
public class ManageHeight {
    private int[][] student;

    public void setData() {
        student = new int[][]{
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}
        };
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        for(int student : student[classNo]) {
            System.out.println(student);
        }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No.:" + classNo);

        int i = 0;
        int studentHeightTotal = 0;
        for(int student : student[classNo]) {
            i++;
            studentHeightTotal += student;
        }
        System.out.println("Height average:" + (double) studentHeightTotal / i);
    }

}
```

```java
class ManageHeightTest {
    private ManageHeight manageHeight;

    @BeforeEach
    void before() {
        manageHeight = new ManageHeight();
        manageHeight.setData();
    }

    @Test
    void printHeight() {
        for (int i = 0; i < 5; i++) {
            manageHeight.printHeight(i);
        }
    }

    @Test
    void printAverage() {
        int i = 0;
        while (i < 5) {
            manageHeight.printAverage(i);
            i++;
        }
    }
}
```

### 정리해 봅시다

1. 배열을 선언할 때 어떤 키워드를 타입 앞이나 뒤에 사용해야 하나요?
- []
2. 배열의 첫번째 위치는 0인가요? 1인가요?
- 0
3. 배열을 선언할 때 boolean 배열의 크기만 지정했다면 boolean 배열의 [0]에 위치에 잇는 값은 무엇인가요?
- false
4. 중괄호를 이용하여 배열을 초기화 할 때 중괄호 끝에 반드시 어떤 것을 입력해 주어야 하나요?
- ;
5. 2차원 배열을 정의할 때에는 대괄호를 몇 개 지정해야 하나요?
- 2개 이상 (2차원 인덱스 수에 따라 다름)
6. 배열을 쉽게 처리해주는 for문의 문법은 어떻게 되나요?
- for (type name : items)
- java5 이상부터 사용 가능함
7. 자바 프로그램에 데이터를 전달해 주려면 클래스 이름 뒤에 어떻게 구분하여 나열하면 되나요?
- args는 공란으로 구분지어서 나열하면된다.
8. 자바 프로그램이 시작할 때 전달 받는 내용은 어떤 타입의 배열인가요?
- string (String args[])
