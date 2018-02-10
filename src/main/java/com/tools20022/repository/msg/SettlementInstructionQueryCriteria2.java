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
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmReferences
 * SettlementInstructionQueryCriteria2.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmStatus
 * SettlementInstructionQueryCriteria2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSecuritiesMovementType
 * SettlementInstructionQueryCriteria2.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmPayment
 * SettlementInstructionQueryCriteria2.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSecuritiesTransactionType
 * SettlementInstructionQueryCriteria2.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmFinancialInstrumentIdentification
 * SettlementInstructionQueryCriteria2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmPriority
 * SettlementInstructionQueryCriteria2.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSafekeepingAccount
 * SettlementInstructionQueryCriteria2.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmCashAccount
 * SettlementInstructionQueryCriteria2.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmTradeDate
 * SettlementInstructionQueryCriteria2.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettlementQuantity
 * SettlementInstructionQueryCriteria2.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettledQuantity
 * SettlementInstructionQueryCriteria2.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettlementAmount
 * SettlementInstructionQueryCriteria2.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettledAmount
 * SettlementInstructionQueryCriteria2.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmIntendedSettlementDate
 * SettlementInstructionQueryCriteria2.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmEffectiveSettlementDate
 * SettlementInstructionQueryCriteria2.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSettlementCurrency
 * SettlementInstructionQueryCriteria2.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSafekeepingAccountOwner
 * SettlementInstructionQueryCriteria2.mmSafekeepingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmMessageOriginator
 * SettlementInstructionQueryCriteria2.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmCounterpartSettlementParties
 * SettlementInstructionQueryCriteria2.mmCounterpartSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmDeliveringSettlementParties
 * SettlementInstructionQueryCriteria2.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmReceivingSettlementParties
 * SettlementInstructionQueryCriteria2.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmTradeTransactionCondition
 * SettlementInstructionQueryCriteria2.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmSecuritiesTransactionCondition
 * SettlementInstructionQueryCriteria2.mmSecuritiesTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmPartialSettlementIndicator
 * SettlementInstructionQueryCriteria2.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmConditionalSecuritiesDelivery
 * SettlementInstructionQueryCriteria2.mmConditionalSecuritiesDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmCountryOfIssue
 * SettlementInstructionQueryCriteria2.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmIssuerCSD
 * SettlementInstructionQueryCriteria2.mmIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmHoldIndicator
 * SettlementInstructionQueryCriteria2.mmHoldIndicator}</li>
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
 * "SettlementInstructionQueryCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1
 * SettlementInstructionQueryCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInstructionQueryCriteria2", propOrder = {"references", "status", "securitiesMovementType", "payment", "securitiesTransactionType", "financialInstrumentIdentification", "priority", "safekeepingAccount",
		"cashAccount", "tradeDate", "settlementQuantity", "settledQuantity", "settlementAmount", "settledAmount", "intendedSettlementDate", "effectiveSettlementDate", "settlementCurrency", "safekeepingAccountOwner", "messageOriginator",
		"counterpartSettlementParties", "deliveringSettlementParties", "receivingSettlementParties", "tradeTransactionCondition", "securitiesTransactionCondition", "partialSettlementIndicator", "conditionalSecuritiesDelivery",
		"countryOfIssue", "issuerCSD", "holdIndicator"})
