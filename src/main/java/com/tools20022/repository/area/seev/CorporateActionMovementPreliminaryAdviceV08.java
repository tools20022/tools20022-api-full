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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsPreviousVersion;
import com.tools20022.repository.choice.AccountIdentification32Choice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISOPreviousversion;
import com.tools20022.repository.msgset.CorporateActionsMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionMovementPreliminaryAdvice
 * message to an account owner or its designated agent to pre-advise upcoming
 * posting or reversal of securities and/or cash postings.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate),<br>
 * using the relevant elements in the business application header (BAH).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.035.001.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmPagination
 * CorporateActionMovementPreliminaryAdviceV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmMovementPreliminaryAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV08.
 * mmMovementPreliminaryAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV08.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV08.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV08.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV08.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV08.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV08.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmReversalReason
 * CorporateActionMovementPreliminaryAdviceV08.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV08.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceV08.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmCorporateActionDetails
 * CorporateActionMovementPreliminaryAdviceV08.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmCorporateActionMovementDetails
 * CorporateActionMovementPreliminaryAdviceV08.mmCorporateActionMovementDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmAdditionalInformation
 * CorporateActionMovementPreliminaryAdviceV08.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceV08.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOPreviousversion
 * CorporateActionsISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsMaintenance20162017
 * CorporateActionsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntPrlimryAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementPreliminaryAdviceV08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
 * ConstraintRateAndCorporateActionEventRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#for_seev_CorporateActionMovementPreliminaryAdviceV08
 * ConstraintSafekeepingAccount1Rule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule#for_seev_CorporateActionMovementPreliminaryAdviceV08
 * ConstraintSafekeepingAccount2Rule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
 * ConstraintOtherEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV08
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistributionRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
 * ConstraintIntermediateSecuritiesDistributionRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
 * ConstraintAppliedOptionRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
 * CorporateActionMovementPreliminaryAdviceV09}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07
 * CorporateActionMovementPreliminaryAdviceV07}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceV08", propOrder = {"pagination", "movementPreliminaryAdviceGeneralInformation", "previousMovementPreliminaryAdviceIdentification", "notificationIdentification",
		"movementConfirmationIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage", "reversalReason", "corporateActionGeneralInformation", "accountDetails", "corporateActionDetails",
		"corporateActionMovementDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "registrar", "resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent",
		"supplementaryData"})
