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
import com.tools20022.repository.area.SecuritiesEventsArchivesubsetvariant;
import com.tools20022.repository.choice.AccountIdentification34Choice;
import com.tools20022.repository.choice.PartyIdentification104Choice;
import com.tools20022.repository.msg.CorporateAction35;
import com.tools20022.repository.msg.CorporateActionGeneralInformation99;
import com.tools20022.repository.msg.DocumentIdentification37;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.044.002.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchivesubsetvariant
 * SecuritiesEventsArchivesubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmCorporateActionDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmCorporateActionDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntPrlimryAdvcCxlAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06", propOrder = {"movementPreliminaryAdviceIdentification", "corporateActionGeneralInformation", "accountDetails", "corporateActionDetails", "issuerAgent",
		"payingAgent", "subPayingAgent", "registrar", "resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MvmntPrlimryAdvcId", required = true)
	protected DocumentIdentification37 movementPreliminaryAdviceIdentification;
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
	 * xmlTag} = "MvmntPrlimryAdvcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementPreliminaryAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement preliminary advice document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, DocumentIdentification37> mmMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, DocumentIdentification37>() {
		{
			xmlTag = "MvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		@Override
		public DocumentIdentification37 getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getMovementPreliminaryAdviceIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, DocumentIdentification37 value) {
			obj.setMovementPreliminaryAdviceIdentification(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation99 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99
	 * CorporateActionGeneralInformation99}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, CorporateActionGeneralInformation99> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, CorporateActionGeneralInformation99>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation99.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation99 getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, CorporateActionGeneralInformation99 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification34Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification34Choice
	 * AccountIdentification34Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account and the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, AccountIdentification34Choice> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, AccountIdentification34Choice>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account and the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification34Choice.mmObject();
		}

		@Override
		public AccountIdentification34Choice getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, AccountIdentification34Choice value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction35 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction35
	 * CorporateAction35}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<CorporateAction35>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<CorporateAction35>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction35.mmObject();
		}

		@Override
		public Optional<CorporateAction35> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, Optional<CorporateAction35> value) {
			obj.setCorporateActionDetails(value.orElse(null));
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, List<PartyIdentification104Choice> value) {
			obj.setIssuerAgent(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, List<PartyIdentification104Choice> value) {
			obj.setPayingAgent(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, List<PartyIdentification104Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "Regar")
	protected PartyIdentification104Choice registrar;
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>> mmRegistrar = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getRegistrar();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, Optional<PartyIdentification104Choice> value) {
			obj.setRegistrar(value.orElse(null));
		}
	};
	@XmlElement(name = "RsellngAgt")
	protected List<PartyIdentification104Choice> resellingAgent;
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>> mmResellingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getResellingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, List<PartyIdentification104Choice> value) {
			obj.setResellingAgent(value);
		}
	};
	@XmlElement(name = "PhysSctiesAgt")
	protected PartyIdentification104Choice physicalSecuritiesAgent;
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>> mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getPhysicalSecuritiesAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, Optional<PartyIdentification104Choice> value) {
			obj.setPhysicalSecuritiesAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrpAgt")
	protected PartyIdentification104Choice dropAgent;
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>> mmDropAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getDropAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, Optional<PartyIdentification104Choice> value) {
			obj.setDropAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnAgt")
	protected List<PartyIdentification104Choice> solicitationAgent;
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>> mmSolicitationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getSolicitationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, List<PartyIdentification104Choice> value) {
			obj.setSolicitationAgent(value);
		}
	};
	@XmlElement(name = "InfAgt")
	protected PartyIdentification104Choice informationAgent;
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>> mmInformationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getInformationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, Optional<PartyIdentification104Choice> value) {
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntPrlimryAdvcCxlAdvc";
				businessArea_lazy = () -> SecuritiesEventsArchivesubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmAccountDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmRegistrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmPhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmSolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "044";
						version = "06";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification37 getMovementPreliminaryAdviceIdentification() {
		return movementPreliminaryAdviceIdentification;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setMovementPreliminaryAdviceIdentification(DocumentIdentification37 movementPreliminaryAdviceIdentification) {
		this.movementPreliminaryAdviceIdentification = Objects.requireNonNull(movementPreliminaryAdviceIdentification);
		return this;
	}

	public CorporateActionGeneralInformation99 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setCorporateActionGeneralInformation(CorporateActionGeneralInformation99 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification34Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setAccountDetails(AccountIdentification34Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction35> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setCorporateActionDetails(CorporateAction35 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public List<PartyIdentification104Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setIssuerAgent(List<PartyIdentification104Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setPayingAgent(List<PartyIdentification104Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setSubPayingAgent(List<PartyIdentification104Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification104Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setRegistrar(PartyIdentification104Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification104Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setResellingAgent(List<PartyIdentification104Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification104Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setPhysicalSecuritiesAgent(PartyIdentification104Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification104Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setDropAgent(PartyIdentification104Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification104Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setSolicitationAgent(List<PartyIdentification104Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification104Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setInformationAgent(PartyIdentification104Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.044.002.06")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
		public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 messageBody;
	}
}