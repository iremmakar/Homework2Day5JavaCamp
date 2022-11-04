package kodlama.io.programmingLanguage.webApi.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguage.business.repsonse.GetAllProgrammingLanguagesResponse;
import kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		this.programmingLanguageService.add(createProgrammingLanguageRequest);
	}
	
	@PostMapping("/delete")
	public void delete(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		this.programmingLanguageService.delete(createProgrammingLanguageRequest);
	}
	
	@PostMapping("/update")
	public void update(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		this.programmingLanguageService.update(createProgrammingLanguageRequest);
	}
	
	
	

}
