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
import com.tools20022.repository.msg.GenericIdentification19;
import com.tools20022.repository.msg.NameAndAddress5;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Choice of identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#AnyBIC
 * PartyIdentification46Choice.AnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#ProprietaryIdentification
 * PartyIdentification46Choice.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#NameAndAddress
 * PartyIdentification46Choice.NameAndAddress}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#IssuerAgent
 * CorporateActionCancellationAdviceV02.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#PayingAgent
 * CorporateActionCancellationAdviceV02.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#SubPayingAgent
 * CorporateActionCancellationAdviceV02.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#Registrar
 * CorporateActionCancellationAdviceV02.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#ResellingAgent
 * CorporateActionCancellationAdviceV02.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV02.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#DropAgent
 * CorporateActionCancellationAdviceV02.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#SolicitationAgent
 * CorporateActionCancellationAdviceV02.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#InformationAgent
 * CorporateActionCancellationAdviceV02.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#IssuerAgent
 * CorporateActionCancellationAdviceV03.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#PayingAgent
 * CorporateActionCancellationAdviceV03.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#SubPayingAgent
 * CorporateActionCancellationAdviceV03.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#Registrar
 * CorporateActionCancellationAdviceV03.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#ResellingAgent
 * CorporateActionCancellationAdviceV03.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV03.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#DropAgent
 * CorporateActionCancellationAdviceV03.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#SolicitationAgent
 * CorporateActionCancellationAdviceV03.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#InformationAgent
 * CorporateActionCancellationAdviceV03.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#IssuerAgent
 * CorporateActionCancellationAdviceV04.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#PayingAgent
 * CorporateActionCancellationAdviceV04.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#SubPayingAgent
 * CorporateActionCancellationAdviceV04.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#Registrar
 * CorporateActionCancellationAdviceV04.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#ResellingAgent
 * CorporateActionCancellationAdviceV04.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV04.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#DropAgent
 * CorporateActionCancellationAdviceV04.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#SolicitationAgent
 * CorporateActionCancellationAdviceV04.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#InformationAgent
 * CorporateActionCancellationAdviceV04.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#IssuerAgent
 * CorporateActionMovementConfirmationV02.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#PayingAgent
 * CorporateActionMovementConfirmationV02.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#SubPayingAgent
 * CorporateActionMovementConfirmationV02.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#IssuerAgent
 * CorporateActionMovementConfirmationV03.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#PayingAgent
 * CorporateActionMovementConfirmationV03.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#SubPayingAgent
 * CorporateActionMovementConfirmationV03.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#IssuerAgent
 * CorporateActionMovementConfirmationV04.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#PayingAgent
 * CorporateActionMovementConfirmationV04.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#SubPayingAgent
 * CorporateActionMovementConfirmationV04.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceV02.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#PayingAgent
 * CorporateActionMovementPreliminaryAdviceV02.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV02.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#Registrar
 * CorporateActionMovementPreliminaryAdviceV02.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceV02.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV02.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#DropAgent
 * CorporateActionMovementPreliminaryAdviceV02.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV02.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#InformationAgent
 * CorporateActionMovementPreliminaryAdviceV02.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceV03.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#PayingAgent
 * CorporateActionMovementPreliminaryAdviceV03.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV03.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#Registrar
 * CorporateActionMovementPreliminaryAdviceV03.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceV03.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV03.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#DropAgent
 * CorporateActionMovementPreliminaryAdviceV03.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV03.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#InformationAgent
 * CorporateActionMovementPreliminaryAdviceV03.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceV04.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#PayingAgent
 * CorporateActionMovementPreliminaryAdviceV04.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV04.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#Registrar
 * CorporateActionMovementPreliminaryAdviceV04.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceV04.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV04.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#DropAgent
 * CorporateActionMovementPreliminaryAdviceV04.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV04.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#InformationAgent
 * CorporateActionMovementPreliminaryAdviceV04.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.SubPayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.ResellingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.SubPayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.ResellingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.SubPayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.ResellingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#IssuerAgent
 * CorporateActionMovementReversalAdviceV02.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#PayingAgent
 * CorporateActionMovementReversalAdviceV02.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#SubPayingAgent
 * CorporateActionMovementReversalAdviceV02.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#IssuerAgent
 * CorporateActionMovementReversalAdviceV03.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#PayingAgent
 * CorporateActionMovementReversalAdviceV03.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#SubPayingAgent
 * CorporateActionMovementReversalAdviceV03.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#IssuerAgent
 * CorporateActionMovementReversalAdviceV04.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#PayingAgent
 * CorporateActionMovementReversalAdviceV04.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#SubPayingAgent
 * CorporateActionMovementReversalAdviceV04.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.SubPayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.ResellingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#IssuerAgent
 * CorporateActionCancellationAdviceV05.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#PayingAgent
 * CorporateActionCancellationAdviceV05.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#SubPayingAgent
 * CorporateActionCancellationAdviceV05.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#Registrar
 * CorporateActionCancellationAdviceV05.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#ResellingAgent
 * CorporateActionCancellationAdviceV05.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV05.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#DropAgent
 * CorporateActionCancellationAdviceV05.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#SolicitationAgent
 * CorporateActionCancellationAdviceV05.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#InformationAgent
 * CorporateActionCancellationAdviceV05.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#IssuerAgent
 * CorporateActionMovementConfirmationV05.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#PayingAgent
 * CorporateActionMovementConfirmationV05.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#SubPayingAgent
 * CorporateActionMovementConfirmationV05.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceV05.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#PayingAgent
 * CorporateActionMovementPreliminaryAdviceV05.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV05.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#Registrar
 * CorporateActionMovementPreliminaryAdviceV05.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceV05.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV05.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#DropAgent
 * CorporateActionMovementPreliminaryAdviceV05.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV05.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#InformationAgent
 * CorporateActionMovementPreliminaryAdviceV05.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#IssuerAgent
 * CorporateActionMovementReversalAdviceV05.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#PayingAgent
 * CorporateActionMovementReversalAdviceV05.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#SubPayingAgent
 * CorporateActionMovementReversalAdviceV05.SubPayingAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification46Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of a party."</li>
 * </ul>
 */
public class PartyIdentification46Choice {

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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
			componentContext_lazy = () -> PartyIdentification46Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
			componentContext_lazy = () -> PartyIdentification46Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification19.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Name and address of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	public static final MMMessageAssociationEnd NameAndAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyIdentification46Choice.mmObject();
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> NameAndAddress5.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification46Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification46Choice.ProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification46Choice.NameAndAddress);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.Registrar,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.DropAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02.InformationAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.PayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.Registrar, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.Registrar,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.DropAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.DropAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.Registrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.DropAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.InformationAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.PayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.Registrar, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.Registrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05.SubPayingAgent);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentification46Choice";
				definition = "Choice of identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}
}