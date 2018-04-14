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
import com.tools20022.repository.area.reda.*;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification36;
import com.tools20022.repository.msg.NameAndAddress5;
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
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmAnyBIC
 * PartyIdentification71Choice.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmProprietaryIdentification
 * PartyIdentification71Choice.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmNameAndAddress
 * PartyIdentification71Choice.mmNameAndAddress}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV07.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmIssuerAgent
 * CorporateActionMovementConfirmationV07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmPayingAgent
 * CorporateActionMovementConfirmationV07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmSubPayingAgent
 * CorporateActionMovementConfirmationV07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmIssuerAgent
 * CorporateActionNotificationV06.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPayingAgent
 * CorporateActionNotificationV06.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmSubPayingAgent
 * CorporateActionNotificationV06.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmRegistrar
 * CorporateActionNotificationV06.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmResellingAgent
 * CorporateActionNotificationV06.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV06.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmDropAgent
 * CorporateActionNotificationV06.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmSolicitationAgent
 * CorporateActionNotificationV06.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmInformationAgent
 * CorporateActionNotificationV06.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmPayingAgent
 * CorporateActionMovementReversalAdviceV07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmIssuerAgent
 * CorporateActionCancellationAdviceV06.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmPayingAgent
 * CorporateActionCancellationAdviceV06.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmSubPayingAgent
 * CorporateActionCancellationAdviceV06.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmRegistrar
 * CorporateActionCancellationAdviceV06.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmResellingAgent
 * CorporateActionCancellationAdviceV06.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV06.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmDropAgent
 * CorporateActionCancellationAdviceV06.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmSolicitationAgent
 * CorporateActionCancellationAdviceV06.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmInformationAgent
 * CorporateActionCancellationAdviceV06.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmIssuerAgent
 * CorporateActionCancellationAdviceV07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmPayingAgent
 * CorporateActionCancellationAdviceV07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmSubPayingAgent
 * CorporateActionCancellationAdviceV07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmRegistrar
 * CorporateActionCancellationAdviceV07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmResellingAgent
 * CorporateActionCancellationAdviceV07.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV07.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmDropAgent
 * CorporateActionCancellationAdviceV07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmSolicitationAgent
 * CorporateActionCancellationAdviceV07.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmInformationAgent
 * CorporateActionCancellationAdviceV07.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmIssuerAgent
 * CorporateActionNotificationV07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPayingAgent
 * CorporateActionNotificationV07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmSubPayingAgent
 * CorporateActionNotificationV07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmRegistrar
 * CorporateActionNotificationV07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmResellingAgent
 * CorporateActionNotificationV07.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV07.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmDropAgent
 * CorporateActionNotificationV07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmSolicitationAgent
 * CorporateActionNotificationV07.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmInformationAgent
 * CorporateActionNotificationV07.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmIssuerAgent
 * CorporateActionMovementConfirmationV08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmPayingAgent
 * CorporateActionMovementConfirmationV08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmSubPayingAgent
 * CorporateActionMovementConfirmationV08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV08.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmPayingAgent
 * CorporateActionMovementReversalAdviceV08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09#mmPayingAgent
 * CorporateActionMovementReversalAdviceV09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmIssuerAgent
 * CorporateActionNotificationV08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmPayingAgent
 * CorporateActionNotificationV08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmSubPayingAgent
 * CorporateActionNotificationV08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmRegistrar
 * CorporateActionNotificationV08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmResellingAgent
 * CorporateActionNotificationV08.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV08.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmDropAgent
 * CorporateActionNotificationV08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmSolicitationAgent
 * CorporateActionNotificationV08.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmInformationAgent
 * CorporateActionNotificationV08.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09#mmIssuerAgent
 * CorporateActionMovementConfirmationV09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09#mmPayingAgent
 * CorporateActionMovementConfirmationV09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09#mmSubPayingAgent
 * CorporateActionMovementConfirmationV09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV09.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV09.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmIssuerAgent
 * CorporateActionCancellationAdviceV08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmPayingAgent
 * CorporateActionCancellationAdviceV08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmSubPayingAgent
 * CorporateActionCancellationAdviceV08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmRegistrar
 * CorporateActionCancellationAdviceV08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmResellingAgent
 * CorporateActionCancellationAdviceV08.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV08.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmDropAgent
 * CorporateActionCancellationAdviceV08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmSolicitationAgent
 * CorporateActionCancellationAdviceV08.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmInformationAgent
 * CorporateActionCancellationAdviceV08.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01#mmMessageOriginator
 * PartyAuditTrailQueryV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01#mmMessageRecipient
 * PartyAuditTrailQueryV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyActivityAdviceV01#mmMessageOriginator
 * PartyActivityAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyActivityAdviceV01#mmMessageRecipient
 * PartyActivityAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyCreationRequestV01#mmMessageOriginator
 * PartyCreationRequestV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyCreationRequestV01#mmMessageRecipient
 * PartyCreationRequestV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyReportV01#mmMessageOriginator
 * PartyReportV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyReportV01#mmMessageRecipient
 * PartyReportV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailReportV02#mmMessageOriginator
 * PartyAuditTrailReportV02.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailReportV02#mmMessageRecipient
 * PartyAuditTrailReportV02.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyQueryV01#mmMessageOriginator
 * PartyQueryV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyQueryV01#mmMessageRecipient
 * PartyQueryV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyStatusAdviceV01#mmMessageOriginator
 * PartyStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyStatusAdviceV01#mmMessageRecipient
 * PartyStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyModificationRequestV01#mmMessageOriginator
 * PartyModificationRequestV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyModificationRequestV01#mmMessageRecipient
 * PartyModificationRequestV01.mmMessageRecipient}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification71Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between different formats for the identification of a party."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification71Choice", propOrder = {"anyBIC", "proprietaryIdentification", "nameAndAddress"})
