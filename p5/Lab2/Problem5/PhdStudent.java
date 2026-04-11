public class PhdStudent extends PersonP {
    private String researchTopic;

    public PhdStudent(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() { return researchTopic; }

    @Override
    public String getOccupation() {
        return "PhD Student, research: " + researchTopic;
    }

    @Override
    public void assignPet(Animalz pet) {
        if (pet instanceof DogSub)
            throw new IllegalArgumentException(
                getName() + " is a PhD student and cannot take care of a Dog.");
        super.assignPet(pet);
    }
}