package com.zven.reflect;

/**
 * @author Administrator
 * @date 2019/11/18 0018 15:04
 */
public class Person {
    public String name;

    public String sex;

    private String age;

    private String weight;


    public Person() {}

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void eat(String name) {
        System.out.println(name+"吃饭");
    }
}
