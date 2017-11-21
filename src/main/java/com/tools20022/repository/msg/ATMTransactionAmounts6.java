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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmCurrency
 * ATMTransactionAmounts6.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmMaximumPossibleAmount
 * ATMTransactionAmounts6.mmMaximumPossibleAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmMinimumPossibleAmount
 * ATMTransactionAmounts6.mmMinimumPossibleAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmAdditionalAmount
 * ATMTransactionAmounts6.mmAdditionalAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
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
 * "ATMTransactionAmounts6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Limit of amounts for the customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
 * ATMTransactionAmounts8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTransactionAmounts6", propOrder = {"currency", "maximumPossibleAmount", "minimumPossibleAmount", "additionalAmount"})
public class ATMTransactionAmounts6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode currency;
	/**
	 * Default currency of the limits.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
	 * ATMTransactionAmounts6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmCurrency
	 * ATMTransactionAmounts8.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmCurrency;
			componentContext_lazy = () -> ATMTransactionAmounts6.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Default currency of the limits.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts8.mmCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumPossibleAmount;
	/**
	 * Maximum amount allowed for a transaction in the service.
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAvailableAmount
	 * Limit.mmAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
	 * ATMTransactionAmounts6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmMaximumPossibleAmount
	 * ATMTransactionAmounts8.mmMaximumPossibleAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumPossibleAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAvailableAmount;
			componentContext_lazy = () -> ATMTransactionAmounts6.mmObject();
			isDerived = false;
			xmlTag = "MaxPssblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumPossibleAmount";
			definition = "Maximum amount allowed for a transaction in the service.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts8.mmMaximumPossibleAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount minimumPossibleAmount;
	/**
	 * Minimum amount allowed for a transaction in the service.
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
	 * ATMTransactionAmounts6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmMinimumPossibleAmount
	 * ATMTransactionAmounts8.mmMinimumPossibleAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumPossibleAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> ATMTransactionAmounts6.mmObject();
			isDerived = false;
			xmlTag = "MinPssblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumPossibleAmount";
			definition = "Minimum amount allowed for a transaction in the service.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts8.mmMinimumPossibleAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMTransactionAmounts7> additionalAmount;
	/**
	 * Additional amount that may be displayed to the customer, for instance the
	 * daily limit or the daily balance for the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7
	 * ATMTransactionAmounts7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
	 * ATMTransactionAmounts6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmAdditionalAmount
	 * ATMTransactionAmounts8.mmAdditionalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransactionAmounts6.mmObject();
			isDerived = false;
			xmlTag = "AddtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAmount";
			definition = "Additional amount that may be displayed to the customer, for instance the daily limit or the daily balance for the service.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts8.mmAdditionalAmount);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMTransactionAmounts6.mmCurrency, ATMTransactionAmounts6.mmMaximumPossibleAmount, ATMTransactionAmounts6.mmMinimumPossibleAmount, ATMTransactionAmounts6.mmAdditionalAmount);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransactionAmounts6";
				definition = "Limit of amounts for the customer.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ccy")
	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "MaxPssblAmt")
	public ImpliedCurrencyAndAmount getMaximumPossibleAmount() {
		return maximumPossibleAmount;
	}

	public void setMaximumPossibleAmount(ImpliedCurrencyAndAmount maximumPossibleAmount) {
		this.maximumPossibleAmount = maximumPossibleAmount;
	}

	@XmlElement(name = "MinPssblAmt")
	public ImpliedCurrencyAndAmount getMinimumPossibleAmount() {
		return minimumPossibleAmount;
	}

	public void setMinimumPossibleAmount(ImpliedCurrencyAndAmount minimumPossibleAmount) {
		this.minimumPossibleAmount = minimumPossibleAmount;
	}

	@XmlElement(name = "AddtlAmt")
	public List<ATMTransactionAmounts7> getAdditionalAmount() {
		return additionalAmount;
	}

	public void setAdditionalAmount(List<com.tools20022.repository.msg.ATMTransactionAmounts7> additionalAmount) {
		this.additionalAmount = additionalAmount;
	}
}