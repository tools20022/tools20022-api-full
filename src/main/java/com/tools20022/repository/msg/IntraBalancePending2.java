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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PriorityNumeric1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmStatusAndReason
 * IntraBalancePending2.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmAccountOwnerTransactionIdentification
 * IntraBalancePending2.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmAccountServicerTransactionIdentification
 * IntraBalancePending2.mmAccountServicerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmMarketInfrastructureTransactionIdentification
 * IntraBalancePending2.mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmProcessorTransactionIdentification
 * IntraBalancePending2.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmPoolIdentification
 * IntraBalancePending2.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmCorporateActionEventIdentification
 * IntraBalancePending2.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmBalanceFrom
 * IntraBalancePending2.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmBalanceTo
 * IntraBalancePending2.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmSettlementAmount
 * IntraBalancePending2.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmIntendedSettlementDate
 * IntraBalancePending2.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmStatusDate
 * IntraBalancePending2.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmCashSubBalanceIdentification
 * IntraBalancePending2.mmCashSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmLinkages
 * IntraBalancePending2.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmPriority
 * IntraBalancePending2.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmMessageOriginator
 * IntraBalancePending2.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmCreationDateTime
 * IntraBalancePending2.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmInstructionProcessingAdditionalDetails
 * IntraBalancePending2.mmInstructionProcessingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmSupplementaryData
 * IntraBalancePending2.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalancePending2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the details of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraBalancePending2
 * ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalancePending2
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePending4
 * IntraBalancePending4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalancePending2", propOrder = {"statusAndReason", "accountOwnerTransactionIdentification", "accountServicerTransactionIdentification", "marketInfrastructureTransactionIdentification",
		"processorTransactionIdentification", "poolIdentification", "corporateActionEventIdentification", "balanceFrom", "balanceTo", "settlementAmount", "intendedSettlementDate", "statusDate", "cashSubBalanceIdentification", "linkages",
		"priority", "messageOriginator", "creationDateTime", "instructionProcessingAdditionalDetails", "supplementaryData"})
