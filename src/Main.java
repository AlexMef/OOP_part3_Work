public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(new ExcelentPupil("Kate"), new GoodPupil("Andrew"), new BadPupil("Serge"));
        classRoom.getStudy();
    }
}
