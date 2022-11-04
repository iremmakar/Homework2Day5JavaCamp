package kodlama.io.programmingLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageSubTechnologyService;
import kodlama.io.programmingLanguage.business.repsonse.GetAllProgrammingLanguageSubTechnologyResponse;
import kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageSubTechnologyRequest;
import kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageSubTechnologyRepository;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguageSubTechnology;


@Service
public class ProgrammingLanguageSubTechnologyManager implements ProgrammingLanguageSubTechnologyService{

	private ProgrammingLanguageSubTechnologyRepository programmingLanguageSubTechnologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	
	@Autowired
	public ProgrammingLanguageSubTechnologyManager(
			ProgrammingLanguageSubTechnologyRepository programmingLanguageSubTechnologyRepository,
			ProgrammingLanguageRepository programmingLanguageRepository) {
		
		this.programmingLanguageSubTechnologyRepository = programmingLanguageSubTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageSubTechnologyResponse> getAll() {
		
		List<ProgrammingLanguageSubTechnology> programmingLanguageSubTechnologies =programmingLanguageSubTechnologyRepository.findAll();
		List<GetAllProgrammingLanguageSubTechnologyResponse> programmingLanguageSubTechnologyResponse = new ArrayList<GetAllProgrammingLanguageSubTechnologyResponse>();
		
		for(ProgrammingLanguageSubTechnology programmingLanguageSubTechnology: programmingLanguageSubTechnologies) {
			GetAllProgrammingLanguageSubTechnologyResponse responseItem = new GetAllProgrammingLanguageSubTechnologyResponse();
			responseItem.setSubTechId(programmingLanguageSubTechnology.getSubTechId());
			responseItem.setSubTechName(programmingLanguageSubTechnology.getSubTechName());
			responseItem.setLanguageId(programmingLanguageSubTechnology.getProgrammingLanguage().getLanguageId());
			programmingLanguageSubTechnologyResponse.add(responseItem);
		}
	
		return programmingLanguageSubTechnologyResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageRequest) {
		ProgrammingLanguageSubTechnology programmingLanguageSubTechnology = new ProgrammingLanguageSubTechnology();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getById(createProgrammingLanguageRequest.getLanguageId());
		programmingLanguageSubTechnology.setSubTechName(createProgrammingLanguageRequest.getSubTechName());
		programmingLanguageSubTechnology.setProgrammingLanguage(programmingLanguage);
		programmingLanguageSubTechnologyRepository.save(programmingLanguageSubTechnology);
		
	}

	@Override
	public void delete(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest) {
		ProgrammingLanguageSubTechnology programmingLanguageSubTechnology = new ProgrammingLanguageSubTechnology();
		programmingLanguageSubTechnology.setSubTechName(createProgrammingLanguageSubTechnologyRequest.getSubTechName());
		programmingLanguageSubTechnology.setSubTechId(createProgrammingLanguageSubTechnologyRequest.getId());
		this.programmingLanguageSubTechnologyRepository.delete(programmingLanguageSubTechnology);
		
	}

	@Override
	public void update(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest) {
		ProgrammingLanguageSubTechnology programmingLanguageSubTechnology = new ProgrammingLanguageSubTechnology();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getById(createProgrammingLanguageSubTechnologyRequest.getLanguageId());

		programmingLanguageSubTechnology.setSubTechId(createProgrammingLanguageSubTechnologyRequest.getId());
		programmingLanguageSubTechnology.setSubTechName(programmingLanguageSubTechnology.getSubTechName());
		programmingLanguageSubTechnology.setProgrammingLanguage(programmingLanguage);
		
		programmingLanguageSubTechnologyRepository.save(programmingLanguageSubTechnology);
		
		
		
		
		
	}

}