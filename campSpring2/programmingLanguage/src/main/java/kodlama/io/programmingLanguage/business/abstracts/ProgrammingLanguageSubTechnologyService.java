package kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.business.repsonse.GetAllProgrammingLanguageSubTechnologyResponse;
import kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageSubTechnologyRequest;

public interface ProgrammingLanguageSubTechnologyService {
	List<GetAllProgrammingLanguageSubTechnologyResponse> getAll();
	void add(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageRequest);
	void delete(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest);
	void update(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest);
	
}