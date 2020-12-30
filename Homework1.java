import java.util.*;
class Homework1{
public static void main(String[] args) {
    ArrayList<Integer> entries = new ArrayList<>();
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter 1st Integer:");
    int i1 = sc.nextInt();
    entries.add(i1);

    System.out.println("Enter 2nd Integer:");
    int i2 = sc.nextInt();
    entries.add(i2);

    System.out.println("Enter 3rd Integer:");
    int i3 = sc.nextInt();
    entries.add(i3);

    System.out.println("Enter 4th Integer:");
    int i4 = sc.nextInt();
    entries.add(i4);

    System.out.println("Enter 5th Integer:");
    int i5 = sc.nextInt();
    entries.add(i5);

    System.out.println("You have entered " +entries.size() + " numbers.");
    System.out.println(entries);
    // Find sum, product, largest, smallest numbers

    //sum and prod
    Integer sum = 0;
    Integer prod = 1;

    for (Integer x : entries) {
        sum += x;
        prod *= x;

    }
    System.out.println("The sum of these numbers is : "+ sum);
    System.out.println("The product of these numbers is : " +prod );
    System.out.println("The largest of these numbers is : "+ Collections.max(entries));
    System.out.println("The smallest of these numbers is : "+ Collections.min(entries));    
  
  //Car dealer, create hashmap of vehicles
  System.out.println("-----------------");

  //Map<String, String> makeModel = new HashMap<>(
  //    Map.of("Honda", "Civic", "Ford", "Bronco", "Chevy", "Blazer" );

  
       // Map<String, Object> jonMap = new HashMap<>(
        //     Map.of("Pid", "102", "First", "Jon", "Last", "Snow")
  //makeModel.put("Honda", "Civic");

//  Map<String, String> makeModel = Map.of();
//Map<String, String> singletonMap = Map.of("key1", "value");
Map<String, String> makeModel = Map.of("Honda", "Civic", "Ford", "Bronco", "Chevy", "Blazer" );
  makeModel.entrySet().forEach(entry->{
    System.out.println(entry.getKey() + " " + entry.getValue());  
 
 });

 Map<String, String> makeModel2  = new HashMap<String, String>() {{
    put("Honda", "Civic");
    put("Ford", "Bronco");
    put("Chevy", "Blazer");
}};
makeModel2.entrySet().forEach(entry->{
    System.out.println(entry.getKey() + " " + entry.getValue());   
 });

 
 System.out.println("What model of car are you looking for?");
  String qCarModel = sc.next();
 // Lookup model
 String lMake = "";
lMake = makeModel2.get(qCarModel);  

 System.out.println("Looks like we have that "+qCarModel+ " model with a make of: "+lMake+  " right over here.");
}
}