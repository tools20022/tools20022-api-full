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
import com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SwapLegIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the underlying of a security transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingIdentification2Choice#mmSwap
 * UnderlyingIdentification2Choice.mmSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingIdentification2Choice#mmOther
 * UnderlyingIdentification2Choice.mmOther}</li>
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
 * "UnderlyingIdentification2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the underlying of a security transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingIdentification2Choice", propOrder = {"swap", "other"})
public class UnderlyingIdentification2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Swp", required = true)
	protected SwapLegIdentification2 swap;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SwapLegIdentification2
	 * SwapLegIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingIdentification2Choice
	 * UnderlyingIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Swp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying of a swap transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingIdentification2Choice, SwapLegIdentification2> mmSwap = new MMMessageAssociationEnd<UnderlyingIdentification2Choice, SwapLegIdentification2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnderlyingIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "Swp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Underlying of a swap transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SwapLegIdentification2.mmObject();
		}

		@Override
		public SwapLegIdentification2 getValue(UnderlyingIdentification2Choice obj) {
			return obj.getSwap();
		}

		@Override
		public void setValue(UnderlyingIdentification2Choice obj, SwapLegIdentification2 value) {
			obj.setSwap(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected FinancialInstrumentIdentification7Choice other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
	 * FinancialInstrumentIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingIdentification2Choice
	 * UnderlyingIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying of any other type of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingIdentification2Choice, FinancialInstrumentIdentification7Choice> mmOther = new MMMessageAssociationEnd<UnderlyingIdentification2Choice, FinancialInstrumentIdentification7Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnderlyingIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Underlying of any other type of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentIdentification7Choice.mmObject();
		}

		@Override
		public FinancialInstrumentIdentification7Choice getValue(UnderlyingIdentification2Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(UnderlyingIdentification2Choice obj, FinancialInstrumentIdentification7Choice value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnderlyingIdentification2Choice.mmSwap, com.tools20022.repository.choice.UnderlyingIdentification2Choice.mmOther);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingIdentification2Choice";
				definition = "Details of the underlying of a security transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SwapLegIdentification2 getSwap() {
		return swap;
	}

	public UnderlyingIdentification2Choice setSwap(SwapLegIdentification2 swap) {
		this.swap = Objects.requireNonNull(swap);
		return this;
	}

	public FinancialInstrumentIdentification7Choice getOther() {
		return other;
	}

	public UnderlyingIdentification2Choice setOther(FinancialInstrumentIdentification7Choice other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}