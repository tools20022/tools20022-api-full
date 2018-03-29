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
import com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2;
import com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange2Choice#mmImpliedCurrencyAndAmountRange
 * ActiveAmountRange2Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange2Choice#mmCurrencyAndAmountRange
 * ActiveAmountRange2Choice.mmCurrencyAndAmountRange}</li>
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
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActiveAmountRange2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a range of amount values with or without the currency."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice
 * ActiveAmountRange3Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice
 * ActiveAmountRange1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActiveAmountRange2Choice", propOrder = {"impliedCurrencyAndAmountRange", "currencyAndAmountRange"})
public class ActiveAmountRange2Choice {

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
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange2Choice
	 * ActiveAmountRange2Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice#mmImpliedCurrencyAndAmountRange
	 * ActiveAmountRange3Choice.mmImpliedCurrencyAndAmountRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice#mmImpliedCurrencyAndAmountRange
	 * ActiveAmountRange1Choice.mmImpliedCurrencyAndAmountRange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActiveAmountRange2Choice, ImpliedCurrencyAndAmountRange> mmImpliedCurrencyAndAmountRange = new MMMessageAssociationEnd<ActiveAmountRange2Choice, ImpliedCurrencyAndAmountRange>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ActiveAmountRange2Choice.mmObject();
			isDerived = false;
			xmlTag = "ImpldCcyAndAmtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpliedCurrencyAndAmountRange";
			definition = "Expresses an amount or an amount range with an explicit debit/credit indicator and where the currency is implied.";
			nextVersions_lazy = () -> Arrays.asList(ActiveAmountRange3Choice.mmImpliedCurrencyAndAmountRange);
			previousVersion_lazy = () -> ActiveAmountRange1Choice.mmImpliedCurrencyAndAmountRange;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ImpliedCurrencyAndAmountRange.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmountRange getValue(ActiveAmountRange2Choice obj) {
			return obj.getImpliedCurrencyAndAmountRange();
		}

		@Override
		public void setValue(ActiveAmountRange2Choice obj, ImpliedCurrencyAndAmountRange value) {
			obj.setImpliedCurrencyAndAmountRange(value);
		}
	};
	@XmlElement(name = "CcyAndAmtRg", required = true)
	protected ActiveCurrencyAndAmountRange2 currencyAndAmountRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2
	 * ActiveCurrencyAndAmountRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange2Choice
	 * ActiveAmountRange2Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice#mmCurrencyAndAmountRange
	 * ActiveAmountRange3Choice.mmCurrencyAndAmountRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice#mmCurrencyAndAmountRange
	 * ActiveAmountRange1Choice.mmCurrencyAndAmountRange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActiveAmountRange2Choice, ActiveCurrencyAndAmountRange2> mmCurrencyAndAmountRange = new MMMessageAssociationEnd<ActiveAmountRange2Choice, ActiveCurrencyAndAmountRange2>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ActiveAmountRange2Choice.mmObject();
			isDerived = false;
			xmlTag = "CcyAndAmtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAndAmountRange";
			definition = "Expresses an amount or an amount range with the currency and where the credit/debit indicator is explicit.";
			nextVersions_lazy = () -> Arrays.asList(ActiveAmountRange3Choice.mmCurrencyAndAmountRange);
			previousVersion_lazy = () -> ActiveAmountRange1Choice.mmCurrencyAndAmountRange;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ActiveCurrencyAndAmountRange2.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmountRange2 getValue(ActiveAmountRange2Choice obj) {
			return obj.getCurrencyAndAmountRange();
		}

		@Override
		public void setValue(ActiveAmountRange2Choice obj, ActiveCurrencyAndAmountRange2 value) {
			obj.setCurrencyAndAmountRange(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ActiveAmountRange2Choice.mmImpliedCurrencyAndAmountRange, com.tools20022.repository.choice.ActiveAmountRange2Choice.mmCurrencyAndAmountRange);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ActiveAmountRange2Choice";
				definition = "Choice between a range of amount values with or without the currency.";
				nextVersions_lazy = () -> Arrays.asList(ActiveAmountRange3Choice.mmObject());
				previousVersion_lazy = () -> ActiveAmountRange1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAndAmountRange getImpliedCurrencyAndAmountRange() {
		return impliedCurrencyAndAmountRange;
	}

	public ActiveAmountRange2Choice setImpliedCurrencyAndAmountRange(ImpliedCurrencyAndAmountRange impliedCurrencyAndAmountRange) {
		this.impliedCurrencyAndAmountRange = Objects.requireNonNull(impliedCurrencyAndAmountRange);
		return this;
	}

	public ActiveCurrencyAndAmountRange2 getCurrencyAndAmountRange() {
		return currencyAndAmountRange;
	}

	public ActiveAmountRange2Choice setCurrencyAndAmountRange(ActiveCurrencyAndAmountRange2 currencyAndAmountRange) {
		this.currencyAndAmountRange = Objects.requireNonNull(currencyAndAmountRange);
		return this;
	}
}