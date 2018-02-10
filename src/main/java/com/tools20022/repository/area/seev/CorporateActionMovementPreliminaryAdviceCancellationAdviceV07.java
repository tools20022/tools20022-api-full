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
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.choice.AccountIdentification29Choice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.msg.CorporateAction34;
import com.tools20022.repository.msg.CorporateActionGeneralInformation112;
import com.tools20022.repository.msg.DocumentIdentification31;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CorporateActionsISOLatestversion;
import com.tools20022.repository.msgset.CorporateActionsMaintenance20162017;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an
 * account owner or its designated agent to cancel a previously announced
 * CorporateActionMovementPreliminaryAdvice.<br>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmCorporateActionDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmCorporateActionDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOLatestversion
 * CorporateActionsISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsMaintenance20162017
 * CorporateActionsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntPrlimryAdvcCxlAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.044.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementPreliminaryAdviceCancellationAdviceV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceCancellationAdviceV07", propOrder = {"movementPreliminaryAdviceIdentification", "corporateActionGeneralInformation", "accountDetails", "corporateActionDetails", "issuerAgent",
		"payingAgent", "subPayingAgent", "registrar", "resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MvmntPrlimryAdvcId", required = true)
	protected DocumentIdentification31 movementPreliminaryAdviceIdentification;
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
	 * xmlTag} = "MvmntPrlimryAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementPreliminaryAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement preliminary advice document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmMovementPreliminaryAdviceIdentification
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmMovementPreliminaryAdviceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmMovementPreliminaryAdviceIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getMovementPreliminaryAdviceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation112 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112
	 * CorporateActionGeneralInformation112}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmCorporateActionGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation112.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification29Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice
	 * AccountIdentification29Choice}</li>
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
	 * "General information about the safekeeping account and the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmAccountDetails
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account and the account owner.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification29Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction34 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34
	 * CorporateAction34}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmCorporateActionDetails
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmCorporateActionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmCorporateActionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction34.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getCorporateActionDetails", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmIssuerAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmIssuerAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIssuerAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmIssuerAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getIssuerAgent", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmPayingAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getPayingAgent", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmSubPayingAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmSubPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmSubPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getSubPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmRegistrar
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmRegistrar
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRegistrar = new MMMessageBuildingBlock() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmRegistrar;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getRegistrar", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmResellingAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmResellingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResellingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner. ";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmResellingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getResellingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmPhysicalSecuritiesAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmPhysicalSecuritiesAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getPhysicalSecuritiesAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmDropAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmDropAgent
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDropAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person. ";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmDropAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getDropAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmSolicitationAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmSolicitationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSolicitationAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmSolicitationAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getSolicitationAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmInformationAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmInformationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInformationAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation. ";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmInformationAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getInformationAgent", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmSupplementaryData
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
	 * mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementPreliminaryAdviceCancellationAdviceV07";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISOLatestversion.mmObject(), CorporateActionsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntPrlimryAdvcCxlAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmAccountDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmRegistrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmPhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmSolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "044";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification31 getMovementPreliminaryAdviceIdentification() {
		return movementPreliminaryAdviceIdentification;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setMovementPreliminaryAdviceIdentification(DocumentIdentification31 movementPreliminaryAdviceIdentification) {
		this.movementPreliminaryAdviceIdentification = Objects.requireNonNull(movementPreliminaryAdviceIdentification);
		return this;
	}

	public CorporateActionGeneralInformation112 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setCorporateActionGeneralInformation(CorporateActionGeneralInformation112 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification29Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setAccountDetails(AccountIdentification29Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction34> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setCorporateActionDetails(CorporateAction34 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public List<PartyIdentification71Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setIssuerAgent(List<PartyIdentification71Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setPayingAgent(List<PartyIdentification71Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setSubPayingAgent(List<PartyIdentification71Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setRegistrar(PartyIdentification71Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification71Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setResellingAgent(List<PartyIdentification71Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setPhysicalSecuritiesAgent(PartyIdentification71Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification71Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setDropAgent(PartyIdentification71Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification71Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setSolicitationAgent(List<PartyIdentification71Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setInformationAgent(PartyIdentification71Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.044.001.07")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
		public CorporateActionMovementPreliminaryAdviceCancellationAdviceV07 messageBody;
	}
}