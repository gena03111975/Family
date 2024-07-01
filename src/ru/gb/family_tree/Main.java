package ru.gb.family_tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human mother = new Human("Alice", "01/01/1970", "", Gender.Female);
        Human father = new Human("Bob", "01/01/1965", "", Gender.Male);

        familyTree.addPerson(mother);
        familyTree.addPerson(father);

        Human child1 = new Human("Charlie", "01/01/1990", "", Gender.Male);
        Human child2 = new Human("Daisy", "01/01/1995", "", Gender.Female);

        familyTree.addPerson(child1);
        familyTree.addPerson(child2);

        List<Human> children = familyTree.getChildren(mother);
        for (Human child : children) {
            System.out.println(child.getName());
        }
    }
}




