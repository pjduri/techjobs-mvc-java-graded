package org.launchcode.techjobs.mvc.models;

import java.util.*;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private ArrayList<HashMap<String, String>> fieldsList = new ArrayList<>();

   // private LinkedHashMap<String, String> jobMap = new LinkedHashMap<>();

    // Initialize a unique ID.
    public Job() {
        id = nextId;
        nextId++;
    }

    // Initialize the id and value fields.
    public Job(String aName, Employer anEmployer, Location aLocation, PositionType aPositionType,
               CoreCompetency aCoreCompetency) {
        this();
        name = aName;
        employer = anEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    // Custom toString method.
    @Override
    public String toString(){
        String output = "";
        if (name.equals("")){
            name = "Data not available";
        }
        if (employer.getValue().equals("") || employer.getValue() == null){
            employer.setValue("Data not available");
        }
        if (location.getValue().equals("") || location.getValue() == null){
            location.setValue("Data not available");
        }
        if (coreCompetency.getValue().equals("") || coreCompetency.getValue() == null){
            coreCompetency.setValue("Data not available");
        }
        if (positionType.getValue().equals("") || positionType.getValue() == null){
            positionType.setValue("Data not available");
        }

        output = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n" +
                "Core Competency: %s\n", id, name, employer, location, positionType, coreCompetency);
        return output;
    }

    // Custom equals and hashCode methods. Two Job objects are "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // Getters and setters.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public ArrayList<HashMap<String, String>> getFieldsList() {
        return fieldsList;
    }

    public void setFieldsList() {

        HashMap<String, String> idMap = new HashMap<>();

        idMap.put("Id", String.valueOf(this.id));
        fieldsList.add(idMap);

        HashMap<String, String> nameMap = new HashMap<>();
        nameMap.put("Name", this.name);
        fieldsList.add(nameMap);

        HashMap<String, String> employerMap = new HashMap<>();
        employerMap.put("Employer", this.employer.getValue());
        fieldsList.add(employerMap);

        HashMap<String, String> locationMap = new HashMap<>();
        locationMap.put("Location", this.location.getValue());
        fieldsList.add(locationMap);

        HashMap<String, String> positionTypeMap = new HashMap<>();
        positionTypeMap.put("Position Type", this.positionType.getValue());
        fieldsList.add(positionTypeMap);

        HashMap<String, String> coreCompetencyMap = new HashMap<>();
        coreCompetencyMap.put("Core Competency", this.coreCompetency.getValue());
        fieldsList.add(coreCompetencyMap);
    }

    //    public LinkedHashMap<String, String> renderJobMap() {
//        this.jobMap.put("Id", String.valueOf(this.getId()));
//        this.jobMap.put("Name", this.getName());
//        this.jobMap.put("Employer", this.getEmployer().getValue());
//        this.jobMap.put("Location", this.getLocation().getValue());
//        this.jobMap.put("Position Type", this.getPositionType().getValue());
//        this.jobMap.put("Core Competency", this.getCoreCompetency().getValue());
//        return this.jobMap;
//    }


//    public LinkedHashMap<String, String> getJobMap() {
//        return jobMap;
//    }
//
//    public void setJobMap() {
//        this.jobMap.put("Id", String.valueOf(this.getId()));
//        this.jobMap.put("Name", this.getName());
//        this.jobMap.put("Employer", this.getEmployer().getValue());
//        this.jobMap.put("Location", this.getLocation().getValue());
//        this.jobMap.put("Position Type", this.getPositionType().getValue());
//        this.jobMap.put("Core Competency", this.getCoreCompetency().getValue());
//    }

}
