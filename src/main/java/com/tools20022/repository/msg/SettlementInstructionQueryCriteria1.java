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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria based on which information is included.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmReferences
 * SettlementInstructionQueryCriteria1.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmStatus
 * SettlementInstructionQueryCriteria1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSecuritiesMovementType
 * SettlementInstructionQueryCriteria1.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmPayment
 * SettlementInstructionQueryCriteria1.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSecuritiesTransactionType
 * SettlementInstructionQueryCriteria1.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmFinancialInstrumentIdentification
 * SettlementInstructionQueryCriteria1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmPriority
 * SettlementInstructionQueryCriteria1.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSafekeepingAccount
 * SettlementInstructionQueryCriteria1.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmCashAccount
 * SettlementInstructionQueryCriteria1.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmTradeDate
 * SettlementInstructionQueryCriteria1.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettlementQuantity
 * SettlementInstructionQueryCriteria1.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettledQuantity
 * SettlementInstructionQueryCriteria1.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettlementAmount
 * SettlementInstructionQueryCriteria1.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettledAmount
 * SettlementInstructionQueryCriteria1.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmIntendedSettlementDate
 * SettlementInstructionQueryCriteria1.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmEffectiveSettlementDate
 * SettlementInstructionQueryCriteria1.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettlementCurrency
 * SettlementInstructionQueryCriteria1.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSafekeepingAccountOwner
 * SettlementInstructionQueryCriteria1.mmSafekeepingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmMessageOriginator
 * SettlementInstructionQueryCriteria1.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmCounterpartSettlementParties
 * SettlementInstructionQueryCriteria1.mmCounterpartSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmDeliveringSettlementParties
 * SettlementInstructionQueryCriteria1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmReceivingSettlementParties
 * SettlementInstructionQueryCriteria1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmTradeTransactionCondition
 * SettlementInstructionQueryCriteria1.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSecuritiesTransactionCondition
 * SettlementInstructionQueryCriteria1.mmSecuritiesTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmPartialSettlementIndicator
 * SettlementInstructionQueryCriteria1.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmConditionalSecuritiesDelivery
 * SettlementInstructionQueryCriteria1.mmConditionalSecuritiesDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmCountryOfIssue
 * SettlementInstructionQueryCriteria1.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmIssuerCSD
 * SettlementInstructionQueryCriteria1.mmIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmHoldIndicator
 * SettlementInstructionQueryCriteria1.mmHoldIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionQueryCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
 * SettlementInstructionQueryCriteria2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInstructionQueryCriteria1", propOrder = {"references", "status", "securitiesMovementType", "payment", "securitiesTransactionType", "financialInstrumentIdentification", "priority", "safekeepingAccount",
		"cashAccount", "tradeDate", "settlementQuantity", "settledQuantity", "settlementAmount", "settledAmount", "intendedSettlementDate", "effectiveSettlementDate", "settlementCurrency", "safekeepingAccountOwner", "messageOriginator",
		"counterpartSettlementParties", "deliveringSettlementParties", "receivingSettlementParties", "tradeTransactionCondition", "securitiesTransactionCondition", "partialSettlementIndicator", "conditionalSecuritiesDelivery",
		"countryOfIssue", "issuerCSD", "holdIndicator"})
