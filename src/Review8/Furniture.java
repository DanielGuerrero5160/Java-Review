package Review8;

public class Furniture {

    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }
    public void comfort(){
        System.out.println("Furniture needs to be comfortable");
    }
    private void use(){
        System.out.println("We are using furniture");
    }
    //@Override
    public static void breaks(){//we cannot override static methods
        System.out.println("furniture can break");
    }
}
class Chair extends Furniture{
  @Override
    public void comfort(){
        System.out.println("Chair needs to be comfortable");
    }
    protected void loveSeat(){
        System.out.println("Love seats are the best chairs");
    }
    public static void breaks(){
        System.out.println("chair can break");
    }


}
class Table extends Furniture{
    @Override
    public void assemble(){
        System.out.println("Table needs to be assembled");
    }
    protected void buildTable(){
        System.out.println("We can build a table");
    }
    protected void buildTable(String material){
        System.out.println("We can build a table with "+material);
    }
    public void comfort(){
        System.out.println("table cannot be comfortable");
    }
    private void use(){
        System.out.println("We are using table");//this is not being overridden from chair class as we cannot inherit priate methods
    }

}
