/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Acknowledgement of exempt instruction specifying whether the documentation
 * will be sent to DTCC or not (not maintained by DTCC).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementOfExemption1Choice#mmDocumentationWillBeSentIndicator
 * AcknowledgementOfExemption1Choice.mmDocumentationWillBeSentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementOfExemption1Choice#mmDocumentationWillNotBeSentIndicator
 * AcknowledgementOfExemption1Choice.mmDocumentationWillNotBeSentIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcknowledgementOfExemption1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTCC or not (not maintained by DTCC)."
 * </li>
 * </ul>
 */
public class AcknowledgementOfExemption1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator documentationWillBeSentIndicator;
	/**
	 * Acknowledgement of exempt instruction specifying that the documentation
	 * will be sent to DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementOfExemption1Choice
	 * AcknowledgementOfExemption1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmnttnWillBeSntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationWillBeSentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of exempt instruction specifying that the documentation will be sent to DTC  (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDocumentationWillBeSentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcknowledgementOfExemption1Choice.mmObject();
			isDerived = false;
			xmlTag = "DcmnttnWillBeSntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentationWillBeSentIndicator";
			definition = "Acknowledgement of exempt instruction specifying that the documentation will be sent to DTC  (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator documentationWillNotBeSentIndicator;
	/**
	 * Acknowledgement of exempt instruction specifying that the documentation
	 * will not be sent to DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementOfExemption1Choice
	 * AcknowledgementOfExemption1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmnttnWillNotBeSntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationWillNotBeSentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of exempt instruction specifying that the documentation will not be sent to DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDocumentationWillNotBeSentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcknowledgementOfExemption1Choice.mmObject();
			isDerived = false;
			xmlTag = "DcmnttnWillNotBeSntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentationWillNotBeSentIndicator";
			definition = "Acknowledgement of exempt instruction specifying that the documentation will not be sent to DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcknowledgementOfExemption1Choice.mmDocumentationWillBeSentIndicator, AcknowledgementOfExemption1Choice.mmDocumentationWillNotBeSentIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AcknowledgementOfExemption1Choice";
				definition = "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTCC or not (not maintained by DTCC).";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getDocumentationWillBeSentIndicator() {
		return documentationWillBeSentIndicator;
	}

	public void setDocumentationWillBeSentIndicator(YesNoIndicator documentationWillBeSentIndicator) {
		this.documentationWillBeSentIndicator = documentationWillBeSentIndicator;
	}

	public YesNoIndicator getDocumentationWillNotBeSentIndicator() {
		return documentationWillNotBeSentIndicator;
	}

	public void setDocumentationWillNotBeSentIndicator(YesNoIndicator documentationWillNotBeSentIndicator) {
		this.documentationWillNotBeSentIndicator = documentationWillNotBeSentIndicator;
	}
}