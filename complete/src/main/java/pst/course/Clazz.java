package pst.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by uengine on 2018. 1. 6..
 */
@Entity
public class Clazz {

    @Id
    @GeneratedValue
    Long id;
    String states;
    int evaluationRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public int getEvaluationRate() {
        return evaluationRate;
    }

    public void setEvaluationRate(int evaluationRate) {
        this.evaluationRate = evaluationRate;
    }
}
