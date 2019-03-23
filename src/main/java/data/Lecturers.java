package data;

import javax.persistence.*;
import java.util.Date;

@Entity
@SecondaryTables({
        @SecondaryTable(name = "Aud"),
        @SecondaryTable(name = "Lecturers")

})
public class Lecturers {
    @EmbeddedId
    private Long ID;
    @Column(table = "Lecturers")
    private String lecturer;
    @Column(table = "Aud")
    private Integer room;
    @Temporal(TemporalType.DATE)
    private Date dateOfLecture;


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
