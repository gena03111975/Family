package ru.gb.family_tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Human person) {
        this.people.add(person);
    }

    public List<Human> getChildren(Human parent) {
        List<Human> children = new ArrayList<>();
        for (Human person : this.people) {
            // Check if person is child of the parent
            // Logic to determine parent-child relationship is up to you
            // For simplicity, let's assume parent is female and children are her direct descendants
            if (person.getGender() == Gender.Male && parent.getGender() == Gender.Female) {
                children.add(person);
            }
        }
        return children;
    }
}