public class SettlementInstructionQueryCriteria2 {

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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmReferences
	 * SettlementInstructionQueryCriteria1.mmReferences}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferences = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmReferences;
			minOccurs = 0;
			complexType_lazy = () -> References35Choice.mmObject();
		}
	};
	@XmlElement(name = "Sts")
	protected List<com.tools20022.repository.msg.SettlementInstructionQueryStatus2> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus2
	 * SettlementInstructionQueryStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmStatus
	 * SettlementInstructionQueryCriteria1.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status of settlement of a transaction.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmStatus;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryStatus2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSecuritiesMovementType
	 * SettlementInstructionQueryCriteria1.mmSecuritiesMovementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesMovementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE"), new ISO15022Synonym(this, "MT 540-1 or 542-3"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSecuritiesMovementType;
			minOccurs = 0;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmPayment
	 * SettlementInstructionQueryCriteria1.mmPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::PAYM"), new ISO15022Synonym(this, "MT 541-543 or 540-542"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmPayment;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	@XmlElement(name = "SctiesTxTp")
	protected List<SecuritiesTransactionType18Choice> securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice
	 * SecuritiesTransactionType18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSecuritiesTransactionType
	 * SettlementInstructionQueryCriteria1.mmSecuritiesTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesTransactionType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSecuritiesTransactionType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionType18Choice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected List<com.tools20022.repository.msg.SecurityIdentification19> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmFinancialInstrumentIdentification
	 * SettlementInstructionQueryCriteria1.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmFinancialInstrumentIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	@XmlElement(name = "Prty")
	protected List<PriorityNumeric4Choice> priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric4Choice
	 * PriorityNumeric4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmPriority
	 * SettlementInstructionQueryCriteria1.mmPriority}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmPriority;
			minOccurs = 0;
			complexType_lazy = () -> PriorityNumeric4Choice.mmObject();
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected List<com.tools20022.repository.msg.SecuritiesAccount19> safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSafekeepingAccount
	 * SettlementInstructionQueryCriteria1.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account where financial instruments are maintained.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSafekeepingAccount;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmCashAccount
	 * SettlementInstructionQueryCriteria1.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account in which cash is maintained.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmCashAccount;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmTradeDate
	 * SettlementInstructionQueryCriteria1.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettlementQuantity
	 * SettlementInstructionQueryCriteria1.mmSettlementQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSettlementQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuantitySearch1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettledQuantity
	 * SettlementInstructionQueryCriteria1.mmSettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettledQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Total quantity of securities settled.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSettledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuantitySearch1Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected ActiveCurrencyAndAmountRange2 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2
	 * ActiveCurrencyAndAmountRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettlementAmount
	 * SettlementInstructionQueryCriteria1.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2.mmObject();
		}
	};
	@XmlElement(name = "SttldAmt")
	protected ActiveCurrencyAndAmountRange2 settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2
	 * ActiveCurrencyAndAmountRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettledAmount
	 * SettlementInstructionQueryCriteria1.mmSettledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettledAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SttldAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Total amount of money paid or received in exchange for the securities.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSettledAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmIntendedSettlementDate
	 * SettlementInstructionQueryCriteria1.mmIntendedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntendedSettlementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Date on which a transaction is expected to settle. That is, the intended day on which transfer of cash or assets is completed.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmIntendedSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmEffectiveSettlementDate
	 * SettlementInstructionQueryCriteria1.mmEffectiveSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveSettlementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which a transaction is completed and cleared, that is a payment is effected and securities are delivered.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmEffectiveSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSettlementCurrency
	 * SettlementInstructionQueryCriteria1.mmSettlementCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which the instructed amount is expressed.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSettlementCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "SfkpgAcctOwnr")
	protected List<com.tools20022.repository.msg.PartyIdentification91> safekeepingAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification91
	 * PartyIdentification91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSafekeepingAccountOwner
	 * SettlementInstructionQueryCriteria1.mmSafekeepingAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountOwner";
			definition = "Party that owns the account.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSafekeepingAccountOwner;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification91.mmObject();
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected List<com.tools20022.repository.msg.SystemPartyIdentification6> messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmMessageOriginator
	 * SettlementInstructionQueryCriteria1.mmMessageOriginator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageOriginator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmMessageOriginator;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification6.mmObject();
		}
	};
	@XmlElement(name = "CntrptSttlmPties")
	protected List<com.tools20022.repository.msg.SettlementParties40> counterpartSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties40
	 * SettlementParties40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmCounterpartSettlementParties
	 * SettlementInstructionQueryCriteria1.mmCounterpartSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartSettlementParties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CntrptSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartSettlementParties";
			definition = "Identifies the chain of counterparty settlement parties.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmCounterpartSettlementParties;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties40.mmObject();
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected List<com.tools20022.repository.msg.SettlementParties40> deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties40
	 * SettlementParties40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmDeliveringSettlementParties
	 * SettlementInstructionQueryCriteria1.mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmDeliveringSettlementParties;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties40.mmObject();
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected List<com.tools20022.repository.msg.SettlementParties40> receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties40
	 * SettlementParties40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmReceivingSettlementParties
	 * SettlementInstructionQueryCriteria1.mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmReceivingSettlementParties;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties40.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmTradeTransactionCondition
	 * SettlementInstructionQueryCriteria1.mmTradeTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionCondition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Provides the conditions under which the order/trade is to be/was executed.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmTradeTransactionCondition;
			minOccurs = 0;
			simpleType_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	@XmlElement(name = "SctiesTxCond")
	protected List<SettlementTransactionCondition16Choice> securitiesTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice
	 * SettlementTransactionCondition16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmSecuritiesTransactionCondition
	 * SettlementInstructionQueryCriteria1.mmSecuritiesTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesTransactionCondition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmSecuritiesTransactionCondition;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition16Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmPartialSettlementIndicator
	 * SettlementInstructionQueryCriteria1.mmPartialSettlementIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlementIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmPartialSettlementIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmConditionalSecuritiesDelivery
	 * SettlementInstructionQueryCriteria1.mmConditionalSecuritiesDelivery}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConditionalSecuritiesDelivery = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CondlSctiesDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalSecuritiesDelivery";
			definition = "Specifies whether the transaction is under Conditional Securities Delivery (CoSD).";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmConditionalSecuritiesDelivery;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmCountryOfIssue
	 * SettlementInstructionQueryCriteria1.mmCountryOfIssue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfIssue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmCountryOfIssue;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmIssuerCSD
	 * SettlementInstructionQueryCriteria1.mmIssuerCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuerCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "Central securities depository (CSD) in which financial instruments are issued (or immobilised). The issuer CSD opens accounts allowing investors (in a direct holding system) and/or intermediaries (including investor CSDs) to hold these financial instruments.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmIssuerCSD;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	@XmlElement(name = "HldInd")
	protected List<Registration10Choice> holdIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Registration10Choice
	 * Registration10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmHoldIndicator
	 * SettlementInstructionQueryCriteria1.mmHoldIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold, blocked or frozen.";
			previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmHoldIndicator;
			minOccurs = 0;
			complexType_lazy = () -> Registration10Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmReferences, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmStatus,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmPayment,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSecuritiesTransactionType, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmPriority, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSafekeepingAccount,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmCashAccount, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmTradeDate,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSettlementQuantity, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSettledQuantity,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSettlementAmount, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSettledAmount,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmIntendedSettlementDate, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmEffectiveSettlementDate,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSettlementCurrency, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSafekeepingAccountOwner,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmMessageOriginator, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmCounterpartSettlementParties,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmDeliveringSettlementParties, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmTradeTransactionCondition, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmSecuritiesTransactionCondition,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmConditionalSecuritiesDelivery,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmCountryOfIssue, com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmIssuerCSD,
						com.tools20022.repository.msg.SettlementInstructionQueryCriteria2.mmHoldIndicator);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInstructionQueryCriteria2";
				definition = "Defines the criteria based on which information is included.";
				previousVersion_lazy = () -> SettlementInstructionQueryCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<References35Choice> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public SettlementInstructionQueryCriteria2 setReferences(List<References35Choice> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public List<SettlementInstructionQueryStatus2> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public SettlementInstructionQueryCriteria2 setStatus(List<com.tools20022.repository.msg.SettlementInstructionQueryStatus2> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<ReceiveDelivery1Code> getSecuritiesMovementType() {
		return securitiesMovementType == null ? securitiesMovementType = new ArrayList<>() : securitiesMovementType;
	}

	public SettlementInstructionQueryCriteria2 setSecuritiesMovementType(List<ReceiveDelivery1Code> securitiesMovementType) {
		this.securitiesMovementType = Objects.requireNonNull(securitiesMovementType);
		return this;
	}

	public List<DeliveryReceiptType2Code> getPayment() {
		return payment == null ? payment = new ArrayList<>() : payment;
	}

	public SettlementInstructionQueryCriteria2 setPayment(List<DeliveryReceiptType2Code> payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public List<SecuritiesTransactionType18Choice> getSecuritiesTransactionType() {
		return securitiesTransactionType == null ? securitiesTransactionType = new ArrayList<>() : securitiesTransactionType;
	}

	public SettlementInstructionQueryCriteria2 setSecuritiesTransactionType(List<SecuritiesTransactionType18Choice> securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}

	public List<SecurityIdentification19> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public SettlementInstructionQueryCriteria2 setFinancialInstrumentIdentification(List<com.tools20022.repository.msg.SecurityIdentification19> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public List<PriorityNumeric4Choice> getPriority() {
		return priority == null ? priority = new ArrayList<>() : priority;
	}

	public SettlementInstructionQueryCriteria2 setPriority(List<PriorityNumeric4Choice> priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public List<SecuritiesAccount19> getSafekeepingAccount() {
		return safekeepingAccount == null ? safekeepingAccount = new ArrayList<>() : safekeepingAccount;
	}

	public SettlementInstructionQueryCriteria2 setSafekeepingAccount(List<com.tools20022.repository.msg.SecuritiesAccount19> safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<AccountIdentificationSearchCriteria2Choice> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public SettlementInstructionQueryCriteria2 setCashAccount(List<AccountIdentificationSearchCriteria2Choice> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public SettlementInstructionQueryCriteria2 setTradeDate(DateAndDateTimeSearch2Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<QuantitySearch1Choice> getSettlementQuantity() {
		return settlementQuantity == null ? Optional.empty() : Optional.of(settlementQuantity);
	}

	public SettlementInstructionQueryCriteria2 setSettlementQuantity(QuantitySearch1Choice settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
		return this;
	}

	public Optional<QuantitySearch1Choice> getSettledQuantity() {
		return settledQuantity == null ? Optional.empty() : Optional.of(settledQuantity);
	}

	public SettlementInstructionQueryCriteria2 setSettledQuantity(QuantitySearch1Choice settledQuantity) {
		this.settledQuantity = settledQuantity;
		return this;
	}

	public Optional<ActiveCurrencyAndAmountRange2> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SettlementInstructionQueryCriteria2 setSettlementAmount(com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmountRange2> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SettlementInstructionQueryCriteria2 setSettledAmount(com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2 settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getIntendedSettlementDate() {
		return intendedSettlementDate == null ? Optional.empty() : Optional.of(intendedSettlementDate);
	}

	public SettlementInstructionQueryCriteria2 setIntendedSettlementDate(DateAndDateTimeSearch2Choice intendedSettlementDate) {
		this.intendedSettlementDate = intendedSettlementDate;
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getEffectiveSettlementDate() {
		return effectiveSettlementDate == null ? Optional.empty() : Optional.of(effectiveSettlementDate);
	}

	public SettlementInstructionQueryCriteria2 setEffectiveSettlementDate(DateAndDateTimeSearch2Choice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? settlementCurrency = new ArrayList<>() : settlementCurrency;
	}

	public SettlementInstructionQueryCriteria2 setSettlementCurrency(List<ActiveOrHistoricCurrencyCode> settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public List<PartyIdentification91> getSafekeepingAccountOwner() {
		return safekeepingAccountOwner == null ? safekeepingAccountOwner = new ArrayList<>() : safekeepingAccountOwner;
	}

	public SettlementInstructionQueryCriteria2 setSafekeepingAccountOwner(List<com.tools20022.repository.msg.PartyIdentification91> safekeepingAccountOwner) {
		this.safekeepingAccountOwner = Objects.requireNonNull(safekeepingAccountOwner);
		return this;
	}

	public List<SystemPartyIdentification6> getMessageOriginator() {
		return messageOriginator == null ? messageOriginator = new ArrayList<>() : messageOriginator;
	}

	public SettlementInstructionQueryCriteria2 setMessageOriginator(List<com.tools20022.repository.msg.SystemPartyIdentification6> messageOriginator) {
		this.messageOriginator = Objects.requireNonNull(messageOriginator);
		return this;
	}

	public List<SettlementParties40> getCounterpartSettlementParties() {
		return counterpartSettlementParties == null ? counterpartSettlementParties = new ArrayList<>() : counterpartSettlementParties;
	}

	public SettlementInstructionQueryCriteria2 setCounterpartSettlementParties(List<com.tools20022.repository.msg.SettlementParties40> counterpartSettlementParties) {
		this.counterpartSettlementParties = Objects.requireNonNull(counterpartSettlementParties);
		return this;
	}

	public List<SettlementParties40> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? deliveringSettlementParties = new ArrayList<>() : deliveringSettlementParties;
	}

	public SettlementInstructionQueryCriteria2 setDeliveringSettlementParties(List<com.tools20022.repository.msg.SettlementParties40> deliveringSettlementParties) {
		this.deliveringSettlementParties = Objects.requireNonNull(deliveringSettlementParties);
		return this;
	}

	public List<SettlementParties40> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? receivingSettlementParties = new ArrayList<>() : receivingSettlementParties;
	}

	public SettlementInstructionQueryCriteria2 setReceivingSettlementParties(List<com.tools20022.repository.msg.SettlementParties40> receivingSettlementParties) {
		this.receivingSettlementParties = Objects.requireNonNull(receivingSettlementParties);
		return this;
	}

	public List<TradeTransactionCondition1Code> getTradeTransactionCondition() {
		return tradeTransactionCondition == null ? tradeTransactionCondition = new ArrayList<>() : tradeTransactionCondition;
	}

	public SettlementInstructionQueryCriteria2 setTradeTransactionCondition(List<TradeTransactionCondition1Code> tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public List<SettlementTransactionCondition16Choice> getSecuritiesTransactionCondition() {
		return securitiesTransactionCondition == null ? securitiesTransactionCondition = new ArrayList<>() : securitiesTransactionCondition;
	}

	public SettlementInstructionQueryCriteria2 setSecuritiesTransactionCondition(List<SettlementTransactionCondition16Choice> securitiesTransactionCondition) {
		this.securitiesTransactionCondition = Objects.requireNonNull(securitiesTransactionCondition);
		return this;
	}

	public Optional<SettlementTransactionCondition5Code> getPartialSettlementIndicator() {
		return partialSettlementIndicator == null ? Optional.empty() : Optional.of(partialSettlementIndicator);
	}

	public SettlementInstructionQueryCriteria2 setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getConditionalSecuritiesDelivery() {
		return conditionalSecuritiesDelivery == null ? Optional.empty() : Optional.of(conditionalSecuritiesDelivery);
	}

	public SettlementInstructionQueryCriteria2 setConditionalSecuritiesDelivery(YesNoIndicator conditionalSecuritiesDelivery) {
		this.conditionalSecuritiesDelivery = conditionalSecuritiesDelivery;
		return this;
	}

	public List<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? countryOfIssue = new ArrayList<>() : countryOfIssue;
	}

	public SettlementInstructionQueryCriteria2 setCountryOfIssue(List<CountryCode> countryOfIssue) {
		this.countryOfIssue = Objects.requireNonNull(countryOfIssue);
		return this;
	}

	public List<PartyIdentification71Choice> getIssuerCSD() {
		return issuerCSD == null ? issuerCSD = new ArrayList<>() : issuerCSD;
	}

	public SettlementInstructionQueryCriteria2 setIssuerCSD(List<PartyIdentification71Choice> issuerCSD) {
		this.issuerCSD = Objects.requireNonNull(issuerCSD);
		return this;
	}

	public List<Registration10Choice> getHoldIndicator() {
		return holdIndicator == null ? holdIndicator = new ArrayList<>() : holdIndicator;
	}

	public SettlementInstructionQueryCriteria2 setHoldIndicator(List<Registration10Choice> holdIndicator) {
		this.holdIndicator = Objects.requireNonNull(holdIndicator);
		return this;
	}
}