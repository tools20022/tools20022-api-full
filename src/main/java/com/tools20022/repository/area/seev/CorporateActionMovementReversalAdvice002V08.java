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
import com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant;
import com.tools20022.repository.choice.PartyIdentification104Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion;
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdvice002V08.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdvice002V08.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmEventsLinkage
 * CorporateActionMovementReversalAdvice002V08.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmReversalReason
 * CorporateActionMovementReversalAdvice002V08.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmCorporateActionGeneralInformation
 * CorporateActionMovementReversalAdvice002V08.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmAccountDetails
 * CorporateActionMovementReversalAdvice002V08.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmCorporateActionDetails
 * CorporateActionMovementReversalAdvice002V08.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmCorporateActionConfirmationDetails
 * CorporateActionMovementReversalAdvice002V08.
 * mmCorporateActionConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmAdditionalInformation
 * CorporateActionMovementReversalAdvice002V08.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmSupplementaryData
 * CorporateActionMovementReversalAdvice002V08.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion
 * CorporateActionsISO15022VariantsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntRvslAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant
 * SecuritiesEventsLatestversionsubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.037.002.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#forCorporateActionMovementReversalAdvice002V08
 * ConstraintOptionNumberRule.forCorporateActionMovementReversalAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherDocumentIdentificationRule#forCorporateActionMovementReversalAdvice002V08
 * ConstraintOtherDocumentIdentificationRule.
 * forCorporateActionMovementReversalAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdvice002V08
 * ConstraintAdditionalInformationRule.
 * forCorporateActionMovementReversalAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdvice002V08
 * ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdvice002V08
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment1Rule#forCorporateActionMovementReversalAdvice002V08
 * ConstraintScripOrDividendReinvestment1Rule.
 * forCorporateActionMovementReversalAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment2Rule#forCorporateActionMovementReversalAdvice002V08
 * ConstraintScripOrDividendReinvestment2Rule.
 * forCorporateActionMovementReversalAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdvice002V08
 * ConstraintScripOrDividendReinvestment3Rule.
 * forCorporateActionMovementReversalAdvice002V08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementReversalAdvice002V08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementReversalAdvice message to an account owner or its designated agent to reverse previously confirmed posting of securities or cash.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementReversalAdvice002V08", propOrder = {"movementConfirmationIdentification", "otherDocumentIdentification", "eventsLinkage", "reversalReason", "corporateActionGeneralInformation", "accountDetails",
		"corporateActionDetails", "corporateActionConfirmationDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "supplementaryData"})
public class CorporateActionMovementReversalAdvice002V08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MvmntConfId", required = true)
	protected DocumentIdentification37 movementConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37
	 * DocumentIdentification37}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMovementConfirmationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementConfirmationIdentification";
			definition = "Identification of a previously sent movement confirmation document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getMovementConfirmationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification38> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38
	 * DocumentIdentification38}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherDocumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification38.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getOtherDocumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference4> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4
	 * CorporateActionEventReference4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEventsLinkage = new MMMessageBuildingBlock() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getEventsLinkage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RvslRsn")
	protected CorporateActionReversalReason4 reversalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4
	 * CorporateActionReversalReason4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReversalReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "RvslRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionReversalReason4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getReversalReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation118 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118
	 * CorporateActionGeneralInformation118}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation118.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountAndBalance40 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance40
	 * AccountAndBalance40}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountAndBalance40.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction36 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36
	 * CorporateAction36}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getCorporateActionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnConfDtls", required = true)
	protected CorporateActionOption126 corporateActionConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126
	 * CorporateActionOption126}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionConfirmationDetails";
			definition = "Information about the corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption126.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getCorporateActionConfirmationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative35 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative35
	 * CorporateActionNarrative35}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative35.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification104Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIssuerAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getIssuerAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification104Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification104Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getSubPayingAgent", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementReversalAdvice002V08.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.forCorporateActionMovementReversalAdvice002V08,
						com.tools20022.repository.constraints.ConstraintOtherDocumentIdentificationRule.forCorporateActionMovementReversalAdvice002V08,
						com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdvice002V08,
						com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdvice002V08,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment1Rule.forCorporateActionMovementReversalAdvice002V08,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment2Rule.forCorporateActionMovementReversalAdvice002V08,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdvice002V08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementReversalAdvice002V08";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementReversalAdvice message to an account owner or its designated agent to reverse previously confirmed posting of securities or cash.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISO15022VariantsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntRvslAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmMovementConfirmationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmOtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmReversalReason, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmCorporateActionConfirmationDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "037";
						version = "08";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementReversalAdvice002V08.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification37 getMovementConfirmationIdentification() {
		return movementConfirmationIdentification;
	}

	public CorporateActionMovementReversalAdvice002V08 setMovementConfirmationIdentification(DocumentIdentification37 movementConfirmationIdentification) {
		this.movementConfirmationIdentification = Objects.requireNonNull(movementConfirmationIdentification);
		return this;
	}

	public List<DocumentIdentification38> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionMovementReversalAdvice002V08 setOtherDocumentIdentification(List<DocumentIdentification38> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference4> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionMovementReversalAdvice002V08 setEventsLinkage(List<CorporateActionEventReference4> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public Optional<CorporateActionReversalReason4> getReversalReason() {
		return reversalReason == null ? Optional.empty() : Optional.of(reversalReason);
	}

	public CorporateActionMovementReversalAdvice002V08 setReversalReason(CorporateActionReversalReason4 reversalReason) {
		this.reversalReason = reversalReason;
		return this;
	}

	public CorporateActionGeneralInformation118 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementReversalAdvice002V08 setCorporateActionGeneralInformation(CorporateActionGeneralInformation118 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountAndBalance40 getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementReversalAdvice002V08 setAccountDetails(AccountAndBalance40 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction36> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementReversalAdvice002V08 setCorporateActionDetails(CorporateAction36 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public CorporateActionOption126 getCorporateActionConfirmationDetails() {
		return corporateActionConfirmationDetails;
	}

	public CorporateActionMovementReversalAdvice002V08 setCorporateActionConfirmationDetails(CorporateActionOption126 corporateActionConfirmationDetails) {
		this.corporateActionConfirmationDetails = Objects.requireNonNull(corporateActionConfirmationDetails);
		return this;
	}

	public Optional<CorporateActionNarrative35> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionMovementReversalAdvice002V08 setAdditionalInformation(CorporateActionNarrative35 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification104Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementReversalAdvice002V08 setIssuerAgent(List<PartyIdentification104Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementReversalAdvice002V08 setPayingAgent(List<PartyIdentification104Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementReversalAdvice002V08 setSubPayingAgent(List<PartyIdentification104Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementReversalAdvice002V08 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.002.08")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
		public CorporateActionMovementReversalAdvice002V08 messageBody;
	}
}