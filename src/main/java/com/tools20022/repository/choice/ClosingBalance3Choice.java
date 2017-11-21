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
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of final and intermediary balances.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClosingBalance3Choice#mmFinalClosingBalance
 * ClosingBalance3Choice.mmFinalClosingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClosingBalance3Choice#mmIntermediaryClosingBalance
 * ClosingBalance3Choice.mmIntermediaryClosingBalance}</li>
 * </ul>
 * </li>
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
 * "ClosingBalance3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of final and intermediary balances."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ClosingBalance3Choice", propOrder = {"finalClosingBalance", "intermediaryClosingBalance"})
public class ClosingBalance3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1 finalClosingBalance;
	/**
	 * Closing balance of the financial instrument in the statement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance3Choice
	 * ClosingBalance3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlClsgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance of the financial instrument in the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalClosingBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClosingBalance3Choice.mmObject();
			isDerived = false;
			xmlTag = "FnlClsgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalClosingBalance";
			definition = "Closing balance of the financial instrument in the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 intermediaryClosingBalance;
	/**
	 * Closing Balance of this page only. Must be the intermediary opening
	 * balance of the next page (part of the same statement).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance3Choice
	 * ClosingBalance3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyClsgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Balance of this page only. Must be the intermediary opening balance of the next page (part of the same statement)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaryClosingBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClosingBalance3Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrmyClsgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryClosingBalance";
			definition = "Closing Balance of this page only. Must be the intermediary opening balance of the next page (part of the same statement).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ClosingBalance3Choice.mmFinalClosingBalance, ClosingBalance3Choice.mmIntermediaryClosingBalance);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClosingBalance3Choice";
				definition = "Choice of final and intermediary balances.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FnlClsgBal")
	public FinancialInstrumentQuantity1 getFinalClosingBalance() {
		return finalClosingBalance;
	}

	public void setFinalClosingBalance(FinancialInstrumentQuantity1 finalClosingBalance) {
		this.finalClosingBalance = finalClosingBalance;
	}

	@XmlElement(name = "IntrmyClsgBal")
	public FinancialInstrumentQuantity1 getIntermediaryClosingBalance() {
		return intermediaryClosingBalance;
	}

	public void setIntermediaryClosingBalance(FinancialInstrumentQuantity1 intermediaryClosingBalance) {
		this.intermediaryClosingBalance = intermediaryClosingBalance;
	}
}