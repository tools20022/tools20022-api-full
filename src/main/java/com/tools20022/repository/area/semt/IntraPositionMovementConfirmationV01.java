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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementArchive;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.choice.PartyIdentification13Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a IntraPositionMovementConfirmation to an account
 * owner to confirm the movement of securities within its holding from one
 * sub-balance to another, for example, blocking of securities.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate). ISO 15022 - 20022 Coexistence
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.015.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmIdentification
 * IntraPositionMovementConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmAdditionalParameters
 * IntraPositionMovementConfirmationV01.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmAccountOwner
 * IntraPositionMovementConfirmationV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmSafekeepingAccount
 * IntraPositionMovementConfirmationV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmSafekeepingPlace
 * IntraPositionMovementConfirmationV01.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmFinancialInstrumentAttributes
 * IntraPositionMovementConfirmationV01.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmIntraPositionDetails
 * IntraPositionMovementConfirmationV01.mmIntraPositionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmMessageOriginator
 * IntraPositionMovementConfirmationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmMessageRecipient
 * IntraPositionMovementConfirmationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmExtension
 * IntraPositionMovementConfirmationV01.mmExtension}</li>
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
 * xmlTag} = "IntraPosMvmntConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionMovementConfirmationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a IntraPositionMovementConfirmation to an account owner to confirm the movement of securities within its holding from one sub-balance to another, for example, blocking of securities.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_IntraPositionMovementConfirmationV01
 * ConstraintCoexistenceCharacterSetXRule.
 * for_semt_IntraPositionMovementConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_semt_IntraPositionMovementConfirmationV01
 * ConstraintCoexistenceIdentificationRule.
 * for_semt_IntraPositionMovementConfirmationV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: MT 508, Seq A :23G:NEWM</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02
 * IntraPositionMovementConfirmationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionMovementConfirmationV01", propOrder = {"identification", "additionalParameters", "accountOwner", "safekeepingAccount", "safekeepingPlace", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"intraPositionDetails", "messageOriginator", "messageRecipient", "extension"})
public class IntraPositionMovementConfirmationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification11 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies an IntraPositionMovementConfirmation message as known by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, DocumentIdentification11> mmIdentification = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, DocumentIdentification11>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies an IntraPositionMovementConfirmation message as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification11.mmObject();
		}

		@Override
		public DocumentIdentification11 getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, DocumentIdentification11 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AddtlParams")
	protected AdditionalParameters3 additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3
	 * AdditionalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional parameters to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<AdditionalParameters3>> mmAdditionalParameters = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<AdditionalParameters3>>() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters3.mmObject();
		}

		@Override
		public Optional<AdditionalParameters3> getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getAdditionalParameters();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, Optional<AdditionalParameters3> value) {
			obj.setAdditionalParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification13Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
	 * PartyIdentification13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<PartyIdentification13Choice>> mmAccountOwner = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<PartyIdentification13Choice>>() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification13Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification13Choice> getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, Optional<PartyIdentification13Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, SecuritiesAccount13> mmSafekeepingAccount = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, SecuritiesAccount13>() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, SecuritiesAccount13 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat3Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice
	 * SafekeepingPlaceFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<SafekeepingPlaceFormat3Choice>> mmSafekeepingPlace = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<SafekeepingPlaceFormat3Choice>>() {
		{
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingPlaceFormat3Choice.mmObject();
		}

		@Override
		public Optional<SafekeepingPlaceFormat3Choice> getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, Optional<SafekeepingPlaceFormat3Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification11 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, SecurityIdentification11> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, SecurityIdentification11>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		@Override
		public SecurityIdentification11 getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, SecurityIdentification11 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes4 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4
	 * FinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<FinancialInstrumentAttributes4>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<FinancialInstrumentAttributes4>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes4.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes4> getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, Optional<FinancialInstrumentAttributes4> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "IntraPosDtls", required = true)
	protected IntraPositionDetails2 intraPositionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2
	 * IntraPositionDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intra-position movement transaction details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, IntraPositionDetails2> mmIntraPositionDetails = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, IntraPositionDetails2>() {
		{
			xmlTag = "IntraPosDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionDetails";
			definition = "Intra-position movement transaction details.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IntraPositionDetails2.mmObject();
		}

		@Override
		public IntraPositionDetails2 getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getIntraPositionDetails();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, IntraPositionDetails2 value) {
			obj.setIntraPositionDetails(value);
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected PartyIdentification10Choice messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<PartyIdentification10Choice>> mmMessageOriginator = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgRcpt")
	protected PartyIdentification10Choice messageRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<PartyIdentification10Choice>> mmMessageRecipient = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getMessageRecipient();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, List<Extension2>> mmExtension = new MMMessageBuildingBlock<IntraPositionMovementConfirmationV01, List<Extension2>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		@Override
		public List<Extension2> getValue(IntraPositionMovementConfirmationV01 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(IntraPositionMovementConfirmationV01 obj, List<Extension2> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_IntraPositionMovementConfirmationV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_semt_IntraPositionMovementConfirmationV01);
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "MT 508, Seq A :23G:NEWM"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionMovementConfirmationV01";
				definition = "Scope\r\nAn account servicer sends a IntraPositionMovementConfirmation to an account owner to confirm the movement of securities within its holding from one sub-balance to another, for example, blocking of securities.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "IntraPosMvmntConf";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmIdentification,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmAdditionalParameters, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmAccountOwner,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmSafekeepingAccount, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmSafekeepingPlace,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmFinancialInstrumentIdentification, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmIntraPositionDetails, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmMessageOriginator,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmMessageRecipient, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "015";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return IntraPositionMovementConfirmationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification11 getIdentification() {
		return identification;
	}

	public IntraPositionMovementConfirmationV01 setIdentification(DocumentIdentification11 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<AdditionalParameters3> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public IntraPositionMovementConfirmationV01 setAdditionalParameters(AdditionalParameters3 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public Optional<PartyIdentification13Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public IntraPositionMovementConfirmationV01 setAccountOwner(PartyIdentification13Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public IntraPositionMovementConfirmationV01 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<SafekeepingPlaceFormat3Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public IntraPositionMovementConfirmationV01 setSafekeepingPlace(SafekeepingPlaceFormat3Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public IntraPositionMovementConfirmationV01 setFinancialInstrumentIdentification(SecurityIdentification11 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes4> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public IntraPositionMovementConfirmationV01 setFinancialInstrumentAttributes(FinancialInstrumentAttributes4 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public IntraPositionDetails2 getIntraPositionDetails() {
		return intraPositionDetails;
	}

	public IntraPositionMovementConfirmationV01 setIntraPositionDetails(IntraPositionDetails2 intraPositionDetails) {
		this.intraPositionDetails = Objects.requireNonNull(intraPositionDetails);
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public IntraPositionMovementConfirmationV01 setMessageOriginator(PartyIdentification10Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return messageRecipient == null ? Optional.empty() : Optional.of(messageRecipient);
	}

	public IntraPositionMovementConfirmationV01 setMessageRecipient(PartyIdentification10Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public IntraPositionMovementConfirmationV01 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.015.001.01")
	static public class Document {
		@XmlElement(name = "IntraPosMvmntConf", required = true)
		public IntraPositionMovementConfirmationV01 messageBody;
	}
}