package kodlama.io.programmingLanguage.webApi.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageSubTechnologyService;
import kodlama.io.programmingLanguage.business.repsonse.GetAllProgrammingLanguageSubTechnologyResponse;
import kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageSubTechnologyRequest;

@RestController
@RequestMapping("/api/subTechnologies")
public class ProgrammingLanguageSubTechnologiesController {
	
	private ProgrammingLanguageSubTechnologyService programmingLanguageSubTechnologiesService;
	
	@Autowired
	public ProgrammingLanguageSubTechnologiesController(
			ProgrammingLanguageSubTechnologyService programmingLanguageSubTechnologiesService) {
		super();
		this.programmingLanguageSubTechnologiesService = programmingLanguageSubTechnologiesService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllProgrammingLanguageSubTechnologyResponse> getAll(){
		return programmingLanguageSubTechnologiesService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest) {
		this.programmingLanguageSubTechnologiesService.add(createProgrammingLanguageSubTechnologyRequest);
	}
	
	@PostMapping("/delete")
	public void delete(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest) {
		this.programmingLanguageSubTechnologiesService.delete(createProgrammingLanguageSubTechnologyRequest);
	}
	
	@PostMapping("/update")
	public void update(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest) {
		this.programmingLanguageSubTechnologiesService.update(createProgrammingLanguageSubTechnologyRequest);
	}
	

}
