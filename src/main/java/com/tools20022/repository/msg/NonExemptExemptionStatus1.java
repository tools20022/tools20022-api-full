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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
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
 * Non-exempt beneficial owner exemption information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExemptExemptionStatus1#mmAcknowledgementOfNonExemptIndicator
 * NonExemptExemptionStatus1.mmAcknowledgementOfNonExemptIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonExemptExemptionStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Non-exempt beneficial owner exemption information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonExemptExemptionStatus1", propOrder = "acknowledgementOfNonExemptIndicator")
public class NonExemptExemptionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AckOfNonXmptInd", required = true)
	protected YesNoIndicator acknowledgementOfNonExemptIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.NonExemptExemptionStatus1
	 * NonExemptExemptionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckOfNonXmptInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Acknowledgement Of Non Exempt Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementOfNonExemptIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of the status on non exempt on interest penalties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonExemptExemptionStatus1, YesNoIndicator> mmAcknowledgementOfNonExemptIndicator = new MMMessageAttribute<NonExemptExemptionStatus1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NonExemptExemptionStatus1.mmObject();
			isDerived = false;
			xmlTag = "AckOfNonXmptInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Acknowledgement Of Non Exempt Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementOfNonExemptIndicator";
			definition = "Acknowledgement of the status on non exempt on interest penalties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(NonExemptExemptionStatus1 obj) {
			return obj.getAcknowledgementOfNonExemptIndicator();
		}

		@Override
		public void setValue(NonExemptExemptionStatus1 obj, YesNoIndicator value) {
			obj.setAcknowledgementOfNonExemptIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonExemptExemptionStatus1.mmAcknowledgementOfNonExemptIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonExemptExemptionStatus1";
				definition = "Non-exempt beneficial owner exemption information.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAcknowledgementOfNonExemptIndicator() {
		return acknowledgementOfNonExemptIndicator;
	}

	public NonExemptExemptionStatus1 setAcknowledgementOfNonExemptIndicator(YesNoIndicator acknowledgementOfNonExemptIndicator) {
		this.acknowledgementOfNonExemptIndicator = Objects.requireNonNull(acknowledgementOfNonExemptIndicator);
		return this;
	}
}