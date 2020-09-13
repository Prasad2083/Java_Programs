public class secretType {
   private String name;
    private int age,weight;
    private double height;

    public secretType() {
        this.name = null;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public secretType(String name, int age, int weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {

        secretType data=new secretType("vara",26,78,5.7);

        data.setName("Assignment");
        data.setAge(20);
        data.setHeight(5.6);
        data.setWeight(76);
        System.out.println("Name :"+data.getName()+" "+"Age :"+data.getAge()+" "+
                "Height :"+data.getHeight()+" "+"Weight :"+data.getWeight());

    }
}
