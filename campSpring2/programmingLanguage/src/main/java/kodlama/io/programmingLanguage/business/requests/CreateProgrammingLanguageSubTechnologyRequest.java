package kodlama.io.programmingLanguage.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingLanguageSubTechnologyRequest {
	private String subTechName;
	private int languageId;
	private int id;
	
}
