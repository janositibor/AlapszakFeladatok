package n01_Iterator_collectionsiterator;

import java.util.Comparator;

    class ComparatorForOnlineLessons implements Comparator<OnlineLesson> {
        @Override
        public int compare(OnlineLesson onlineLesson1, OnlineLesson onlineLesson2) {
            if(onlineLesson1.getStartTime().isAfter(onlineLesson2.getStartTime())){
                return 1;
            } else {
                return -1;
            }
        }
    }
