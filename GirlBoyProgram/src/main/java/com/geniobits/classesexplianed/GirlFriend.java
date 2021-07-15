/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geniobits.classesexplianed;

/**
 *
 * @author DESTINY
 */
public class GirlFriend {
    private Name gf_name;
    private int height;
    private int age;
    private int weight;
    private boolean have_bf;

    public GirlFriend(Name gf_name, int height, int age, int weight) {
        this.gf_name = gf_name;
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public Name getGf_name() {
        return gf_name;
    }

    public void setGf_name(Name gf_name) {
        this.gf_name = gf_name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
    
    public boolean getAndAnswerTheProposal(Proposal proposal){
        if(!proposal.gov_job){
            return false;
        }else if(proposal.age<20){
            return false;
        }else if(!proposal.message.contains("beautifull")){
            return false;
        }else{
            return true;
        }
    }
    
}
