package com.serenity.developers.simple_string_generator;

import java.util.Random;

public class Generator {

    public String generated;
    public int numOfString = 1;

    public String generateLettersUppercase(int numOfString) {
        String useString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateLettersLowercase(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateLettersUppercaseNumbers(int numOfString) {
        String useString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateLettersLowercaseNumbers(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyz1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateLettersNumbers(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateLettersUppercaseSpecials(int numOfString) {
        String useString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateLettersLowercaseSpecials(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyz!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateNumbersSpecials(int numOfString) {
        String useString = "1234567890!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateLettersSpecials(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateAll(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateCustomString(int numOfString, String useString) {
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }

    public String generateDefault() {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < 10) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
        return generated;
    }
}
