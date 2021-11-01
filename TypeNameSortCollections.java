/*
Question 2
Write java program to print out the data by group of "type" and sort by "type", "name" A
     Input - Given the list of item (Type, Name)
     -Type=Fruit, Name=Orange
     -Type=Fruit, Name=Apple
     -Type=Fruit, Name=Banana
     -Type=Animal, Name=Tiger
     -Type=Animal", Name=Dog
     -Type=Vehicle", Name=Car
     -Type=Vehicle", Name=Boat
     -Type=Vehicle", Name=Plane

     Output
     -Type=Animal
               -Name=Dog
               -Name=Tiger
     -Type=Fruit
               -Name=Apple
               -Name=Banana
               -Name=Orange
     -Type=Vehicle
               -Name=Boat
               -Name=Car
               -Name=Plane
*/


import java.util.*;

public class TypeNameSortCollections {

    private HashMap<String, ArrayList<String>> typeNames = new HashMap<String, ArrayList<String>>();
    public static void main(String a[]) {
        TypeNameSortCollections typeNameSortCollections = new TypeNameSortCollections();
        typeNameSortCollections.getInput(typeNameSortCollections.typeNames);
        typeNameSortCollections.display(typeNameSortCollections.typeNames);
    }

    public HashMap<String, ArrayList<String>> getInput(HashMap<String, ArrayList<String>> typeNames) {
        Scanner sc = new Scanner(System.in);
        String type,name;
        System.out.println("Enter 5 pairs of types and names");
        for(int i = 0;i < 5;i++) {
            type = sc.nextLine();
            name = sc.nextLine();
            if(!typeNames.containsKey(type)) {
                typeNames.put(type, new ArrayList<String>());
            }
            typeNames.get(type).add(name);
        }
        return typeNames;
    }

    public void display(HashMap<String, ArrayList<String>> typeNames) {
        typeNames.forEach((type,namesList) -> {
            System.out.println("Type = "+ type);
            namesList.forEach((name) -> {
                System.out.println("\t Animal = "+ name);
            });
        });
    }
}
