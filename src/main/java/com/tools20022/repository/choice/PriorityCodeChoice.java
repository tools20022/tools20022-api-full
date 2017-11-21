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
import com.tools20022.repository.codeset.Priority1Code;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Priority is expressed as a code or a text.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PriorityCodeChoice#mmCode
 * PriorityCodeChoice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriorityCodeChoice#mmProprietaryCode
 * PriorityCodeChoice.mmProprietaryCode}</li>
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
 * "PriorityCodeChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Priority is expressed  as a code or a text."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriorityCodeChoice", propOrder = {"code", "proprietaryCode"})
public class PriorityCodeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Priority1Code code;
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment instruction to apply to the processing of the
	 * payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority1Code
	 * Priority1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPriority
	 * Payment.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriorityCodeChoice
	 * PriorityCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> PriorityCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Priority1Code.mmObject();
		}
	};
	protected Max4AlphaNumericText proprietaryCode;
	/**
	 * Priority code bilaterally defined between parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriorityCodeChoice
	 * PriorityCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority code bilaterally defined between parties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PriorityCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "PrtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryCode";
			definition = "Priority code bilaterally defined between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PriorityCodeChoice.mmCode, PriorityCodeChoice.mmProprietaryCode);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PriorityCodeChoice";
				definition = "Priority is expressed  as a code or a text.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cd", required = true)
	public Priority1Code getCode() {
		return code;
	}

	public void setCode(Priority1Code code) {
		this.code = code;
	}

	@XmlElement(name = "PrtryCd", required = true)
	public Max4AlphaNumericText getProprietaryCode() {
		return proprietaryCode;
	}

	public void setProprietaryCode(Max4AlphaNumericText proprietaryCode) {
		this.proprietaryCode = proprietaryCode;
	}
}