public class IntraBalancePending2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsAndRsn")
	protected PendingStatusAndReason1 statusAndReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason1
	 * PendingStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsAndRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status and status reason of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:STAT [and 16R:REAS]</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmStatusAndReason
	 * IntraBalancePending4.mmStatusAndReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePending2, Optional<PendingStatusAndReason1>> mmStatusAndReason = new MMMessageAssociationEnd<IntraBalancePending2, Optional<PendingStatusAndReason1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "StsAndRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:STAT [and 16R:REAS]"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReason";
			definition = "Status and status reason of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmStatusAndReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingStatusAndReason1.mmObject();
		}

		@Override
		public Optional<PendingStatusAndReason1> getValue(IntraBalancePending2 obj) {
			return obj.getStatusAndReason();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<PendingStatusAndReason1> value) {
			obj.setStatusAndReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrTxId", required = true)
	protected Max35Text accountOwnerTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountOwnerTransactionIdentification
	 * Entry.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmAccountOwnerTransactionIdentification
	 * IntraBalancePending4.mmAccountOwnerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Max35Text> mmAccountOwnerTransactionIdentification = new MMMessageAttribute<IntraBalancePending2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountOwnerTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmAccountOwnerTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IntraBalancePending2 obj) {
			return obj.getAccountOwnerTransactionIdentification();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Max35Text value) {
			obj.setAccountOwnerTransactionIdentification(value);
		}
	};
	@XmlElement(name = "AcctSvcrTxId")
	protected Max35Text accountServicerTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
	 * Entry.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::ASRF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmAccountServicerTransactionIdentification
	 * IntraBalancePending4.mmAccountServicerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>> mmAccountServicerTransactionIdentification = new MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountServicerTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::ASRF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmAccountServicerTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraBalancePending2 obj) {
			return obj.getAccountServicerTransactionIdentification();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<Max35Text> value) {
			obj.setAccountServicerTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MktInfrstrctrTxId")
	protected Max35Text marketInfrastructureTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::MITI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmMarketInfrastructureTransactionIdentification
	 * IntraBalancePending4.mmMarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>> mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::MITI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmMarketInfrastructureTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraBalancePending2 obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<Max35Text> value) {
			obj.setMarketInfrastructureTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcrTxId")
	protected Max35Text processorTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction as assigned by the processor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmProcessorTransactionIdentification
	 * IntraBalancePending4.mmProcessorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>> mmProcessorTransactionIdentification = new MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "PrcrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction as assigned by the processor.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmProcessorTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraBalancePending2 obj) {
			return obj.getProcessorTransactionIdentification();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<Max35Text> value) {
			obj.setProcessorTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PoolId")
	protected Max35Text poolIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmPoolIdentification
	 * IntraBalancePending4.mmPoolIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>> mmPoolIdentification = new MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmPoolIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraBalancePending2 obj) {
			return obj.getPoolIdentification();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<Max35Text> value) {
			obj.setPoolIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtId")
	protected Max35Text corporateActionEventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CORP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmCorporateActionEventIdentification
	 * IntraBalancePending4.mmCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>> mmCorporateActionEventIdentification = new MMMessageAttribute<IntraBalancePending2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CORP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmCorporateActionEventIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraBalancePending2 obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<Max35Text> value) {
			obj.setCorporateActionEventIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "BalFr", required = true)
	protected CashSubBalanceTypeAndQuantityBreakdown1 balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1
	 * CashSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the amount of money is moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmBalanceFrom
	 * IntraBalancePending4.mmBalanceFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePending2, CashSubBalanceTypeAndQuantityBreakdown1> mmBalanceFrom = new MMMessageAssociationEnd<IntraBalancePending2, CashSubBalanceTypeAndQuantityBreakdown1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the amount of money is moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmBalanceFrom);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}

		@Override
		public CashSubBalanceTypeAndQuantityBreakdown1 getValue(IntraBalancePending2 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, CashSubBalanceTypeAndQuantityBreakdown1 value) {
			obj.setBalanceFrom(value);
		}
	};
	@XmlElement(name = "BalTo", required = true)
	protected CashSubBalanceTypeAndQuantityBreakdown1 balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1
	 * CashSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the amount of money is moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmBalanceTo
	 * IntraBalancePending4.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePending2, CashSubBalanceTypeAndQuantityBreakdown1> mmBalanceTo = new MMMessageAssociationEnd<IntraBalancePending2, CashSubBalanceTypeAndQuantityBreakdown1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the amount of money is moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmBalanceTo);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}

		@Override
		public CashSubBalanceTypeAndQuantityBreakdown1 getValue(IntraBalancePending2 obj) {
			return obj.getBalanceTo();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, CashSubBalanceTypeAndQuantityBreakdown1 value) {
			obj.setBalanceTo(value);
		}
	};
	@XmlElement(name = "SttlmAmt", required = true)
	protected Amount2Choice settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount2Choice Amount2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmSettlementAmount
	 * IntraBalancePending4.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Amount2Choice> mmSettlementAmount = new MMMessageAttribute<IntraBalancePending2, Amount2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmSettlementAmount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Amount2Choice getValue(IntraBalancePending2 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Amount2Choice value) {
			obj.setSettlementAmount(value);
		}
	};
	@XmlElement(name = "IntnddSttlmDt", required = true)
	protected DateAndDateTimeChoice intendedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntnddSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntendedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the amount of money is intended to be moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmIntendedSettlementDate
	 * IntraBalancePending4.mmIntendedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, DateAndDateTimeChoice> mmIntendedSettlementDate = new MMMessageAttribute<IntraBalancePending2, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Date and time at which the amount of money is intended to be moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmIntendedSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IntraBalancePending2 obj) {
			return obj.getIntendedSettlementDate();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, DateAndDateTimeChoice value) {
			obj.setIntendedSettlementDate(value);
		}
	};
	@XmlElement(name = "StsDt")
	protected ISODateTime statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmStatusDate
	 * IntraBalancePending4.mmStatusDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<ISODateTime>> mmStatusDate = new MMMessageAttribute<IntraBalancePending2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmStatusDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(IntraBalancePending2 obj) {
			return obj.getStatusDate();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<ISODateTime> value) {
			obj.setStatusDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSubBalId")
	protected GenericIdentification37 cashSubBalanceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number identifying a lot constituting the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmCashSubBalanceIdentification
	 * IntraBalancePending4.mmCashSubBalanceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePending2, Optional<GenericIdentification37>> mmCashSubBalanceIdentification = new MMMessageAssociationEnd<IntraBalancePending2, Optional<GenericIdentification37>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceIdentification";
			definition = "Number identifying a lot constituting the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmCashSubBalanceIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification37.mmObject();
		}

		@Override
		public Optional<GenericIdentification37> getValue(IntraBalancePending2 obj) {
			return obj.getCashSubBalanceIdentification();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<GenericIdentification37> value) {
			obj.setCashSubBalanceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages26> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages26
	 * Linkages26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmLinkages
	 * IntraBalancePending4.mmLinkages}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, List<Linkages26>> mmLinkages = new MMMessageAttribute<IntraBalancePending2, List<Linkages26>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmLinkages);
			minOccurs = 0;
			complexType_lazy = () -> Linkages26.mmObject();
		}

		@Override
		public List<Linkages26> getValue(IntraBalancePending2 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, List<Linkages26> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityNumeric1Choice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric1Choice
	 * PriorityNumeric1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmPriority
	 * IntraBalancePending4.mmPriority}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<PriorityNumeric1Choice>> mmPriority = new MMMessageAttribute<IntraBalancePending2, Optional<PriorityNumeric1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmPriority);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriorityNumeric1Choice.mmObject();
		}

		@Override
		public Optional<PriorityNumeric1Choice> getValue(IntraBalancePending2 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<PriorityNumeric1Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected SystemPartyIdentification5 messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmMessageOriginator
	 * IntraBalancePending4.mmMessageOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePending2, Optional<SystemPartyIdentification5>> mmMessageOriginator = new MMMessageAssociationEnd<IntraBalancePending2, Optional<SystemPartyIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmMessageOriginator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification5.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification5> getValue(IntraBalancePending2 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<SystemPartyIdentification5> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmCreationDateTime
	 * IntraBalancePending4.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, ISODateTime> mmCreationDateTime = new MMMessageAttribute<IntraBalancePending2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmCreationDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IntraBalancePending2 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "InstrPrcgAddtlDtls")
	protected Max350Text instructionProcessingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::SPRO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmInstructionProcessingAdditionalDetails
	 * IntraBalancePending4.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalancePending2, Optional<Max350Text>> mmInstructionProcessingAdditionalDetails = new MMMessageAttribute<IntraBalancePending2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::SPRO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmInstructionProcessingAdditionalDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(IntraBalancePending2 obj) {
			return obj.getInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, Optional<Max350Text> value) {
			obj.setInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4#mmSupplementaryData
	 * IntraBalancePending4.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePending2, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<IntraBalancePending2, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePending2.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmSupplementaryData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(IntraBalancePending2 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(IntraBalancePending2 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalancePending2.mmStatusAndReason, com.tools20022.repository.msg.IntraBalancePending2.mmAccountOwnerTransactionIdentification,
						com.tools20022.repository.msg.IntraBalancePending2.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.IntraBalancePending2.mmMarketInfrastructureTransactionIdentification,
						com.tools20022.repository.msg.IntraBalancePending2.mmProcessorTransactionIdentification, com.tools20022.repository.msg.IntraBalancePending2.mmPoolIdentification,
						com.tools20022.repository.msg.IntraBalancePending2.mmCorporateActionEventIdentification, com.tools20022.repository.msg.IntraBalancePending2.mmBalanceFrom,
						com.tools20022.repository.msg.IntraBalancePending2.mmBalanceTo, com.tools20022.repository.msg.IntraBalancePending2.mmSettlementAmount, com.tools20022.repository.msg.IntraBalancePending2.mmIntendedSettlementDate,
						com.tools20022.repository.msg.IntraBalancePending2.mmStatusDate, com.tools20022.repository.msg.IntraBalancePending2.mmCashSubBalanceIdentification, com.tools20022.repository.msg.IntraBalancePending2.mmLinkages,
						com.tools20022.repository.msg.IntraBalancePending2.mmPriority, com.tools20022.repository.msg.IntraBalancePending2.mmMessageOriginator, com.tools20022.repository.msg.IntraBalancePending2.mmCreationDateTime,
						com.tools20022.repository.msg.IntraBalancePending2.mmInstructionProcessingAdditionalDetails, com.tools20022.repository.msg.IntraBalancePending2.mmSupplementaryData);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalancePending2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalancePending2";
				definition = "Identifies the details of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(IntraBalancePending4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PendingStatusAndReason1> getStatusAndReason() {
		return statusAndReason == null ? Optional.empty() : Optional.of(statusAndReason);
	}

	public IntraBalancePending2 setStatusAndReason(PendingStatusAndReason1 statusAndReason) {
		this.statusAndReason = statusAndReason;
		return this;
	}

	public Max35Text getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public IntraBalancePending2 setAccountOwnerTransactionIdentification(Max35Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = Objects.requireNonNull(accountOwnerTransactionIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification == null ? Optional.empty() : Optional.of(accountServicerTransactionIdentification);
	}

	public IntraBalancePending2 setAccountServicerTransactionIdentification(Max35Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification == null ? Optional.empty() : Optional.of(marketInfrastructureTransactionIdentification);
	}

	public IntraBalancePending2 setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getProcessorTransactionIdentification() {
		return processorTransactionIdentification == null ? Optional.empty() : Optional.of(processorTransactionIdentification);
	}

	public IntraBalancePending2 setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getPoolIdentification() {
		return poolIdentification == null ? Optional.empty() : Optional.of(poolIdentification);
	}

	public IntraBalancePending2 setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
		return this;
	}

	public Optional<Max35Text> getCorporateActionEventIdentification() {
		return corporateActionEventIdentification == null ? Optional.empty() : Optional.of(corporateActionEventIdentification);
	}

	public IntraBalancePending2 setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
		return this;
	}

	public CashSubBalanceTypeAndQuantityBreakdown1 getBalanceFrom() {
		return balanceFrom;
	}

	public IntraBalancePending2 setBalanceFrom(CashSubBalanceTypeAndQuantityBreakdown1 balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public CashSubBalanceTypeAndQuantityBreakdown1 getBalanceTo() {
		return balanceTo;
	}

	public IntraBalancePending2 setBalanceTo(CashSubBalanceTypeAndQuantityBreakdown1 balanceTo) {
		this.balanceTo = Objects.requireNonNull(balanceTo);
		return this;
	}

	public Amount2Choice getSettlementAmount() {
		return settlementAmount;
	}

	public IntraBalancePending2 setSettlementAmount(Amount2Choice settlementAmount) {
		this.settlementAmount = Objects.requireNonNull(settlementAmount);
		return this;
	}

	public DateAndDateTimeChoice getIntendedSettlementDate() {
		return intendedSettlementDate;
	}

	public IntraBalancePending2 setIntendedSettlementDate(DateAndDateTimeChoice intendedSettlementDate) {
		this.intendedSettlementDate = Objects.requireNonNull(intendedSettlementDate);
		return this;
	}

	public Optional<ISODateTime> getStatusDate() {
		return statusDate == null ? Optional.empty() : Optional.of(statusDate);
	}

	public IntraBalancePending2 setStatusDate(ISODateTime statusDate) {
		this.statusDate = statusDate;
		return this;
	}

	public Optional<GenericIdentification37> getCashSubBalanceIdentification() {
		return cashSubBalanceIdentification == null ? Optional.empty() : Optional.of(cashSubBalanceIdentification);
	}

	public IntraBalancePending2 setCashSubBalanceIdentification(GenericIdentification37 cashSubBalanceIdentification) {
		this.cashSubBalanceIdentification = cashSubBalanceIdentification;
		return this;
	}

	public List<Linkages26> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public IntraBalancePending2 setLinkages(List<Linkages26> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public Optional<PriorityNumeric1Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public IntraBalancePending2 setPriority(PriorityNumeric1Choice priority) {
		this.priority = priority;
		return this;
	}

	public Optional<SystemPartyIdentification5> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public IntraBalancePending2 setMessageOriginator(SystemPartyIdentification5 messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public IntraBalancePending2 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<Max350Text> getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(instructionProcessingAdditionalDetails);
	}

	public IntraBalancePending2 setInstructionProcessingAdditionalDetails(Max350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public IntraBalancePending2 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}