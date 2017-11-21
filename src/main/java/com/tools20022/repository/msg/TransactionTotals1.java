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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeTransactionTotals1Code;
import com.tools20022.repository.datatype.Exact4NumericText;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transaction totals during the reconciliation period, for a certain type of
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#mmPOIGroupIdentification
 * TransactionTotals1.mmPOIGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#mmCardProductProfile
 * TransactionTotals1.mmCardProductProfile}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals1#mmCurrency
 * TransactionTotals1.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals1#mmType
 * TransactionTotals1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#mmTotalNumber
 * TransactionTotals1.mmTotalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#mmCumulativeAmount
 * TransactionTotals1.mmCumulativeAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
 * ReconciliationTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionTotals1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction totals during the reconciliation period, for a certain type of transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals2
 * TransactionTotals2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionTotals1", propOrder = {"POIGroupIdentification", "cardProductProfile", "currency", "type", "totalNumber", "cumulativeAmount"})
public class TransactionTotals1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text pOIGroupIdentification;
	/**
	 * Identifier assigned by the merchant identifying a set of POI terminals
	 * performing some categories of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIGrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIGroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIGroupIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals1.mmObject();
			isDerived = false;
			xmlTag = "POIGrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIGroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Exact4NumericText cardProductProfile;
	/**
	 * Category of cards related the acceptance processing rules defined by the
	 * acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4NumericText
	 * Exact4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category of cards related the acceptance processing rules defined by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardProductProfile = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals1.mmObject();
			isDerived = false;
			xmlTag = "CardPdctPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductProfile";
			definition = "Category of cards related the acceptance processing rules defined by the acquirer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4NumericText.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency associated with the transaction totals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCurrency
	 * ReconciliationTransaction.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the transaction totals."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCurrency;
			componentContext_lazy = () -> TransactionTotals1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction totals.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected TypeTransactionTotals1Code type;
	/**
	 * Identification of the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code
	 * TypeTransactionTotals1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTransactionType
	 * ReconciliationTransaction.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmTransactionType;
			componentContext_lazy = () -> TransactionTotals1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identification of the type of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeTransactionTotals1Code.mmObject();
		}
	};
	protected Max35NumericText totalNumber;
	/**
	 * Total number of transactions during a reconciliation period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTotalNumber
	 * ReconciliationTransaction.mmTotalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions during a reconciliation period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmTotalNumber;
			componentContext_lazy = () -> TransactionTotals1.mmObject();
			isDerived = false;
			xmlTag = "TtlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumber";
			definition = "Total number of transactions during a reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount cumulativeAmount;
	/**
	 * Total amount of a collection of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCumulativeAmount
	 * ReconciliationTransaction.mmCumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmltvAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of a collection of transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCumulativeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCumulativeAmount;
			componentContext_lazy = () -> TransactionTotals1.mmObject();
			isDerived = false;
			xmlTag = "CmltvAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumulativeAmount";
			definition = "Total amount of a collection of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionTotals1.mmPOIGroupIdentification, TransactionTotals1.mmCardProductProfile, TransactionTotals1.mmCurrency, TransactionTotals1.mmType, TransactionTotals1.mmTotalNumber,
						TransactionTotals1.mmCumulativeAmount);
				trace_lazy = () -> ReconciliationTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransactionTotals1";
				definition = "Transaction totals during the reconciliation period, for a certain type of transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionTotals2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "POIGrpId")
	public Max35Text getPOIGroupIdentification() {
		return pOIGroupIdentification;
	}

	public void setPOIGroupIdentification(Max35Text pOIGroupIdentification) {
		this.pOIGroupIdentification = pOIGroupIdentification;
	}

	@XmlElement(name = "CardPdctPrfl")
	public Exact4NumericText getCardProductProfile() {
		return cardProductProfile;
	}

	public void setCardProductProfile(Exact4NumericText cardProductProfile) {
		this.cardProductProfile = cardProductProfile;
	}

	@XmlElement(name = "Ccy")
	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "Tp", required = true)
	public TypeTransactionTotals1Code getType() {
		return type;
	}

	public void setType(TypeTransactionTotals1Code type) {
		this.type = type;
	}

	@XmlElement(name = "TtlNb", required = true)
	public Max35NumericText getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Max35NumericText totalNumber) {
		this.totalNumber = totalNumber;
	}

	@XmlElement(name = "CmltvAmt", required = true)
	public ImpliedCurrencyAndAmount getCumulativeAmount() {
		return cumulativeAmount;
	}

	public void setCumulativeAmount(ImpliedCurrencyAndAmount cumulativeAmount) {
		this.cumulativeAmount = cumulativeAmount;
	}
}