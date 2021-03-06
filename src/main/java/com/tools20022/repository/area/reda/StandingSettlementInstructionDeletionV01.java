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
import com.tools20022.repository.choice.PartyOrCurrency1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.AccountIdentification26;
import com.tools20022.repository.msg.EffectiveDate1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.SSIforSecuritiesPaymentsandForeignExchange;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party sends the StandingSettlementInstructionDeletion message
 * to the receiver to delete a previously sent StandingSettlementInstruction
 * message. The message can also be used to notify a counterparty of the
 * deletion of a standing settlement information.<br>
 * <br>
 * <b>Usage</b><br>
 * The instructing party (initiator) is:<br>
 * • An account servicer, for example, a global custodian or prime broker<br>
 * • A counterparty in a transaction, for example:<br>
 * - an investment manager (executing broker),<br>
 * - a global custodian (executing broker, prime broker)<br>
 * • A vendor's application communicating on behalf of an account servicer or
 * counterparty<br>
 * The receiver is:<br>
 * • An account owner, for example, an investment manager, hedge fund
 * administrator or a party to which SSI operations have been outsourced<br>
 * • A counterparty, for example:<br>
 * - an investment manager (executing broker)<br>
 * - a global custodian (executing broker, prime broker)<br>
 * • A vendor's application communicating on behalf of the account owner or
 * counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.057.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmMessageReferenceIdentification
 * StandingSettlementInstructionDeletionV01.mmMessageReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmEffectiveDateDetails
 * StandingSettlementInstructionDeletionV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmAccountIdentification
 * StandingSettlementInstructionDeletionV01.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmMarketIdentification
 * StandingSettlementInstructionDeletionV01.mmMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmSettlementDetails
 * StandingSettlementInstructionDeletionV01.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmSupplementaryData
 * StandingSettlementInstructionDeletionV01.mmSupplementaryData}</li>
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
 * xmlTag} = "StgSttlmInstrDeltn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingSettlementInstructionDeletionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party sends the StandingSettlementInstructionDeletion message to the receiver to delete a previously sent StandingSettlementInstruction message. The message can also be used to notify a counterparty of the deletion of a standing settlement information.\r\n\r\nUsage\r\nThe instructing party (initiator) is:\r\n• An account servicer, for example, a global custodian or prime broker\r\n• A counterparty in a transaction, for example:\r\n\t- an investment manager (executing broker),\r\n\t- a global custodian (executing broker, prime broker)\r\n• A vendor's application communicating on behalf of an account servicer or counterparty\r\nThe receiver is:\r\n• An account owner, for example, an investment manager, hedge fund administrator or a party to which SSI operations have been outsourced\r\n• A counterparty, for example:\r\n\t- an investment manager (executing broker)\r\n\t- a global custodian (executing broker, prime broker)\r\n• A vendor's application communicating on behalf of the account owner or counterparty."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingSettlementInstructionDeletionV01", propOrder = {"messageReferenceIdentification", "effectiveDateDetails", "accountIdentification", "marketIdentification", "settlementDetails", "supplementaryData"})
public class StandingSettlementInstructionDeletionV01 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of this message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, Max35Text> mmMessageReferenceIdentification = new MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, Max35Text>() {
		{
			xmlTag = "MsgRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReferenceIdentification";
			definition = "Reference of this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StandingSettlementInstructionDeletionV01 obj) {
			return obj.getMessageReferenceIdentification();
		}

