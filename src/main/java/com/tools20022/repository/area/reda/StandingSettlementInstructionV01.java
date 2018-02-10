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

package com.tools20022.repository.area.reda;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ReferenceDataLatestVersion;
import com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice;
import com.tools20022.repository.choice.SecuritiesOrCash1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.AccountIdentification26;
import com.tools20022.repository.msg.EffectiveDate1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.SSIforSecuritiesPaymentsandForeignExchange;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party sends the StandingSettlementInstruction (SSI) message to
 * the receiver to create or update a standing cash or securities settlement
 * instruction. The message can also be used to notify a counterparty of an SSI.<br>
 * <br>
 * <b>Usage</b><br>
 * The instructing party (initiator) is:<br>
 * • An account servicer, for example, a global custodian or prime broker<br>
 * • A counterparty in a transaction, for example:<br>
 * - an investment manager (executing broker),<br>
 * - a global custodian (executing broker, prime broker)<br>
 * • A vendor’s application communicating on behalf of an account servicer or
 * counterparty<br>
 * The receiver is:<br>
 * • An account owner, for example, an investment manager, hedge fund
 * administrator or a party to which SSI operations have been outsourced<br>
 * • A counterparty, for example:<br>
 * - an investment manager (executing broker)<br>
 * - a global custodian (executing broker, prime broker)<br>
 * • A vendor’s application communicating on behalf of the account owner or
 * counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmMessageReferenceIdentification
 * StandingSettlementInstructionV01.mmMessageReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmEffectiveDateDetails
 * StandingSettlementInstructionV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmAccountIdentification
 * StandingSettlementInstructionV01.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmMarketIdentification
 * StandingSettlementInstructionV01.mmMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmSettlementCurrency
 * StandingSettlementInstructionV01.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmSettlementDetails
 * StandingSettlementInstructionV01.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmSupplementaryData
 * StandingSettlementInstructionV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SSIforSecuritiesPaymentsandForeignExchange
 * SSIforSecuritiesPaymentsandForeignExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StgSttlmInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.056.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashPartiesCurrencyPresenceRule#forStandingSettlementInstructionV01
 * ConstraintCashPartiesCurrencyPresenceRule.forStandingSettlementInstructionV01
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingSettlementInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party sends the StandingSettlementInstruction (SSI) message to the receiver to create or update a standing cash or securities settlement instruction. The message can also be used to notify a counterparty of an SSI.\r\n\r\nUsage\r\nThe instructing party (initiator) is:\r\n•\tAn account servicer, for example, a global custodian or prime broker\r\n•\tA counterparty in a transaction, for example:\r\n-\tan investment manager (executing broker),\r\n-\ta global custodian (executing broker, prime broker)\r\n•\tA vendor’s application communicating on behalf of an account servicer or counterparty\r\nThe receiver is:\r\n•\tAn account owner, for example, an investment manager, hedge fund administrator or a party to which SSI operations have been outsourced\r\n•\tA counterparty, for example:\r\n-\tan investment manager (executing broker)\r\n-\ta global custodian (executing broker, prime broker)\r\n•\tA vendor’s application communicating on behalf of the account owner or counterparty."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingSettlementInstructionV01", propOrder = {"messageReferenceIdentification", "effectiveDateDetails", "accountIdentification", "marketIdentification", "settlementCurrency", "settlementDetails", "supplementaryData"})
public class StandingSettlementInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgRefId", required = true)
	protected Max35Text messageReferenceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of this message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageReferenceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReferenceIdentification";
			definition = "Reference of this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingSettlementInstructionV01.class.getMethod("getMessageReferenceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FctvDtDtls")
	protected EffectiveDate1 effectiveDateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.EffectiveDate1
	 * EffectiveDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the SSI is effective."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEffectiveDateDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "FctvDtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateDetails";
			definition = "Date on which the SSI is effective.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> EffectiveDate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingSettlementInstructionV01.class.getMethod("getEffectiveDateDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctId", required = true)
	protected List<AccountIdentification26> accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification26
	 * AccountIdentification26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous master identification known to the sender (or its authorised agent) and receiver (or its authorised agent), below which the SSI will be lodged. This may be an account number or reference to a fund.\r\nIf no account or reference is available then “NONREF” must be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous master identification known to the sender (or its authorised agent) and receiver (or its authorised agent), below which the SSI will be lodged. This may be an account number or reference to a fund.\r\nIf no account or reference is available then “NONREF” must be specified.";
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification26.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingSettlementInstructionV01.class.getMethod("getAccountIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MktId", required = true)
	protected MarketIdentificationOrCashPurpose1Choice marketIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice
	 * MarketIdentificationOrCashPurpose1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market for the standing settlement instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentification";
			definition = "Identifies the market for the standing settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarketIdentificationOrCashPurpose1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingSettlementInstructionV01.class.getMethod("getMarketIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmCcy")
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for which the SSI is specified."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementCurrency = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency for which the SSI is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingSettlementInstructionV01.class.getMethod("getSettlementCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmDtls", required = true)
	protected SecuritiesOrCash1Choice settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesOrCash1Choice
	 * SecuritiesOrCash1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement chain parties, accounts and other details."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Settlement chain parties, accounts and other details.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesOrCash1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingSettlementInstructionV01.class.getMethod("getSettlementDetails", new Class[]{});
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
				return StandingSettlementInstructionV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashPartiesCurrencyPresenceRule.forStandingSettlementInstructionV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingSettlementInstructionV01";
				definition = "Scope\r\nAn instructing party sends the StandingSettlementInstruction (SSI) message to the receiver to create or update a standing cash or securities settlement instruction. The message can also be used to notify a counterparty of an SSI.\r\n\r\nUsage\r\nThe instructing party (initiator) is:\r\n•\tAn account servicer, for example, a global custodian or prime broker\r\n•\tA counterparty in a transaction, for example:\r\n-\tan investment manager (executing broker),\r\n-\ta global custodian (executing broker, prime broker)\r\n•\tA vendor’s application communicating on behalf of an account servicer or counterparty\r\nThe receiver is:\r\n•\tAn account owner, for example, an investment manager, hedge fund administrator or a party to which SSI operations have been outsourced\r\n•\tA counterparty, for example:\r\n-\tan investment manager (executing broker)\r\n-\ta global custodian (executing broker, prime broker)\r\n•\tA vendor’s application communicating on behalf of the account owner or counterparty.";
				messageSet_lazy = () -> Arrays.asList(SSIforSecuritiesPaymentsandForeignExchange.mmObject());
				rootElement = "Document";
				xmlTag = "StgSttlmInstr";
				businessArea_lazy = () -> ReferenceDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.StandingSettlementInstructionV01.mmMessageReferenceIdentification,
						com.tools20022.repository.area.reda.StandingSettlementInstructionV01.mmEffectiveDateDetails, com.tools20022.repository.area.reda.StandingSettlementInstructionV01.mmAccountIdentification,
						com.tools20022.repository.area.reda.StandingSettlementInstructionV01.mmMarketIdentification, com.tools20022.repository.area.reda.StandingSettlementInstructionV01.mmSettlementCurrency,
						com.tools20022.repository.area.reda.StandingSettlementInstructionV01.mmSettlementDetails, com.tools20022.repository.area.reda.StandingSettlementInstructionV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "056";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StandingSettlementInstructionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageReferenceIdentification() {
		return messageReferenceIdentification;
	}

	public StandingSettlementInstructionV01 setMessageReferenceIdentification(Max35Text messageReferenceIdentification) {
		this.messageReferenceIdentification = Objects.requireNonNull(messageReferenceIdentification);
		return this;
	}

	public Optional<EffectiveDate1> getEffectiveDateDetails() {
		return effectiveDateDetails == null ? Optional.empty() : Optional.of(effectiveDateDetails);
	}

	public StandingSettlementInstructionV01 setEffectiveDateDetails(EffectiveDate1 effectiveDateDetails) {
		this.effectiveDateDetails = effectiveDateDetails;
		return this;
	}

	public List<AccountIdentification26> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public StandingSettlementInstructionV01 setAccountIdentification(List<AccountIdentification26> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public MarketIdentificationOrCashPurpose1Choice getMarketIdentification() {
		return marketIdentification;
	}

	public StandingSettlementInstructionV01 setMarketIdentification(MarketIdentificationOrCashPurpose1Choice marketIdentification) {
		this.marketIdentification = Objects.requireNonNull(marketIdentification);
		return this;
	}

	public Optional<ActiveCurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? Optional.empty() : Optional.of(settlementCurrency);
	}

	public StandingSettlementInstructionV01 setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
		return this;
	}

	public SecuritiesOrCash1Choice getSettlementDetails() {
		return settlementDetails;
	}

	public StandingSettlementInstructionV01 setSettlementDetails(SecuritiesOrCash1Choice settlementDetails) {
		this.settlementDetails = Objects.requireNonNull(settlementDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public StandingSettlementInstructionV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.056.001.01")
	static public class Document {
		@XmlElement(name = "StgSttlmInstr", required = true)
		public StandingSettlementInstructionV01 messageBody;
	}
}