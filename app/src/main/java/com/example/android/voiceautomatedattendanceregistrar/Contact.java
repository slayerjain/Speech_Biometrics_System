package com.example.android.voiceautomatedattendanceregistrar;

import java.util.ArrayList;

/**
 * Created by shubhamjain on 28/07/15.
 */
public class Contact {
    //private variables
    int _id;
    String _name;
    String _phone_number;
    ArrayList<String> _voiceSample;
    float _confidenceRatios[];

    // Empty constructor
    public Contact(){
    }
    public Contact(Contact anotherContact) {
        _id = anotherContact.getID();
        _name = anotherContact.getName();
        _phone_number = anotherContact.getAmount();
        _voiceSample = anotherContact.getSamples();
        _confidenceRatios = anotherContact.getConfidence();

    }
    // constructor
    public Contact(int id, String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;

    }

    // constructor
    public Contact(String name, String _phone_number){
        this._name = name;
        this._phone_number = _phone_number;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getName(){
        return this._name;
    }

    // setting name
    public void setName(String name){
        this._name = name;
    }
    public void set_voiceSample(ArrayList Sample){
        this._voiceSample = Sample;
    }
    public void set_confidenceRatios(float ratios[]) {this._confidenceRatios = ratios;}


    // getting phone number
    public String getAmount(){
        return this._phone_number;
    }

    public ArrayList<String> getSamples(){

        return _voiceSample;
    }

    public float[] getConfidence(){
        return this._confidenceRatios;
    }

    // setting phone number
    public void setAmount(String phone_number){
        this._phone_number = phone_number;
    }

}