public class CorporateActionMovementPreliminaryAdviceV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn")
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and continuation indicator to indicate that the multi-parts preliminary advice is to continue or that the message is the last page of the multi-parts preliminary advice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmPagination
	 * CorporateActionMovementPreliminaryAdviceV09.mmPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPagination
	 * CorporateActionMovementPreliminaryAdviceV07.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<Pagination>> mmPagination = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<Pagination>>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-parts preliminary advice is to continue or that the message is the last page of the multi-parts preliminary advice.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmPagination);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmPagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<Pagination> value) {
			obj.setPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "MvmntPrlimryAdvcGnlInf", required = true)
	protected CorporateActionPreliminaryAdviceType2 movementPreliminaryAdviceGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2
	 * CorporateActionPreliminaryAdviceType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntPrlimryAdvcGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementPreliminaryAdviceGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the movement preliminary advice document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmMovementPreliminaryAdviceGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV09.
	 * mmMovementPreliminaryAdviceGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmMovementPreliminaryAdviceGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmMovementPreliminaryAdviceGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, CorporateActionPreliminaryAdviceType2> mmMovementPreliminaryAdviceGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, CorporateActionPreliminaryAdviceType2>() {
		{
			xmlTag = "MvmntPrlimryAdvcGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceGeneralInformation";
			definition = "General information about the movement preliminary advice document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmMovementPreliminaryAdviceGeneralInformation);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmMovementPreliminaryAdviceGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionPreliminaryAdviceType2.mmObject();
		}

		@Override
		public CorporateActionPreliminaryAdviceType2 getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getMovementPreliminaryAdviceGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, CorporateActionPreliminaryAdviceType2 value) {
			obj.setMovementPreliminaryAdviceGeneralInformation(value);
		}
	};
	@XmlElement(name = "PrvsMvmntPrlimryAdvcId")
	protected DocumentIdentification31 previousMovementPreliminaryAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31
	 * DocumentIdentification31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsMvmntPrlimryAdvcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousMovementPreliminaryAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement preliminary advice document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmPreviousMovementPreliminaryAdviceIdentification
	 * CorporateActionMovementPreliminaryAdviceV09.
	 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPreviousMovementPreliminaryAdviceIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification31>> mmPreviousMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification31>>() {
		{
			xmlTag = "PrvsMvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousMovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmPreviousMovementPreliminaryAdviceIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmPreviousMovementPreliminaryAdviceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		@Override
		public Optional<DocumentIdentification31> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getPreviousMovementPreliminaryAdviceIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<DocumentIdentification31> value) {
			obj.setPreviousMovementPreliminaryAdviceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnId")
	protected DocumentIdentification31 notificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31
	 * DocumentIdentification31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmNotificationIdentification
	 * CorporateActionMovementPreliminaryAdviceV09.mmNotificationIdentification}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmNotificationIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.mmNotificationIdentification}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification31>> mmNotificationIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification31>>() {
		{
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmNotificationIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmNotificationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		@Override
		public Optional<DocumentIdentification31> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<DocumentIdentification31> value) {
			obj.setNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MvmntConfId")
	protected DocumentIdentification31 movementConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31
	 * DocumentIdentification31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntConfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement confirmation document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmMovementConfirmationIdentification
	 * CorporateActionMovementPreliminaryAdviceV09.
	 * mmMovementConfirmationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmMovementConfirmationIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmMovementConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification31>> mmMovementConfirmationIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification31>>() {
		{
			xmlTag = "MvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementConfirmationIdentification";
			definition = "Identification of a previously sent movement confirmation document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmMovementConfirmationIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmMovementConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		@Override
		public Optional<DocumentIdentification31> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getMovementConfirmationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<DocumentIdentification31> value) {
			obj.setMovementConfirmationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrId")
	protected DocumentIdentification9 instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmInstructionIdentification
	 * CorporateActionMovementPreliminaryAdviceV09.mmInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmInstructionIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.mmInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification9>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<DocumentIdentification9>>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmInstructionIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public Optional<DocumentIdentification9> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<DocumentIdentification9> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification32> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32
	 * DocumentIdentification32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmOtherDocumentIdentification
	 * CorporateActionMovementPreliminaryAdviceV09.mmOtherDocumentIdentification
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmOtherDocumentIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.mmOtherDocumentIdentification
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<DocumentIdentification32>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<DocumentIdentification32>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmOtherDocumentIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmOtherDocumentIdentification;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification32.mmObject();
		}

		@Override
		public List<DocumentIdentification32> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<DocumentIdentification32> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference3> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
	 * CorporateActionEventReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtsLkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmEventsLinkage
	 * CorporateActionMovementPreliminaryAdviceV09.mmEventsLinkage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmEventsLinkage
	 * CorporateActionMovementPreliminaryAdviceV07.mmEventsLinkage}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<CorporateActionEventReference3>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<CorporateActionEventReference3>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmEventsLinkage);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmEventsLinkage;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference3.mmObject();
		}

		@Override
		public List<CorporateActionEventReference3> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<CorporateActionEventReference3> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "RvslRsn")
	protected CorporateActionReversalReason3 reversalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3
	 * CorporateActionReversalReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmReversalReason
	 * CorporateActionMovementPreliminaryAdviceV09.mmReversalReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmReversalReason
	 * CorporateActionMovementPreliminaryAdviceV07.mmReversalReason}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<CorporateActionReversalReason3>> mmReversalReason = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<CorporateActionReversalReason3>>() {
		{
			xmlTag = "RvslRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmReversalReason);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmReversalReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionReversalReason3.mmObject();
		}

		@Override
		public Optional<CorporateActionReversalReason3> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getReversalReason();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<CorporateActionReversalReason3> value) {
			obj.setReversalReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation106 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106
	 * CorporateActionGeneralInformation106}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmCorporateActionGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV09.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmCorporateActionGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, CorporateActionGeneralInformation106> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, CorporateActionGeneralInformation106>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmCorporateActionGeneralInformation);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation106.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation106 getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, CorporateActionGeneralInformation106 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification32Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice
	 * AccountIdentification32Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account, owner and account balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmAccountDetails
	 * CorporateActionMovementPreliminaryAdviceV09.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmAccountDetails
	 * CorporateActionMovementPreliminaryAdviceV07.mmAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, AccountIdentification32Choice> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, AccountIdentification32Choice>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmAccountDetails);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification32Choice.mmObject();
		}

		@Override
		public AccountIdentification32Choice getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, AccountIdentification32Choice value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction32 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32
	 * CorporateAction32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmCorporateActionDetails
	 * CorporateActionMovementPreliminaryAdviceV09.mmCorporateActionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmCorporateActionDetails
	 * CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<CorporateAction32>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<CorporateAction32>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmCorporateActionDetails);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction32.mmObject();
		}

		@Override
		public Optional<CorporateAction32> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<CorporateAction32> value) {
			obj.setCorporateActionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnMvmntDtls")
	protected List<CorporateActionOption129> corporateActionMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129
	 * CorporateActionOption129}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnMvmntDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmCorporateActionMovementDetails
	 * CorporateActionMovementPreliminaryAdviceV09.
	 * mmCorporateActionMovementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmCorporateActionMovementDetails
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmCorporateActionMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<CorporateActionOption129>> mmCorporateActionMovementDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<CorporateActionOption129>>() {
		{
			xmlTag = "CorpActnMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionMovementDetails";
			definition = "Information about the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmCorporateActionMovementDetails);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionMovementDetails;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption129.mmObject();
		}

		@Override
		public List<CorporateActionOption129> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getCorporateActionMovementDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<CorporateActionOption129> value) {
			obj.setCorporateActionMovementDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative28 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28
	 * CorporateActionNarrative28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmAdditionalInformation
	 * CorporateActionMovementPreliminaryAdviceV09.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmAdditionalInformation
	 * CorporateActionMovementPreliminaryAdviceV07.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<CorporateActionNarrative28>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<CorporateActionNarrative28>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmAdditionalInformation);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative28.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative28> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<CorporateActionNarrative28> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification71Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmIssuerAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmIssuerAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmIssuerAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmIssuerAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmIssuerAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmIssuerAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<PartyIdentification71Choice> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification71Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmPayingAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<PartyIdentification71Choice> value) {
			obj.setPayingAgent(value);
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification71Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmSubPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmSubPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSubPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmSubPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmSubPayingAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmSubPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<PartyIdentification71Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "Regar")
	protected PartyIdentification71Choice registrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regar"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party/agent responsible for maintaining the register of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmRegistrar
	 * CorporateActionMovementPreliminaryAdviceV09.mmRegistrar}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmRegistrar
	 * CorporateActionMovementPreliminaryAdviceV07.mmRegistrar}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>> mmRegistrar = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmRegistrar);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmRegistrar;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getRegistrar();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<PartyIdentification71Choice> value) {
			obj.setRegistrar(value.orElse(null));
		}
	};
	@XmlElement(name = "RsellngAgt")
	protected List<PartyIdentification71Choice> resellingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsellngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResellingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmResellingAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmResellingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmResellingAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmResellingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>> mmResellingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmResellingAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmResellingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getResellingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<PartyIdentification71Choice> value) {
			obj.setResellingAgent(value);
		}
	};
	@XmlElement(name = "PhysSctiesAgt")
	protected PartyIdentification71Choice physicalSecuritiesAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysSctiesAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmPhysicalSecuritiesAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPhysicalSecuritiesAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>> mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmPhysicalSecuritiesAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmPhysicalSecuritiesAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getPhysicalSecuritiesAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<PartyIdentification71Choice> value) {
			obj.setPhysicalSecuritiesAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrpAgt")
	protected PartyIdentification71Choice dropAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrpAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DropAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmDropAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmDropAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmDropAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmDropAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>> mmDropAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmDropAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmDropAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getDropAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<PartyIdentification71Choice> value) {
			obj.setDropAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnAgt")
	protected List<PartyIdentification71Choice> solicitationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmSolicitationAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmSolicitationAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSolicitationAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmSolicitationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>> mmSolicitationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmSolicitationAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmSolicitationAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getSolicitationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<PartyIdentification71Choice> value) {
			obj.setSolicitationAgent(value);
		}
	};
	@XmlElement(name = "InfAgt")
	protected PartyIdentification71Choice informationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmInformationAgent
	 * CorporateActionMovementPreliminaryAdviceV09.mmInformationAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmInformationAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmInformationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>> mmInformationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmInformationAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmInformationAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getInformationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, Optional<PartyIdentification71Choice> value) {
			obj.setInformationAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmSupplementaryData
	 * CorporateActionMovementPreliminaryAdviceV09.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSupplementaryData
	 * CorporateActionMovementPreliminaryAdviceV07.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV08, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmSupplementaryData);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionMovementPreliminaryAdviceV08 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV08 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV08,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionMovementPreliminaryAdviceV08,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionMovementPreliminaryAdviceV08,
						com.tools20022.repository.constraints.ConstraintOtherEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV08,
						com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistributionRule.for_seev_CorporateActionMovementPreliminaryAdviceV08,
						com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionMovementPreliminaryAdviceV08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementPreliminaryAdviceV08";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV09.mmObject());
				previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmObject();
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISOPreviousversion.mmObject(), CorporateActionsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntPrlimryAdvc";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmMovementPreliminaryAdviceGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmPreviousMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmMovementConfirmationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmInstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmOtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmReversalReason, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmCorporateActionMovementDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmRegistrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmPhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmSolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "035";
						version = "08";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementPreliminaryAdviceV08.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Pagination> getPagination() {
		return pagination == null ? Optional.empty() : Optional.of(pagination);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}

	public CorporateActionPreliminaryAdviceType2 getMovementPreliminaryAdviceGeneralInformation() {
		return movementPreliminaryAdviceGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setMovementPreliminaryAdviceGeneralInformation(CorporateActionPreliminaryAdviceType2 movementPreliminaryAdviceGeneralInformation) {
		this.movementPreliminaryAdviceGeneralInformation = Objects.requireNonNull(movementPreliminaryAdviceGeneralInformation);
		return this;
	}

	public Optional<DocumentIdentification31> getPreviousMovementPreliminaryAdviceIdentification() {
		return previousMovementPreliminaryAdviceIdentification == null ? Optional.empty() : Optional.of(previousMovementPreliminaryAdviceIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setPreviousMovementPreliminaryAdviceIdentification(DocumentIdentification31 previousMovementPreliminaryAdviceIdentification) {
		this.previousMovementPreliminaryAdviceIdentification = previousMovementPreliminaryAdviceIdentification;
		return this;
	}

	public Optional<DocumentIdentification31> getNotificationIdentification() {
		return notificationIdentification == null ? Optional.empty() : Optional.of(notificationIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setNotificationIdentification(DocumentIdentification31 notificationIdentification) {
		this.notificationIdentification = notificationIdentification;
		return this;
	}

	public Optional<DocumentIdentification31> getMovementConfirmationIdentification() {
		return movementConfirmationIdentification == null ? Optional.empty() : Optional.of(movementConfirmationIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setMovementConfirmationIdentification(DocumentIdentification31 movementConfirmationIdentification) {
		this.movementConfirmationIdentification = movementConfirmationIdentification;
		return this;
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setInstructionIdentification(DocumentIdentification9 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification32> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setOtherDocumentIdentification(List<DocumentIdentification32> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference3> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setEventsLinkage(List<CorporateActionEventReference3> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public Optional<CorporateActionReversalReason3> getReversalReason() {
		return reversalReason == null ? Optional.empty() : Optional.of(reversalReason);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setReversalReason(CorporateActionReversalReason3 reversalReason) {
		this.reversalReason = reversalReason;
		return this;
	}

	public CorporateActionGeneralInformation106 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setCorporateActionGeneralInformation(CorporateActionGeneralInformation106 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification32Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setAccountDetails(AccountIdentification32Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction32> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setCorporateActionDetails(CorporateAction32 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public List<CorporateActionOption129> getCorporateActionMovementDetails() {
		return corporateActionMovementDetails == null ? corporateActionMovementDetails = new ArrayList<>() : corporateActionMovementDetails;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setCorporateActionMovementDetails(List<CorporateActionOption129> corporateActionMovementDetails) {
		this.corporateActionMovementDetails = Objects.requireNonNull(corporateActionMovementDetails);
		return this;
	}

	public Optional<CorporateActionNarrative28> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setAdditionalInformation(CorporateActionNarrative28 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification71Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setIssuerAgent(List<PartyIdentification71Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setPayingAgent(List<PartyIdentification71Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setSubPayingAgent(List<PartyIdentification71Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setRegistrar(PartyIdentification71Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification71Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setResellingAgent(List<PartyIdentification71Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setPhysicalSecuritiesAgent(PartyIdentification71Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification71Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setDropAgent(PartyIdentification71Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification71Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setSolicitationAgent(List<PartyIdentification71Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV08 setInformationAgent(PartyIdentification71Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementPreliminaryAdviceV08 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.08")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
		public CorporateActionMovementPreliminaryAdviceV08 messageBody;
	}
}