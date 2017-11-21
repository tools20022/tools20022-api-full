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
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.AccountIdentification13Choice;
import com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice;
import com.tools20022.repository.choice.PartyIdentification46Choice;
import com.tools20022.repository.msg.CorporateActionGeneralInformation53;
import com.tools20022.repository.msg.DocumentIdentification15;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends the
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an
 * account owner or its designated agent to cancel a previously announced
 * CorporateActionMovementPreliminaryAdvice. Usage The message may also be used
 * to: - re-send a message previously sent (the sub-function of the message is
 * Duplicate), - provide a third party with a copy of a message for information
 * (the sub-function of the message is Copy), - re-send to a third party a copy
 * of a message for information (the sub-function of the message is Copy
 * Duplicate), using the relevant elements in the business application header
 * (BAH). ISO 15022 - 20022 COEXISTENCE<br>
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntPrlimryAdvcCxlAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmCancellationAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.044.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementPreliminaryAdviceCancellationAdviceV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\nUsage\nThe message may also be used to:\n- re-send a message previously sent (the sub-function of the message is Duplicate),\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceCancellationAdviceV04", propOrder = {"cancellationAdviceGeneralInformation", "movementPreliminaryAdviceIdentification", "corporateActionGeneralInformation", "accountDetails",
		"issuerAgent", "payingAgent", "subPayingAgent", "registrar", "resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionMovementPreliminaryAdviceCancellationAdviceV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionProcessingStatus1Choice cancellationAdviceGeneralInformation;
	/**
	 * Specifies the status of the details of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice
	 * CorporateActionProcessingStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlAdvcGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdviceGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the details of the event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationAdviceGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlAdvcGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdviceGeneralInformation";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionProcessingStatus1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getCancellationAdviceGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification15 movementPreliminaryAdviceIdentification;
	/**
	 * Identification of a previously sent movement preliminary advice document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmMovementPreliminaryAdviceIdentification
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmMovementPreliminaryAdviceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmMovementPreliminaryAdviceIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getMovementPreliminaryAdviceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionGeneralInformation53 corporateActionGeneralInformation;
	/**
	 * General information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53
	 * CorporateActionGeneralInformation53}</li>
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmCorporateActionGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmCorporateActionGeneralInformation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation53.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountIdentification13Choice accountDetails;
	/**
	 * General information about the safekeeping account and the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice
	 * AccountIdentification13Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmAccountDetails
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account and the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification13Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification46Choice> issuerAgent;
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmIssuerAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmIssuerAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIssuerAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmIssuerAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getIssuerAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification46Choice> payingAgent;
	/**
	 * Agent (principal or fiscal paying agent) appointed to execute the payment
	 * for the corporate action event on behalf of the issuer company/offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmPayingAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmPayingAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmPayingAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification46Choice> subPayingAgent;
	/**
	 * Sub-agent appointed to execute the payment for the corporate action event
	 * on behalf of the issuer company/offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmSubPayingAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmSubPayingAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubPayingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmSubPayingAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getSubPayingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification46Choice registrar;
	/**
	 * Party/agent responsible for maintaining the register of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmRegistrar
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmRegistrar
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRegistrar = new MMMessageBuildingBlock() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmRegistrar);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getRegistrar", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification46Choice> resellingAgent;
	/**
	 * A broker-dealer responsible for reselling to new investors securities
	 * (usually bonds) that have been tendered for purchase by their owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmResellingAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmResellingAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResellingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner. ";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmResellingAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getResellingAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification46Choice physicalSecuritiesAgent;
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmPhysicalSecuritiesAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmPhysicalSecuritiesAgent);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getPhysicalSecuritiesAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification46Choice dropAgent;
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmDropAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmDropAgent
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDropAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person. ";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmDropAgent);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getDropAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyIdentification46Choice> solicitationAgent;
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmSolicitationAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmSolicitationAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSolicitationAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmSolicitationAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getSolicitationAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification46Choice informationAgent;
	/**
	 * A trust company, bank or similar financial institution assigned by an
	 * Issuer to provide information and copies of the offering documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmInformationAgent
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmInformationAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInformationAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation. ";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmInformationAgent);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getInformationAgent", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmSupplementaryData
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
	 * mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementPreliminaryAdviceCancellationAdviceV04";
				definition = "Scope\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\nUsage\nThe message may also be used to:\n- re-send a message previously sent (the sub-function of the message is Duplicate),\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmObject());
				previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntPrlimryAdvcCxlAdvc";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmCancellationAdviceGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmAccountDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmRegistrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmPhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmSolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "044";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlAdvcGnlInf", required = true)
	public CorporateActionProcessingStatus1Choice getCancellationAdviceGeneralInformation() {
		return cancellationAdviceGeneralInformation;
	}

	public void setCancellationAdviceGeneralInformation(CorporateActionProcessingStatus1Choice cancellationAdviceGeneralInformation) {
		this.cancellationAdviceGeneralInformation = cancellationAdviceGeneralInformation;
	}

	@XmlElement(name = "MvmntPrlimryAdvcId", required = true)
	public DocumentIdentification15 getMovementPreliminaryAdviceIdentification() {
		return movementPreliminaryAdviceIdentification;
	}

	public void setMovementPreliminaryAdviceIdentification(DocumentIdentification15 movementPreliminaryAdviceIdentification) {
		this.movementPreliminaryAdviceIdentification = movementPreliminaryAdviceIdentification;
	}

	@XmlElement(name = "CorpActnGnlInf", required = true)
	public CorporateActionGeneralInformation53 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionGeneralInformation53 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public AccountIdentification13Choice getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountIdentification13Choice accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "IssrAgt")
	public List<PartyIdentification46Choice> getIssuerAgent() {
		return issuerAgent;
	}

	public void setIssuerAgent(List<PartyIdentification46Choice> issuerAgent) {
		this.issuerAgent = issuerAgent;
	}

	@XmlElement(name = "PngAgt")
	public List<PartyIdentification46Choice> getPayingAgent() {
		return payingAgent;
	}

	public void setPayingAgent(List<PartyIdentification46Choice> payingAgent) {
		this.payingAgent = payingAgent;
	}

	@XmlElement(name = "SubPngAgt")
	public List<PartyIdentification46Choice> getSubPayingAgent() {
		return subPayingAgent;
	}

	public void setSubPayingAgent(List<PartyIdentification46Choice> subPayingAgent) {
		this.subPayingAgent = subPayingAgent;
	}

	@XmlElement(name = "Regar")
	public PartyIdentification46Choice getRegistrar() {
		return registrar;
	}

	public void setRegistrar(PartyIdentification46Choice registrar) {
		this.registrar = registrar;
	}

	@XmlElement(name = "RsellngAgt")
	public List<PartyIdentification46Choice> getResellingAgent() {
		return resellingAgent;
	}

	public void setResellingAgent(List<PartyIdentification46Choice> resellingAgent) {
		this.resellingAgent = resellingAgent;
	}

	@XmlElement(name = "PhysSctiesAgt")
	public PartyIdentification46Choice getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(PartyIdentification46Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
	}

	@XmlElement(name = "DrpAgt")
	public PartyIdentification46Choice getDropAgent() {
		return dropAgent;
	}

	public void setDropAgent(PartyIdentification46Choice dropAgent) {
		this.dropAgent = dropAgent;
	}

	@XmlElement(name = "SlctnAgt")
	public List<PartyIdentification46Choice> getSolicitationAgent() {
		return solicitationAgent;
	}

	public void setSolicitationAgent(List<PartyIdentification46Choice> solicitationAgent) {
		this.solicitationAgent = solicitationAgent;
	}

	@XmlElement(name = "InfAgt")
	public PartyIdentification46Choice getInformationAgent() {
		return informationAgent;
	}

	public void setInformationAgent(PartyIdentification46Choice informationAgent) {
		this.informationAgent = informationAgent;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.044.04.04")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
		public CorporateActionMovementPreliminaryAdviceCancellationAdviceV04 messageBody;
	}
}