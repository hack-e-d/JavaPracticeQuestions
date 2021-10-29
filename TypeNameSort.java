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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypeNameSort {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        String type,name;
        List<TypeName> typeNames = new ArrayList<TypeName>();
        System.out.println("Enter 5 pairs of types and names");
        for(int i = 0;i < 5;i++) {
            type = sc.nextLine();
            name = sc.nextLine();
            typeNames.add(new TypeName(type,name));
        }
        typeNames = sortList(typeNames);
        display(typeNames);
    }

    public static List<TypeName> sortList(List<TypeName> typeNameList) {
        for (int i = 0;i < 5;i++) {
            for (int j = i+1;j < 5;j++) {
                if(typeNameList.get(i).type.compareTo(typeNameList.get(j).type) > 0) {
                    TypeName typeName = typeNameList.get(i);
                    typeNameList.add(i,typeNameList.get(j));
                    typeNameList.add(j,typeName);
                }
            }
        }
        return typeNameList;
    }
    public static void display(List<TypeName> typeNameList) {
        String type = "";
        for( int i = 0;i < 5;i++) {
            if(type.compareTo(typeNameList.get(i).type) != 0) {
                System.out.println("Type = "+typeNameList.get(i).type);
                type = typeNameList.get(i).type;
            }
            System.out.println("\t Animal = "+typeNameList.get(i).name);
        }
    }
}

class TypeName {
    String type,name;

    public TypeName(String type, String name) {
        this.type = type;
        this.name = name;
    }
}


