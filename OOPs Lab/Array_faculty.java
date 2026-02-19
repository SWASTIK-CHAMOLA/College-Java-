class ArrayList {
    //store faculty objects with attributes name, department and experienceYears
    String[] facultyList;
    public ArrayList() {
        facultyList = new String[10]; //initial size of the array
    }
    public void addFaculty(String faculty) {
        for (int i = 0; i < facultyList.length; i++) {
            if (facultyList[i] == null) {
                facultyList[i] = faculty;
                break;
            }
        }
    }
}

public class Question {
    public static void main(String[] args) {
        ArrayList facultyArrayList = new ArrayList();
        facultyArrayList.addFaculty("Aryan, Computer Science, 10 years");
        facultyArrayList.addFaculty("Sagar Deb, AIML, 8 years");
        facultyArrayList.addFaculty("Raju, Advanced Engineering, 12 years");
        facultyArrayList.addFaculty("Ayush Gujjar, School of Design, 5 years");

        facultyArrayList.addFaculty("Aryan, Data Science, 10 years");
        
        facultyArrayList.addFaculty("Raju, null, null");
        
        for (int i = 0; i < facultyArrayList.facultyList.length; i++) {
            if (facultyArrayList.facultyList[i] != null) {
                System.out.println(facultyArrayList.facultyList[i]);
            }
        }
    }
}
