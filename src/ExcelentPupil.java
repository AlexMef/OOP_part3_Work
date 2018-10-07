public class ExcelentPupil extends Pupil {

    ExcelentPupil(String name) {
        super(name);
    }

    @Override
    void Study() {
        System.out.println(getName() + "  Study more!!!");
    }

    @Override
    void Write() {
        System.out.println(getName() + "  Write a lot!!!");
    }

    @Override
    void Relax() {
        System.out.println(getName() + "  No relax");
    }




}
