### 更夫
- 项目核心价值观：研究[quartz](https://github.com/quartz-scheduler/quartz)项目实现原理

### 构造器设计模式的写法步骤
1. 创建静态class
1. 确定对象属性
1. 提供属性填充方法
1. 提供build方法

#### 示例
1. public static class StudentBuilder
1. name, age, number
1. name()
1. build()

- 代码
```java
public class Student{
    
    private String name;
    private int age;
    private int number;
    
    private Student(StudentBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.number = builder.number;
    }
    
    public static class StudentBuilder{
        private String name;
        private int age;
        private int number;
        
        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        
        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }
        
        public StudentBuilder number(int number){
            this.number = number;
            return this;
        }
        
        public Student build(){
            Student student = new Student(this);
            return student;
        }
        
    }
    
}

```
 