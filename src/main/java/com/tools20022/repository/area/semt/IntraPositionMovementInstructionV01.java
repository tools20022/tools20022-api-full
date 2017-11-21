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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends a IntraPositionMovementInstruction to an account
 * servicer to instruct the movement of securities within its holding from one
 * sub-balance to another, for example, blocking of securities.<br>
 * The account owner/servicer relationship may be:<br>
 * - a global custodian which has an account with its local agent
 * (sub-custodian), or<br>
 * - an investment management institution which manage a fund account opened at
 * a custodian, or<br>
 * - broker which has an account with a custodian, or<br>
 * - a central securities depository participant which has an account with a
 * central securities depository, or<br>
 * - a central securities depository which has an account with a custodian,
 * another central securities depository or another settlement market
 * infrastructure.<br>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IntraPosMvmntInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmIdentification
 * IntraPositionMovementInstructionV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmCorporateActionEventIdentification
 * IntraPositionMovementInstructionV01.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmLinkages
 * IntraPositionMovementInstructionV01.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmAccountOwner
 * IntraPositionMovementInstructionV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmSafekeepingAccount
 * IntraPositionMovementInstructionV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmSafekeepingPlace
 * IntraPositionMovementInstructionV01.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmFinancialInstrumentIdentification
 * IntraPositionMovementInstructionV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmFinancialInstrumentAttributes
 * IntraPositionMovementInstructionV01.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmIntraPositionDetails
 * IntraPositionMovementInstructionV01.mmIntraPositionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmMessageOriginator
 * IntraPositionMovementInstructionV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmMessageRecipient
 * IntraPositionMovementInstructionV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmExtension
 * IntraPositionMovementInstructionV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.013.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionMovementInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends a IntraPositionMovementInstruction to an account servicer to instruct the movement of securities within its holding from one sub-balance to another, for example, blocking of securities.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with its local agent (sub-custodian), or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02
 * IntraPositionMovementInstructionV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntraPositionMovementInstructionV01", propOrder = {"identification", "corporateActionEventIdentification", "linkages", "accountOwner", "safekeepingAccount", "safekeepingPlace", "financialInstrumentIdentification",
		"financialInstrumentAttributes", "intraPositionDetails", "messageOriginator", "messageRecipient", "extension"})
public class IntraPositionMovementInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TransactionAndDocumentIdentification1 identification;
	/**
	 * Information that unambiguously identifies an
	 * IntraPositionMovementTransaction and an IntraPositionMovementInstruction
	 * message as known by the account owner (or the instructing party acting on
	 * its behalf).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification1
	 * TransactionAndDocumentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies an IntraPositionMovementTransaction and an IntraPositionMovementInstruction message as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies an IntraPositionMovementTransaction and an IntraPositionMovementInstruction message as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionAndDocumentIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Identification1 corporateActionEventIdentification;
	/**
	 * Identification assigned by the account servicer to unambiguously identify
	 * a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Identification1
	 * Identification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionEventIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnEvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Identification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getCorporateActionEventIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Linkages2 linkages;
	/**
	 * Link to another transaction that must be processed after, before or at
	 * the same time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages2
	 * Linkages2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLinkages = new MMMessageBuildingBlock() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Linkages2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getLinkages", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification13Choice accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
	 * PartyIdentification13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification13Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SafekeepingPlaceFormat3Choice safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice
	 * SafekeepingPlaceFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingPlace = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingPlaceFormat3Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getSafekeepingPlace", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecurityIdentification11 financialInstrumentIdentification;
	/**
	 * Financial instrument representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialInstrumentAttributes4 financialInstrumentAttributes;
	/**
	 * Elements characterising a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4
	 * FinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected IntraPositionDetails1 intraPositionDetails;
	/**
	 * Intra-position movement transaction details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1
	 * IntraPositionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intra-position movement transaction details."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntraPositionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntraPosDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionDetails";
			definition = "Intra-position movement transaction details.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IntraPositionDetails1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getIntraPositionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification10Choice messageOriginator;
	/**
	 * Party that originated the message, if other than the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageOriginator = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getMessageOriginator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification10Choice messageRecipient;
	/**
	 * Party that is the final destination of the message, if other than the
	 * receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageRecipient = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getMessageRecipient", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension2> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionMovementInstructionV01.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionMovementInstructionV01";
				definition = "Scope\r\nAn account owner sends a IntraPositionMovementInstruction to an account servicer to instruct the movement of securities within its holding from one sub-balance to another, for example, blocking of securities.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with its local agent (sub-custodian), or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionMovementInstructionV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "IntraPosMvmntInstr";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmIdentification,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmCorporateActionEventIdentification, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmLinkages,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmAccountOwner, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmSafekeepingAccount,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmSafekeepingPlace, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmFinancialInstrumentAttributes, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmIntraPositionDetails,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmMessageOriginator, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmMessageRecipient,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "013";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return IntraPositionMovementInstructionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public TransactionAndDocumentIdentification1 getIdentification() {
		return identification;
	}

	public void setIdentification(TransactionAndDocumentIdentification1 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "CorpActnEvtId")
	public Identification1 getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public void setCorporateActionEventIdentification(Identification1 corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
	}

	@XmlElement(name = "Lnkgs")
	public Linkages2 getLinkages() {
		return linkages;
	}

	public void setLinkages(Linkages2 linkages) {
		this.linkages = linkages;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification13Choice getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification13Choice accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "SfkpgPlc")
	public SafekeepingPlaceFormat3Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlaceFormat3Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(SecurityIdentification11 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "FinInstrmAttrbts")
	public FinancialInstrumentAttributes4 getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(FinancialInstrumentAttributes4 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
	}

	@XmlElement(name = "IntraPosDtls", required = true)
	public IntraPositionDetails1 getIntraPositionDetails() {
		return intraPositionDetails;
	}

	public void setIntraPositionDetails(IntraPositionDetails1 intraPositionDetails) {
		this.intraPositionDetails = intraPositionDetails;
	}

	@XmlElement(name = "MsgOrgtr")
	public PartyIdentification10Choice getMessageOriginator() {
		return messageOriginator;
	}

	public void setMessageOriginator(PartyIdentification10Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
	}

	@XmlElement(name = "MsgRcpt")
	public PartyIdentification10Choice getMessageRecipient() {
		return messageRecipient;
	}

	public void setMessageRecipient(PartyIdentification10Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension2> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension2> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.013.01.01")
	static public class Document {
		@XmlElement(name = "IntraPosMvmntInstr", required = true)
		public IntraPositionMovementInstructionV01 messageBody;
	}
}