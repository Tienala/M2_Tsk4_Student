/* Module 2. Task 4
 * Classname: Student
 *
 * Version 1
 *
 * Nataliia Zviertseva, NTU KhPI
 *
 *
3. Create a class Student  - 25 fields.
4.  Create a builder for the class Student.
 */
package com.company;

import java.time.LocalDate;
import java.util.Objects;
//Student Class Creation
public class Student {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Gender gender;
    private LocalDate birthday;
    private String houseAdress;
    private String telephoneNumber;
    private String eMail;
    private boolean headGroup;
    private String curator;
    private boolean militaryRegistration;
    private Speciality speciality;
    private Department department;
    private String groupNuber;
    private String personalRecordNumber;//Номер личного дела
    private String recordCardID;//Зачетная книга
    private String studentIDNumber;//Номер студенческого билета
    private boolean socialSecurityBeneficiary;
    private EducationalMaintenanceAllowance educationalMaintenanceAllowance;
    private boolean memberTradeUnionCommittee;
    private boolean liveInHostel;
    private ForeignLanguage foreignLanguage;
    private boolean medicalInspection;
    private SportSection sportsection;
    private double cum;
//Construcor with parametrs
    public Student(String firstName, String lastName, String patronymic,
                   Gender gender, LocalDate birthday, String houseAdress,
                   String telephoneNumber, String eMail, boolean headGroup,
                   String curator, boolean militaryRegistration,
                   Speciality speciality, Department department,
                   String groupNuber, String personalRecordNumber,
                   String recordCardID, String studentIDNumber,
                   boolean socialSecurityBeneficiary,
                   EducationalMaintenanceAllowance educationalMaintenanceAllowance,
                   boolean memberTradeUnionCommittee, boolean liveInHostel,
                   ForeignLanguage foreignLanguage, boolean medicalInspection,
                   SportSection sportsection, double cum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthday = birthday;
        this.houseAdress = houseAdress;
        this.telephoneNumber = telephoneNumber;
        this.eMail = eMail;
        this.headGroup = headGroup;
        this.curator = curator;
        this.militaryRegistration = militaryRegistration;
        this.speciality = speciality;
        this.department = department;
        this.groupNuber = groupNuber;
        this.personalRecordNumber = personalRecordNumber;
        this.recordCardID = recordCardID;
        this.studentIDNumber = studentIDNumber;
        this.socialSecurityBeneficiary = socialSecurityBeneficiary;
        this.educationalMaintenanceAllowance = educationalMaintenanceAllowance;
        this.memberTradeUnionCommittee = memberTradeUnionCommittee;
        this.liveInHostel = liveInHostel;
        this.foreignLanguage = foreignLanguage;
        this.medicalInspection = medicalInspection;
        this.sportsection = sportsection;
        this.cum = cum;
    }
//Constructor without parametr
    public Student() {

    }
//Getters and setters for all parametrs
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getHouseAdress() {
        return houseAdress;
    }

