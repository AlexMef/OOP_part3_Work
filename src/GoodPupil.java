public class GoodPupil extends Pupil {

    GoodPupil(String name){
        super(name);
    }

    @Override
    void Study() {
        System.out.println(getName() + "  Study a bit");
    }

    @Override
    void Write() {
        System.out.println(getName() + "  Write a bit");
    }

    @Override
    void Relax() {
        System.out.println(getName() + "  Relax more");
    }
}
