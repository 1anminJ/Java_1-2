package Final;

import java.util.ArrayList;

interface StudentInterface{
    //전공은 상수 처리
    public static final String SW = "컴퓨터공학부 컴퓨터소프트웨어공학과";
    public static final String AI = "컴퓨터공학부 인공지능학과";
    public static final String ECO = "경영학부 경영학과";
    public static final String DESIGN = "디자인학부 생활디자인과";

    public abstract String getResult();
    public abstract String getDept();
}

class Person{
    private String name, addr;

    public Person() {}
    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

}

class Student extends Person implements StudentInterface{
    private int stuId, jeongong, grade;

    public Student() {}  //기본 생성자
    public Student(String name, String addr, int stuId, int jeongong, int grade) {
        super(name, addr);
        this.stuId = stuId;
        this.jeongong = jeongong;
        this.grade = grade;
    }
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    public int getJeongong() {
        return jeongong;
    }
    public void setJeongong(int jeongong) {
        this.jeongong = jeongong;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }


    public void print() {
        System.out.println("이름 : " +  getName() + ", 주소 : " + getAddr() + ", 학번 : " + stuId + ", 전공 : " + getDept() + ", 점수 : " + grade + "     " + getResult());
    }

    @Override
    public String getResult() {
        if(grade >= 80) {
            return "참 잘했어요~";
        }
        else {
            return "조금 더 노력해보세요.";
        }
    }
    @Override
    public String getDept() {
        if(jeongong == 1100) {
            return StudentInterface.SW;
        }
        else if(jeongong == 1200) {
            return StudentInterface.AI;
        }
        else if(jeongong == 2000) {
            return StudentInterface.ECO;
        }
        else if(jeongong == 3000) {
            return StudentInterface.DESIGN;
        }
        return "기타학과";
    }
    @Override
    public String toString() {
        return "이름 : " +  getName() + ", 주소 : " + getAddr() + ", 학번 : " + stuId + ", 전공 : " + getDept() + ", 점수 : " + grade + "   " + getResult();
    }

}



public class PersonEx {
    public static void main(String[] args) {
        ArrayList<Student> stList = new ArrayList<>();

        stList.add(new Student("한민정", "서울", 2201, 1100, 100));
        stList.add(new Student("홍길동", "경기", 2202, 1200, 80));
        stList.add(new Student("손흥민", "유럽", 2301, 2000, 70));
        stList.add(new Student("페이커", "인천", 2302, 3000, 85));

        System.out.println("***전체 명단***");
        //System.out.println(stList);
        for(Student one : stList) {
            System.out.println(one);
        }

        //컴퓨터공학부 학생명단 작성
        System.out.println("\n***컴퓨터공학부 명단***");
        //System.out.println(stList);
        for(Student com : stList) {
            if(com.getJeongong() == 1100 || com.getJeongong() == 1200)
                System.out.println(com);
        }

        //우수학생(성적 >= 80) 이름과 전공, 성적 출력
        System.out.println("\n***우수학생 이름과 전공, 성적***");
        for(Student usu : stList) {
            if(usu.getGrade() >= 80)
                System.out.println("이름 : " + usu.getName() + ", 전공 : " + usu.getDept() + ", 성적 : " + usu.getGrade());
        }
    }
}