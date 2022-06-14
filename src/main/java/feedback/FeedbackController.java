package feedback;

import feedback.Feedback;
import feedback.FeedbackInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/feedbackService")
public class FeedbackController {

    @Autowired
    public FeedbackInterface feedbackInterface;

    @GetMapping("/viewfeedbacks")
    public List<Feedback> getAllFeedbacks(){
        return (List<Feedback>) feedbackInterface.findAll();
    }

    @PostMapping("/addfeedback")
    public Feedback createFeedback(@RequestBody Feedback feedback){
        return feedbackInterface.save(feedback);
    }

  //  @PutMapping("/feedback/{id}")
  //  public ResponseEntity<Feedback> updateFeedback(@PathVariable(value = "id")Long id,
  //      @RequestBody Feedback feedbackDetails) throws ConfigDataResourceNotFoundException  {
  //      Feedback feedback =  feedbackInterface.findById(id)
    //            .orElseThrow(() ->new ConfigDataResourceNotFoundException("Feedback not found for this id :: "  + id));

    //    feedback.setName(feedbackDetails.getName());
    //    feedback.setEmail(feedbackDetails.getEmail());
    //    feedback.setRate(feedbackDetails.getRate());
   //     feedback.setFeedback(feedbackDetails.getFeedback());
   //     final Feedback updatedFeedback = feedbackInterface.save(feedback);
  //      return ResponseEntity.ok(updatedFeedback);
  //  }

   // @DeleteMapping(value = "/feedback/{id}")
    //public Map<String,Boolean> deleteFeedback(@PathVariable Long id)
      //      throws ConfigDataResourceNotFoundException{
        //Feedback feedback = feedbackInterface.findById(id)
          //      .orElseThrow(()->new ConfigDataResourceNotFoundException("Not found" + id));

        //feedbackInterface.delete(id);
        //Map<String,Boolean> response = new HashMap<>();
        //response.put("deleted",Boolean.TRUE);
    //}



}
