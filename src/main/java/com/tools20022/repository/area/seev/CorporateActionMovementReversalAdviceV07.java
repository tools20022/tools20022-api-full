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
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionMovementReversalAdvice message
 * to an account owner or its designated agent to reverse previously confirmed
 * posting of securities or cash.<br>
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV07.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV07.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmReversalReason
 * CorporateActionMovementReversalAdviceV07.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmCorporateActionGeneralInformation
 * CorporateActionMovementReversalAdviceV07.mmCorporateActionGeneralInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmAccountDetails
 * CorporateActionMovementReversalAdviceV07.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmCorporateActionDetails
 * CorporateActionMovementReversalAdviceV07.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmCorporateActionConfirmationDetails
 * CorporateActionMovementReversalAdviceV07.mmCorporateActionConfirmationDetails
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmAdditionalInformation
 * CorporateActionMovementReversalAdviceV07.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmSupplementaryData
 * CorporateActionMovementReversalAdviceV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOPreviousversion
 * CorporateActionsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntRvslAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.037.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#forCorporateActionMovementReversalAdviceV07
 * ConstraintOptionNumberRule.forCorporateActionMovementReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherDocumentIdentificationRule#forCorporateActionMovementReversalAdviceV07
 * ConstraintOtherDocumentIdentificationRule.
 * forCorporateActionMovementReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV07
 * ConstraintAdditionalInformationRule.
 * forCorporateActionMovementReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV07
 * ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment1Rule#forCorporateActionMovementReversalAdviceV07
 * ConstraintScripOrDividendReinvestment1Rule.
 * forCorporateActionMovementReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment2Rule#forCorporateActionMovementReversalAdviceV07
 * ConstraintScripOrDividendReinvestment2Rule.
 * forCorporateActionMovementReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV07
 * ConstraintScripOrDividendReinvestment3Rule.
 * forCorporateActionMovementReversalAdviceV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementReversalAdviceV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementReversalAdvice message to an account owner or its designated agent to reverse previously confirmed posting of securities or cash.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08
 * CorporateActionMovementReversalAdviceV08}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
 * CorporateActionMovementReversalAdviceV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementReversalAdviceV07", propOrder = {"movementConfirmationIdentification", "otherDocumentIdentification", "eventsLinkage", "reversalReason", "corporateActionGeneralInformation", "accountDetails",
		"corporateActionDetails", "corporateActionConfirmationDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "supplementaryData"})
