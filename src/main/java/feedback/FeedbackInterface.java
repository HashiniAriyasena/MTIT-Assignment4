package feedback;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedbackInterface extends CrudRepository<Feedback,Long> {

    List<Feedback> findById(Integer id);


    // List<Feedback> findAll(Integer id);



}
