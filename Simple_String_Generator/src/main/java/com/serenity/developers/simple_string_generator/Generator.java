package com.serenity.developers.simple_string_generator;

import java.util.Random;

public class Generator {

    public String generated;
    public int numOfString = 1;

    private void generateLettersUppercase(int numOfString) {
        String useString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateLettersLowercase(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateLettersUppercaseNumbers(int numOfString) {
        String useString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateLettersLowercaseNumbers(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyz1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateLettersNumbers(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateLettersUppercaseSpecials(int numOfString) {
        String useString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateLettersLowercaseSpecials(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyz!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateNumbersSpecials(int numOfString) {
        String useString = "1234567890!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateLettersSpecials(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateAll(int numOfString) {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateCustomString(int numOfString, String useString) {
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < numOfString) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }

    private void generateDefault() {
        String useString = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*_-+";
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        while (stringBuilder.length() < 10) {
            int index = (int) (r.nextFloat() * useString.length());
            stringBuilder.append(useString.charAt(index));
        }
        generated = stringBuilder.toString();
    }
}
