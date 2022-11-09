public class Birds {
    private String name;
    private Wings wings;

    Wings ostrichWings = new Wings();
    Wings crowWings = new Wings();



    public Birds(String name, Wings wings) {
        this.name = name;
        this.wings = wings;
    }

    public void walk() {
        System.out.println("Walk-walk");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWings(Wings wings) {
        this.wings = crowWings;
    }

    public String getName() {
        return name;
    }

    public Wings getWings() {
        return wings;
    }
}
