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
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous way to identify an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification44#mmAnyBIC
 * PartyIdentification44.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification44#mmAlternativeIdentifier
 * PartyIdentification44.mmAlternativeIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
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
 * "PartyIdentification44"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify an organisation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentification44", propOrder = {"anyBIC", "alternativeIdentifier"})
public class PartyIdentification44 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AnyBICIdentifier anyBIC;
	/**
	 * Code allocated to a financial or non-financial institution by the ISO
	 * 9362 Registration Authority, as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44
	 * PartyIdentification44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnyBIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> PartyIdentification44.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected List<Max35Text> alternativeIdentifier;
	/**
	 * Unique and unambiguous identifier, as assigned to a financial institution
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44
	 * PartyIdentification44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrntvIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternativeIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> PartyIdentification44.mmObject();
			isDerived = false;
			xmlTag = "AltrntvIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeIdentifier";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification44.mmAnyBIC, PartyIdentification44.mmAlternativeIdentifier);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification44";
				definition = "Unique and unambiguous way to identify an organisation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AnyBIC", required = true)
	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public void setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = anyBIC;
	}

	@XmlElement(name = "AltrntvIdr")
	public List<Max35Text> getAlternativeIdentifier() {
		return alternativeIdentifier;
	}

	public void setAlternativeIdentifier(List<Max35Text> alternativeIdentifier) {
		this.alternativeIdentifier = alternativeIdentifier;
	}
}