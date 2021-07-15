/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplication;

/**
 *
 * @author DESTINY
 */
public class Proposal {
    private String message;
    private String qualification;
    private boolean have_government_job;
    private int age;
    private int height;
    private int weight;

    public Proposal(String message, String qualification, boolean have_government_job, int age, int height, int weight) {
        this.message = message;
        this.qualification = qualification;
        this.have_government_job = have_government_job;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getMessage() {
        return message;
    }

    public String getQualification() {
        return qualification;
    }

    public boolean isHave_government_job() {
        return have_government_job;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    
    
}
