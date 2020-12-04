package eventsapplicationproject.eventsapp.event;

import eventsapplicationproject.eventsapp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EventController {
    private final EventService eventService;

    private EventRepository repo;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/list")
    public String eventList(Model model) {
        model.addAttribute("event", eventService.getEvent());
        return "/event/list";
    }
    @GetMapping("/show/{id}")
    public String showEvent(@PathVariable long id, Model model) {
        Event event = eventService.getEvent(id);
        model.addAttribute("event", event);
        return "/event/details";
    }
    @GetMapping("/add")
    public String addEvent(Model model) {
        model.addAttribute("event", new Event());
        return "/event/add_event";
    }
    @PostMapping("/add")
    public String addUser(Event event) {
        eventService.addEvent(event);
        repo.save(event);
        return "redirect:/event/list";
    }
    @GetMapping("/delete/{id}")
    public String deleteEvent(@PathVariable long id) {
        eventService.deleteEvent(id);
        return "redirect:/event/list";
    }
//    @GetMapping("/update/{id}")
//    public String updateEvent(@PathVariable long id, Model model) {
//        Event event = eventService.getEvent(id);
//        model.addAttribute("event", event);
//        return "/event/edit";
//    }
//    @PostMapping("/update")
//    public String updateEvent(Event event) {
//        eventService.updateEvent(event);
//        return "redirect:/event/list";
//    }



}
