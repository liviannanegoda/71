import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class flow implements Iterable<StudyGroup> {
    private List<StudyGroup> StudyGroup = new ArrayList<>();

    public void addgroup(StudyGroup group) {
        studyGroups.add(group);
    }

    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {
    public int compare(Flow flow1, Flow flow2) {
        return Integer.compare(flow1.studyGroups.size(), flow2.studyGroups.size());
    }
}

import java.util.Collections;
import java.util.List;

public class FlowService {
    public void sortStreams(List<Flow> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}



import java.util.List;

public class Controller {
    private FlowService potokService;

    public Controller(FlowService potokService) {
        this.potokService = potokService;
    }

    public void sortStreams(List<Flow> streams) {
        potokService.sortStreams(streams);
    }
}
