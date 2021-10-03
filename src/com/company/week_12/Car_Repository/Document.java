package com.company.week_12.Car_Repository;

public class Document {
    private final long personId;

    public Document(long personId, String documentNumber) {
        this.personId = personId;
        this.documentNumber = documentNumber;
    }

    private final String documentNumber;

    public long getPersonId() {
        return personId;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "personId=" + personId +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }
}
