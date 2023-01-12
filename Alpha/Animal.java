package Alpha;

class Animal {
    public int age;
    Animal(int a) {
     this.age = a;   
    }
    void bark() {
        System.out.println("Woof-Woof");
    }  
    public void returnAge() {
        System.out.println(age);
    }
}
