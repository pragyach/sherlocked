package com.example.shree.sherlocked;

/**
 * Created by shree on 12/26/201
 public class contact {
 //private variables**/public class contact {
 int _id;
 String _name;
 String _rating;
    String _summary;
    String _duration;

 public contact() {

 }

 // Empty constructor
 public void  Contact(){

 }
 // constructor
 public  contact(int id, String name, String rating , String  summary , String duration){
 this._id = id;
 this._name = name;
 this._rating = rating;
 this._duration=duration;
 this._summary=summary;}


 // constructor
 public contact(String name, String duration , String rating , String  summary){
 this._name = name;
 this._duration = duration;
     this._rating = rating;
     this._summary=summary;
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

 // getting phone number
 public String getDuration(){
 return this._duration;
 }

 // setting phone number
 public void setDuration(String duration){
 this._duration = duration;
 }

    public String getRating(){
        return this._rating;
    }

    // setting phone number
    public void setRating(String rating){
        this._rating= rating;
    }

    public String getSummary(){
        return this._summary;
    }

    // setting phone number
    public void setSummary(String summary){
        this._summary = summary;
    }
 }

