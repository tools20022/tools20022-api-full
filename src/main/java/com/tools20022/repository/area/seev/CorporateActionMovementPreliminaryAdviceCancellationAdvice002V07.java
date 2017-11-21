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
import com.tools20022.repository.choice.AccountIdentification34Choice;
import com.tools20022.repository.choice.PartyIdentification104Choice;
import com.tools20022.repository.msg.CorporateAction35;
import com.tools20022.repository.msg.CorporateActionGeneralInformation123;
import com.tools20022.repository.msg.DocumentIdentification37;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * xmlTag} = "CorpActnMvmntPrlimryAdvcCxlAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmCorporateActionDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmRegistrar}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmDropAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.044.002.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07", propOrder = {"movementPreliminaryAdviceIdentification", "corporateActionGeneralInformation", "accountDetails", "corporateActionDetails", "issuerAgent",
		"payingAgent", "subPayingAgent", "registrar", "resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification37 movementPreliminaryAdviceIdentification;
	/**
	 * Identification of a previously sent movement preliminary advice document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37
	 * DocumentIdentification37}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getMovementPreliminaryAdviceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionGeneralInformation123 corporateActionGeneralInformation;
	/**
	 * General information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123
	 * CorporateActionGeneralInformation123}</li>
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
			complexType_lazy = () -> CorporateActionGeneralInformation123.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountIdentification34Choice accountDetails;
	/**
	 * General information about the safekeeping account and the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification34Choice
	 * AccountIdentification34Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account and the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification34Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateAction35 corporateActionDetails;
	/**
	 * Information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction35
	 * CorporateAction35}</li>
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
			complexType_lazy = () -> CorporateAction35.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getCorporateActionDetails", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getIssuerAgent", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getPayingAgent", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getSubPayingAgent", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getRegistrar", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getResellingAgent", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getPhysicalSecuritiesAgent", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getDropAgent", new Class[]{});
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
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSolicitationAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getSolicitationAgent", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getInformationAgent", new Class[]{});
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
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISO15022VariantsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntPrlimryAdvcCxlAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmAccountDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmRegistrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmPhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmSolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "044";
						version = "07";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MvmntPrlimryAdvcId", required = true)
	public DocumentIdentification37 getMovementPreliminaryAdviceIdentification() {
		return movementPreliminaryAdviceIdentification;
	}

	public void setMovementPreliminaryAdviceIdentification(DocumentIdentification37 movementPreliminaryAdviceIdentification) {
		this.movementPreliminaryAdviceIdentification = movementPreliminaryAdviceIdentification;
	}

	@XmlElement(name = "CorpActnGnlInf", required = true)
	public CorporateActionGeneralInformation123 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionGeneralInformation123 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public AccountIdentification34Choice getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountIdentification34Choice accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "CorpActnDtls")
	public CorporateAction35 getCorporateActionDetails() {
		return corporateActionDetails;
	}

	public void setCorporateActionDetails(CorporateAction35 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
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

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.044.07.07")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
		public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 messageBody;
	}
}