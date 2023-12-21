package org.example;

class DairyFarm {
    private CustomLinkedList cows;

    public DairyFarm() {
        this.cows = new CustomLinkedList();
    }

    public void giveBirth(String parentCowId, String childCowId, String childNickName) {
        cows.addNode(childCowId, childNickName);
        System.out.println("Calf born: Cow{" +
                "parentCowId='" + parentCowId + '\'' +
                "cowId='" + childCowId + '\'' +
                ", nickName='" + childNickName + '\'' +
                '}');
    }

    public void endLifeSpan(String cowId) {
        Node cowToRemove = cows.findNode(cowId);

        if (cowToRemove != null) {
            cows.removeNode(cowId);
            System.out.println("Cow's life span ended: Cow{" +
                    "cowId='" + cowToRemove.getCowId() + '\'' +
                    ", nickName='" + cowToRemove.getNickName() + '\'' +
                    '}');
        } else {
            System.out.println("Cow with ID " + cowId + " not found in the farm.");
        }
    }

    public void printFarmData() {
        System.out.println("Farm data:");
        cows.printList();
    }
}
