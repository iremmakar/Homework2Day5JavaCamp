package kodlama.io.programmingLanguage.business.repsonse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguageSubTechnologyResponse {
	private int subTechId;
	private String subTechName;
	private int languageId;

}