public class CorporateActionMovementReversalAdviceV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MvmntConfId", required = true)
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement confirmation document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmMovementConfirmationIdentification
	 * CorporateActionMovementReversalAdviceV08.
	 * mmMovementConfirmationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmMovementConfirmationIdentification
	 * CorporateActionMovementReversalAdviceV06.
	 * mmMovementConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMovementConfirmationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementConfirmationIdentification";
			definition = "Identification of a previously sent movement confirmation document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmMovementConfirmationIdentification);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmMovementConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getMovementConfirmationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmOtherDocumentIdentification
	 * CorporateActionMovementReversalAdviceV08.mmOtherDocumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmOtherDocumentIdentification
	 * CorporateActionMovementReversalAdviceV06.mmOtherDocumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherDocumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmOtherDocumentIdentification);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmOtherDocumentIdentification;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification32.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getOtherDocumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmEventsLinkage
	 * CorporateActionMovementReversalAdviceV08.mmEventsLinkage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmEventsLinkage
	 * CorporateActionMovementReversalAdviceV06.mmEventsLinkage}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEventsLinkage = new MMMessageBuildingBlock() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmEventsLinkage);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmEventsLinkage;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getEventsLinkage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmReversalReason
	 * CorporateActionMovementReversalAdviceV08.mmReversalReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmReversalReason
	 * CorporateActionMovementReversalAdviceV06.mmReversalReason}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReversalReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "RvslRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmReversalReason);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmReversalReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionReversalReason3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getReversalReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation89 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89
	 * CorporateActionGeneralInformation89}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmCorporateActionGeneralInformation
	 * CorporateActionMovementReversalAdviceV08.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmCorporateActionGeneralInformation
	 * CorporateActionMovementReversalAdviceV06.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmCorporateActionGeneralInformation);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation89.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountAndBalance36 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance36
	 * AccountAndBalance36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account, owner and account balance."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmAccountDetails
	 * CorporateActionMovementReversalAdviceV08.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmAccountDetails
	 * CorporateActionMovementReversalAdviceV06.mmAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmAccountDetails);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountAndBalance36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction33 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33
	 * CorporateAction33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmCorporateActionDetails
	 * CorporateActionMovementReversalAdviceV08.mmCorporateActionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmCorporateActionDetails
	 * CorporateActionMovementReversalAdviceV06.mmCorporateActionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmCorporateActionDetails);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmCorporateActionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction33.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getCorporateActionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnConfDtls", required = true)
	protected CorporateActionOption119 corporateActionConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119
	 * CorporateActionOption119}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmCorporateActionConfirmationDetails
	 * CorporateActionMovementReversalAdviceV08.
	 * mmCorporateActionConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmCorporateActionConfirmationDetails
	 * CorporateActionMovementReversalAdviceV06.
	 * mmCorporateActionConfirmationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionConfirmationDetails";
			definition = "Information about the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmCorporateActionConfirmationDetails);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmCorporateActionConfirmationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption119.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getCorporateActionConfirmationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative31 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative31
	 * CorporateActionNarrative31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmAdditionalInformation
	 * CorporateActionMovementReversalAdviceV08.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmAdditionalInformation
	 * CorporateActionMovementReversalAdviceV06.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmAdditionalInformation);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmIssuerAgent
	 * CorporateActionMovementReversalAdviceV08.mmIssuerAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmIssuerAgent
	 * CorporateActionMovementReversalAdviceV06.mmIssuerAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIssuerAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmIssuerAgent);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmIssuerAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getIssuerAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmPayingAgent
	 * CorporateActionMovementReversalAdviceV08.mmPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmPayingAgent
	 * CorporateActionMovementReversalAdviceV06.mmPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmPayingAgent);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmSubPayingAgent
	 * CorporateActionMovementReversalAdviceV08.mmSubPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmSubPayingAgent
	 * CorporateActionMovementReversalAdviceV06.mmSubPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmSubPayingAgent);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmSubPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getSubPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmSupplementaryData
	 * CorporateActionMovementReversalAdviceV08.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmSupplementaryData
	 * CorporateActionMovementReversalAdviceV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmSupplementaryData);
			previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdviceV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.forCorporateActionMovementReversalAdviceV07,
						com.tools20022.repository.constraints.ConstraintOtherDocumentIdentificationRule.forCorporateActionMovementReversalAdviceV07,
						com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV07,
						com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV07,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment1Rule.forCorporateActionMovementReversalAdviceV07,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment2Rule.forCorporateActionMovementReversalAdviceV07,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementReversalAdviceV07";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementReversalAdvice message to an account owner or its designated agent to reverse previously confirmed posting of securities or cash.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV08.mmObject());
				previousVersion_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntRvslAdvc";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmMovementConfirmationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmOtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmReversalReason, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmCorporateActionConfirmationDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "037";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementReversalAdviceV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification31 getMovementConfirmationIdentification() {
		return movementConfirmationIdentification;
	}

	public CorporateActionMovementReversalAdviceV07 setMovementConfirmationIdentification(DocumentIdentification31 movementConfirmationIdentification) {
		this.movementConfirmationIdentification = Objects.requireNonNull(movementConfirmationIdentification);
		return this;
	}

	public List<DocumentIdentification32> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionMovementReversalAdviceV07 setOtherDocumentIdentification(List<DocumentIdentification32> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference3> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionMovementReversalAdviceV07 setEventsLinkage(List<CorporateActionEventReference3> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public Optional<CorporateActionReversalReason3> getReversalReason() {
		return reversalReason == null ? Optional.empty() : Optional.of(reversalReason);
	}

	public CorporateActionMovementReversalAdviceV07 setReversalReason(CorporateActionReversalReason3 reversalReason) {
		this.reversalReason = reversalReason;
		return this;
	}

	public CorporateActionGeneralInformation89 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementReversalAdviceV07 setCorporateActionGeneralInformation(CorporateActionGeneralInformation89 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountAndBalance36 getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementReversalAdviceV07 setAccountDetails(AccountAndBalance36 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction33> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementReversalAdviceV07 setCorporateActionDetails(CorporateAction33 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public CorporateActionOption119 getCorporateActionConfirmationDetails() {
		return corporateActionConfirmationDetails;
	}

	public CorporateActionMovementReversalAdviceV07 setCorporateActionConfirmationDetails(CorporateActionOption119 corporateActionConfirmationDetails) {
		this.corporateActionConfirmationDetails = Objects.requireNonNull(corporateActionConfirmationDetails);
		return this;
	}

	public Optional<CorporateActionNarrative31> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionMovementReversalAdviceV07 setAdditionalInformation(CorporateActionNarrative31 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification71Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementReversalAdviceV07 setIssuerAgent(List<PartyIdentification71Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementReversalAdviceV07 setPayingAgent(List<PartyIdentification71Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementReversalAdviceV07 setSubPayingAgent(List<PartyIdentification71Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementReversalAdviceV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.001.07")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
		public CorporateActionMovementReversalAdviceV07 messageBody;
	}
}