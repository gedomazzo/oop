package exe2;

public class Vehicles {
    private int id;
    private int age;
    private int wheels;
    private String control;
    private int shew;

    public Vehicles(int id, int age, int wheels, String control, int shew) {
        this.id = id;
        this.age = age;
        this.wheels = wheels;
        this.control = control;
        this.shew = shew;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }



    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }



    public String getControl() {
        return this.control;
    }

    public void setControl(String control) {
        this.control = control;
    }


    public int getShew() {
        return this.shew;
    }

    public void setShew(int shew) {
        this.shew = shew;
    }




    public double exhaust(){
        return this.shew * 60;
    }



    @Override
    public String toString() {
        return "age: " + this.age + "\n" +
                "id: " + this.id + "\n" +
                "wheels: " + this.wheels + "\n" +
                "control: " + this.control + "\n";
    }
}


