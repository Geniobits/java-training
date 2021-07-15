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
public class BoyFriend {
    private final Name bf_name;
    private final String gender;
    private int age;
    private int weight;
    private int height;
    private boolean have_girl_friend;
    private boolean have_goverenment_job;
    private String qualification;
    private GirlFriend gf;

    public BoyFriend(Name bf_name, String gender, int age, int weight, int height) {
        this.bf_name = bf_name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHave_goverenment_job(boolean have_goverenment_job) {
        this.have_goverenment_job = have_goverenment_job;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
   public void propose_girlfriend(GirlFriend gf){
       
   }
    
}
