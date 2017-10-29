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
import com.tools20022.repository.msg.GenericIdentification36;
import com.tools20022.repository.msg.NameAndAddress5;
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
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#AnyBIC
 * PartyIdentification71Choice.AnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#ProprietaryIdentification
 * PartyIdentification71Choice.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#NameAndAddress
 * PartyIdentification71Choice.NameAndAddress}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.SubPayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.ResellingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceV07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#PayingAgent
 * CorporateActionMovementPreliminaryAdviceV07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV07.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#Registrar
 * CorporateActionMovementPreliminaryAdviceV07.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceV07.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV07.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#DropAgent
 * CorporateActionMovementPreliminaryAdviceV07.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV07.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#InformationAgent
 * CorporateActionMovementPreliminaryAdviceV07.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#IssuerAgent
 * CorporateActionMovementConfirmationV07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#PayingAgent
 * CorporateActionMovementConfirmationV07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#SubPayingAgent
 * CorporateActionMovementConfirmationV07.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#IssuerAgent
 * CorporateActionNotificationV06.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#PayingAgent
 * CorporateActionNotificationV06.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#SubPayingAgent
 * CorporateActionNotificationV06.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#Registrar
 * CorporateActionNotificationV06.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#ResellingAgent
 * CorporateActionNotificationV06.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#PhysicalSecuritiesAgent
 * CorporateActionNotificationV06.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#DropAgent
 * CorporateActionNotificationV06.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#SolicitationAgent
 * CorporateActionNotificationV06.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#InformationAgent
 * CorporateActionNotificationV06.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#IssuerAgent
 * CorporateActionMovementReversalAdviceV07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#PayingAgent
 * CorporateActionMovementReversalAdviceV07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#SubPayingAgent
 * CorporateActionMovementReversalAdviceV07.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#IssuerAgent
 * CorporateActionCancellationAdviceV06.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#PayingAgent
 * CorporateActionCancellationAdviceV06.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#SubPayingAgent
 * CorporateActionCancellationAdviceV06.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#Registrar
 * CorporateActionCancellationAdviceV06.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#ResellingAgent
 * CorporateActionCancellationAdviceV06.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV06.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#DropAgent
 * CorporateActionCancellationAdviceV06.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#SolicitationAgent
 * CorporateActionCancellationAdviceV06.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#InformationAgent
 * CorporateActionCancellationAdviceV06.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#IssuerAgent
 * CorporateActionCancellationAdviceV07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#PayingAgent
 * CorporateActionCancellationAdviceV07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#SubPayingAgent
 * CorporateActionCancellationAdviceV07.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#Registrar
 * CorporateActionCancellationAdviceV07.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#ResellingAgent
 * CorporateActionCancellationAdviceV07.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV07.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#DropAgent
 * CorporateActionCancellationAdviceV07.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#SolicitationAgent
 * CorporateActionCancellationAdviceV07.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#InformationAgent
 * CorporateActionCancellationAdviceV07.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#IssuerAgent
 * CorporateActionNotificationV07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#PayingAgent
 * CorporateActionNotificationV07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#SubPayingAgent
 * CorporateActionNotificationV07.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#Registrar
 * CorporateActionNotificationV07.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#ResellingAgent
 * CorporateActionNotificationV07.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#PhysicalSecuritiesAgent
 * CorporateActionNotificationV07.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#DropAgent
 * CorporateActionNotificationV07.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#SolicitationAgent
 * CorporateActionNotificationV07.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#InformationAgent
 * CorporateActionNotificationV07.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#IssuerAgent
 * CorporateActionMovementConfirmationV08.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#PayingAgent
 * CorporateActionMovementConfirmationV08.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#SubPayingAgent
 * CorporateActionMovementConfirmationV08.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceV08.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#PayingAgent
 * CorporateActionMovementPreliminaryAdviceV08.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV08.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#Registrar
 * CorporateActionMovementPreliminaryAdviceV08.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceV08.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV08.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#DropAgent
 * CorporateActionMovementPreliminaryAdviceV08.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV08.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#InformationAgent
 * CorporateActionMovementPreliminaryAdviceV08.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#IssuerAgent
 * CorporateActionMovementReversalAdviceV08.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#PayingAgent
 * CorporateActionMovementReversalAdviceV08.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#SubPayingAgent
 * CorporateActionMovementReversalAdviceV08.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.SubPayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.ResellingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * InformationAgent}</li>
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
 * "PartyIdentification71Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between different formats for the identification of a party."</li>
 * </ul>
 */
public class PartyIdentification71Choice {

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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
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
			componentContext_lazy = () -> PartyIdentification71Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36
	 * GenericIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
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
			componentContext_lazy = () -> PartyIdentification71Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification36.mmObject();
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
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
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
			componentContext_lazy = () -> PartyIdentification71Choice.mmObject();
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> NameAndAddress5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification71Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification71Choice.ProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification71Choice.NameAndAddress);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.Registrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV06.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV06.PayingAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV06.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV06.Registrar, com.tools20022.repository.area.seev.CorporateActionNotificationV06.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV06.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV06.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV06.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV06.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.PayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.Registrar, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.Registrar,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.DropAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07.InformationAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV07.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.PayingAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV07.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.Registrar, com.tools20022.repository.area.seev.CorporateActionNotificationV07.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV07.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV07.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.Registrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.InformationAgent);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification71Choice";
				definition = "Choice between different formats for the identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}
}