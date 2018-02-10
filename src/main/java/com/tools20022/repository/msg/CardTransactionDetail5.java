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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.MessageReason1Code;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the card transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmTransactionAmounts
 * CardTransactionDetail5.mmTransactionAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmTransactionFees
 * CardTransactionDetail5.mmTransactionFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmAdditionalAmounts
 * CardTransactionDetail5.mmAdditionalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmMessageReason
 * CardTransactionDetail5.mmMessageReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmICCRelatedData
 * CardTransactionDetail5.mmICCRelatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransactionDetail5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the card transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1
 * CardTransactionDetail1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionDetail5", propOrder = {"transactionAmounts", "transactionFees", "additionalAmounts", "messageReason", "iCCRelatedData"})
public class CardTransactionDetail5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxAmts", required = true)
	protected CardTransactionAmount5 transactionAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransactionAmount5
	 * CardTransactionAmount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5
	 * CardTransactionDetail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amounts of the transaction expressed within the terminal currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmTransactionAmounts
	 * CardTransactionDetail1.mmTransactionAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail5.mmObject();
			isDerived = false;
			xmlTag = "TxAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmounts";
			definition = "Amounts of the transaction expressed within the terminal currency.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmTransactionAmounts;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount5.mmObject();
		}
	};
	@XmlElement(name = "TxFees")
	protected List<com.tools20022.repository.msg.DetailedAmount11> transactionFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount11
	 * DetailedAmount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5
	 * CardTransactionDetail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees between acquirer and issuer exclusive of the transaction amount, and expressed in the currency of the reconciliation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionFees = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail5.mmObject();
			isDerived = false;
			xmlTag = "TxFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionFees";
			definition = "Fees between acquirer and issuer exclusive of the transaction amount, and expressed in the currency of the reconciliation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount11.mmObject();
		}
	};
	@XmlElement(name = "AddtlAmts")
	protected List<com.tools20022.repository.msg.DetailedAmount10> additionalAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount10
	 * DetailedAmount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5
	 * CardTransactionDetail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amounts from the processor or the issuer without financial impacts on the transaction amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAdditionalAmounts
	 * CardTransactionDetail1.mmAdditionalAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail5.mmObject();
			isDerived = false;
			xmlTag = "AddtlAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAmounts";
			definition = "Additional amounts from the processor or the issuer without financial impacts on the transaction amount.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmAdditionalAmounts;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount10.mmObject();
		}
	};
	@XmlElement(name = "MsgRsn", required = true)
	protected List<MessageReason1Code> messageReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5
	 * CardTransactionDetail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason to send a card acquirer to issuer message.\r\nIt corresponds to ISO 8583, field number 25 for the version 93, and 9 for the version 2003."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmMessageReason
	 * CardTransactionDetail1.mmMessageReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail5.mmObject();
			isDerived = false;
			xmlTag = "MsgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReason";
			definition = "Reason to send a card acquirer to issuer message.\r\nIt corresponds to ISO 8583, field number 25 for the version 93, and 9 for the version 2003.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmMessageReason;
			minOccurs = 1;
			simpleType_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	@XmlElement(name = "ICCRltdData")
	protected Max10000Binary iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5
	 * CardTransactionDetail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to an integrated circuit card application.\r\nIt corresponds to ISO 8583, field number 55 for the versions 93 and 2003."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmICCRelatedData
	 * CardTransactionDetail1.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail5.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.\r\nIt corresponds to ISO 8583, field number 55 for the versions 93 and 2003.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionDetail5.mmTransactionAmounts, com.tools20022.repository.msg.CardTransactionDetail5.mmTransactionFees,
						com.tools20022.repository.msg.CardTransactionDetail5.mmAdditionalAmounts, com.tools20022.repository.msg.CardTransactionDetail5.mmMessageReason, com.tools20022.repository.msg.CardTransactionDetail5.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionDetail5";
				definition = "Details of the card transaction.";
				previousVersion_lazy = () -> CardTransactionDetail1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardTransactionAmount5 getTransactionAmounts() {
		return transactionAmounts;
	}

	public CardTransactionDetail5 setTransactionAmounts(com.tools20022.repository.msg.CardTransactionAmount5 transactionAmounts) {
		this.transactionAmounts = Objects.requireNonNull(transactionAmounts);
		return this;
	}

	public List<DetailedAmount11> getTransactionFees() {
		return transactionFees == null ? transactionFees = new ArrayList<>() : transactionFees;
	}

	public CardTransactionDetail5 setTransactionFees(List<com.tools20022.repository.msg.DetailedAmount11> transactionFees) {
		this.transactionFees = Objects.requireNonNull(transactionFees);
		return this;
	}

	public List<DetailedAmount10> getAdditionalAmounts() {
		return additionalAmounts == null ? additionalAmounts = new ArrayList<>() : additionalAmounts;
	}

	public CardTransactionDetail5 setAdditionalAmounts(List<com.tools20022.repository.msg.DetailedAmount10> additionalAmounts) {
		this.additionalAmounts = Objects.requireNonNull(additionalAmounts);
		return this;
	}

	public List<MessageReason1Code> getMessageReason() {
		return messageReason == null ? messageReason = new ArrayList<>() : messageReason;
	}

	public CardTransactionDetail5 setMessageReason(List<MessageReason1Code> messageReason) {
		this.messageReason = Objects.requireNonNull(messageReason);
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public CardTransactionDetail5 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}
}