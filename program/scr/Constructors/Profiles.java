package Constructors;

import Controllers.Profile;


import java.util.ArrayList;

public class Profiles {

    ArrayList<Profile> profiles;

    public Profiles() {
        profiles = new ArrayList<>();
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }
}
