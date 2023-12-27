package org.example.dto;

import org.example.util.CowsStorage;

public class Cow {
    private String cowId;
    private String nickName;
    private String parentId;
    private CowsStorage children;

    public Cow(String cowId, String nickName, String parentId) {
        this.cowId = cowId;
        this.nickName = nickName;
        this.parentId = parentId;
        children = new CowsStorage();
    }

    public void addChild(Cow child) {
        children.add(child);
    }

    public void removeChild(String childId) {
        children.remove(childId);
    }

    public CowsStorage getChildren() {
        return children;
    }

    public String getParentId() {
        return parentId;
    }

    public boolean equalsById(String cowId) {
        return this.cowId.equals(cowId);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "cowId='" + cowId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
