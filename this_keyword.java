public class this_keyword {

    String name;

    this_keyword(String naam) {
        name = naam;

    }

    public void Printname() {
        System.out.println("Say my name " + this.name);
    }

    public static void main(String[] args) {
        this_keyword Kunal = new this_keyword("Kunal");
        Kunal.Printname();

        this_keyword Krishna = new this_keyword("Krishna");
        Krishna.Printname();

    }

}
