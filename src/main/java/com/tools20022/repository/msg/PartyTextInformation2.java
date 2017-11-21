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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding the party, for example, the contact
 * unit or person responsible for the transaction identified in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#mmDeclarationDetails
 * PartyTextInformation2.mmDeclarationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#mmPartyContactDetails
 * PartyTextInformation2.mmPartyContactDetails}</li>
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
 * "PartyTextInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyTextInformation2", propOrder = {"declarationDetails", "partyContactDetails"})
public class PartyTextInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text declarationDetails;
	/**
	 * Provides declaration details narrative relative to the party.
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmDeclaration
	 * PartyIdentificationInformation.mmDeclaration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2
	 * PartyTextInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides declaration details narrative relative to the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclarationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmDeclaration;
			componentContext_lazy = () -> PartyTextInformation2.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max140Text partyContactDetails;
	/**
	 * Provides additional information regarding the party, for example, the
	 * contact unit or person responsible for the transaction identified in the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2
	 * PartyTextInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyCtctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyContactDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyContactDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> PartyTextInformation2.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactDetails";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyTextInformation2.mmDeclarationDetails, PartyTextInformation2.mmPartyContactDetails);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyTextInformation2";
				definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DclrtnDtls")
	public Max350Text getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = declarationDetails;
	}

	@XmlElement(name = "PtyCtctDtls")
	public Max140Text getPartyContactDetails() {
		return partyContactDetails;
	}

	public void setPartyContactDetails(Max140Text partyContactDetails) {
		this.partyContactDetails = partyContactDetails;
	}
}