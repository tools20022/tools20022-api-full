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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification84;
import com.tools20022.repository.msg.NameAndAddress12;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between different formats for the identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#mmAnyBIC
 * PartyIdentification104Choice.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#mmProprietaryIdentification
 * PartyIdentification104Choice.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#mmNameAndAddress
 * PartyIdentification104Choice.mmNameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmPayingAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmRegistrar
 * CorporateActionMovementPreliminaryAdvice002V08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmResellingAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmDropAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmInformationAgent
 * CorporateActionMovementPreliminaryAdvice002V08.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmIssuerAgent
 * CorporateActionCancellationAdvice002V07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmPayingAgent
 * CorporateActionCancellationAdvice002V07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmSubPayingAgent
 * CorporateActionCancellationAdvice002V07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmRegistrar
 * CorporateActionCancellationAdvice002V07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmResellingAgent
 * CorporateActionCancellationAdvice002V07.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdvice002V07.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmDropAgent
 * CorporateActionCancellationAdvice002V07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmSolicitationAgent
 * CorporateActionCancellationAdvice002V07.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#mmInformationAgent
 * CorporateActionCancellationAdvice002V07.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmIssuerAgent
 * CorporateActionMovementReversalAdvice002V08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmPayingAgent
 * CorporateActionMovementReversalAdvice002V08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmSubPayingAgent
 * CorporateActionMovementReversalAdvice002V08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmRegistrar}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmDropAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmIssuerAgent
 * CorporateActionNotification002V07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmPayingAgent
 * CorporateActionNotification002V07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmSubPayingAgent
 * CorporateActionNotification002V07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmRegistrar
 * CorporateActionNotification002V07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmResellingAgent
 * CorporateActionNotification002V07.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmPhysicalSecuritiesAgent
 * CorporateActionNotification002V07.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmDropAgent
 * CorporateActionNotification002V07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmSolicitationAgent
 * CorporateActionNotification002V07.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmInformationAgent
 * CorporateActionNotification002V07.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#mmIssuerAgent
 * CorporateActionMovementConfirmation002V08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#mmPayingAgent
 * CorporateActionMovementConfirmation002V08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#mmSubPayingAgent
 * CorporateActionMovementConfirmation002V08.mmSubPayingAgent}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification104Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between different formats for the identification of a party."</li>
 * </ul>
 */
public class PartyIdentification104Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
			componentContext_lazy = () -> PartyIdentification104Choice.mmObject();
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
	protected GenericIdentification84 proprietaryIdentification;
	/**
	 * Unique and unambiguous identifier, as assigned to a financial institution
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification84
	 * GenericIdentification84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> PartyIdentification104Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification84.mmObject();
		}
	};
	protected NameAndAddress12 nameAndAddress;
	/**
	 * Name and address of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NameAndAddress12
	 * NameAndAddress12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of a party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameAndAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentification104Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NameAndAddress12.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification104Choice.mmAnyBIC, PartyIdentification104Choice.mmProprietaryIdentification, PartyIdentification104Choice.mmNameAndAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdvice002V08.mmIssuerAgent, CorporateActionMovementPreliminaryAdvice002V08.mmPayingAgent,
						CorporateActionMovementPreliminaryAdvice002V08.mmSubPayingAgent, CorporateActionMovementPreliminaryAdvice002V08.mmRegistrar, CorporateActionMovementPreliminaryAdvice002V08.mmResellingAgent,
						CorporateActionMovementPreliminaryAdvice002V08.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdvice002V08.mmDropAgent, CorporateActionMovementPreliminaryAdvice002V08.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdvice002V08.mmInformationAgent, CorporateActionCancellationAdvice002V07.mmIssuerAgent, CorporateActionCancellationAdvice002V07.mmPayingAgent,
						CorporateActionCancellationAdvice002V07.mmSubPayingAgent, CorporateActionCancellationAdvice002V07.mmRegistrar, CorporateActionCancellationAdvice002V07.mmResellingAgent,
						CorporateActionCancellationAdvice002V07.mmPhysicalSecuritiesAgent, CorporateActionCancellationAdvice002V07.mmDropAgent, CorporateActionCancellationAdvice002V07.mmSolicitationAgent,
						CorporateActionCancellationAdvice002V07.mmInformationAgent, CorporateActionMovementReversalAdvice002V08.mmIssuerAgent, CorporateActionMovementReversalAdvice002V08.mmPayingAgent,
						CorporateActionMovementReversalAdvice002V08.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmIssuerAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmRegistrar, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmDropAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmSolicitationAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmInformationAgent,
						CorporateActionNotification002V07.mmIssuerAgent, CorporateActionNotification002V07.mmPayingAgent, CorporateActionNotification002V07.mmSubPayingAgent, CorporateActionNotification002V07.mmRegistrar,
						CorporateActionNotification002V07.mmResellingAgent, CorporateActionNotification002V07.mmPhysicalSecuritiesAgent, CorporateActionNotification002V07.mmDropAgent, CorporateActionNotification002V07.mmSolicitationAgent,
						CorporateActionNotification002V07.mmInformationAgent, CorporateActionMovementConfirmation002V08.mmIssuerAgent, CorporateActionMovementConfirmation002V08.mmPayingAgent,
						CorporateActionMovementConfirmation002V08.mmSubPayingAgent);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification104Choice";
				definition = "Choice between different formats for the identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public void setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = anyBIC;
	}

	public GenericIdentification84 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(GenericIdentification84 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}

	public NameAndAddress12 getNameAndAddress() {
		return nameAndAddress;
	}

	public void setNameAndAddress(NameAndAddress12 nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
	}
}