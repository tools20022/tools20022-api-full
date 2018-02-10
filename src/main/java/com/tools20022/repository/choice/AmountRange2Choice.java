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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AmountRange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyAndAmountRange2;
import com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a range of amount values with or without the currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice#mmImpliedCurrencyAndAmountRange
 * AmountRange2Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice#mmCurrencyAndAmountRange
 * AmountRange2Choice.mmCurrencyAndAmountRange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountRange
 * AmountRange}</li>
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
 * "AmountRange2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a range of amount values with or without the currency."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountRange2Choice", propOrder = {"impliedCurrencyAndAmountRange", "currencyAndAmountRange"})
public class AmountRange2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ImpldCcyAndAmtRg", required = true)
	protected ImpliedCurrencyAndAmountRange impliedCurrencyAndAmountRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange
	 * ImpliedCurrencyAndAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice
	 * AmountRange2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ImpldCcyAndAmtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpliedCurrencyAndAmountRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses an amount or an amount range with an explicit debit/credit indicator and where the currency is implied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmImpliedCurrencyAndAmountRange = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AmountRange2Choice.mmObject();
			isDerived = false;
			xmlTag = "ImpldCcyAndAmtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpliedCurrencyAndAmountRange";
			definition = "Expresses an amount or an amount range with an explicit debit/credit indicator and where the currency is implied.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ImpliedCurrencyAndAmountRange.mmObject();
		}
	};
	@XmlElement(name = "CcyAndAmtRg", required = true)
	protected CurrencyAndAmountRange2 currencyAndAmountRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2
	 * CurrencyAndAmountRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice
	 * AmountRange2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyAndAmtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAndAmountRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses an amount or an amount range with the currency and where the credit/debit indicator is explicit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyAndAmountRange = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AmountRange2Choice.mmObject();
			isDerived = false;
			xmlTag = "CcyAndAmtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAndAmountRange";
			definition = "Expresses an amount or an amount range with the currency and where the credit/debit indicator is explicit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyAndAmountRange2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AmountRange2Choice.mmImpliedCurrencyAndAmountRange, com.tools20022.repository.choice.AmountRange2Choice.mmCurrencyAndAmountRange);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AmountRange2Choice";
				definition = "Choice between a range of amount values with or without the currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAndAmountRange getImpliedCurrencyAndAmountRange() {
		return impliedCurrencyAndAmountRange;
	}

	public AmountRange2Choice setImpliedCurrencyAndAmountRange(ImpliedCurrencyAndAmountRange impliedCurrencyAndAmountRange) {
		this.impliedCurrencyAndAmountRange = Objects.requireNonNull(impliedCurrencyAndAmountRange);
		return this;
	}

	public CurrencyAndAmountRange2 getCurrencyAndAmountRange() {
		return currencyAndAmountRange;
	}

	public AmountRange2Choice setCurrencyAndAmountRange(CurrencyAndAmountRange2 currencyAndAmountRange) {
		this.currencyAndAmountRange = Objects.requireNonNull(currencyAndAmountRange);
		return this;
	}
}