    public void setHouseAdress(String houseAdress) {
        this.houseAdress = houseAdress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public boolean isHeadGroup() {
        return headGroup;
    }

    public void setHeadGroup(boolean headGroup) {
        this.headGroup = headGroup;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public boolean isMilitaryRegistration() {
        return militaryRegistration;
    }

    public void setMilitaryRegistration(boolean militaryRegistration) {
        this.militaryRegistration = militaryRegistration;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getGroupNuber() {
        return groupNuber;
    }

    public void setGroupNuber(String groupNuber) {
        this.groupNuber = groupNuber;
    }

    public String getPersonalRecordNumber() {
        return personalRecordNumber;
    }

    public void setPersonalRecordNumber(String personalRecordNumber) {
        this.personalRecordNumber = personalRecordNumber;
    }

    public String getRecordCardID() {
        return recordCardID;
    }

    public void setRecordCardID(String recordCardID) {
        this.recordCardID = recordCardID;
    }

    public String getStudentIDNumber() {
        return studentIDNumber;
    }

    public void setStudentIDNumber(String studentIDNumber) {
        this.studentIDNumber = studentIDNumber;
    }

    public boolean isSocialSecurityBeneficiary() {
        return socialSecurityBeneficiary;
    }

    public void setSocialSecurityBeneficiary(boolean socialSecurityBeneficiary) {
        this.socialSecurityBeneficiary = socialSecurityBeneficiary;
    }

    public EducationalMaintenanceAllowance getEducationalMaintenanceAllowance() {
        return educationalMaintenanceAllowance;
    }

    public void setEducationalMaintenanceAllowance
            (EducationalMaintenanceAllowance educationalMaintenanceAllowance) {
        this.educationalMaintenanceAllowance = educationalMaintenanceAllowance;
    }

    public boolean isMemberTradeUnionCommittee() {
        return memberTradeUnionCommittee;
    }

    public void setMemberTradeUnionCommittee(boolean memberTradeUnionCommittee) {
        this.memberTradeUnionCommittee = memberTradeUnionCommittee;
    }

    public boolean isLiveInHostel() {
        return liveInHostel;
    }

    public void setLiveInHostel(boolean liveInHostel) {
        this.liveInHostel = liveInHostel;
    }

    public ForeignLanguage getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(ForeignLanguage foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public boolean isMedicalInspection() {
        return medicalInspection;
    }

    public void setMedicalInspection(boolean medicalInspection) {
        this.medicalInspection = medicalInspection;
    }

    public SportSection getSportsection() {
        return sportsection;
    }

    public void setSportsection(SportSection sportsection) {
        this.sportsection = sportsection;
    }

    public double getCum() {
        return cum;
    }

    public void setCum(double cum) {
        this.cum = cum;
    }

//To string method
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", houseAdress='" + houseAdress + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ", headGroup=" + headGroup +
                ", curator='" + curator + '\'' +
                ", militaryRegistration=" + militaryRegistration +
                ", speciality=" + speciality +
                ", department=" + department +
                ", groupNuber='" + groupNuber + '\'' +
                ", personalRecordNumber='" + personalRecordNumber + '\'' +
                ", recordCardID='" + recordCardID + '\'' +
                ", studentIDNumber='" + studentIDNumber + '\'' +
                ", socialSecurityBeneficiary=" + socialSecurityBeneficiary +
                ", educationalMaintenanceAllowance=" + educationalMaintenanceAllowance +
                ", memberTradeUnionCommittee=" + memberTradeUnionCommittee +
                ", liveInHostel=" + liveInHostel +
                ", foreignLanguage=" + foreignLanguage +
                ", medicalInspection=" + medicalInspection +
                ", sportsection=" + sportsection +
                ", cum=" + cum +
                '}';
    }
//Equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return isHeadGroup() == student.isHeadGroup() &&
                isMilitaryRegistration()
                        == student.isMilitaryRegistration() &&
                isSocialSecurityBeneficiary()
                        == student.isSocialSecurityBeneficiary() &&
                isMemberTradeUnionCommittee()
                        == student.isMemberTradeUnionCommittee() &&
                isLiveInHostel() == student.isLiveInHostel() &&
                isMedicalInspection() == student.isMedicalInspection() &&
                Double.compare(student.getCum(), getCum()) == 0 &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                getGender() == student.getGender() &&
                Objects.equals(getBirthday(), student.getBirthday()) &&
                Objects.equals(getHouseAdress(), student.getHouseAdress()) &&
                Objects.equals(getTelephoneNumber(),
                        student.getTelephoneNumber()) &&
                Objects.equals(geteMail(), student.geteMail()) &&
                Objects.equals(getCurator(), student.getCurator()) &&
                getSpeciality() == student.getSpeciality() &&
                getDepartment() == student.getDepartment() &&
                Objects.equals(getGroupNuber(), student.getGroupNuber()) &&
                Objects.equals(getPersonalRecordNumber(),
                        student.getPersonalRecordNumber()) &&
                Objects.equals(getRecordCardID(), student.getRecordCardID()) &&
                Objects.equals(getStudentIDNumber(),
                        student.getStudentIDNumber()) &&
                getEducationalMaintenanceAllowance()
                        == student.getEducationalMaintenanceAllowance() &&
                getForeignLanguage() == student.getForeignLanguage() &&
                getSportsection() == student.getSportsection();
    }
//Hashcode Method
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymic(),
                getGender(), getBirthday(), getHouseAdress(),
                getTelephoneNumber(), geteMail(), isHeadGroup(),
                getCurator(), isMilitaryRegistration(),
                getSpeciality(), getDepartment(), getGroupNuber(),
                getPersonalRecordNumber(), getRecordCardID(),
                getStudentIDNumber(), isSocialSecurityBeneficiary(),
                getEducationalMaintenanceAllowance(),
                isMemberTradeUnionCommittee(), isLiveInHostel(),
                getForeignLanguage(), isMedicalInspection(),
                getSportsection(), getCum());
    }
    //Builder creation
    public static class Builder{
        private Student studentToBuild;
        public Builder() {
            this.studentToBuild =  new Student();
        }
      //Method similarTO
      //@param firstName,  lastName,  patronymic,
      //       gender,  birthday,  houseAdress,
      //       telephoneNumber,  eMail,  headGroup,
      //       curator,  militaryRegistration,
      //       speciality,  department,
      //       groupNuber,  personalRecordNumber,
      //       recordCardID,  studentIDNumber,
      //       socialSecurityBeneficiary,
      //       educationalMaintenanceAllowance,
      //       memberTradeUnionCommittee,  liveInHostel,
      //       foreignLanguage,  medicalInspection,
      //       sportsection,  cum
        public Builder setSimilarTo(Student student) {

            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.houseAdress = student.houseAdress;
            this.studentToBuild.telephoneNumber = student.telephoneNumber;
            this.studentToBuild.eMail = student.eMail;
            this.studentToBuild.headGroup = student.headGroup;
            this.studentToBuild.curator = student.curator;
            this.studentToBuild.militaryRegistration
                    = student.militaryRegistration;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.department = student.department;
            this.studentToBuild.groupNuber = student.groupNuber;
            this.studentToBuild.personalRecordNumber
                    = student.personalRecordNumber;
            this.studentToBuild.recordCardID = student.recordCardID;
            this.studentToBuild.studentIDNumber = student.studentIDNumber;
            this.studentToBuild.socialSecurityBeneficiary
                    = student.socialSecurityBeneficiary;
            this.studentToBuild.educationalMaintenanceAllowance
                    = student.educationalMaintenanceAllowance;
            this.studentToBuild.memberTradeUnionCommittee
                    = student.memberTradeUnionCommittee;
            this.studentToBuild.liveInHostel = student.liveInHostel;
            this.studentToBuild.foreignLanguage = student.foreignLanguage;
            this.studentToBuild.medicalInspection = student.medicalInspection;
            this.studentToBuild.sportsection = student.sportsection;
            this.studentToBuild.cum = student.cum;
            return this;
        }
        //Setters for all parametrs
        Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }
        Builder setLastName(String lastName){
            studentToBuild.setFirstName(lastName);
            return this;
        }
        Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }
         Builder setGender (Gender gender){
            studentToBuild.setGender(gender);
            return this;
        }
        Builder setBirthday (LocalDate birthday){
            studentToBuild.setBirthday(birthday);
            return this;
        }
        Builder setHouseAdress (String houseAdress){
            studentToBuild.setHouseAdress(houseAdress);
            return this;
        }
        Builder setTelephoneNumber (String telephoneNumber){
            studentToBuild.setTelephoneNumber(telephoneNumber);
            return this;
        }
        Builder setEMail (String eMail){
            studentToBuild.seteMail(eMail);
            return this;
        }
        Builder setHeadGroup (boolean headGroup){
            studentToBuild.setHeadGroup(headGroup);
            return this;
        }
        Builder setCurator(String curator){
            studentToBuild.setCurator(curator);
            return this;
        }
        Builder setMilitaryRegistration (boolean militaryRegistration){
            studentToBuild.setMilitaryRegistration(militaryRegistration);
            return this;
        }
        Builder setSpeciality (Speciality speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }
        Builder setDepartment (Department department){
            studentToBuild.setDepartment(department);
            return this;
        }
        Builder setGroupNumber (String groupNumber){
            studentToBuild.setGroupNuber(groupNumber);
            return this;
        }
        Builder setPersonalRecordNumber (String personalRecordNumber){
            studentToBuild.setPersonalRecordNumber(personalRecordNumber);
            return this;
        }
        Builder setRecordCardID(String recordCardID){
            studentToBuild.setRecordCardID(recordCardID);
            return this;
        }
        Builder setStudentIDNumber(String studentIDNumber){
            studentToBuild.setStudentIDNumber(studentIDNumber);
            return this;
        }
        Builder setSocialSecurityBeneficiary(boolean socialSecurityBeneficiary){
            studentToBuild.setSocialSecurityBeneficiary(socialSecurityBeneficiary);
            return this;
        }
        Builder setEducationalMaintenanceAllowance
                (EducationalMaintenanceAllowance educationalMaintenanceAllowance){
            studentToBuild.setEducationalMaintenanceAllowance
                    (educationalMaintenanceAllowance);
            return this;
        }
        Builder setMemberTradeUnionCommittee
                (boolean memberTradeUnionCommittee){
            studentToBuild.setMemberTradeUnionCommittee
                    (memberTradeUnionCommittee);
            return this;
        }
        Builder setLiveInHostel(boolean liveInHostel){
            studentToBuild.setLiveInHostel(liveInHostel);
            return this;
        }
        Builder setForeignLanguage(ForeignLanguage foreignLanguage){
            studentToBuild.setForeignLanguage(foreignLanguage);
            return this;
        }
        Builder setMedicalInspection(boolean medicalInspection){
            studentToBuild.setMedicalInspection(medicalInspection);
            return this;
        }
        Builder setSporctSection(SportSection sportSection){
            studentToBuild.setSportsection(sportSection);
            return this;
        }
        Builder setCum (double cum){
            studentToBuild.setCum(cum);
            return this;
        }
        Student buid(){
            return studentToBuild;
        }

    }

}
