package models;

import java.util.ArrayList;
import java.util.List;

public class CriteriaWorkflowMatchTag implements Criteria<Workflow> {
    private long tagId;

    public CriteriaWorkflowMatchTag(long tagId) {
        this.tagId = tagId;
    }

    @Override
    public List<Workflow> meetCriteria(List<Workflow> objects) {
        List<Workflow> workflows = new ArrayList<>();
        for (Workflow workflow: objects) {
            for (Tag tag: workflow.getTags()) {
                if (tag.getId() == tagId) {
                    workflows.add(workflow);
                    break;
                }
            }
        }
        return workflows;
    }
}