public class PartyIdentification71Choice {

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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification71Choice, AnyBICIdentifier> mmAnyBIC = new MMMessageAttribute<PartyIdentification71Choice, AnyBICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification71Choice.mmObject();
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
		public AnyBICIdentifier getValue(PartyIdentification71Choice obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(PartyIdentification71Choice obj, AnyBICIdentifier value) {
			obj.setAnyBIC(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected GenericIdentification36 proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36
	 * GenericIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification71Choice, GenericIdentification36> mmProprietaryIdentification = new MMMessageAssociationEnd<PartyIdentification71Choice, GenericIdentification36>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification71Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification36.mmObject();
		}

		@Override
		public GenericIdentification36 getValue(PartyIdentification71Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(PartyIdentification71Choice obj, GenericIdentification36 value) {
			obj.setProprietaryIdentification(value);
		}
	};
	@XmlElement(name = "NmAndAdr", required = true)
	protected NameAndAddress5 nameAndAddress;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification71Choice, NameAndAddress5> mmNameAndAddress = new MMMessageAttribute<PartyIdentification71Choice, NameAndAddress5>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification71Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NameAndAddress5.mmObject();
		}

		@Override
		public NameAndAddress5 getValue(PartyIdentification71Choice obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(PartyIdentification71Choice obj, NameAndAddress5 value) {
			obj.setNameAndAddress(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification71Choice.mmAnyBIC, com.tools20022.repository.choice.PartyIdentification71Choice.mmProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification71Choice.mmNameAndAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmInformationAgent, CorporateActionMovementPreliminaryAdviceV07.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV07.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceV07.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV07.mmRegistrar, CorporateActionMovementPreliminaryAdviceV07.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceV07.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceV07.mmDropAgent, CorporateActionMovementPreliminaryAdviceV07.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceV07.mmInformationAgent, CorporateActionMovementConfirmationV07.mmIssuerAgent, CorporateActionMovementConfirmationV07.mmPayingAgent,
						CorporateActionMovementConfirmationV07.mmSubPayingAgent, CorporateActionNotificationV06.mmIssuerAgent, CorporateActionNotificationV06.mmPayingAgent, CorporateActionNotificationV06.mmSubPayingAgent,
						CorporateActionNotificationV06.mmRegistrar, CorporateActionNotificationV06.mmResellingAgent, CorporateActionNotificationV06.mmPhysicalSecuritiesAgent, CorporateActionNotificationV06.mmDropAgent,
						CorporateActionNotificationV06.mmSolicitationAgent, CorporateActionNotificationV06.mmInformationAgent, CorporateActionMovementReversalAdviceV07.mmIssuerAgent, CorporateActionMovementReversalAdviceV07.mmPayingAgent,
						CorporateActionMovementReversalAdviceV07.mmSubPayingAgent, CorporateActionCancellationAdviceV06.mmIssuerAgent, CorporateActionCancellationAdviceV06.mmPayingAgent,
						CorporateActionCancellationAdviceV06.mmSubPayingAgent, CorporateActionCancellationAdviceV06.mmRegistrar, CorporateActionCancellationAdviceV06.mmResellingAgent,
						CorporateActionCancellationAdviceV06.mmPhysicalSecuritiesAgent, CorporateActionCancellationAdviceV06.mmDropAgent, CorporateActionCancellationAdviceV06.mmSolicitationAgent,
						CorporateActionCancellationAdviceV06.mmInformationAgent, CorporateActionCancellationAdviceV07.mmIssuerAgent, CorporateActionCancellationAdviceV07.mmPayingAgent, CorporateActionCancellationAdviceV07.mmSubPayingAgent,
						CorporateActionCancellationAdviceV07.mmRegistrar, CorporateActionCancellationAdviceV07.mmResellingAgent, CorporateActionCancellationAdviceV07.mmPhysicalSecuritiesAgent,
						CorporateActionCancellationAdviceV07.mmDropAgent, CorporateActionCancellationAdviceV07.mmSolicitationAgent, CorporateActionCancellationAdviceV07.mmInformationAgent, CorporateActionNotificationV07.mmIssuerAgent,
						CorporateActionNotificationV07.mmPayingAgent, CorporateActionNotificationV07.mmSubPayingAgent, CorporateActionNotificationV07.mmRegistrar, CorporateActionNotificationV07.mmResellingAgent,
						CorporateActionNotificationV07.mmPhysicalSecuritiesAgent, CorporateActionNotificationV07.mmDropAgent, CorporateActionNotificationV07.mmSolicitationAgent, CorporateActionNotificationV07.mmInformationAgent,
						CorporateActionMovementConfirmationV08.mmIssuerAgent, CorporateActionMovementConfirmationV08.mmPayingAgent, CorporateActionMovementConfirmationV08.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceV08.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV08.mmPayingAgent, CorporateActionMovementPreliminaryAdviceV08.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceV08.mmRegistrar, CorporateActionMovementPreliminaryAdviceV08.mmResellingAgent, CorporateActionMovementPreliminaryAdviceV08.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceV08.mmDropAgent, CorporateActionMovementPreliminaryAdviceV08.mmSolicitationAgent, CorporateActionMovementPreliminaryAdviceV08.mmInformationAgent,
						CorporateActionMovementReversalAdviceV08.mmIssuerAgent, CorporateActionMovementReversalAdviceV08.mmPayingAgent, CorporateActionMovementReversalAdviceV08.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmInformationAgent, CorporateActionMovementReversalAdviceV09.mmIssuerAgent, CorporateActionMovementReversalAdviceV09.mmPayingAgent,
						CorporateActionMovementReversalAdviceV09.mmSubPayingAgent, CorporateActionNotificationV08.mmIssuerAgent, CorporateActionNotificationV08.mmPayingAgent, CorporateActionNotificationV08.mmSubPayingAgent,
						CorporateActionNotificationV08.mmRegistrar, CorporateActionNotificationV08.mmResellingAgent, CorporateActionNotificationV08.mmPhysicalSecuritiesAgent, CorporateActionNotificationV08.mmDropAgent,
						CorporateActionNotificationV08.mmSolicitationAgent, CorporateActionNotificationV08.mmInformationAgent, CorporateActionMovementConfirmationV09.mmIssuerAgent, CorporateActionMovementConfirmationV09.mmPayingAgent,
						CorporateActionMovementConfirmationV09.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmInformationAgent, CorporateActionMovementPreliminaryAdviceV09.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV09.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceV09.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV09.mmRegistrar, CorporateActionMovementPreliminaryAdviceV09.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceV09.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceV09.mmDropAgent, CorporateActionMovementPreliminaryAdviceV09.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceV09.mmInformationAgent, CorporateActionCancellationAdviceV08.mmIssuerAgent, CorporateActionCancellationAdviceV08.mmPayingAgent,
						CorporateActionCancellationAdviceV08.mmSubPayingAgent, CorporateActionCancellationAdviceV08.mmRegistrar, CorporateActionCancellationAdviceV08.mmResellingAgent,
						CorporateActionCancellationAdviceV08.mmPhysicalSecuritiesAgent, CorporateActionCancellationAdviceV08.mmDropAgent, CorporateActionCancellationAdviceV08.mmSolicitationAgent,
						CorporateActionCancellationAdviceV08.mmInformationAgent, PartyAuditTrailQueryV01.mmMessageOriginator, PartyAuditTrailQueryV01.mmMessageRecipient, PartyActivityAdviceV01.mmMessageOriginator,
						PartyActivityAdviceV01.mmMessageRecipient, PartyCreationRequestV01.mmMessageOriginator, PartyCreationRequestV01.mmMessageRecipient, PartyReportV01.mmMessageOriginator, PartyReportV01.mmMessageRecipient,
						PartyAuditTrailReportV02.mmMessageOriginator, PartyAuditTrailReportV02.mmMessageRecipient, PartyQueryV01.mmMessageOriginator, PartyQueryV01.mmMessageRecipient, PartyStatusAdviceV01.mmMessageOriginator,
						PartyStatusAdviceV01.mmMessageRecipient, PartyModificationRequestV01.mmMessageOriginator, PartyModificationRequestV01.mmMessageRecipient);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification71Choice";
				definition = "Choice between different formats for the identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public PartyIdentification71Choice setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = Objects.requireNonNull(anyBIC);
		return this;
	}

	public GenericIdentification36 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public PartyIdentification71Choice setProprietaryIdentification(GenericIdentification36 proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}

	public NameAndAddress5 getNameAndAddress() {
		return nameAndAddress;
	}

	public PartyIdentification71Choice setNameAndAddress(NameAndAddress5 nameAndAddress) {
		this.nameAndAddress = Objects.requireNonNull(nameAndAddress);
		return this;
	}
}