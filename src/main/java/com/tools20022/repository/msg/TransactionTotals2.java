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
import com.tools20022.repository.codeset.TypeTransactionTotals2Code;
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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmPOIGroupIdentification
 * TransactionTotals2.mmPOIGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCardProductProfile
 * TransactionTotals2.mmCardProductProfile}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCurrency
 * TransactionTotals2.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals2#mmType
 * TransactionTotals2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmTotalNumber
 * TransactionTotals2.mmTotalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCumulativeAmount
 * TransactionTotals2.mmCumulativeAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionTotals2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction totals during the reconciliation period, for a certain type of transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals3
 * TransactionTotals3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionTotals1
 * TransactionTotals1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionTotals2", propOrder = {"pOIGroupIdentification", "cardProductProfile", "currency", "type", "totalNumber", "cumulativeAmount"})
public class TransactionTotals2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIGrpId")
	protected Max35Text pOIGroupIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmPOIGroupIdentification
	 * TransactionTotals3.mmPOIGroupIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals2, Optional<Max35Text>> mmPOIGroupIdentification = new MMMessageAttribute<TransactionTotals2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
			isDerived = false;
			xmlTag = "POIGrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIGroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals3.mmPOIGroupIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransactionTotals2 obj) {
			return obj.getPOIGroupIdentification();
		}

		@Override
		public void setValue(TransactionTotals2 obj, Optional<Max35Text> value) {
			obj.setPOIGroupIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPdctPrfl")
	protected Exact4NumericText cardProductProfile;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCardProductProfile
	 * TransactionTotals3.mmCardProductProfile}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals2, Optional<Exact4NumericText>> mmCardProductProfile = new MMMessageAttribute<TransactionTotals2, Optional<Exact4NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
			isDerived = false;
			xmlTag = "CardPdctPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductProfile";
			definition = "Category of cards related the acceptance processing rules defined by the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals3.mmCardProductProfile);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4NumericText.mmObject();
		}

		@Override
		public Optional<Exact4NumericText> getValue(TransactionTotals2 obj) {
			return obj.getCardProductProfile();
		}

		@Override
		public void setValue(TransactionTotals2 obj, Optional<Exact4NumericText> value) {
			obj.setCardProductProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCurrency
	 * TransactionTotals3.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals2, Optional<CurrencyCode>> mmCurrency = new MMMessageAttribute<TransactionTotals2, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction totals.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals3.mmCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(TransactionTotals2 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(TransactionTotals2 obj, Optional<CurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected TypeTransactionTotals2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals2Code
	 * TypeTransactionTotals2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTransactionType
	 * ReconciliationTransaction.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals3#mmType
	 * TransactionTotals3.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals2, TypeTransactionTotals2Code> mmType = new MMMessageAttribute<TransactionTotals2, TypeTransactionTotals2Code>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identification of the type of transaction.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals3.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeTransactionTotals2Code.mmObject();
		}

		@Override
		public TypeTransactionTotals2Code getValue(TransactionTotals2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TransactionTotals2 obj, TypeTransactionTotals2Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "TtlNb", required = true)
	protected Max35NumericText totalNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmTotalNumber
	 * TransactionTotals3.mmTotalNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals2, Max35NumericText> mmTotalNumber = new MMMessageAttribute<TransactionTotals2, Max35NumericText>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmTotalNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
			isDerived = false;
			xmlTag = "TtlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumber";
			definition = "Total number of transactions during a reconciliation period.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals3.mmTotalNumber);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(TransactionTotals2 obj) {
			return obj.getTotalNumber();
		}

		@Override
		public void setValue(TransactionTotals2 obj, Max35NumericText value) {
			obj.setTotalNumber(value);
		}
	};
	@XmlElement(name = "CmltvAmt", required = true)
	protected ImpliedCurrencyAndAmount cumulativeAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCumulativeAmount
	 * TransactionTotals3.mmCumulativeAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals2, ImpliedCurrencyAndAmount> mmCumulativeAmount = new MMMessageAttribute<TransactionTotals2, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCumulativeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
			isDerived = false;
			xmlTag = "CmltvAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumulativeAmount";
			definition = "Total amount of a collection of transactions.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals3.mmCumulativeAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(TransactionTotals2 obj) {
			return obj.getCumulativeAmount();
		}

		@Override
		public void setValue(TransactionTotals2 obj, ImpliedCurrencyAndAmount value) {
			obj.setCumulativeAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals2.mmPOIGroupIdentification, com.tools20022.repository.msg.TransactionTotals2.mmCardProductProfile,
						com.tools20022.repository.msg.TransactionTotals2.mmCurrency, com.tools20022.repository.msg.TransactionTotals2.mmType, com.tools20022.repository.msg.TransactionTotals2.mmTotalNumber,
						com.tools20022.repository.msg.TransactionTotals2.mmCumulativeAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransactionTotals2";
				definition = "Transaction totals during the reconciliation period, for a certain type of transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionTotals3.mmObject());
				previousVersion_lazy = () -> TransactionTotals1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPOIGroupIdentification() {
		return pOIGroupIdentification == null ? Optional.empty() : Optional.of(pOIGroupIdentification);
	}

	public TransactionTotals2 setPOIGroupIdentification(Max35Text pOIGroupIdentification) {
		this.pOIGroupIdentification = pOIGroupIdentification;
		return this;
	}

	public Optional<Exact4NumericText> getCardProductProfile() {
		return cardProductProfile == null ? Optional.empty() : Optional.of(cardProductProfile);
	}

	public TransactionTotals2 setCardProductProfile(Exact4NumericText cardProductProfile) {
		this.cardProductProfile = cardProductProfile;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public TransactionTotals2 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public TypeTransactionTotals2Code getType() {
		return type;
	}

	public TransactionTotals2 setType(TypeTransactionTotals2Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35NumericText getTotalNumber() {
		return totalNumber;
	}

	public TransactionTotals2 setTotalNumber(Max35NumericText totalNumber) {
		this.totalNumber = Objects.requireNonNull(totalNumber);
		return this;
	}

	public ImpliedCurrencyAndAmount getCumulativeAmount() {
		return cumulativeAmount;
	}

	public TransactionTotals2 setCumulativeAmount(ImpliedCurrencyAndAmount cumulativeAmount) {
		this.cumulativeAmount = Objects.requireNonNull(cumulativeAmount);
		return this;
	}
}