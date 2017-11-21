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
import com.tools20022.repository.choice.AccountIdentification36Choice;
import com.tools20022.repository.choice.PartyIdentification104Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionNotification message to an
 * account owner or its designated agent to notify details of a corporate action
 * event and optionally account information, eligible balance and entitlements. <br>
 * It may also include possible elections or choices available to the account
 * owner. The account servicer can initially send the
 * CorporateActionNotification message as a preliminary advice, subsequently
 * replaced by another CorporateActionNotification message with complete or
 * confirmed information. <br>
 * It may also be sent to an account owner or its designated agent, to remind of
 * event details and/or of missing or incomplete instructions for a corporate
 * action event.<br>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant
 * SecuritiesEventsLatestversionsubsetvariant}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion
 * CorporateActionsISO15022VariantsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmPagination
 * CorporateActionNotification002V07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmNotificationGeneralInformation
 * CorporateActionNotification002V07.mmNotificationGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmPreviousNotificationIdentification
 * CorporateActionNotification002V07.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmInstructionIdentification
 * CorporateActionNotification002V07.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmOtherDocumentIdentification
 * CorporateActionNotification002V07.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmEventsLinkage
 * CorporateActionNotification002V07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmCorporateActionGeneralInformation
 * CorporateActionNotification002V07.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmAccountDetails
 * CorporateActionNotification002V07.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmIntermediateSecurity
 * CorporateActionNotification002V07.mmIntermediateSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmCorporateActionDetails
 * CorporateActionNotification002V07.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmCorporateActionOptionDetails
 * CorporateActionNotification002V07.mmCorporateActionOptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmAdditionalInformation
 * CorporateActionNotification002V07.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmSupplementaryData
 * CorporateActionNotification002V07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.031.002.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotification002V07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionNotification002V07", propOrder = {"pagination", "notificationGeneralInformation", "previousNotificationIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage",
		"corporateActionGeneralInformation", "accountDetails", "intermediateSecurity", "corporateActionDetails", "corporateActionOptionDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "registrar",
		"resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionNotification002V07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Pagination pagination;
	/**
	 * Page number of the message and continuation indicator to indicate that
	 * the multi-parts notification is to continue or that the message is the
	 * last page of the multi-parts notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and  continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message and  continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionNotification6 notificationGeneralInformation;
	/**
	 * General information about the event notification type, status and
	 * contents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6
	 * CorporateActionNotification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the event notification type, status and contents."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotificationGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationGeneralInformation";
			definition = "General information about the event notification type, status and contents.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionNotification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getNotificationGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification37 previousNotificationIdentification;
	/**
	 * Identification of a previously sent notification document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37
	 * DocumentIdentification37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousNotificationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getPreviousNotificationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification17 instructionIdentification;
	/**
	 * Identification of a related instruction document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification17
	 * DocumentIdentification17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getInstructionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<DocumentIdentification38> otherDocumentIdentification;
	/**
	 * Identification of other documents as well as the document number.
	 * <p>
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
				return CorporateActionNotification002V07.class.getMethod("getOtherDocumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<CorporateActionEventReference4> eventsLinkage;
	/**
	 * Identification of an other corporate action event that needs to be
	 * closely linked to the processing of the event notified in this document.
	 * <p>
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
				return CorporateActionNotification002V07.class.getMethod("getEventsLinkage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionGeneralInformation113 corporateActionGeneralInformation;
	/**
	 * General information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113
	 * CorporateActionGeneralInformation113}</li>
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
			complexType_lazy = () -> CorporateActionGeneralInformation113.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountIdentification36Choice accountDetails;
	/**
	 * General information about the safekeeping account, owner and account
	 * balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification36Choice
	 * AccountIdentification36Choice}</li>
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
			complexType_lazy = () -> AccountIdentification36Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialInstrumentAttributes73 intermediateSecurity;
	/**
	 * Provides details on rights credited to the account as for instance
	 * trading period, expiry date, renounceability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73
	 * FinancialInstrumentAttributes73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on rights credited to the account as for instance trading period, expiry date, renounceability."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediateSecurity = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntrmdtScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecurity";
			definition = "Provides details on rights credited to the account as for instance trading period, expiry date, renounceability.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes73.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getIntermediateSecurity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateAction40 corporateActionDetails;
	/**
	 * Information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40
	 * CorporateAction40}</li>
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
			complexType_lazy = () -> CorporateAction40.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getCorporateActionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<CorporateActionOption133> corporateActionOptionDetails;
	/**
	 * Information about the corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133
	 * CorporateActionOption133}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnOptnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionOptionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnOptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionDetails";
			definition = "Information about the corporate action option.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption133.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getCorporateActionOptionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionNarrative41 additionalInformation;
	/**
	 * Provides additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
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
			complexType_lazy = () -> CorporateActionNarrative41.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification104Choice> issuerAgent;
	/**
	 * Party appointed to administer the event on behalf of the issuer
	 * company/offeror. The party may be contacted for more information about
	 * the event.
	 * <p>
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
				return CorporateActionNotification002V07.class.getMethod("getIssuerAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification104Choice> payingAgent;
	/**
	 * Agent (principal or fiscal paying agent) appointed to execute the payment
	 * for the corporate action event on behalf of the issuer company/offeror.
	 * <p>
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
				return CorporateActionNotification002V07.class.getMethod("getPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification104Choice> subPayingAgent;
	/**
	 * Sub-agent appointed to execute the payment for the corporate action event
	 * on behalf of the issuer company/offeror.
	 * <p>
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
				return CorporateActionNotification002V07.class.getMethod("getSubPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification104Choice registrar;
	/**
	 * Party/agent responsible for maintaining the register of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party/agent responsible for maintaining the register of a security."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRegistrar = new MMMessageBuildingBlock() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getRegistrar", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification104Choice> resellingAgent;
	/**
	 * A broker-dealer responsible for reselling to new investors securities
	 * (usually bonds) that have been tendered for purchase by their owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsellngAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResellingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResellingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner. ";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getResellingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification104Choice physicalSecuritiesAgent;
	/**
	 * A trust company, bank or similar financial institution assigned by an
	 * issuer to accept presentations of instruments, usually bonds, for
	 * transfer and or exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysSctiesAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getPhysicalSecuritiesAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification104Choice dropAgent;
	/**
	 * A trust company, bank or similar financial institution who acts on behalf
	 * of an out of town agent or event agent where securities can be delivered
	 * in person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrpAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DropAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDropAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getDropAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification104Choice> solicitationAgent;
	/**
	 * A trust company, bank or similar financial institution assigned by an
	 * issuer to maintain records of investors and account balances and
	 * transactions for the consent of a material change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSolicitationAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change. ";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getSolicitationAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification104Choice informationAgent;
	/**
	 * A trust company, bank or similar financial institution assigned by an
	 * Issuer to provide information and copies of the offering documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInformationAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification002V07.class.getMethod("getInformationAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
				return CorporateActionNotification002V07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification002V07";
				definition = "Scope\r\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISO15022VariantsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnNtfctn";
				businessArea_lazy = () -> SecuritiesEventsLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmNotificationGeneralInformation, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmPreviousNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmInstructionIdentification, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmIntermediateSecurity,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmCorporateActionDetails, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmCorporateActionOptionDetails,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmRegistrar, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmPhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmSolicitationAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "031";
						version = "07";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionNotification002V07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Pgntn")
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	@XmlElement(name = "NtfctnGnlInf", required = true)
	public CorporateActionNotification6 getNotificationGeneralInformation() {
		return notificationGeneralInformation;
	}

	public void setNotificationGeneralInformation(CorporateActionNotification6 notificationGeneralInformation) {
		this.notificationGeneralInformation = notificationGeneralInformation;
	}

	@XmlElement(name = "PrvsNtfctnId")
	public DocumentIdentification37 getPreviousNotificationIdentification() {
		return previousNotificationIdentification;
	}

	public void setPreviousNotificationIdentification(DocumentIdentification37 previousNotificationIdentification) {
		this.previousNotificationIdentification = previousNotificationIdentification;
	}

	@XmlElement(name = "InstrId")
	public DocumentIdentification17 getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(DocumentIdentification17 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	@XmlElement(name = "OthrDocId")
	public List<DocumentIdentification38> getOtherDocumentIdentification() {
		return otherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(List<DocumentIdentification38> otherDocumentIdentification) {
		this.otherDocumentIdentification = otherDocumentIdentification;
	}

	@XmlElement(name = "EvtsLkg")
	public List<CorporateActionEventReference4> getEventsLinkage() {
		return eventsLinkage;
	}

	public void setEventsLinkage(List<CorporateActionEventReference4> eventsLinkage) {
		this.eventsLinkage = eventsLinkage;
	}

	@XmlElement(name = "CorpActnGnlInf", required = true)
	public CorporateActionGeneralInformation113 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionGeneralInformation113 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public AccountIdentification36Choice getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountIdentification36Choice accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "IntrmdtScty")
	public FinancialInstrumentAttributes73 getIntermediateSecurity() {
		return intermediateSecurity;
	}

	public void setIntermediateSecurity(FinancialInstrumentAttributes73 intermediateSecurity) {
		this.intermediateSecurity = intermediateSecurity;
	}

	@XmlElement(name = "CorpActnDtls")
	public CorporateAction40 getCorporateActionDetails() {
		return corporateActionDetails;
	}

	public void setCorporateActionDetails(CorporateAction40 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
	}

	@XmlElement(name = "CorpActnOptnDtls")
	public List<CorporateActionOption133> getCorporateActionOptionDetails() {
		return corporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(List<CorporateActionOption133> corporateActionOptionDetails) {
		this.corporateActionOptionDetails = corporateActionOptionDetails;
	}

	@XmlElement(name = "AddtlInf")
	public CorporateActionNarrative41 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(CorporateActionNarrative41 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "IssrAgt")
	public List<PartyIdentification104Choice> getIssuerAgent() {
		return issuerAgent;
	}

	public void setIssuerAgent(List<PartyIdentification104Choice> issuerAgent) {
		this.issuerAgent = issuerAgent;
	}

	@XmlElement(name = "PngAgt")
	public List<PartyIdentification104Choice> getPayingAgent() {
		return payingAgent;
	}

	public void setPayingAgent(List<PartyIdentification104Choice> payingAgent) {
		this.payingAgent = payingAgent;
	}

	@XmlElement(name = "SubPngAgt")
	public List<PartyIdentification104Choice> getSubPayingAgent() {
		return subPayingAgent;
	}

	public void setSubPayingAgent(List<PartyIdentification104Choice> subPayingAgent) {
		this.subPayingAgent = subPayingAgent;
	}

	@XmlElement(name = "Regar")
	public PartyIdentification104Choice getRegistrar() {
		return registrar;
	}

	public void setRegistrar(PartyIdentification104Choice registrar) {
		this.registrar = registrar;
	}

	@XmlElement(name = "RsellngAgt")
	public List<PartyIdentification104Choice> getResellingAgent() {
		return resellingAgent;
	}

	public void setResellingAgent(List<PartyIdentification104Choice> resellingAgent) {
		this.resellingAgent = resellingAgent;
	}

	@XmlElement(name = "PhysSctiesAgt")
	public PartyIdentification104Choice getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(PartyIdentification104Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
	}

	@XmlElement(name = "DrpAgt")
	public PartyIdentification104Choice getDropAgent() {
		return dropAgent;
	}

	public void setDropAgent(PartyIdentification104Choice dropAgent) {
		this.dropAgent = dropAgent;
	}

	@XmlElement(name = "SlctnAgt")
	public List<PartyIdentification104Choice> getSolicitationAgent() {
		return solicitationAgent;
	}

	public void setSolicitationAgent(List<PartyIdentification104Choice> solicitationAgent) {
		this.solicitationAgent = solicitationAgent;
	}

	@XmlElement(name = "InfAgt")
	public PartyIdentification104Choice getInformationAgent() {
		return informationAgent;
	}

	public void setInformationAgent(PartyIdentification104Choice informationAgent) {
		this.informationAgent = informationAgent;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.07.07")
	static public class Document {
		@XmlElement(name = "CorpActnNtfctn", required = true)
		public CorporateActionNotification002V07 messageBody;
	}
}