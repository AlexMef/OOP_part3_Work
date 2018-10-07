import java.util.ArrayList;

public class ClassRoom {
    //    private Pupil pupil_1;
//    private Pupil pupil_2;
//    private Pupil pupil_3;
//    private Pupil pupil_4;
    private ArrayList<Pupil> pupils = new ArrayList<>();

    ClassRoom(Pupil pupil_1, Pupil pupil_2) {
        pupils.add(pupil_1);
        pupils.add(pupil_2);
    }

    ClassRoom(Pupil pupil_1, Pupil pupil_2, Pupil pupil_3) {
        pupils.add(pupil_1);
        pupils.add(pupil_2);
        pupils.add(pupil_3);
    }

    ClassRoom(Pupil pupil_1, Pupil pupil_2, Pupil pupil_3, Pupil pupil_4) {
        pupils.add(pupil_1);
        pupils.add(pupil_2);
        pupils.add(pupil_3);
        pupils.add(pupil_4);
    }

    void getStudy() {
        for (Pupil pupil : pupils) {
            pupil.Study();
        }
    }

    void getWrite() {
        for (Pupil pupil : pupils) {
            pupil.Write();
        }
    }

    void getRelax() {
        for (Pupil pupil : pupils) {
            pupil.Relax();
        }
    }


}
