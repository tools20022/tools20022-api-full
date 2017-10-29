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
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
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
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#AnyBIC
 * PartyIdentification104Choice.AnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#ProprietaryIdentification
 * PartyIdentification104Choice.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#NameAndAddress
 * PartyIdentification104Choice.NameAndAddress}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#IssuerAgent
 * CorporateActionMovementPreliminaryAdvice002V08.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#PayingAgent
 * CorporateActionMovementPreliminaryAdvice002V08.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#SubPayingAgent
 * CorporateActionMovementPreliminaryAdvice002V08.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#Registrar
 * CorporateActionMovementPreliminaryAdvice002V08.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#ResellingAgent
 * CorporateActionMovementPreliminaryAdvice002V08.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdvice002V08.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#DropAgent
 * CorporateActionMovementPreliminaryAdvice002V08.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#SolicitationAgent
 * CorporateActionMovementPreliminaryAdvice002V08.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#InformationAgent
 * CorporateActionMovementPreliminaryAdvice002V08.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#IssuerAgent
 * CorporateActionCancellationAdvice002V07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#PayingAgent
 * CorporateActionCancellationAdvice002V07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#SubPayingAgent
 * CorporateActionCancellationAdvice002V07.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#Registrar
 * CorporateActionCancellationAdvice002V07.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#ResellingAgent
 * CorporateActionCancellationAdvice002V07.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdvice002V07.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#DropAgent
 * CorporateActionCancellationAdvice002V07.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#SolicitationAgent
 * CorporateActionCancellationAdvice002V07.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07#InformationAgent
 * CorporateActionCancellationAdvice002V07.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#IssuerAgent
 * CorporateActionMovementReversalAdvice002V08.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#PayingAgent
 * CorporateActionMovementReversalAdvice002V08.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#SubPayingAgent
 * CorporateActionMovementReversalAdvice002V08.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.IssuerAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.PayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#IssuerAgent
 * CorporateActionNotification002V07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#PayingAgent
 * CorporateActionNotification002V07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#SubPayingAgent
 * CorporateActionNotification002V07.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#Registrar
 * CorporateActionNotification002V07.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#ResellingAgent
 * CorporateActionNotification002V07.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#PhysicalSecuritiesAgent
 * CorporateActionNotification002V07.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#DropAgent
 * CorporateActionNotification002V07.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#SolicitationAgent
 * CorporateActionNotification002V07.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#InformationAgent
 * CorporateActionNotification002V07.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#IssuerAgent
 * CorporateActionMovementConfirmation002V08.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#PayingAgent
 * CorporateActionMovementConfirmation002V08.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#SubPayingAgent
 * CorporateActionMovementConfirmation002V08.SubPayingAgent}</li>
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
 * "PartyIdentification104Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between different formats for the identification of a party."</li>
 * </ul>
 */
public class PartyIdentification104Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#AnyBIC
	 * OrganisationIdentification.AnyBIC}</li>
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
	public static final MMMessageAttribute AnyBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification104Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.AnyBIC;
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
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
	public static final MMMessageAssociationEnd ProprietaryIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyIdentification104Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification84.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAttribute NameAndAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification104Choice.mmObject();
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> NameAndAddress12.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification104Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification104Choice.ProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification104Choice.NameAndAddress);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.Registrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.Registrar,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.DropAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.InformationAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V07.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.PayingAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V07.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.Registrar, com.tools20022.repository.area.seev.CorporateActionNotification002V07.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V07.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V07.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08.SubPayingAgent);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification104Choice";
				definition = "Choice between different formats for the identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}
}