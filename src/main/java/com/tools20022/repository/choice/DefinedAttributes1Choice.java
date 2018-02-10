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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentAttributes89;
import com.tools20022.repository.msg.FinancialInstrumentAttributes90;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the choice between different types of derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DefinedAttributes1Choice#mmQuantityDefinedAttributes
 * DefinedAttributes1Choice.mmQuantityDefinedAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DefinedAttributes1Choice#mmValueDefinedAttributes
 * DefinedAttributes1Choice.mmValueDefinedAttributes}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DefinedAttributes1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the choice between different types of derivative."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DefinedAttributes1Choice", propOrder = {"quantityDefinedAttributes", "valueDefinedAttributes"})
public class DefinedAttributes1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QtyDfndAttrbts", required = true)
	protected FinancialInstrumentAttributes89 quantityDefinedAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89
	 * FinancialInstrumentAttributes89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DefinedAttributes1Choice
	 * DefinedAttributes1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyDfndAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDefinedAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Shares or some other fixed amount of derivative (such an ERIS future or swaption), or a fixed quantity of commodities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityDefinedAttributes = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DefinedAttributes1Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyDfndAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDefinedAttributes";
			definition = "Shares or some other fixed amount of derivative (such an ERIS future or swaption), or a fixed quantity of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes89.mmObject();
		}
	};
	@XmlElement(name = "ValDfndAttrbts", required = true)
	protected FinancialInstrumentAttributes90 valueDefinedAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90
	 * FinancialInstrumentAttributes90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DefinedAttributes1Choice
	 * DefinedAttributes1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDfndAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDefinedAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value defined attributes for derivatives where the terms of the contract define the value of payable per unit of a move in some published index. This includes the floating leg of interest rate swaps which implicitly are payments proportional to the change in the index.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValueDefinedAttributes = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DefinedAttributes1Choice.mmObject();
			isDerived = false;
			xmlTag = "ValDfndAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDefinedAttributes";
			definition = "Value defined attributes for derivatives where the terms of the contract define the value of payable per unit of a move in some published index. This includes the floating leg of interest rate swaps which implicitly are payments proportional to the change in the index.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes90.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DefinedAttributes1Choice.mmQuantityDefinedAttributes, com.tools20022.repository.choice.DefinedAttributes1Choice.mmValueDefinedAttributes);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DefinedAttributes1Choice";
				definition = "Specifies the choice between different types of derivative.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentAttributes89 getQuantityDefinedAttributes() {
		return quantityDefinedAttributes;
	}

	public DefinedAttributes1Choice setQuantityDefinedAttributes(FinancialInstrumentAttributes89 quantityDefinedAttributes) {
		this.quantityDefinedAttributes = Objects.requireNonNull(quantityDefinedAttributes);
		return this;
	}

	public FinancialInstrumentAttributes90 getValueDefinedAttributes() {
		return valueDefinedAttributes;
	}

	public DefinedAttributes1Choice setValueDefinedAttributes(FinancialInstrumentAttributes90 valueDefinedAttributes) {
		this.valueDefinedAttributes = Objects.requireNonNull(valueDefinedAttributes);
		return this;
	}
}