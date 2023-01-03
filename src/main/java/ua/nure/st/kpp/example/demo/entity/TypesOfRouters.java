package ua.nure.st.kpp.example.demo.entity;

public class TypesOfRouters {
    int typeOfRouterID;
    String description;
    public TypesOfRouters(int typeOfRouterID, String description) {
        this.typeOfRouterID = typeOfRouterID;
        this.description = description;
    }
    @Override
    public String toString() {
        return "TypesOfRouters{" +
                "typeOfRouterID=" + typeOfRouterID +
                ", description='" + description + '\'' +
                '}';
    }

    public int getTypeOfRouterID() {
        return typeOfRouterID;
    }

    public void setTypeOfRouterID(int typeOfRouterID) {
        this.typeOfRouterID = typeOfRouterID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
