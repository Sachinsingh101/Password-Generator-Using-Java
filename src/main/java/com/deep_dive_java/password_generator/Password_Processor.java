/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deep_dive_java.password_generator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sachin Kumar Singh
 */
public class Password_Processor {
    boolean upercase,lowercase,number,symbols;
    int length;
    Password_Processor(boolean upercase,boolean lowercase,boolean number,boolean symbols,int length){
        this.upercase=upercase;
        this.lowercase=lowercase;
        this.number=number;
        this.symbols=symbols;
        this.length=length;
    }
    Password_Structure obj=new Password_Structure();
    String password=" ";
    int size=12;
    public String generatePassword(){
        Random rand=new Random();
        if(upercase && lowercase && number && symbols){
           for(int i=0; i<=8/4; i++){
            int temp=rand.nextInt(25);
            Character ch=obj.alphabet.charAt(temp);
            int temp2=rand.nextInt(25);
            Character ch2=obj.alphabet.charAt(temp);
            int temp3=rand.nextInt(3);
            Character ch3=obj.special_char.charAt(temp3);
            int temp4=rand.nextInt(8);
            Character ch4=obj.numbers.charAt(temp4);
            password=password.concat(ch.toString().toUpperCase()+ch2.toString()+ch3.toString()+ch4.toString());
            }
            return password;
        }else if(upercase && lowercase &&  number){
           for(int i=0; i<=8/4; i++){
            int temp=rand.nextInt(25);
            Character ch=obj.alphabet.charAt(temp);
            int temp2=rand.nextInt(25);
            Character ch2=obj.alphabet.charAt(temp);
//            int temp3=rand.nextInt(3);
//            Character ch3=obj.special_char.charAt(temp3);
            int temp4=rand.nextInt(8);
            Character ch4=obj.numbers.charAt(temp4);
            password=password.concat(ch.toString().toUpperCase()+ch2.toString()+ch4.toString());
            }
            return password;
        }
        else if(upercase && lowercase && symbols){
                       for(int i=0; i<=8/4; i++){
            int temp=rand.nextInt(25);
            Character ch=obj.alphabet.charAt(temp);
            int temp2=rand.nextInt(25);
            Character ch2=obj.alphabet.charAt(temp);
            int temp3=rand.nextInt(3);
            Character ch3=obj.special_char.charAt(temp3);
//            int temp4=rand.nextInt(8);
//            Character ch4=obj.numbers.charAt(temp4);
            password=password.concat(ch.toString().toUpperCase()+ch2.toString()+ch3.toString());
            }
            return password;
        }
        else if(upercase && lowercase){
            for(int i=0; i<=size/2; i++){
                int temp=rand.nextInt(25);
                int temp2=rand.nextInt(25);
                Character ch=obj.alphabet.charAt(temp);
                Character ch2=obj.alphabet.charAt(temp2);
                password=password.concat(ch.toString().toUpperCase()+ch2.toString());
                
            }
            return password;
        }else if(number && symbols){
            for(int i=0; i<=8/4; i++){
//            int temp=rand.nextInt(25);
//            Character ch=obj.alphabet.charAt(temp);
//            int temp2=rand.nextInt(25);
//            Character ch2=obj.alphabet.charAt(temp);
            int temp3=rand.nextInt(3);
            Character ch3=obj.special_char.charAt(temp3);
            int temp4=rand.nextInt(8);
            Character ch4=obj.numbers.charAt(temp4);
            password=password.concat(ch3.toString()+ch4.toString());
            }
            return password;
        }    
        else if(upercase){
            for(int i=0; i<=size; i++){
                int temp=rand.nextInt(25);
                Character ch=obj.alphabet.charAt(temp);
                password=password.concat(ch.toString().toUpperCase());
            }

            return password;
        }else if(lowercase){
            for(int i=0; i<=size; i++){
                int temp=rand.nextInt(25);
                Character ch=obj.alphabet.charAt(temp);
                password=password.concat(ch.toString().toLowerCase());
            }
            return password;
        }else if(number){
            for(int i=0; i<=size; i++){
                int temp=rand.nextInt(8);
                Character ch=obj.numbers.charAt(temp);
                password=password.concat(ch.toString());
            }
            return password;
        }else if(symbols){
            for(int i=0; i<=size; i++){
                int temp=rand.nextInt(3);
                Character ch=obj.special_char.charAt(temp);
                password=password.concat(ch.toString());
            }
        }else{
            for(int i=0; i<=8/4; i++){
            int temp=rand.nextInt(25);
            Character ch=obj.alphabet.charAt(temp);
            int temp2=rand.nextInt(25);
            Character ch2=obj.alphabet.charAt(temp);
            int temp3=rand.nextInt(3);
            Character ch3=obj.special_char.charAt(temp3);
            int temp4=rand.nextInt(8);
            Character ch4=obj.numbers.charAt(temp4);
                    password=password.concat(ch.toString().toUpperCase()+ch2.toString()+ch3.toString()+ch4.toString());
            }
            return password;
        }
        
        return password;
    }
}