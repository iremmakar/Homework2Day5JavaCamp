package kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.business.repsonse.GetAllProgrammingLanguagesResponse;
import kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	void delete(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	void update(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	
}
