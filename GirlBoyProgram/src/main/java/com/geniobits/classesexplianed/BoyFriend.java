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
public class BoyFriend {
    private Name bf_name;
    private int height;
    private int age;
    private int weight;
    private boolean have_gf;
    private boolean have_goverenment_job;
    private String qualification;

    public BoyFriend(Name bf_name, int height, int age, int weight, boolean have_goverenment_job, String qualification) {
        this.bf_name = bf_name;
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.have_goverenment_job = have_goverenment_job;
        this.qualification = qualification;
    }

    public Name getBf_name() {
        return bf_name;
    }

    public void setBf_name(Name bf_name) {
        this.bf_name = bf_name;
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

    public boolean isHave_goverenment_job() {
        return have_goverenment_job;
    }

    public void setHave_goverenment_job(boolean have_goverenment_job) {
        this.have_goverenment_job = have_goverenment_job;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public Proposal createProposal(){
        return new Proposal("Your beautifull",isHave_goverenment_job(),getAge());
    }
    
}
