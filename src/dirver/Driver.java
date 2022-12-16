package dirver;

public class Driver{

    private String fullName;
    private final String driverLicense;
    private Integer experience;

    private <T> boolean isNull(T checkObject){
        return checkObject == null || checkObject.equals("");
    }

    public Driver(String fullName, String driverLicense, Integer experience) {

        if(isNull(driverLicense)) {
            driverLicense = "M";
        }
        this.driverLicense = driverLicense;

        setExperience(experience);
        setFullName(fullName);
    }

    public void setFullName(String fullName) {
        if(!isNull(fullName))
            this.fullName = fullName;
    }

    public void setExperience(Integer experience) {
        if(!isNull(experience))
            this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    public void startMoving(){
        System.out.println("Водитель начал движение");
    }

    public void stopMoving(){
        System.out.println("Водитель закончил движение");
    }

    public void refueling(){
        System.out.println("Водитель запправил");
    }
}
