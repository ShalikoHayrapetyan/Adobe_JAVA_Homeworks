package com.company.week_12.Car_Repository;

public class Car {
    private final long documentId;
    private final String markName;

    public long getDocumentId() {
        return documentId;
    }

    public String getMarkName() {
        return markName;
    }

    public String getModelName() {
        return modelName;
    }

    private final String modelName;


    public Car(long documentId, String markName, String modelName) {
        this.documentId = documentId;
        this.markName = markName;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "documentId=" + documentId +
                ", markName='" + markName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
