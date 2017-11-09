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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AcknowledgementOfExemption1Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Incompetent beneficial owner exemption information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncompetentExemptionStatus1#mmDocumentationAcknowledgementOfExemption
 * IncompetentExemptionStatus1.mmDocumentationAcknowledgementOfExemption}</li>
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
 * "IncompetentExemptionStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Incompetent beneficial owner exemption information."</li>
 * </ul>
 */
public class IncompetentExemptionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AcknowledgementOfExemption1Choice documentationAcknowledgementOfExemption;
	/**
	 * Acknowledgement of exempt instruction specifying whether the
	 * documentation will be sent to DTC (The Depository Trust Corporation) or
	 * not (not maintained by DTCC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementOfExemption1Choice
	 * AcknowledgementOfExemption1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncompetentExemptionStatus1
	 * IncompetentExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmnttnAckOfXmptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationAcknowledgementOfExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTC  (The Depository Trust Corporation) or not (not maintained by DTCC)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDocumentationAcknowledgementOfExemption = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IncompetentExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "DcmnttnAckOfXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentationAcknowledgementOfExemption";
			definition = "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTC  (The Depository Trust Corporation) or not (not maintained by DTCC).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgementOfExemption1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IncompetentExemptionStatus1.mmDocumentationAcknowledgementOfExemption);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IncompetentExemptionStatus1";
				definition = "Incompetent beneficial owner exemption information.";
			}
		});
		return mmObject_lazy.get();
	}

	public AcknowledgementOfExemption1Choice getDocumentationAcknowledgementOfExemption() {
		return documentationAcknowledgementOfExemption;
	}

	public void setDocumentationAcknowledgementOfExemption(AcknowledgementOfExemption1Choice documentationAcknowledgementOfExemption) {
		this.documentationAcknowledgementOfExemption = documentationAcknowledgementOfExemption;
	}
}