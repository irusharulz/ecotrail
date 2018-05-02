package org.gdgsrilanka.ecotrail.api.questions;

public interface    Question {
    public String getQuestion();

    /**
     * A unique question number for the question generated by this type.
     * @return
     */
    public String getID();

    /**
     * Finds the answer for a question number identified by the ID
     * @param id
     * @return
     */
    public String getAnswer(String id);

}
