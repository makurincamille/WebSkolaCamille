package myProject.domain.profile;


import java.time.LocalDate;

/**
 * Created by Camille on 27.03.2016.
 */

/**
 * This a class of persons profile that contains few main character traits and short description.
 * Date of birth is for congratulation reminder.
 * Name, familyName - obvious
 */
public class Profile {

    private Long profileId;
    private String firstName;
    private String familyName;
    private LocalDate birthDate;
    private String characterTrait1;
    private String characterTrait2;


    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCharacterTrait1() {
        return characterTrait1;
    }

    public void setCharacterTrait1(String characterTrait1) {
        this.characterTrait1 = characterTrait1;
    }

    public String getCharacterTrait2() {
        return characterTrait2;
    }

    public void setCharacterTrait2(String characterTrait2) {
        this.characterTrait2 = characterTrait2;
    }

    public String getCharacterTrait3() {
        return characterTrait3;
    }

    public void setCharacterTrait3(String characterTrait3) {
        this.characterTrait3 = characterTrait3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String characterTrait3;
    private String description;


}
