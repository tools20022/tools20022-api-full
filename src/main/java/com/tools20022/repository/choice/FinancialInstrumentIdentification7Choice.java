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
import com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BasketDescription3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice for identifying the underlying instruments that a derivative can
 * consist of.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmSingle
 * FinancialInstrumentIdentification7Choice.mmSingle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmBasket
 * FinancialInstrumentIdentification7Choice.mmBasket}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
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
 * "FinancialInstrumentIdentification7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice for identifying the underlying instruments that a derivative can consist of."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentIdentification7Choice", propOrder = {"single", "basket"})
public class FinancialInstrumentIdentification7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sngl", required = true)
	protected FinancialInstrumentIdentification6Choice single;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice
	 * FinancialInstrumentIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
	 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
	 * FinancialInstrumentIdentification7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sngl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Single"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument consists of single instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentIdentification7Choice, FinancialInstrumentIdentification6Choice> mmSingle = new MMMessageAssociationEnd<FinancialInstrumentIdentification7Choice, FinancialInstrumentIdentification6Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmIdentifiedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice.mmObject();
			isDerived = false;
			xmlTag = "Sngl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Single";
			definition = "Instrument consists of single instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentIdentification6Choice.mmObject();
		}

		@Override
		public FinancialInstrumentIdentification6Choice getValue(FinancialInstrumentIdentification7Choice obj) {
			return obj.getSingle();
		}

		@Override
		public void setValue(FinancialInstrumentIdentification7Choice obj, FinancialInstrumentIdentification6Choice value) {
			obj.setSingle(value);
		}
	};
	@XmlElement(name = "Bskt", required = true)
	protected BasketDescription3 basket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BasketDescription3
	 * BasketDescription3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
	 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
	 * FinancialInstrumentIdentification7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bskt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument consists of multiple instruments."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentIdentification7Choice, BasketDescription3> mmBasket = new MMMessageAssociationEnd<FinancialInstrumentIdentification7Choice, BasketDescription3>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmIdentifiedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice.mmObject();
			isDerived = false;
			xmlTag = "Bskt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basket";
			definition = "Instrument consists of multiple instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BasketDescription3.mmObject();
		}

		@Override
		public BasketDescription3 getValue(FinancialInstrumentIdentification7Choice obj) {
			return obj.getBasket();
		}

		@Override
		public void setValue(FinancialInstrumentIdentification7Choice obj, BasketDescription3 value) {
			obj.setBasket(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice.mmSingle, com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice.mmBasket);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentIdentification7Choice";
				definition = "Choice for identifying the underlying instruments that a derivative can consist of.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentIdentification6Choice getSingle() {
		return single;
	}

	public FinancialInstrumentIdentification7Choice setSingle(FinancialInstrumentIdentification6Choice single) {
		this.single = Objects.requireNonNull(single);
		return this;
	}

	public BasketDescription3 getBasket() {
		return basket;
	}

	public FinancialInstrumentIdentification7Choice setBasket(BasketDescription3 basket) {
		this.basket = Objects.requireNonNull(basket);
		return this;
	}
}