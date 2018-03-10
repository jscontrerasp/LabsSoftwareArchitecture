package arqsoft.course.model;

import javax.persistence.*;

@Entity
@Table(name = "courses")
@NamedQueries({
  @NamedQuery(name = Course.FIND_ALL, query = "SELECT u FROM Course u")})
public class Course {

    public static final String FIND_ALL = "Course.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long credits;
    private Long code;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }

    public String getName(){
      return name;
    }
    public void setName(String name){
      this.name = name;
    }

    public Long getCredits() {
        return credits;
    }
    public void setCredits(Long credits) {
        this.credits = credits;
    }
}
