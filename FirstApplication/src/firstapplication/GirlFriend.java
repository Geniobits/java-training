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
public class GirlFriend {
    private final Name gf_name;
    private final String gender;
    private int age;
    private int weight;
    private int height;
    private boolean have_boy_friend;
    private BoyFriend bf;

    public GirlFriend(Name gf_name, String gender, int age, int weight, int height) {
        this.gf_name = gf_name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Name getGf_name() {
        return gf_name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHave_boy_friend() {
        return have_boy_friend;
    }

    private void setHave_boy_friend(boolean have_boy_friend) {
        this.have_boy_friend = have_boy_friend;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
