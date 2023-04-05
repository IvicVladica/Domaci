package Nedelja8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class UrosResenje {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> userList = new ArrayList<>();
            ArrayList<String> emailList = new ArrayList<>();
            createFiles(userList, emailList);
            while (true) {
                System.out.println("Enter username to get his email or stop to exit: ");
                String username = scanner.nextLine();
                if (username.equals("stop")) {
                    break;
                }
                int possition = -1;
                if (userList.contains(username)) {
                    possition = userList.indexOf(username);
                } else {
                    System.out.println("No user in the database!");
                }
                if (possition != -1) {
                    System.out.println(emailList.get(possition));
                }
            }
        }

        public static void createUserFile(String username) {
            BufferedWriter users = null;
            try {
                users = new BufferedWriter(new FileWriter("usernames.txt", true));
                users.write(username + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (users != null) {
                    try {
                        users.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public static void createUserEmailFile(String user_email) {
            BufferedWriter user_emails = null;
            try {
                user_emails = new BufferedWriter(new FileWriter("user_emails.txt", true));
                user_emails.write(user_email + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (user_emails != null) {
                    try {
                        user_emails.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public static void createFiles(ArrayList<String> usernameList, ArrayList<String> emailList) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter username: ");
                String username = scanner.nextLine();
                usernameList.add(username);
                createUserFile(username);
                System.out.println("Enter user email");
                String userEmail = scanner.nextLine();
                emailList.add(userEmail);
                createUserEmailFile(userEmail);
                System.out.println("Enter stop to exit or next to add user and email!");
                String exit = scanner.nextLine();
                if (exit.equals("stop")) {
                    break;
                }
            }
        }

    }









