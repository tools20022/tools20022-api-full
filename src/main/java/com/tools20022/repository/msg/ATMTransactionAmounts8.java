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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMTransactionAmounts7;
import com.tools20022.repository.msg.ATMTransactionAmounts9;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Limit of amounts for the customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmCurrency
 * ATMTransactionAmounts8.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmMaximumPossibleAmount
 * ATMTransactionAmounts8.mmMaximumPossibleAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmMinimumPossibleAmount
 * ATMTransactionAmounts8.mmMinimumPossibleAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmAdditionalAmount
 * ATMTransactionAmounts8.mmAdditionalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmDepositLimits
 * ATMTransactionAmounts8.mmDepositLimits}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
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
 * "ATMTransactionAmounts8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Limit of amounts for the customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
 * ATMTransactionAmounts6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransactionAmounts8", propOrder = {"currency", "maximumPossibleAmount", "minimumPossibleAmount", "additionalAmount", "depositLimits"})
public class ATMTransactionAmounts8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCurrency
	 * Limit.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
	 * ATMTransactionAmounts8}</li>
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
	 * definition} = "Default currency of the limits."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmCurrency
	 * ATMTransactionAmounts6.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransactionAmounts8, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<ATMTransactionAmounts8, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts8.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Default currency of the limits.";
			previousVersion_lazy = () -> ATMTransactionAmounts6.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(ATMTransactionAmounts8 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ATMTransactionAmounts8 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxPssblAmt")
	protected ImpliedCurrencyAndAmount maximumPossibleAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAvailableAmount
	 * Limit.mmAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
	 * ATMTransactionAmounts8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxPssblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPossibleAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount allowed for a transaction in the service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmMaximumPossibleAmount
	 * ATMTransactionAmounts6.mmMaximumPossibleAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransactionAmounts8, Optional<ImpliedCurrencyAndAmount>> mmMaximumPossibleAmount = new MMMessageAttribute<ATMTransactionAmounts8, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAvailableAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts8.mmObject();
			isDerived = false;
			xmlTag = "MaxPssblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumPossibleAmount";
			definition = "Maximum amount allowed for a transaction in the service.";
			previousVersion_lazy = () -> ATMTransactionAmounts6.mmMaximumPossibleAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTransactionAmounts8 obj) {
			return obj.getMaximumPossibleAmount();
		}

		@Override
		public void setValue(ATMTransactionAmounts8 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMaximumPossibleAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MinPssblAmt")
	protected ImpliedCurrencyAndAmount minimumPossibleAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
	 * ATMTransactionAmounts8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinPssblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPossibleAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum amount allowed for a transaction in the service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmMinimumPossibleAmount
	 * ATMTransactionAmounts6.mmMinimumPossibleAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransactionAmounts8, Optional<ImpliedCurrencyAndAmount>> mmMinimumPossibleAmount = new MMMessageAttribute<ATMTransactionAmounts8, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts8.mmObject();
			isDerived = false;
			xmlTag = "MinPssblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumPossibleAmount";
			definition = "Minimum amount allowed for a transaction in the service.";
			previousVersion_lazy = () -> ATMTransactionAmounts6.mmMinimumPossibleAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTransactionAmounts8 obj) {
			return obj.getMinimumPossibleAmount();
		}

		@Override
		public void setValue(ATMTransactionAmounts8 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMinimumPossibleAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlAmt")
	protected List<ATMTransactionAmounts7> additionalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7
	 * ATMTransactionAmounts7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
	 * ATMTransactionAmounts8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount that may be displayed to the customer, for instance the daily limit or the daily balance for the service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmAdditionalAmount
	 * ATMTransactionAmounts6.mmAdditionalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransactionAmounts8, List<ATMTransactionAmounts7>> mmAdditionalAmount = new MMMessageAssociationEnd<ATMTransactionAmounts8, List<ATMTransactionAmounts7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts8.mmObject();
			isDerived = false;
			xmlTag = "AddtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAmount";
			definition = "Additional amount that may be displayed to the customer, for instance the daily limit or the daily balance for the service.";
			previousVersion_lazy = () -> ATMTransactionAmounts6.mmAdditionalAmount;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts7.mmObject();
		}

		@Override
		public List<ATMTransactionAmounts7> getValue(ATMTransactionAmounts8 obj) {
			return obj.getAdditionalAmount();
		}

		@Override
		public void setValue(ATMTransactionAmounts8 obj, List<ATMTransactionAmounts7> value) {
			obj.setAdditionalAmount(value);
		}
	};
	@XmlElement(name = "DpstLmts")
	protected List<ATMTransactionAmounts9> depositLimits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts9
	 * ATMTransactionAmounts9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
	 * ATMTransactionAmounts8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstLmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositLimits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit of deposited media for the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransactionAmounts8, List<ATMTransactionAmounts9>> mmDepositLimits = new MMMessageAssociationEnd<ATMTransactionAmounts8, List<ATMTransactionAmounts9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts8.mmObject();
			isDerived = false;
			xmlTag = "DpstLmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositLimits";
			definition = "Limit of deposited media for the customer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts9.mmObject();
		}

		@Override
		public List<ATMTransactionAmounts9> getValue(ATMTransactionAmounts8 obj) {
			return obj.getDepositLimits();
		}

		@Override
		public void setValue(ATMTransactionAmounts8 obj, List<ATMTransactionAmounts9> value) {
			obj.setDepositLimits(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransactionAmounts8.mmCurrency, com.tools20022.repository.msg.ATMTransactionAmounts8.mmMaximumPossibleAmount,
						com.tools20022.repository.msg.ATMTransactionAmounts8.mmMinimumPossibleAmount, com.tools20022.repository.msg.ATMTransactionAmounts8.mmAdditionalAmount,
						com.tools20022.repository.msg.ATMTransactionAmounts8.mmDepositLimits);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransactionAmounts8";
				definition = "Limit of amounts for the customer.";
				previousVersion_lazy = () -> ATMTransactionAmounts6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public ATMTransactionAmounts8 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumPossibleAmount() {
		return maximumPossibleAmount == null ? Optional.empty() : Optional.of(maximumPossibleAmount);
	}

	public ATMTransactionAmounts8 setMaximumPossibleAmount(ImpliedCurrencyAndAmount maximumPossibleAmount) {
		this.maximumPossibleAmount = maximumPossibleAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumPossibleAmount() {
		return minimumPossibleAmount == null ? Optional.empty() : Optional.of(minimumPossibleAmount);
	}

	public ATMTransactionAmounts8 setMinimumPossibleAmount(ImpliedCurrencyAndAmount minimumPossibleAmount) {
		this.minimumPossibleAmount = minimumPossibleAmount;
		return this;
	}

	public List<ATMTransactionAmounts7> getAdditionalAmount() {
		return additionalAmount == null ? additionalAmount = new ArrayList<>() : additionalAmount;
	}

	public ATMTransactionAmounts8 setAdditionalAmount(List<ATMTransactionAmounts7> additionalAmount) {
		this.additionalAmount = Objects.requireNonNull(additionalAmount);
		return this;
	}

	public List<ATMTransactionAmounts9> getDepositLimits() {
		return depositLimits == null ? depositLimits = new ArrayList<>() : depositLimits;
	}

	public ATMTransactionAmounts8 setDepositLimits(List<ATMTransactionAmounts9> depositLimits) {
		this.depositLimits = Objects.requireNonNull(depositLimits);
		return this;
	}
}