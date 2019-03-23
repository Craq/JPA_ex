package data;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class AudID {
    private String lecturer;
    private String room;

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudID audID = (AudID) o;
        return Objects.equals(lecturer, audID.lecturer) &&
                Objects.equals(room, audID.room);
    }

    @Override
    public int hashCode() {

        return Objects.hash(lecturer, room);
    }
}
