package access_modifiers;

import com.sun.tools.javac.Main;

public class LevelTestSamePackage {
    //public,protected,default,private ulaşabilme deneme
    //aynı paket farklı sınıf private olmaz sadece

    public static void main(String[] args) {
        AccessLevel accessLevel=new AccessLevel();
        System.out.println(accessLevel.publicString());
        System.out.println(accessLevel.publicInt());
        System.out.println(accessLevel.protectedString());
        System.out.println(accessLevel.defaultString());
       // System.out.println(accessLevel.);

    }

}

