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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcknowledgementOfExemption1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acknowledgement of exempt instruction specifying whether the documentation will be sent to DTCC or not (not maintained by DTCC)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcknowledgementOfExemption1Choice", propOrder = {"documentationWillBeSentIndicator", "documentationWillNotBeSentIndicator"})
public class AcknowledgementOfExemption1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DcmnttnWillBeSntInd", required = true)
	protected YesNoIndicator documentationWillBeSentIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationWillBeSentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of exempt instruction specifying that the documentation will be sent to DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Documentation Will Be Sent Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcknowledgementOfExemption1Choice, YesNoIndicator> mmDocumentationWillBeSentIndicator = new MMMessageAttribute<AcknowledgementOfExemption1Choice, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AcknowledgementOfExemption1Choice.mmObject();
			isDerived = false;
			xmlTag = "DcmnttnWillBeSntInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Documentation Will Be Sent Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentationWillBeSentIndicator";
			definition = "Acknowledgement of exempt instruction specifying that the documentation will be sent to DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AcknowledgementOfExemption1Choice obj) {
			return obj.getDocumentationWillBeSentIndicator();
		}

		@Override
		public void setValue(AcknowledgementOfExemption1Choice obj, YesNoIndicator value) {
			obj.setDocumentationWillBeSentIndicator(value);
		}
	};
	@XmlElement(name = "DcmnttnWillNotBeSntInd", required = true)
	protected YesNoIndicator documentationWillNotBeSentIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationWillNotBeSentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of exempt instruction specifying that the documentation will not be sent to DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Documentation Will Not Be Sent Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcknowledgementOfExemption1Choice, YesNoIndicator> mmDocumentationWillNotBeSentIndicator = new MMMessageAttribute<AcknowledgementOfExemption1Choice, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AcknowledgementOfExemption1Choice.mmObject();
			isDerived = false;
			xmlTag = "DcmnttnWillNotBeSntInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Documentation Will Not Be Sent Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentationWillNotBeSentIndicator";
			definition = "Acknowledgement of exempt instruction specifying that the documentation will not be sent to DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AcknowledgementOfExemption1Choice obj) {
			return obj.getDocumentationWillNotBeSentIndicator();
		}

		@Override
		public void setValue(AcknowledgementOfExemption1Choice obj, YesNoIndicator value) {
			obj.setDocumentationWillNotBeSentIndicator(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AcknowledgementOfExemption1Choice.mmDocumentationWillBeSentIndicator,
						com.tools20022.repository.choice.AcknowledgementOfExemption1Choice.mmDocumentationWillNotBeSentIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public AcknowledgementOfExemption1Choice setDocumentationWillBeSentIndicator(YesNoIndicator documentationWillBeSentIndicator) {
		this.documentationWillBeSentIndicator = Objects.requireNonNull(documentationWillBeSentIndicator);
		return this;
	}

	public YesNoIndicator getDocumentationWillNotBeSentIndicator() {
		return documentationWillNotBeSentIndicator;
	}

	public AcknowledgementOfExemption1Choice setDocumentationWillNotBeSentIndicator(YesNoIndicator documentationWillNotBeSentIndicator) {
		this.documentationWillNotBeSentIndicator = Objects.requireNonNull(documentationWillNotBeSentIndicator);
		return this;
	}
}