		@Override
		public void setValue(StandingSettlementInstructionDeletionV01 obj, Max35Text value) {
			obj.setMessageReferenceIdentification(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the SSI is effective."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, Optional<EffectiveDate1>> mmEffectiveDateDetails = new MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, Optional<EffectiveDate1>>() {
		{
			xmlTag = "FctvDtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateDetails";
			definition = "Date on which the SSI is effective.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> EffectiveDate1.mmObject();
		}

		@Override
		public Optional<EffectiveDate1> getValue(StandingSettlementInstructionDeletionV01 obj) {
			return obj.getEffectiveDateDetails();
		}

		@Override
		public void setValue(StandingSettlementInstructionDeletionV01 obj, Optional<EffectiveDate1> value) {
			obj.setEffectiveDateDetails(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous master identification known to the sender (or its authorised agent) and receiver (or its authorised agent), below which the SSI will be lodged. This may be an account number or reference to a fund.\r\nIf no account or reference is available then “NONREF” must be specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, List<AccountIdentification26>> mmAccountIdentification = new MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, List<AccountIdentification26>>() {
		{
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous master identification known to the sender (or its authorised agent) and receiver (or its authorised agent), below which the SSI will be lodged. This may be an account number or reference to a fund.\r\nIf no account or reference is available then “NONREF” must be specified.";
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification26.mmObject();
		}

		@Override
		public List<AccountIdentification26> getValue(StandingSettlementInstructionDeletionV01 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(StandingSettlementInstructionDeletionV01 obj, List<AccountIdentification26> value) {
			obj.setAccountIdentification(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market for the standing settlement instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, MarketIdentificationOrCashPurpose1Choice> mmMarketIdentification = new MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, MarketIdentificationOrCashPurpose1Choice>() {
		{
			xmlTag = "MktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentification";
			definition = "Identifies the market for the standing settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarketIdentificationOrCashPurpose1Choice.mmObject();
		}

		@Override
		public MarketIdentificationOrCashPurpose1Choice getValue(StandingSettlementInstructionDeletionV01 obj) {
			return obj.getMarketIdentification();
		}

		@Override
		public void setValue(StandingSettlementInstructionDeletionV01 obj, MarketIdentificationOrCashPurpose1Choice value) {
			obj.setMarketIdentification(value);
		}
	};
	@XmlElement(name = "SttlmDtls", required = true)
	protected PartyOrCurrency1Choice settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyOrCurrency1Choice
	 * PartyOrCurrency1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement information that helps to identify the standing settlement instruction for which the deletion is sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, PartyOrCurrency1Choice> mmSettlementDetails = new MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, PartyOrCurrency1Choice>() {
		{
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Settlement information that helps to identify the standing settlement instruction for which the deletion is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyOrCurrency1Choice.mmObject();
		}

		@Override
		public PartyOrCurrency1Choice getValue(StandingSettlementInstructionDeletionV01 obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(StandingSettlementInstructionDeletionV01 obj, PartyOrCurrency1Choice value) {
			obj.setSettlementDetails(value);
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
	public static final MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<StandingSettlementInstructionDeletionV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(StandingSettlementInstructionDeletionV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(StandingSettlementInstructionDeletionV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingSettlementInstructionDeletionV01";
				definition = "Scope\r\nAn instructing party sends the StandingSettlementInstructionDeletion message to the receiver to delete a previously sent StandingSettlementInstruction message. The message can also be used to notify a counterparty of the deletion of a standing settlement information.\r\n\r\nUsage\r\nThe instructing party (initiator) is:\r\n• An account servicer, for example, a global custodian or prime broker\r\n• A counterparty in a transaction, for example:\r\n\t- an investment manager (executing broker),\r\n\t- a global custodian (executing broker, prime broker)\r\n• A vendor's application communicating on behalf of an account servicer or counterparty\r\nThe receiver is:\r\n• An account owner, for example, an investment manager, hedge fund administrator or a party to which SSI operations have been outsourced\r\n• A counterparty, for example:\r\n\t- an investment manager (executing broker)\r\n\t- a global custodian (executing broker, prime broker)\r\n• A vendor's application communicating on behalf of the account owner or counterparty.";
				messageSet_lazy = () -> Arrays.asList(SSIforSecuritiesPaymentsandForeignExchange.mmObject());
				rootElement = "Document";
				xmlTag = "StgSttlmInstrDeltn";
				businessArea_lazy = () -> ReferenceDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.mmMessageReferenceIdentification,
						com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.mmEffectiveDateDetails, com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.mmAccountIdentification,
						com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.mmMarketIdentification, com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.mmSettlementDetails,
						com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "057";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StandingSettlementInstructionDeletionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageReferenceIdentification() {
		return messageReferenceIdentification;
	}

	public StandingSettlementInstructionDeletionV01 setMessageReferenceIdentification(Max35Text messageReferenceIdentification) {
		this.messageReferenceIdentification = Objects.requireNonNull(messageReferenceIdentification);
		return this;
	}

	public Optional<EffectiveDate1> getEffectiveDateDetails() {
		return effectiveDateDetails == null ? Optional.empty() : Optional.of(effectiveDateDetails);
	}

	public StandingSettlementInstructionDeletionV01 setEffectiveDateDetails(EffectiveDate1 effectiveDateDetails) {
		this.effectiveDateDetails = effectiveDateDetails;
		return this;
	}

	public List<AccountIdentification26> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public StandingSettlementInstructionDeletionV01 setAccountIdentification(List<AccountIdentification26> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public MarketIdentificationOrCashPurpose1Choice getMarketIdentification() {
		return marketIdentification;
	}

	public StandingSettlementInstructionDeletionV01 setMarketIdentification(MarketIdentificationOrCashPurpose1Choice marketIdentification) {
		this.marketIdentification = Objects.requireNonNull(marketIdentification);
		return this;
	}

	public PartyOrCurrency1Choice getSettlementDetails() {
		return settlementDetails;
	}

	public StandingSettlementInstructionDeletionV01 setSettlementDetails(PartyOrCurrency1Choice settlementDetails) {
		this.settlementDetails = Objects.requireNonNull(settlementDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public StandingSettlementInstructionDeletionV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.057.001.01")
	static public class Document {
		@XmlElement(name = "StgSttlmInstrDeltn", required = true)
		public StandingSettlementInstructionDeletionV01 messageBody;
	}
}