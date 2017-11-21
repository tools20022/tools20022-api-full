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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmTransactionAmounts
 * CardTransactionDetail4.mmTransactionAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmTransactionFees
 * CardTransactionDetail4.mmTransactionFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmAdditionalAmounts
 * CardTransactionDetail4.mmAdditionalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmAccountAndBalance
 * CardTransactionDetail4.mmAccountAndBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmTransactionVerificationResult
 * CardTransactionDetail4.mmTransactionVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmValidityDate
 * CardTransactionDetail4.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmICCRelatedData
 * CardTransactionDetail4.mmICCRelatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransactionDetail4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the card transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2
 * CardTransactionDetail2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardTransactionDetail4", propOrder = {"transactionAmounts", "transactionFees", "additionalAmounts", "accountAndBalance", "transactionVerificationResult", "validityDate", "ICCRelatedData"})
public class CardTransactionDetail4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardTransactionAmount4 transactionAmounts;
	/**
	 * Amounts of the transaction expressed within the terminal currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransactionAmount4
	 * CardTransactionAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4
	 * CardTransactionDetail4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmTransactionAmounts
	 * CardTransactionDetail2.mmTransactionAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> CardTransactionDetail4.mmObject();
			isDerived = false;
			xmlTag = "TxAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmounts";
			definition = "Amounts of the transaction expressed within the terminal currency.";
			previousVersion_lazy = () -> CardTransactionDetail2.mmTransactionAmounts;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount11> transactionFees;
	/**
	 * Fees between acquirer and issuer exclusive of the transaction amount, and
	 * expressed in the currency of the reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount11
	 * DetailedAmount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4
	 * CardTransactionDetail4}</li>
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
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> CardTransactionDetail4.mmObject();
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
	protected List<com.tools20022.repository.msg.DetailedAmount10> additionalAmounts;
	/**
	 * Additional amounts from the processor or the issuer without financial
	 * impacts on the transaction amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4
	 * CardTransactionDetail4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmAdditionalAmounts
	 * CardTransactionDetail2.mmAdditionalAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> CardTransactionDetail4.mmObject();
			isDerived = false;
			xmlTag = "AddtlAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAmounts";
			definition = "Additional amounts from the processor or the issuer without financial impacts on the transaction amount.";
			previousVersion_lazy = () -> CardTransactionDetail2.mmAdditionalAmounts;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardAccount2> accountAndBalance;
	/**
	 * Account involved in the card transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount2
	 * CardAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBalance
	 * Account.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4
	 * CardTransactionDetail4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctAndBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountAndBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account involved in the card transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmAccountAndBalance
	 * CardTransactionDetail2.mmAccountAndBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountAndBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmBalance;
			componentContext_lazy = () -> CardTransactionDetail4.mmObject();
			isDerived = false;
			xmlTag = "AcctAndBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountAndBalance";
			definition = "Account involved in the card transaction.";
			previousVersion_lazy = () -> CardTransactionDetail2.mmAccountAndBalance;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransactionVerificationResult4> transactionVerificationResult;
	/**
	 * Results of the verifications performed by the various agents during the
	 * processing of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4
	 * CardTransactionDetail4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxVrfctnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Results of the verifications performed by the various agents during the processing of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmTransactionVerificationResult
	 * CardTransactionDetail2.mmTransactionVerificationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionVerificationResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> CardTransactionDetail4.mmObject();
			isDerived = false;
			xmlTag = "TxVrfctnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionVerificationResult";
			definition = "Results of the verifications performed by the various agents during the processing of the transaction.";
			previousVersion_lazy = () -> CardTransactionDetail2.mmTransactionVerificationResult;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult4.mmObject();
		}
	};
	protected ISODate validityDate;
	/**
	 * Transaction authorisation deadline to complete the related payment.<br>
	 * It corresponds to ISO 8583, field number 57 for the version 93, and 3 for
	 * the version 2003.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4
	 * CardTransactionDetail4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction authorisation deadline to complete the related payment.\r\nIt corresponds to ISO 8583, field number 57 for the version 93, and 3 for the version 2003."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmValidityDate
	 * CardTransactionDetail2.mmValidityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> CardTransactionDetail4.mmObject();
			isDerived = false;
			xmlTag = "VldtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.\r\nIt corresponds to ISO 8583, field number 57 for the version 93, and 3 for the version 2003.";
			previousVersion_lazy = () -> CardTransactionDetail2.mmValidityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max10000Binary iCCRelatedData;
	/**
	 * Data related to an integrated circuit card application.<br>
	 * It corresponds to ISO 8583, field number 55 for the versions 93 and 2003.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4
	 * CardTransactionDetail4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmICCRelatedData
	 * CardTransactionDetail2.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransactionDetail4.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.\r\nIt corresponds to ISO 8583, field number 55 for the versions 93 and 2003.";
			previousVersion_lazy = () -> CardTransactionDetail2.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardTransactionDetail4.mmTransactionAmounts, CardTransactionDetail4.mmTransactionFees, CardTransactionDetail4.mmAdditionalAmounts, CardTransactionDetail4.mmAccountAndBalance,
						CardTransactionDetail4.mmTransactionVerificationResult, CardTransactionDetail4.mmValidityDate, CardTransactionDetail4.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionDetail4";
				definition = "Details of the card transaction.";
				previousVersion_lazy = () -> CardTransactionDetail2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxAmts", required = true)
	public CardTransactionAmount4 getTransactionAmounts() {
		return transactionAmounts;
	}

	public void setTransactionAmounts(com.tools20022.repository.msg.CardTransactionAmount4 transactionAmounts) {
		this.transactionAmounts = transactionAmounts;
	}

	@XmlElement(name = "TxFees")
	public List<DetailedAmount11> getTransactionFees() {
		return transactionFees;
	}

	public void setTransactionFees(List<com.tools20022.repository.msg.DetailedAmount11> transactionFees) {
		this.transactionFees = transactionFees;
	}

	@XmlElement(name = "AddtlAmts")
	public List<DetailedAmount10> getAdditionalAmounts() {
		return additionalAmounts;
	}

	public void setAdditionalAmounts(List<com.tools20022.repository.msg.DetailedAmount10> additionalAmounts) {
		this.additionalAmounts = additionalAmounts;
	}

	@XmlElement(name = "AcctAndBal")
	public List<CardAccount2> getAccountAndBalance() {
		return accountAndBalance;
	}

	public void setAccountAndBalance(List<com.tools20022.repository.msg.CardAccount2> accountAndBalance) {
		this.accountAndBalance = accountAndBalance;
	}

	@XmlElement(name = "TxVrfctnRslt")
	public List<TransactionVerificationResult4> getTransactionVerificationResult() {
		return transactionVerificationResult;
	}

	public void setTransactionVerificationResult(List<com.tools20022.repository.msg.TransactionVerificationResult4> transactionVerificationResult) {
		this.transactionVerificationResult = transactionVerificationResult;
	}

	@XmlElement(name = "VldtyDt")
	public ISODate getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(ISODate validityDate) {
		this.validityDate = validityDate;
	}

	@XmlElement(name = "ICCRltdData")
	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}
}