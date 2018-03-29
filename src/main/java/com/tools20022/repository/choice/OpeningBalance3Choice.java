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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of opening and intermediary balances.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OpeningBalance3Choice#mmFirstOpeningBalance
 * OpeningBalance3Choice.mmFirstOpeningBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OpeningBalance3Choice#mmIntermediaryOpeningBalance
 * OpeningBalance3Choice.mmIntermediaryOpeningBalance}</li>
 * </ul>
 * </li>
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
 * "OpeningBalance3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of opening and intermediary balances."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OpeningBalance3Choice", propOrder = {"firstOpeningBalance", "intermediaryOpeningBalance"})
public class OpeningBalance3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrstOpngBal", required = true)
	protected FinancialInstrumentQuantity1 firstOpeningBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance3Choice
	 * OpeningBalance3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstOpngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstOpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of the financial instrument in the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OpeningBalance3Choice, FinancialInstrumentQuantity1> mmFirstOpeningBalance = new MMMessageAttribute<OpeningBalance3Choice, FinancialInstrumentQuantity1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.OpeningBalance3Choice.mmObject();
			isDerived = false;
			xmlTag = "FrstOpngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstOpeningBalance";
			definition = "Opening balance of the financial instrument in the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1 getValue(OpeningBalance3Choice obj) {
			return obj.getFirstOpeningBalance();
		}

		@Override
		public void setValue(OpeningBalance3Choice obj, FinancialInstrumentQuantity1 value) {
			obj.setFirstOpeningBalance(value);
		}
	};
	@XmlElement(name = "IntrmyOpngBal", required = true)
	protected FinancialInstrumentQuantity1 intermediaryOpeningBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance3Choice
	 * OpeningBalance3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyOpngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryOpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of this page only. It must be the intermediary closing balance of the previous page (part of the same statement)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OpeningBalance3Choice, FinancialInstrumentQuantity1> mmIntermediaryOpeningBalance = new MMMessageAttribute<OpeningBalance3Choice, FinancialInstrumentQuantity1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.OpeningBalance3Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrmyOpngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryOpeningBalance";
			definition = "Opening balance of this page only. It must be the intermediary closing balance of the previous page (part of the same statement).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1 getValue(OpeningBalance3Choice obj) {
			return obj.getIntermediaryOpeningBalance();
		}

		@Override
		public void setValue(OpeningBalance3Choice obj, FinancialInstrumentQuantity1 value) {
			obj.setIntermediaryOpeningBalance(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OpeningBalance3Choice.mmFirstOpeningBalance, com.tools20022.repository.choice.OpeningBalance3Choice.mmIntermediaryOpeningBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OpeningBalance3Choice";
				definition = "Choice of opening and intermediary balances.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantity1 getFirstOpeningBalance() {
		return firstOpeningBalance;
	}

	public OpeningBalance3Choice setFirstOpeningBalance(FinancialInstrumentQuantity1 firstOpeningBalance) {
		this.firstOpeningBalance = Objects.requireNonNull(firstOpeningBalance);
		return this;
	}

	public FinancialInstrumentQuantity1 getIntermediaryOpeningBalance() {
		return intermediaryOpeningBalance;
	}

	public OpeningBalance3Choice setIntermediaryOpeningBalance(FinancialInstrumentQuantity1 intermediaryOpeningBalance) {
		this.intermediaryOpeningBalance = Objects.requireNonNull(intermediaryOpeningBalance);
		return this;
	}
}