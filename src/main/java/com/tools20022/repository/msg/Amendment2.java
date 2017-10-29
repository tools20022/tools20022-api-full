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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.entity.AmendmentOfUndertaking;
import com.tools20022.repository.entity.UndertakingAdvisingParty;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details of the amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#UndertakingAmendmentMessage
 * Amendment2.UndertakingAmendmentMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#FirstAdvisingPartyAdditionalInformation
 * Amendment2.FirstAdvisingPartyAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#SecondAdvisingPartyAdditionalInformation
 * Amendment2.SecondAdvisingPartyAdditionalInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment2#ConfirmationDetails
 * Amendment2.ConfirmationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment2#DigitalSignature
 * Amendment2.DigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
 * AmendmentOfUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#UndertakingAmendmentAdviceDetails
 * UndertakingAmendmentAdviceV01.UndertakingAmendmentAdviceDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Amendment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendment."</li>
 * </ul>
 */
public class Amendment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contents of the related Undertaking Amendment message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1
	 * UndertakingAmendmentMessage1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmdmntMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendmentMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contents of the related Undertaking Amendment message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UndertakingAmendmentMessage = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Amendment2.mmObject();
			businessComponentTrace_lazy = () -> AmendmentOfUndertaking.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmdmntMsg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendmentMessage";
			definition = "Contents of the related Undertaking Amendment message.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UndertakingAmendmentMessage1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information related to the first advising party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1
	 * AdvisingPartyAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAdvisingParty
	 * UndertakingAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAdvsgPtyAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAdvisingPartyAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the first advising party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FirstAdvisingPartyAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Amendment2.mmObject();
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			isDerived = false;
			xmlTag = "FrstAdvsgPtyAddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAdvisingPartyAdditionalInformation";
			definition = "Additional information related to the first advising party.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AdvisingPartyAdditionalInformation1.mmObject();
		}
	};
	/**
	 * Additional information related to the second advising party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1
	 * AdvisingPartyAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAdvisingParty
	 * UndertakingAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPtyAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingPartyAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the second advising party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SecondAdvisingPartyAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Amendment2.mmObject();
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPtyAddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingPartyAdditionalInformation";
			definition = "Additional information related to the second advising party.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AdvisingPartyAdditionalInformation1.mmObject();
		}
	};
	/**
	 * Details concerning the confirmation of the proposed amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
	 * UndertakingConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#Undertaking
	 * AmendmentOfUndertaking.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details concerning the confirmation of the proposed amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ConfirmationDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Amendment2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.Undertaking;
			isDerived = false;
			xmlTag = "ConfDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Details concerning the confirmation of the proposed amendment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> UndertakingConfirmation1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Digital signature of the party providing additional undertaking amendment
	 * advice details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#ElectronicSignature
	 * Undertaking.ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature of the party providing additional undertaking amendment advice details."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DigitalSignature = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Amendment2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Undertaking.ElectronicSignature;
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the party providing additional undertaking amendment advice details.";
			minOccurs = 0;
			maxOccurs = 3;
			type_lazy = () -> PartyAndSignature2.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment2.UndertakingAmendmentMessage, com.tools20022.repository.msg.Amendment2.FirstAdvisingPartyAdditionalInformation,
						com.tools20022.repository.msg.Amendment2.SecondAdvisingPartyAdditionalInformation, com.tools20022.repository.msg.Amendment2.ConfirmationDetails, com.tools20022.repository.msg.Amendment2.DigitalSignature);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01.UndertakingAmendmentAdviceDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Amendment2";
				definition = "Details of the amendment.";
			}
		});
		return mmObject_lazy.get();
	}
}