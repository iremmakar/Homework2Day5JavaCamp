package kodlama.io.programmingLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguage.business.repsonse.GetAllProgrammingLanguagesResponse;
import kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for(ProgrammingLanguage programmingLanguage:programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setLanguageId(programmingLanguage.getLanguageId());
			responseItem.setLanguageName(programmingLanguage.getLanguageName());
			programmingLanguagesResponse.add(responseItem);
		}
		
		
		
		return programmingLanguagesResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setLanguageName(createProgrammingLanguageRequest.getLanguageName());
		this.programmingLanguageRepository.save(programmingLanguage);
	
	}

	@Override
	public void delete(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setLanguageId(createProgrammingLanguageRequest.getId());
		programmingLanguage.setLanguageName(createProgrammingLanguageRequest.getLanguageName());
		this.programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public void update(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setLanguageName(createProgrammingLanguageRequest.getLanguageName());
		programmingLanguage.setLanguageId(createProgrammingLanguageRequest.getId());
		programmingLanguageRepository.save(programmingLanguage);
		
		
		
	}
	

}
