package org.example.services;

import org.example.util.CowsStorage;
import org.example.dto.Cow;

public class DairyFarm {
    private CowsStorage cows;
    private String firstCowId;

    public DairyFarm() {
        this.cows = new CowsStorage();
    }

    public void giveBirth(String parentCowId, String childCowId, String childNickName) {
        Cow cow = new Cow(childCowId, childNickName, parentCowId);
        cows.add(cow);

        firstCowId = firstCowId == null ? childCowId : firstCowId;

        Cow parent = cows.find(parentCowId);
        if (parent != null) {
            parent.addChild(cow);
        }
    }

    public void endLifeSpan(String cowId) {
        if (cowId == null) {
            System.out.println("A cow ID cannot be null.");
            return;
        }
        if (cowId.equals(firstCowId)) {
            System.out.println("A cow with an ID " + cowId + " is the first cow and cannot be removed.");
            return;
        }
        String parentId = cows.find(cowId).getParentId();
        Cow parent = cows.find(parentId);
        CowsStorage children = parent.getChildren();
        children.remove(cowId);

        cows.remove(cowId);
    }

    public void printFarmData() {
        cows.print();
    }
}
