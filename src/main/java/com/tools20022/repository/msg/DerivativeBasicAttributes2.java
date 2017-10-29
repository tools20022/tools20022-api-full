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
import com.tools20022.repository.datatype.RestrictedFINActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Derivative;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2#NotionalCurrencyAndAmount
 * DerivativeBasicAttributes2.NotionalCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2#InterestIncludedInPrice
 * DerivativeBasicAttributes2.InterestIncludedInPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "DerivativeBasicAttributes2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the derivative contract not included in the general financial instrument attributes component."
 * </li>
 * </ul>
 */
public class DerivativeBasicAttributes2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.Derivative#NotionalCurrencyAndAmount
	 * Derivative.NotionalCurrencyAndAmount}</li>
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
	public static final MMMessageAttribute NotionalCurrencyAndAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DerivativeBasicAttributes2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Derivative.NotionalCurrencyAndAmount;
			isDerived = false;
			xmlTag = "NtnlCcyAndAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrencyAndAmount";
			definition = "Amount underlying a financial derivatives contract necessary for calculating payments or receipts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMMessageAttribute InterestIncludedInPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DerivativeBasicAttributes2.mmObject();
			isDerived = false;
			xmlTag = "IntrstInclInPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestIncludedInPrice";
			definition = "Indicates whether the given derivative price includes a prorated accrued interest component.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeBasicAttributes2.NotionalCurrencyAndAmount, com.tools20022.repository.msg.DerivativeBasicAttributes2.InterestIncludedInPrice);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DerivativeBasicAttributes2";
				definition = "Details of the derivative contract not included in the general financial instrument attributes component.";
			}
		});
		return mmObject_lazy.get();
	}
}