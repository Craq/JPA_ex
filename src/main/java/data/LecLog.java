package data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class LecLog {
    @Id @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "lecturer_fk", nullable = false)
    private Lecturers lecturer;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "lec_fk")
    private List<Lecture> lectures;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Lecturers getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturers lecturer) {
        this.lecturer = lecturer;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }
}
