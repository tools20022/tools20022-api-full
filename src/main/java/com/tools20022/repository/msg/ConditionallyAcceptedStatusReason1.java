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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1#mmStructured
 * ConditionallyAcceptedStatusReason1.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1#mmAdditionalInformation
 * ConditionallyAcceptedStatusReason1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConditionallyAcceptedStatusReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for a conditionally accepted status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ConditionallyAcceptedStatusReason1", propOrder = {"structured", "additionalInformation"})
public class ConditionallyAcceptedStatusReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ConditionallyAcceptedStatusReason1Code> structured;
	/**
	 * Reason for a conditionally accepted status in structured form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code
	 * ConditionallyAcceptedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1
	 * ConditionallyAcceptedStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Strd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Structured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for a conditionally accepted status in structured form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStructured = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> ConditionallyAcceptedStatusReason1.mmObject();
			isDerived = false;
			xmlTag = "Strd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Structured";
			definition = "Reason for a conditionally accepted status in structured form.";
			maxOccurs = 4;
			minOccurs = 1;
			simpleType_lazy = () -> ConditionallyAcceptedStatusReason1Code.mmObject();
		}
	};
	protected Max350Text additionalInformation;
	/**
	 * Reason for a conditionally accepted status in free format text.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1
	 * ConditionallyAcceptedStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for a conditionally accepted status in free format text."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> ConditionallyAcceptedStatusReason1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Reason for a conditionally accepted status in free format text.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ConditionallyAcceptedStatusReason1.mmStructured, ConditionallyAcceptedStatusReason1.mmAdditionalInformation);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReason1";
				definition = "Reason for a conditionally accepted status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Strd", required = true)
	public List<ConditionallyAcceptedStatusReason1Code> getStructured() {
		return structured;
	}

	public void setStructured(List<ConditionallyAcceptedStatusReason1Code> structured) {
		this.structured = structured;
	}

	@XmlElement(name = "AddtlInf")
	public Max350Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}