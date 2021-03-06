package org.launchcode.ParkPals.models.dto;

import org.launchcode.ParkPals.models.DogActivity;
import org.launchcode.ParkPals.models.DogTemperament;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EditDogFormDTO {

    @NotBlank(message = "What is your dogs name?")
    @Size(max = 20, message = "Max of 20 characters.")
    private String name;

    @NotBlank(message = "What type of breed is your dog?")
    private String breed;

    @NotNull(message = "How old is your dog?")
    private int age;

    @NotNull
    private DogActivity activity;

    @NotNull
    private DogTemperament type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DogActivity getActivity() {
        return activity;
    }

    public void setActivity(DogActivity activity) {
        this.activity = activity;
    }

    public DogTemperament getType() {
        return type;
    }

    public void setType(DogTemperament type) {
        this.type = type;
    }
}
