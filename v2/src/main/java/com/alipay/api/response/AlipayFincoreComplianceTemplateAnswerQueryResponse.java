package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateAnswerDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.answer.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:32:07
 */
public class AlipayFincoreComplianceTemplateAnswerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7897133137371944841L;

	/** 
	 * 模版答题要素
	 */
	@ApiListField("answers")
	@ApiField("template_answer_d_t_o")
	private List<TemplateAnswerDTO> answers;

	public void setAnswers(List<TemplateAnswerDTO> answers) {
		this.answers = answers;
	}
	public List<TemplateAnswerDTO> getAnswers( ) {
		return this.answers;
	}

}
