package models;

import java.util.ArrayList;
import java.util.List;

public class CriteriaWorkflowMatchTitle implements Criteria<Workflow> {
    private String title;

    public CriteriaWorkflowMatchTitle(String title) {
        this.title = title.toLowerCase();
    }

    @Override
    public List<Workflow> meetCriteria(List<Workflow> objects) {
        List<Workflow> workflows = new ArrayList<>();
        System.out.println("Inside meet criteria for workflows");
        for (Workflow workflow: objects) {
            System.out.println("Workflow title: " + workflow.getWfTitle());
            if (workflow.getWfTitle() != null && workflow.getWfTitle().toLowerCase().contains(title)) {
                workflows.add(workflow);
            }
        }
        return workflows;
    }
}
