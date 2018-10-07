public class BadPupil extends Pupil {

    BadPupil(String name){
        super(name);
    }

    @Override
    void Study() {
        System.out.println(getName() + "  Don't study");
    }

    @Override
    void Write() {
        System.out.println(getName() + "  Don't write");
    }

    @Override
    void Relax() {
        System.out.println(getName() + "  Let's play dota");
    }
}