public class SettlementInstructionQueryCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs")
	protected List<References35Choice> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References35Choice
	 * References35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmReferences
	 * SettlementInstructionQueryCriteria2.mmReferences}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<References35Choice>> mmReferences = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<References35Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmReferences);
			minOccurs = 0;
			complexType_lazy = () -> References35Choice.mmObject();
		}

		@Override
		public List<References35Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<References35Choice> value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "Sts")
	protected List<SettlementInstructionQueryStatus1> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus1
	 * SettlementInstructionQueryStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmStatus
	 * SettlementInstructionQueryCriteria2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<SettlementInstructionQueryStatus1>> mmStatus = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<SettlementInstructionQueryStatus1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmStatus);
			minOccurs = 0;
			complexType_lazy = () -> SettlementInstructionQueryStatus1.mmObject();
		}

		@Override
		public List<SettlementInstructionQueryStatus1> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SettlementInstructionQueryStatus1> value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "SctiesMvmntTp")
	protected List<ReceiveDelivery1Code> securitiesMovementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE, ISO15022Synonym: MT 540-1
	 * or 542-3</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSecuritiesMovementType
	 * SettlementInstructionQueryCriteria2.mmSecuritiesMovementType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<ReceiveDelivery1Code>> mmSecuritiesMovementType = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<ReceiveDelivery1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE"), new ISO15022Synonym(this, "MT 540-1 or 542-3"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSecuritiesMovementType);
			minOccurs = 0;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}

		@Override
		public List<ReceiveDelivery1Code> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSecuritiesMovementType();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<ReceiveDelivery1Code> value) {
			obj.setSecuritiesMovementType(value);
		}
	};
	@XmlElement(name = "Pmt")
	protected List<DeliveryReceiptType2Code> payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::PAYM, ISO15022Synonym: MT
	 * 541-543 or 540-542</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, for example, against payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmPayment
	 * SettlementInstructionQueryCriteria2.mmPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<DeliveryReceiptType2Code>> mmPayment = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<DeliveryReceiptType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::PAYM"), new ISO15022Synonym(this, "MT 541-543 or 540-542"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmPayment);
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public List<DeliveryReceiptType2Code> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<DeliveryReceiptType2Code> value) {
			obj.setPayment(value);
		}
	};
	@XmlElement(name = "SctiesTxTp")
	protected List<SecuritiesTransactionType10Choice> securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType10Choice
	 * SecuritiesTransactionType10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSecuritiesTransactionType
	 * SettlementInstructionQueryCriteria2.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SecuritiesTransactionType10Choice>> mmSecuritiesTransactionType = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SecuritiesTransactionType10Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSecuritiesTransactionType);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionType10Choice.mmObject();
		}

		@Override
		public List<SecuritiesTransactionType10Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SecuritiesTransactionType10Choice> value) {
			obj.setSecuritiesTransactionType(value);
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected List<SecurityIdentification14> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmFinancialInstrumentIdentification
	 * SettlementInstructionQueryCriteria2.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SecurityIdentification14>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SecurityIdentification14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmFinancialInstrumentIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public List<SecurityIdentification14> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SecurityIdentification14> value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "Prty")
	protected List<PriorityNumeric1Choice> priority;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmPriority
	 * SettlementInstructionQueryCriteria2.mmPriority}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<PriorityNumeric1Choice>> mmPriority = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<PriorityNumeric1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmPriority);
			minOccurs = 0;
			complexType_lazy = () -> PriorityNumeric1Choice.mmObject();
		}

		@Override
		public List<PriorityNumeric1Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<PriorityNumeric1Choice> value) {
			obj.setPriority(value);
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected List<SecuritiesAccount13> safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
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
	 * definition} = "Account where financial instruments are maintained."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSafekeepingAccount
	 * SettlementInstructionQueryCriteria2.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<SecuritiesAccount13>> mmSafekeepingAccount = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<SecuritiesAccount13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account where financial instruments are maintained.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSafekeepingAccount);
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public List<SecuritiesAccount13> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SecuritiesAccount13> value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "CshAcct")
	protected List<AccountIdentificationSearchCriteria2Choice> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account in which cash is maintained."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmCashAccount
	 * SettlementInstructionQueryCriteria2.mmCashAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<AccountIdentificationSearchCriteria2Choice>> mmCashAccount = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<AccountIdentificationSearchCriteria2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account in which cash is maintained.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmCashAccount);
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}

		@Override
		public List<AccountIdentificationSearchCriteria2Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<AccountIdentificationSearchCriteria2Choice> value) {
			obj.setCashAccount(value);
		}
	};
	@XmlElement(name = "TradDt")
	protected DateAndDateTimeSearch2Choice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmTradeDate
	 * SettlementInstructionQueryCriteria2.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>> mmTradeDate = new MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmQty")
	protected QuantitySearch1Choice settlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice
	 * QuantitySearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettlementQuantity
	 * SettlementInstructionQueryCriteria2.mmSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<QuantitySearch1Choice>> mmSettlementQuantity = new MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<QuantitySearch1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSettlementQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuantitySearch1Choice.mmObject();
		}

		@Override
		public Optional<QuantitySearch1Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSettlementQuantity();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<QuantitySearch1Choice> value) {
			obj.setSettlementQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SttldQty")
	protected QuantitySearch1Choice settledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice
	 * QuantitySearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettledQuantity
	 * SettlementInstructionQueryCriteria2.mmSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<QuantitySearch1Choice>> mmSettledQuantity = new MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<QuantitySearch1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Total quantity of securities settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSettledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuantitySearch1Choice.mmObject();
		}

		@Override
		public Optional<QuantitySearch1Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSettledQuantity();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<QuantitySearch1Choice> value) {
			obj.setSettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected ActiveCurrencyAndAmountRange1 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1
	 * ActiveCurrencyAndAmountRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettlementAmount
	 * SettlementInstructionQueryCriteria2.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, Optional<ActiveCurrencyAndAmountRange1>> mmSettlementAmount = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, Optional<ActiveCurrencyAndAmountRange1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ActiveCurrencyAndAmountRange1.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmountRange1> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<ActiveCurrencyAndAmountRange1> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SttldAmt")
	protected ActiveCurrencyAndAmountRange1 settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1
	 * ActiveCurrencyAndAmountRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid or received in exchange for the securities."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettledAmount
	 * SettlementInstructionQueryCriteria2.mmSettledAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, Optional<ActiveCurrencyAndAmountRange1>> mmSettledAmount = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, Optional<ActiveCurrencyAndAmountRange1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttldAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Total amount of money paid or received in exchange for the securities.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSettledAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ActiveCurrencyAndAmountRange1.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmountRange1> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSettledAmount();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<ActiveCurrencyAndAmountRange1> value) {
			obj.setSettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IntnddSttlmDt")
	protected DateAndDateTimeSearch2Choice intendedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntnddSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntendedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a transaction is expected to settle. That is, the intended day on which transfer of cash or assets is completed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmIntendedSettlementDate
	 * SettlementInstructionQueryCriteria2.mmIntendedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>> mmIntendedSettlementDate = new MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Date on which a transaction is expected to settle. That is, the intended day on which transfer of cash or assets is completed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmIntendedSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getIntendedSettlementDate();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setIntendedSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvSttlmDt")
	protected DateAndDateTimeSearch2Choice effectiveSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EXSE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared, that is a payment is effected and securities are delivered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmEffectiveSettlementDate
	 * SettlementInstructionQueryCriteria2.mmEffectiveSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>> mmEffectiveSettlementDate = new MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which a transaction is completed and cleared, that is a payment is effected and securities are delivered.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmEffectiveSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getEffectiveSettlementDate();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setEffectiveSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmCcy")
	protected List<ActiveOrHistoricCurrencyCode> settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
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
	 * definition} = "Currency in which the instructed amount is expressed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettlementCurrency
	 * SettlementInstructionQueryCriteria2.mmSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<ActiveOrHistoricCurrencyCode>> mmSettlementCurrency = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which the instructed amount is expressed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSettlementCurrency);
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyCode> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<ActiveOrHistoricCurrencyCode> value) {
			obj.setSettlementCurrency(value);
		}
	};
	@XmlElement(name = "SfkpgAcctOwnr")
	protected List<PartyIdentification46> safekeepingAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification46
	 * PartyIdentification46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSafekeepingAccountOwner
	 * SettlementInstructionQueryCriteria2.mmSafekeepingAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<PartyIdentification46>> mmSafekeepingAccountOwner = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<PartyIdentification46>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountOwner";
			definition = "Party that owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSafekeepingAccountOwner);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification46.mmObject();
		}

		@Override
		public List<PartyIdentification46> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSafekeepingAccountOwner();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<PartyIdentification46> value) {
			obj.setSafekeepingAccountOwner(value);
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected List<SystemPartyIdentification5> messageOriginator;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmMessageOriginator
	 * SettlementInstructionQueryCriteria2.mmMessageOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SystemPartyIdentification5>> mmMessageOriginator = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SystemPartyIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmMessageOriginator);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification5.mmObject();
		}

		@Override
		public List<SystemPartyIdentification5> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SystemPartyIdentification5> value) {
			obj.setMessageOriginator(value);
		}
	};
	@XmlElement(name = "CntrptSttlmPties")
	protected List<SettlementParties13> counterpartSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties13
	 * SettlementParties13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrptSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of counterparty settlement parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmCounterpartSettlementParties
	 * SettlementInstructionQueryCriteria2.mmCounterpartSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementParties13>> mmCounterpartSettlementParties = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementParties13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CntrptSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartSettlementParties";
			definition = "Identifies the chain of counterparty settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmCounterpartSettlementParties);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties13.mmObject();
		}

		@Override
		public List<SettlementParties13> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getCounterpartSettlementParties();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SettlementParties13> value) {
			obj.setCounterpartSettlementParties(value);
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected List<SettlementParties13> deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties13
	 * SettlementParties13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmDeliveringSettlementParties
	 * SettlementInstructionQueryCriteria2.mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementParties13>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementParties13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmDeliveringSettlementParties);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties13.mmObject();
		}

		@Override
		public List<SettlementParties13> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SettlementParties13> value) {
			obj.setDeliveringSettlementParties(value);
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected List<SettlementParties13> receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties13
	 * SettlementParties13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmReceivingSettlementParties
	 * SettlementInstructionQueryCriteria2.mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementParties13>> mmReceivingSettlementParties = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementParties13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmReceivingSettlementParties);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties13.mmObject();
		}

		@Override
		public List<SettlementParties13> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SettlementParties13> value) {
			obj.setReceivingSettlementParties(value);
		}
	};
	@XmlElement(name = "TradTxCond")
	protected List<TradeTransactionCondition1Code> tradeTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmTradeTransactionCondition
	 * SettlementInstructionQueryCriteria2.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<TradeTransactionCondition1Code>> mmTradeTransactionCondition = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<TradeTransactionCondition1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Provides the conditions under which the order/trade is to be/was executed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmTradeTransactionCondition);
			minOccurs = 0;
			simpleType_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}

		@Override
		public List<TradeTransactionCondition1Code> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getTradeTransactionCondition();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<TradeTransactionCondition1Code> value) {
			obj.setTradeTransactionCondition(value);
		}
	};
	@XmlElement(name = "SctiesTxCond")
	protected List<SettlementTransactionCondition12Choice> securitiesTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice
	 * SettlementTransactionCondition12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSecuritiesTransactionCondition
	 * SettlementInstructionQueryCriteria2.mmSecuritiesTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementTransactionCondition12Choice>> mmSecuritiesTransactionCondition = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<SettlementTransactionCondition12Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmSecuritiesTransactionCondition);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition12Choice.mmObject();
		}

		@Override
		public List<SettlementTransactionCondition12Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getSecuritiesTransactionCondition();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<SettlementTransactionCondition12Choice> value) {
			obj.setSecuritiesTransactionCondition(value);
		}
	};
	@XmlElement(name = "PrtlSttlmInd")
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmPartialSettlementIndicator
	 * SettlementInstructionQueryCriteria2.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<SettlementTransactionCondition5Code>> mmPartialSettlementIndicator = new MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<SettlementTransactionCondition5Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmPartialSettlementIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
		}

		@Override
		public Optional<SettlementTransactionCondition5Code> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getPartialSettlementIndicator();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<SettlementTransactionCondition5Code> value) {
			obj.setPartialSettlementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CondlSctiesDlvry")
	protected YesNoIndicator conditionalSecuritiesDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlSctiesDlvry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalSecuritiesDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is under Conditional Securities Delivery (CoSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmConditionalSecuritiesDelivery
	 * SettlementInstructionQueryCriteria2.mmConditionalSecuritiesDelivery}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<YesNoIndicator>> mmConditionalSecuritiesDelivery = new MMMessageAttribute<SettlementInstructionQueryCriteria1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CondlSctiesDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalSecuritiesDelivery";
			definition = "Specifies whether the transaction is under Conditional Securities Delivery (CoSD).";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmConditionalSecuritiesDelivery);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getConditionalSecuritiesDelivery();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, Optional<YesNoIndicator> value) {
			obj.setConditionalSecuritiesDelivery(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfIsse")
	protected List<CountryCode> countryOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 470</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary market or country where a security is issued by the issuer or its agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmCountryOfIssue
	 * SettlementInstructionQueryCriteria2.mmCountryOfIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<CountryCode>> mmCountryOfIssue = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmCountryOfIssue);
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getCountryOfIssue();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<CountryCode> value) {
			obj.setCountryOfIssue(value);
		}
	};
	@XmlElement(name = "IssrCSD")
	protected List<PartyIdentification71Choice> issuerCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Central securities depository (CSD) in which financial instruments are issued (or immobilised). The issuer CSD opens accounts allowing investors (in a direct holding system) and/or intermediaries (including investor CSDs) to hold these financial instruments."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmIssuerCSD
	 * SettlementInstructionQueryCriteria2.mmIssuerCSD}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<PartyIdentification71Choice>> mmIssuerCSD = new MMMessageAssociationEnd<SettlementInstructionQueryCriteria1, List<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "Central securities depository (CSD) in which financial instruments are issued (or immobilised). The issuer CSD opens accounts allowing investors (in a direct holding system) and/or intermediaries (including investor CSDs) to hold these financial instruments.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmIssuerCSD);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getIssuerCSD();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<PartyIdentification71Choice> value) {
			obj.setIssuerCSD(value);
		}
	};
	@XmlElement(name = "HldInd")
	protected List<Registration3Choice> holdIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Registration3Choice
	 * Registration3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
	 * SettlementInstructionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold, blocked or frozen."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmHoldIndicator
	 * SettlementInstructionQueryCriteria2.mmHoldIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryCriteria1, List<Registration3Choice>> mmHoldIndicator = new MMMessageAttribute<SettlementInstructionQueryCriteria1, List<Registration3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold, blocked or frozen.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmHoldIndicator);
			minOccurs = 0;
			complexType_lazy = () -> Registration3Choice.mmObject();
		}

		@Override
		public List<Registration3Choice> getValue(SettlementInstructionQueryCriteria1 obj) {
			return obj.getHoldIndicator();
		}

		@Override
		public void setValue(SettlementInstructionQueryCriteria1 obj, List<Registration3Choice> value) {
			obj.setHoldIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmReferences, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmStatus,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmPayment,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSecuritiesTransactionType, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmPriority, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSafekeepingAccount,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmCashAccount, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmTradeDate,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSettlementQuantity, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSettledQuantity,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSettlementAmount, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSettledAmount,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmIntendedSettlementDate, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmEffectiveSettlementDate,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSettlementCurrency, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSafekeepingAccountOwner,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmMessageOriginator, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmCounterpartSettlementParties,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmDeliveringSettlementParties, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmTradeTransactionCondition, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmSecuritiesTransactionCondition,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmConditionalSecuritiesDelivery,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmCountryOfIssue, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmIssuerCSD,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmHoldIndicator);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInstructionQueryCriteria1";
				definition = "Defines the criteria based on which information is included.";
				nextVersions_lazy = () -> Arrays.asList(SettlementInstructionQueryCriteria2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<References35Choice> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public SettlementInstructionQueryCriteria1 setReferences(List<References35Choice> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public List<SettlementInstructionQueryStatus1> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public SettlementInstructionQueryCriteria1 setStatus(List<SettlementInstructionQueryStatus1> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<ReceiveDelivery1Code> getSecuritiesMovementType() {
		return securitiesMovementType == null ? securitiesMovementType = new ArrayList<>() : securitiesMovementType;
	}

	public SettlementInstructionQueryCriteria1 setSecuritiesMovementType(List<ReceiveDelivery1Code> securitiesMovementType) {
		this.securitiesMovementType = Objects.requireNonNull(securitiesMovementType);
		return this;
	}

	public List<DeliveryReceiptType2Code> getPayment() {
		return payment == null ? payment = new ArrayList<>() : payment;
	}

	public SettlementInstructionQueryCriteria1 setPayment(List<DeliveryReceiptType2Code> payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public List<SecuritiesTransactionType10Choice> getSecuritiesTransactionType() {
		return securitiesTransactionType == null ? securitiesTransactionType = new ArrayList<>() : securitiesTransactionType;
	}

	public SettlementInstructionQueryCriteria1 setSecuritiesTransactionType(List<SecuritiesTransactionType10Choice> securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}

	public List<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public SettlementInstructionQueryCriteria1 setFinancialInstrumentIdentification(List<SecurityIdentification14> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public List<PriorityNumeric1Choice> getPriority() {
		return priority == null ? priority = new ArrayList<>() : priority;
	}

	public SettlementInstructionQueryCriteria1 setPriority(List<PriorityNumeric1Choice> priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public List<SecuritiesAccount13> getSafekeepingAccount() {
		return safekeepingAccount == null ? safekeepingAccount = new ArrayList<>() : safekeepingAccount;
	}

	public SettlementInstructionQueryCriteria1 setSafekeepingAccount(List<SecuritiesAccount13> safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<AccountIdentificationSearchCriteria2Choice> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public SettlementInstructionQueryCriteria1 setCashAccount(List<AccountIdentificationSearchCriteria2Choice> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public SettlementInstructionQueryCriteria1 setTradeDate(DateAndDateTimeSearch2Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<QuantitySearch1Choice> getSettlementQuantity() {
		return settlementQuantity == null ? Optional.empty() : Optional.of(settlementQuantity);
	}

	public SettlementInstructionQueryCriteria1 setSettlementQuantity(QuantitySearch1Choice settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
		return this;
	}

	public Optional<QuantitySearch1Choice> getSettledQuantity() {
		return settledQuantity == null ? Optional.empty() : Optional.of(settledQuantity);
	}

	public SettlementInstructionQueryCriteria1 setSettledQuantity(QuantitySearch1Choice settledQuantity) {
		this.settledQuantity = settledQuantity;
		return this;
	}

	public Optional<ActiveCurrencyAndAmountRange1> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SettlementInstructionQueryCriteria1 setSettlementAmount(ActiveCurrencyAndAmountRange1 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmountRange1> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SettlementInstructionQueryCriteria1 setSettledAmount(ActiveCurrencyAndAmountRange1 settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getIntendedSettlementDate() {
		return intendedSettlementDate == null ? Optional.empty() : Optional.of(intendedSettlementDate);
	}

	public SettlementInstructionQueryCriteria1 setIntendedSettlementDate(DateAndDateTimeSearch2Choice intendedSettlementDate) {
		this.intendedSettlementDate = intendedSettlementDate;
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getEffectiveSettlementDate() {
		return effectiveSettlementDate == null ? Optional.empty() : Optional.of(effectiveSettlementDate);
	}

	public SettlementInstructionQueryCriteria1 setEffectiveSettlementDate(DateAndDateTimeSearch2Choice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? settlementCurrency = new ArrayList<>() : settlementCurrency;
	}

	public SettlementInstructionQueryCriteria1 setSettlementCurrency(List<ActiveOrHistoricCurrencyCode> settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public List<PartyIdentification46> getSafekeepingAccountOwner() {
		return safekeepingAccountOwner == null ? safekeepingAccountOwner = new ArrayList<>() : safekeepingAccountOwner;
	}

	public SettlementInstructionQueryCriteria1 setSafekeepingAccountOwner(List<PartyIdentification46> safekeepingAccountOwner) {
		this.safekeepingAccountOwner = Objects.requireNonNull(safekeepingAccountOwner);
		return this;
	}

	public List<SystemPartyIdentification5> getMessageOriginator() {
		return messageOriginator == null ? messageOriginator = new ArrayList<>() : messageOriginator;
	}

	public SettlementInstructionQueryCriteria1 setMessageOriginator(List<SystemPartyIdentification5> messageOriginator) {
		this.messageOriginator = Objects.requireNonNull(messageOriginator);
		return this;
	}

	public List<SettlementParties13> getCounterpartSettlementParties() {
		return counterpartSettlementParties == null ? counterpartSettlementParties = new ArrayList<>() : counterpartSettlementParties;
	}

	public SettlementInstructionQueryCriteria1 setCounterpartSettlementParties(List<SettlementParties13> counterpartSettlementParties) {
		this.counterpartSettlementParties = Objects.requireNonNull(counterpartSettlementParties);
		return this;
	}

	public List<SettlementParties13> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? deliveringSettlementParties = new ArrayList<>() : deliveringSettlementParties;
	}

	public SettlementInstructionQueryCriteria1 setDeliveringSettlementParties(List<SettlementParties13> deliveringSettlementParties) {
		this.deliveringSettlementParties = Objects.requireNonNull(deliveringSettlementParties);
		return this;
	}

	public List<SettlementParties13> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? receivingSettlementParties = new ArrayList<>() : receivingSettlementParties;
	}

	public SettlementInstructionQueryCriteria1 setReceivingSettlementParties(List<SettlementParties13> receivingSettlementParties) {
		this.receivingSettlementParties = Objects.requireNonNull(receivingSettlementParties);
		return this;
	}

	public List<TradeTransactionCondition1Code> getTradeTransactionCondition() {
		return tradeTransactionCondition == null ? tradeTransactionCondition = new ArrayList<>() : tradeTransactionCondition;
	}

	public SettlementInstructionQueryCriteria1 setTradeTransactionCondition(List<TradeTransactionCondition1Code> tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public List<SettlementTransactionCondition12Choice> getSecuritiesTransactionCondition() {
		return securitiesTransactionCondition == null ? securitiesTransactionCondition = new ArrayList<>() : securitiesTransactionCondition;
	}

	public SettlementInstructionQueryCriteria1 setSecuritiesTransactionCondition(List<SettlementTransactionCondition12Choice> securitiesTransactionCondition) {
		this.securitiesTransactionCondition = Objects.requireNonNull(securitiesTransactionCondition);
		return this;
	}

	public Optional<SettlementTransactionCondition5Code> getPartialSettlementIndicator() {
		return partialSettlementIndicator == null ? Optional.empty() : Optional.of(partialSettlementIndicator);
	}

	public SettlementInstructionQueryCriteria1 setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getConditionalSecuritiesDelivery() {
		return conditionalSecuritiesDelivery == null ? Optional.empty() : Optional.of(conditionalSecuritiesDelivery);
	}

	public SettlementInstructionQueryCriteria1 setConditionalSecuritiesDelivery(YesNoIndicator conditionalSecuritiesDelivery) {
		this.conditionalSecuritiesDelivery = conditionalSecuritiesDelivery;
		return this;
	}

	public List<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? countryOfIssue = new ArrayList<>() : countryOfIssue;
	}

	public SettlementInstructionQueryCriteria1 setCountryOfIssue(List<CountryCode> countryOfIssue) {
		this.countryOfIssue = Objects.requireNonNull(countryOfIssue);
		return this;
	}

	public List<PartyIdentification71Choice> getIssuerCSD() {
		return issuerCSD == null ? issuerCSD = new ArrayList<>() : issuerCSD;
	}

	public SettlementInstructionQueryCriteria1 setIssuerCSD(List<PartyIdentification71Choice> issuerCSD) {
		this.issuerCSD = Objects.requireNonNull(issuerCSD);
		return this;
	}

	public List<Registration3Choice> getHoldIndicator() {
		return holdIndicator == null ? holdIndicator = new ArrayList<>() : holdIndicator;
	}

	public SettlementInstructionQueryCriteria1 setHoldIndicator(List<Registration3Choice> holdIndicator) {
		this.holdIndicator = Objects.requireNonNull(holdIndicator);
		return this;
	}
}