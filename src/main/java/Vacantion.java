import java.util.ArrayList;
import java.util.List;

public class Vacantion {
    static  final List<String> LIST_OF_STACK = new ArrayList<>();
    static final List<String> LIST_OF_GRADE = new ArrayList<>();
    static final List<String> LIST_OF_EXPIRIENCE = new ArrayList<>();
    static final List<String> LIST_OF_WORK_FORMAT = new ArrayList<>();
    static final List<String> LIST_OF_RESOURCE_MANAGER = new ArrayList<>();


    String nameOfVacantion;
    int idVacantion;
    String descriptionOfVacantion;
    String commentToVacantion;
    String project;
    String requirementsToVacantion;
    String stackOfVacantion;
    String gradeOfVacantion;
    String expirienceOfVacantion;
    String addressOfVacantion;
    String workFormatOfVacantion;
    String resourceManagerOfVacantion;
    String geographyOfVacantion;

    public void setNameOfVacantion(String nameOfVacantion) {
        this.nameOfVacantion = nameOfVacantion;
    }

    public void setIdVacantion(int idVacantion) {
        this.idVacantion = idVacantion;
    }

    public void setDescriptionOfVacantion(String descriptionOfVacantion) {
        this.descriptionOfVacantion = descriptionOfVacantion;
    }

    public void setCommentToVacantion(String commentToVacantion) {
        this.commentToVacantion = commentToVacantion;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setRequirementsToVacantion(String requirementsToVacantion) {
        this.requirementsToVacantion = requirementsToVacantion;
    }

    public void setStackOfVacantion(int numberOfStackVacantion) {

        this.stackOfVacantion = LIST_OF_STACK.get(numberOfStackVacantion);
    }

    public void setGradeOfVacantion(int numberGradeOfVacantion) {
        this.gradeOfVacantion = LIST_OF_GRADE.get(numberGradeOfVacantion);
    }

    public void setExpirienceOfVacantion(int numberExpirienceOfVacantion) {
        this.expirienceOfVacantion = LIST_OF_EXPIRIENCE.get(numberExpirienceOfVacantion);
    }

    public void setAddressOfVacantion(String addressOfVacantion) {
        this.addressOfVacantion = addressOfVacantion;
    }

    public void setWorkFormatOfVacantion(int numberWorkFormatOfVacantion) {
        this.workFormatOfVacantion = LIST_OF_WORK_FORMAT.get(numberWorkFormatOfVacantion);
    }

    public void setResourceManagerOfVacantion(int numberResourceManagerOfVacantion) {
        this.resourceManagerOfVacantion = LIST_OF_RESOURCE_MANAGER.get(numberResourceManagerOfVacantion);
    }

    public void setGeographyOfVacantion(String geographyOfVacantion) {
        this.geographyOfVacantion = geographyOfVacantion;
    }

    public String getNameOfVacantion() {
        return nameOfVacantion;
    }

    public int getIdVacantion() {
        return idVacantion;
    }

    public String getDescriptionOfVacantion() {
        return descriptionOfVacantion;
    }

    public String getCommentToVacantion() {
        return commentToVacantion;
    }

    public String getProject() {
        return project;
    }

    public String getRequirementsToVacantion() {
        return requirementsToVacantion;
    }

    public String getStackOfVacantion() {
        return stackOfVacantion;
    }

    public String getGradeOfVacantion() {
        return gradeOfVacantion;
    }

    public String getExpirienceOfVacantion() {
        return expirienceOfVacantion;
    }

    public String getAddressOfVacantion() {
        return addressOfVacantion;
    }

    public String getWorkFormatOfVacantion() {
        return workFormatOfVacantion;
    }

    public String getResourceManagerOfVacantion() {
        return resourceManagerOfVacantion;
    }

    public String getGeographyOfVacantion() {
        return geographyOfVacantion;
    }
}
