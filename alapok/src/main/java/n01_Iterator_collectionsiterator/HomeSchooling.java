package n01_Iterator_collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class HomeSchooling {
    private TreeSet<OnlineLesson> onlineLessonsList = new TreeSet<OnlineLesson>(new ComparatorForOnlineLessons());

    public void addNewLesson(OnlineLesson lesson){
        onlineLessonsList.add(lesson);
    }

    public TreeSet<OnlineLesson> getLessonsByTitle(String title){
        TreeSet<OnlineLesson> specifiedOnlineLessonsList = new TreeSet<OnlineLesson>(new ComparatorForOnlineLessons());
        Iterator<OnlineLesson> iterator = onlineLessonsList.iterator();

        OnlineLesson lesson;
        String lessonName;
        while (iterator.hasNext()) {
            lesson=iterator.next();
            lessonName = lesson.getLessonTitle();
            if (lessonName.equals(title)) {
               specifiedOnlineLessonsList.add(lesson);
            }
        }
        return specifiedOnlineLessonsList;
    }

    public void removeLesson(LocalDateTime startTime){
        Iterator<OnlineLesson> iterator = onlineLessonsList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getStartTime().equals(startTime)) {
                iterator.remove();;
            }
        }
    }

    public List<OnlineLesson> getLessons() {
        List<OnlineLesson> lessonsList=new ArrayList<>();
        for(OnlineLesson onlineLesson:onlineLessonsList){
            lessonsList.add(onlineLesson);
        }
        return lessonsList;
    }
}
