package kodlama.io.programmingLanguage.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguageSubTechnology;

public interface ProgrammingLanguageSubTechnologyRepository extends JpaRepository<ProgrammingLanguageSubTechnology,Integer>{

}
