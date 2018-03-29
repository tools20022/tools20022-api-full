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
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmRegistrar}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmDropAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmIssuerAgent
 * CorporateActionNotification002V06.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmPayingAgent
 * CorporateActionNotification002V06.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmSubPayingAgent
 * CorporateActionNotification002V06.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmRegistrar
 * CorporateActionNotification002V06.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmResellingAgent
 * CorporateActionNotification002V06.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmPhysicalSecuritiesAgent
 * CorporateActionNotification002V06.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmDropAgent
 * CorporateActionNotification002V06.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmSolicitationAgent
 * CorporateActionNotification002V06.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmInformationAgent
 * CorporateActionNotification002V06.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmPayingAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmRegistrar
 * CorporateActionMovementPreliminaryAdvice002V07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmResellingAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmDropAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmInformationAgent
 * CorporateActionMovementPreliminaryAdvice002V07.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07#mmIssuerAgent
 * CorporateActionMovementReversalAdvice002V07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07#mmPayingAgent
 * CorporateActionMovementReversalAdvice002V07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07#mmSubPayingAgent
 * CorporateActionMovementReversalAdvice002V07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07#mmIssuerAgent
 * CorporateActionMovementConfirmation002V07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07#mmPayingAgent
 * CorporateActionMovementConfirmation002V07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07#mmSubPayingAgent
 * CorporateActionMovementConfirmation002V07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmIssuerAgent
 * CorporateActionCancellationAdvice002V06.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmPayingAgent
 * CorporateActionCancellationAdvice002V06.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmSubPayingAgent
 * CorporateActionCancellationAdvice002V06.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmRegistrar
 * CorporateActionCancellationAdvice002V06.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmResellingAgent
 * CorporateActionCancellationAdvice002V06.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdvice002V06.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmDropAgent
 * CorporateActionCancellationAdvice002V06.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmSolicitationAgent
 * CorporateActionCancellationAdvice002V06.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmInformationAgent
 * CorporateActionCancellationAdvice002V06.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmIssuerAgent
 * CorporateActionCancellationAdvice002V08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmPayingAgent
 * CorporateActionCancellationAdvice002V08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmSubPayingAgent
 * CorporateActionCancellationAdvice002V08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmRegistrar
 * CorporateActionCancellationAdvice002V08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmResellingAgent
 * CorporateActionCancellationAdvice002V08.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdvice002V08.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmDropAgent
 * CorporateActionCancellationAdvice002V08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmSolicitationAgent
 * CorporateActionCancellationAdvice002V08.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmInformationAgent
 * CorporateActionCancellationAdvice002V08.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmIssuerAgent
 * CorporateActionMovementConfirmation002V09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmPayingAgent
 * CorporateActionMovementConfirmation002V09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmSubPayingAgent
 * CorporateActionMovementConfirmation002V09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.
 * mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.
 * mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmRegistrar}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmDropAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmPayingAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmRegistrar
 * CorporateActionMovementPreliminaryAdvice002V09.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmResellingAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmDropAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmInformationAgent
 * CorporateActionMovementPreliminaryAdvice002V09.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmIssuerAgent
 * CorporateActionMovementReversalAdvice002V09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmPayingAgent
 * CorporateActionMovementReversalAdvice002V09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmSubPayingAgent
 * CorporateActionMovementReversalAdvice002V09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmIssuerAgent
 * CorporateActionNotification002V08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmPayingAgent
 * CorporateActionNotification002V08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmSubPayingAgent
 * CorporateActionNotification002V08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmRegistrar
 * CorporateActionNotification002V08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmResellingAgent
 * CorporateActionNotification002V08.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmPhysicalSecuritiesAgent
 * CorporateActionNotification002V08.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmDropAgent
 * CorporateActionNotification002V08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmSolicitationAgent
 * CorporateActionNotification002V08.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmInformationAgent
 * CorporateActionNotification002V08.mmInformationAgent}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification104Choice", propOrder = {"anyBIC", "proprietaryIdentification", "nameAndAddress"})
