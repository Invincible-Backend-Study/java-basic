## 참조 자료형

- 기본 생성자는 다른 생성자가 존재한다면 자동으로 만들어지지 않는다.

---

## 책

### 직접해 봅시다

```java
public class Student {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }
}
```

```java
public class ManageStudent {
    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010123456768", "aaa@mail.com");
        return student;
    }
}
```

```java
class ManageStudentTest {
    private final ManageStudent manageStudent = new ManageStudent();

    @Test
    void addStudent() {
        Student[] student;

        student = manageStudent.addStudent();

        assertAll(
                () -> assertEquals(student[0].toString(), "Lim null null null"),
                () -> assertEquals(student[1].toString(), "Min null null null"),
                () -> assertEquals(student[2].toString(), "Sook Seoul 010123456768 aaa@mail.com")
        );

    }

    @Test
    void printStudent() {
        Student[] student;

        student = manageStudent.addStudent();

        for (Student stu : student) {
            System.out.println(stu.toString());
        }
    }
}
```

### 정리해 봅시다

1. 생성자는 반드시 만들어야 하나요?
- 아니요, 안적으면 기본생성자 자동생성됨
2. 만약 매개 변수가 있는 생성자를 만들고, 매개 변수가 없는 기본 생성자를 호출하면 어떻게 될까요?
- 없으므로 오류발생!
3. 생성자의 개수는 제한이 있나요?
- 없다
4. 인스턴스의 변수와 매개 변수나 메소드 내에서 생성한 변수와 구분하기 위해서 사용하는 키워드는 무엇인가요?
- this
5. 메소드 선언시 아무 데이터도 리턴 타입으로 넘겨주지 않겠다는 것을 지정하는 키워드는 무엇인가요?
- void
6. 메소드 선언에 static이 있는 것과 없는 것의 차이는 무엇인가요?
- 객체 생성없이 해당 메소드를 호출할 수 있다.
7. 필자가 엄청나게 중요하다고 한 것 중 메소드의 이름은 같으나 매개 변수를 다르게 하는 것의 명칭은 무엇인가요?
- overloading
8. 기본 자료형을 매개 변수로 넘겨 줄 때 pass by value인가요? pass by reference 인가요?
- value
9. 참조 자료형은?
- reference
10. 매개 변수의 수가 가변적일 때 메소드 선언시 타입과 변수 이름 사이에 어떤 것을 적어줘야 하나요?
- … (가변인자)
