package Day6.Q1;

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        setName(name);
        setAge(age);
        this.course = course;
    }

    // Setter for age with exception handling
    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }
        this.age = age;
    }

    // Setter for name with exception handling
    public void setName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains invalid characters.");
        }
        this.name = name;
    }

    // Getters for the attributes
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

