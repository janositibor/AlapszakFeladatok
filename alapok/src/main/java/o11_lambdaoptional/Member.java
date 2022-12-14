package o11_lambdaoptional;

import java.util.List;

public class Member {
    private String name;
    private List<String> skills;
    private Gender gender;

    public Member(String name, List<String> skills, Gender gender) {
        this.name = name;
        this.skills = skills;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Gender getGender() {
        return gender;
    }
}
