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
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.AmountRatio;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Ratio expressed as a quotient of amounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmountToAmountRatio2#mmAmount1
 * AmountToAmountRatio2.mmAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountToAmountRatio2#mmAmount2
 * AmountToAmountRatio2.mmAmount2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountRatio
 * AmountRatio}</li>
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
 * "AmountToAmountRatio2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Ratio expressed as a quotient of amounts."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AmountToAmountRatio2", propOrder = {"amount1", "amount2"})
public class AmountToAmountRatio2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAnd13DecimalAmount amount1;
	/**
	 * Numerator of the quotient of amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmAmount1
	 * AmountRatio.mmAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2
	 * AmountToAmountRatio2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numerator of the quotient of amounts."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount1 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AmountRatio.mmAmount1;
			componentContext_lazy = () -> AmountToAmountRatio2.mmObject();
			isDerived = false;
			xmlTag = "Amt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount1";
			definition = "Numerator of the quotient of amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount amount2;
	/**
	 * Denominator of the quotient of amounts
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmAmount2
	 * AmountRatio.mmAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2
	 * AmountToAmountRatio2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denominator of the quotient of amounts"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount2 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AmountRatio.mmAmount2;
			componentContext_lazy = () -> AmountToAmountRatio2.mmObject();
			isDerived = false;
			xmlTag = "Amt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount2";
			definition = "Denominator of the quotient of amounts";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AmountToAmountRatio2.mmAmount1, AmountToAmountRatio2.mmAmount2);
				trace_lazy = () -> AmountRatio.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountToAmountRatio2";
				definition = "Ratio expressed as a quotient of amounts.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Amt1", required = true)
	public ActiveCurrencyAnd13DecimalAmount getAmount1() {
		return amount1;
	}

	public void setAmount1(ActiveCurrencyAnd13DecimalAmount amount1) {
		this.amount1 = amount1;
	}

	@XmlElement(name = "Amt2", required = true)
	public ActiveCurrencyAnd13DecimalAmount getAmount2() {
		return amount2;
	}

	public void setAmount2(ActiveCurrencyAnd13DecimalAmount amount2) {
		this.amount2 = amount2;
	}
}