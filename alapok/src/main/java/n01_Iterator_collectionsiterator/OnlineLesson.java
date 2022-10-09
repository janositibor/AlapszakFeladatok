package n01_Iterator_collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {
    private String teacherName;
    private String lessonName;
    private LocalDateTime dateAndTime;

    public OnlineLesson(String teacherName, String lessonName, LocalDateTime dateAndTime) {
        this.teacherName = teacherName;
        this.lessonName = lessonName;
        this.dateAndTime = dateAndTime;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getLessonTitle() {
        return lessonName;
    }

    public LocalDateTime getStartTime() {
        return dateAndTime;
    }

    @Override
    public String toString() {
        return "OnlineLesson{" +
                "teacherName='" + teacherName + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", dateAndTime=" + dateAndTime +
                '}';
    }
}