public class PartyIdentification104Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnyBIC", required = true)
	protected AnyBICIdentifier anyBIC;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PartyIdentification104Choice, AnyBICIdentifier> mmAnyBIC = new MMMessageAttribute<PartyIdentification104Choice, AnyBICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification104Choice.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(PartyIdentification104Choice obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(PartyIdentification104Choice obj, AnyBICIdentifier value) {
			obj.setAnyBIC(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected GenericIdentification84 proprietaryIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<PartyIdentification104Choice, GenericIdentification84> mmProprietaryIdentification = new MMMessageAssociationEnd<PartyIdentification104Choice, GenericIdentification84>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification104Choice.mmObject();
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

		@Override
		public GenericIdentification84 getValue(PartyIdentification104Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(PartyIdentification104Choice obj, GenericIdentification84 value) {
			obj.setProprietaryIdentification(value);
		}
	};
	@XmlElement(name = "NmAndAdr", required = true)
	protected NameAndAddress12 nameAndAddress;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PartyIdentification104Choice, NameAndAddress12> mmNameAndAddress = new MMMessageAttribute<PartyIdentification104Choice, NameAndAddress12>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification104Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NameAndAddress12.mmObject();
		}

		@Override
		public NameAndAddress12 getValue(PartyIdentification104Choice obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(PartyIdentification104Choice obj, NameAndAddress12 value) {
			obj.setNameAndAddress(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification104Choice.mmAnyBIC, com.tools20022.repository.choice.PartyIdentification104Choice.mmProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification104Choice.mmNameAndAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmInformationAgent, CorporateActionNotification002V06.mmIssuerAgent, CorporateActionNotification002V06.mmPayingAgent,
						CorporateActionNotification002V06.mmSubPayingAgent, CorporateActionNotification002V06.mmRegistrar, CorporateActionNotification002V06.mmResellingAgent, CorporateActionNotification002V06.mmPhysicalSecuritiesAgent,
						CorporateActionNotification002V06.mmDropAgent, CorporateActionNotification002V06.mmSolicitationAgent, CorporateActionNotification002V06.mmInformationAgent,
						CorporateActionMovementPreliminaryAdvice002V07.mmIssuerAgent, CorporateActionMovementPreliminaryAdvice002V07.mmPayingAgent, CorporateActionMovementPreliminaryAdvice002V07.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdvice002V07.mmRegistrar, CorporateActionMovementPreliminaryAdvice002V07.mmResellingAgent, CorporateActionMovementPreliminaryAdvice002V07.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdvice002V07.mmDropAgent, CorporateActionMovementPreliminaryAdvice002V07.mmSolicitationAgent, CorporateActionMovementPreliminaryAdvice002V07.mmInformationAgent,
						CorporateActionMovementReversalAdvice002V07.mmIssuerAgent, CorporateActionMovementReversalAdvice002V07.mmPayingAgent, CorporateActionMovementReversalAdvice002V07.mmSubPayingAgent,
						CorporateActionMovementConfirmation002V07.mmIssuerAgent, CorporateActionMovementConfirmation002V07.mmPayingAgent, CorporateActionMovementConfirmation002V07.mmSubPayingAgent,
						CorporateActionCancellationAdvice002V06.mmIssuerAgent, CorporateActionCancellationAdvice002V06.mmPayingAgent, CorporateActionCancellationAdvice002V06.mmSubPayingAgent,
						CorporateActionCancellationAdvice002V06.mmRegistrar, CorporateActionCancellationAdvice002V06.mmResellingAgent, CorporateActionCancellationAdvice002V06.mmPhysicalSecuritiesAgent,
						CorporateActionCancellationAdvice002V06.mmDropAgent, CorporateActionCancellationAdvice002V06.mmSolicitationAgent, CorporateActionCancellationAdvice002V06.mmInformationAgent,
						CorporateActionCancellationAdvice002V08.mmIssuerAgent, CorporateActionCancellationAdvice002V08.mmPayingAgent, CorporateActionCancellationAdvice002V08.mmSubPayingAgent,
						CorporateActionCancellationAdvice002V08.mmRegistrar, CorporateActionCancellationAdvice002V08.mmResellingAgent, CorporateActionCancellationAdvice002V08.mmPhysicalSecuritiesAgent,
						CorporateActionCancellationAdvice002V08.mmDropAgent, CorporateActionCancellationAdvice002V08.mmSolicitationAgent, CorporateActionCancellationAdvice002V08.mmInformationAgent,
						CorporateActionMovementConfirmation002V09.mmIssuerAgent, CorporateActionMovementConfirmation002V09.mmPayingAgent, CorporateActionMovementConfirmation002V09.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmInformationAgent, CorporateActionMovementPreliminaryAdvice002V09.mmIssuerAgent, CorporateActionMovementPreliminaryAdvice002V09.mmPayingAgent,
						CorporateActionMovementPreliminaryAdvice002V09.mmSubPayingAgent, CorporateActionMovementPreliminaryAdvice002V09.mmRegistrar, CorporateActionMovementPreliminaryAdvice002V09.mmResellingAgent,
						CorporateActionMovementPreliminaryAdvice002V09.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdvice002V09.mmDropAgent, CorporateActionMovementPreliminaryAdvice002V09.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdvice002V09.mmInformationAgent, CorporateActionMovementReversalAdvice002V09.mmIssuerAgent, CorporateActionMovementReversalAdvice002V09.mmPayingAgent,
						CorporateActionMovementReversalAdvice002V09.mmSubPayingAgent, CorporateActionNotification002V08.mmIssuerAgent, CorporateActionNotification002V08.mmPayingAgent, CorporateActionNotification002V08.mmSubPayingAgent,
						CorporateActionNotification002V08.mmRegistrar, CorporateActionNotification002V08.mmResellingAgent, CorporateActionNotification002V08.mmPhysicalSecuritiesAgent, CorporateActionNotification002V08.mmDropAgent,
						CorporateActionNotification002V08.mmSolicitationAgent, CorporateActionNotification002V08.mmInformationAgent);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public PartyIdentification104Choice setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = Objects.requireNonNull(anyBIC);
		return this;
	}

	public GenericIdentification84 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public PartyIdentification104Choice setProprietaryIdentification(GenericIdentification84 proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}

	public NameAndAddress12 getNameAndAddress() {
		return nameAndAddress;
	}

	public PartyIdentification104Choice setNameAndAddress(NameAndAddress12 nameAndAddress) {
		this.nameAndAddress = Objects.requireNonNull(nameAndAddress);
		return this;
	}
}