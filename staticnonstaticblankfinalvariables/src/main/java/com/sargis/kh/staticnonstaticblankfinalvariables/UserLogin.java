package com.sargis.kh.staticnonstaticblankfinalvariables;

public class UserLogin {

    public static final long GUEST_ID = -1;
//    private static final long USER_ID;
    private static final long USER_ID_2 = getUserIdOrGuest();

    private static long getUserIdOrGuest() {
        try {
            return getID();
        } catch (IdNotFound e) {
            System.out.println("Logging in as guest");
            return GUEST_ID;
        }
    }

//    A blank final field can be assigned only at points in the program where it is definitely unassigned.
//    static {
//        try {
//            USER_ID = getID();
//        } catch (IdNotFound e) {
//            USER_ID = GUEST_ID;
//            System.out.println("Logging in as guest");
//        }
//    }

    private static long getID() throws IdNotFound {
        throw new IdNotFound();
    }

    public static void main(String[] args) {
//        System.out.println("User ID: " + USER_ID);
        System.out.println("User ID_2: " + USER_ID_2);
    }

}