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
import com.tools20022.repository.datatype.RestrictedFINActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the derivative contract not included in the general financial
 * instrument attributes component.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2#mmNotionalCurrencyAndAmount
 * DerivativeBasicAttributes2.mmNotionalCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2#mmInterestIncludedInPrice
 * DerivativeBasicAttributes2.mmInterestIncludedInPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "DerivativeBasicAttributes2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the derivative contract not included in the general financial instrument attributes component."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DerivativeBasicAttributes2", propOrder = {"notionalCurrencyAndAmount", "interestIncludedInPrice"})
public class DerivativeBasicAttributes2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINActiveOrHistoricCurrencyAndAmount notionalCurrencyAndAmount;
	/**
	 * Amount underlying a financial derivatives contract necessary for
	 * calculating payments or receipts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveOrHistoricCurrencyAndAmount
	 * RestrictedFINActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrencyAndAmount
	 * Derivative.mmNotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2
	 * DerivativeBasicAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcyAndAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount underlying a financial derivatives contract necessary for calculating payments or receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalCurrencyAndAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrencyAndAmount;
			componentContext_lazy = () -> DerivativeBasicAttributes2.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcyAndAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrencyAndAmount";
			definition = "Amount underlying a financial derivatives contract necessary for calculating payments or receipts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected YesNoIndicator interestIncludedInPrice;
	/**
	 * Indicates whether the given derivative price includes a prorated accrued
	 * interest component.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2
	 * DerivativeBasicAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstInclInPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestIncludedInPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the given derivative price includes a prorated accrued interest component."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestIncludedInPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DerivativeBasicAttributes2.mmObject();
			isDerived = false;
			xmlTag = "IntrstInclInPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestIncludedInPrice";
			definition = "Indicates whether the given derivative price includes a prorated accrued interest component.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DerivativeBasicAttributes2.mmNotionalCurrencyAndAmount, DerivativeBasicAttributes2.mmInterestIncludedInPrice);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeBasicAttributes2";
				definition = "Details of the derivative contract not included in the general financial instrument attributes component.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NtnlCcyAndAmt", required = true)
	public RestrictedFINActiveOrHistoricCurrencyAndAmount getNotionalCurrencyAndAmount() {
		return notionalCurrencyAndAmount;
	}

	public void setNotionalCurrencyAndAmount(RestrictedFINActiveOrHistoricCurrencyAndAmount notionalCurrencyAndAmount) {
		this.notionalCurrencyAndAmount = notionalCurrencyAndAmount;
	}

	@XmlElement(name = "IntrstInclInPric")
	public YesNoIndicator getInterestIncludedInPrice() {
		return interestIncludedInPrice;
	}

	public void setInterestIncludedInPrice(YesNoIndicator interestIncludedInPrice) {
		this.interestIncludedInPrice = interestIncludedInPrice;
	}
}