public class person {
    private final String name;
    private double height;
    private double weight;
    private double BMI;

    //Constructor


    public person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        BMI = BMI();
    }

    // Method

    public void print(){
        System.out.println("Name: "+ name+"\n"+"Height: " + height +"\n" + "Weight: "+ weight+ "\n");
    }


    public void print(boolean withBMI){
        if (withBMI)
            System.out.println("Name: "+ name+"\n"+"Height: " + height +"\n" + "Weight: "+ weight+ "\n" + "BMI: "+ BMI+ "\n");
    }

    public double BMI (){
        return weight * Math.pow(height, 2);
    }


    //getter and setter


    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        BMI = BMI();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        BMI = BMI();
    }

    public double getBMI() {
        return BMI;
    }
}
