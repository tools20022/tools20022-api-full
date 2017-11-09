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
import com.tools20022.repository.choice.ProcessingStatus43Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.AccountIdentification26;
import com.tools20022.repository.msg.EffectiveDate1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.SSIforSecuritiesPaymentsandForeignExchange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The receiver of a StandingSettlementInstruction message sends the
 * StandingSettlementInstructionStatusAdvice message to the instructing party
 * (sender of the StandingSettlementInstruction message) to provide the status
 * of a previously received StandingSettlementInstruction,
 * StandingSettlementInstructionCancellation or
 * StandingSettlementInstructionDeletion message.<br>
 * <br>
 * <b>Usage</b><br>
 * The StandingSettlementInstructionStatusAdvice message is used to report one
 * of the following statuses:<br>
 * - a received status, or, <br>
 * - an accepted status, or,<br>
 * - a rejected status, or,<br>
 * - a pending processing status, or,<br>
 * - a proprietary status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.058.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SSIforSecuritiesPaymentsandForeignExchange
 * SSIforSecuritiesPaymentsandForeignExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StgSttlmInstrStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmEffectiveDateDetails
 * StandingSettlementInstructionStatusAdviceV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmAccountIdentification
 * StandingSettlementInstructionStatusAdviceV01.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmMarketIdentification
 * StandingSettlementInstructionStatusAdviceV01.mmMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmSettlementDetails
 * StandingSettlementInstructionStatusAdviceV01.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmRelatedMessageReference
 * StandingSettlementInstructionStatusAdviceV01.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmProcessingStatus
 * StandingSettlementInstructionStatusAdviceV01.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmSupplementaryData
 * StandingSettlementInstructionStatusAdviceV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingSettlementInstructionStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe receiver of a StandingSettlementInstruction message sends the StandingSettlementInstructionStatusAdvice message to the instructing party (sender of the StandingSettlementInstruction message) to provide the status of a previously received StandingSettlementInstruction, StandingSettlementInstructionCancellation or StandingSettlementInstructionDeletion message.\r\n\r\nUsage\r\nThe StandingSettlementInstructionStatusAdvice message is used to report one of the following statuses:\r\n-\ta received status, or, \r\n-\tan accepted status, or,\r\n-\ta rejected status, or,\r\n-\ta pending processing status, or,\r\n-\ta proprietary status."
 * </li>
 * </ul>
 */
public class StandingSettlementInstructionStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected EffectiveDate1 effectiveDateDetails;
	/**
	 * Date on which the SSI is effective.
	 * <p>
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
	};
	protected List<AccountIdentification26> accountIdentification;
	/**
	 * Unique and unambiguous master identification known to the sender (or its
	 * authorised agent) and receiver (or its authorised agent), below which the
	 * SSI will be lodged. This may be an account number or reference to a fund.<br>
	 * If no account or reference is available then “NONREF” must be specified.
	 * <p>
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
	};
	protected MarketIdentificationOrCashPurpose1Choice marketIdentification;
	/**
	 * Identifies the market for the standing settlement instruction.
	 * <p>
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
	 * "Identifies the market for the standing settlement instruction. "</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentification";
			definition = "Identifies the market for the standing settlement instruction. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarketIdentificationOrCashPurpose1Choice.mmObject();
		}
	};
	protected PartyOrCurrency1Choice settlementDetails;
	/**
	 * Settlement information that helps to identify the standing settlement
	 * instruction, cancellation or deletion for which the status is sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyOrCurrency1Choice
	 * PartyOrCurrency1Choice}</li>
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
	 * definition} =
	 * "Settlement information that helps to identify the standing settlement  instruction, cancellation or deletion for which the status is sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Settlement information that helps to identify the standing settlement  instruction, cancellation or deletion for which the status is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyOrCurrency1Choice.mmObject();
		}
	};
	protected Max35Text relatedMessageReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedMessageReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdMsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessageReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ProcessingStatus43Choice processingStatus;
	/**
	 * Status of the standing settlement instruction, deletion or cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
	 * ProcessingStatus43Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the standing settlement instruction, deletion or cancellation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Status of the standing settlement instruction, deletion or cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProcessingStatus43Choice.mmObject();
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
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingSettlementInstructionStatusAdviceV01";
				definition = "Scope\r\nThe receiver of a StandingSettlementInstruction message sends the StandingSettlementInstructionStatusAdvice message to the instructing party (sender of the StandingSettlementInstruction message) to provide the status of a previously received StandingSettlementInstruction, StandingSettlementInstructionCancellation or StandingSettlementInstructionDeletion message.\r\n\r\nUsage\r\nThe StandingSettlementInstructionStatusAdvice message is used to report one of the following statuses:\r\n-\ta received status, or, \r\n-\tan accepted status, or,\r\n-\ta rejected status, or,\r\n-\ta pending processing status, or,\r\n-\ta proprietary status.";
				messageSet_lazy = () -> Arrays.asList(SSIforSecuritiesPaymentsandForeignExchange.mmObject());
				rootElement = "Document";
				xmlTag = "StgSttlmInstrStsAdvc";
				businessArea_lazy = () -> ReferenceDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(StandingSettlementInstructionStatusAdviceV01.mmEffectiveDateDetails, StandingSettlementInstructionStatusAdviceV01.mmAccountIdentification,
						StandingSettlementInstructionStatusAdviceV01.mmMarketIdentification, StandingSettlementInstructionStatusAdviceV01.mmSettlementDetails, StandingSettlementInstructionStatusAdviceV01.mmRelatedMessageReference,
						StandingSettlementInstructionStatusAdviceV01.mmProcessingStatus, StandingSettlementInstructionStatusAdviceV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "058";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public EffectiveDate1 getEffectiveDateDetails() {
		return effectiveDateDetails;
	}

	public void setEffectiveDateDetails(EffectiveDate1 effectiveDateDetails) {
		this.effectiveDateDetails = effectiveDateDetails;
	}

	public List<AccountIdentification26> getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(List<AccountIdentification26> accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	public MarketIdentificationOrCashPurpose1Choice getMarketIdentification() {
		return marketIdentification;
	}

	public void setMarketIdentification(MarketIdentificationOrCashPurpose1Choice marketIdentification) {
		this.marketIdentification = marketIdentification;
	}

	public PartyOrCurrency1Choice getSettlementDetails() {
		return settlementDetails;
	}

	public void setSettlementDetails(PartyOrCurrency1Choice settlementDetails) {
		this.settlementDetails = settlementDetails;
	}

	public Max35Text getRelatedMessageReference() {
		return relatedMessageReference;
	}

	public void setRelatedMessageReference(Max35Text relatedMessageReference) {
		this.relatedMessageReference = relatedMessageReference;
	}

	public ProcessingStatus43Choice getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatus43Choice processingStatus) {
		this.processingStatus = processingStatus;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}