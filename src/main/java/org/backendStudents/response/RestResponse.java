package org.backendStudents.response;

import org.backendStudents.model.Student;

import java.util.List;


public class RestResponse extends StatusResponse {


    private List<Student> data;

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RestResponse{" +
                "data=" + data +
                '}';
    }
}
