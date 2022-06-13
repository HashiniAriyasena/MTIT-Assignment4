import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/feedbackService")
public class FeedbackController {

    @Autowired
    public FeedbackInterface feedbackInterface;

    @GetMapping(path = "/viewfeedbacks")
    public ResponseEntity<List<Feedback>> viewfeedback(@RequestParam Integer id){

        return new ResponseEntity<List<Feedback>>(feedbackInterface.findById(id), HttpStatus.OK);
    }

}
