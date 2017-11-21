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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.VariableInterest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FloatingInterestRate8;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a fixed rate and a variable rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate8Choice#mmFixed
 * InterestRate8Choice.mmFixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice#mmFloating
 * InterestRate8Choice.mmFloating}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
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
 * "InterestRate8Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a fixed rate and a variable rate."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InterestRate8Choice", propOrder = {"fixed", "floating"})
public class InterestRate8Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate fixed;
	/**
	 * Interest Rate is fixed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice
	 * InterestRate8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fxd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest Rate is fixed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFixed = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> InterestRate8Choice.mmObject();
			isDerived = false;
			xmlTag = "Fxd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Interest Rate is fixed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected FloatingInterestRate8 floating;
	/**
	 * Interest rate is a variable / floating rate, based on an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FloatingInterestRate8
	 * FloatingInterestRate8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice
	 * InterestRate8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fltg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Floating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate is a variable / floating rate, based on an index."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFloating = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> VariableInterest.mmObject();
			componentContext_lazy = () -> InterestRate8Choice.mmObject();
			isDerived = false;
			xmlTag = "Fltg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Floating";
			definition = "Interest rate is a variable / floating rate, based on an index.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FloatingInterestRate8.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InterestRate8Choice.mmFixed, InterestRate8Choice.mmFloating);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRate8Choice";
				definition = "Choice between a fixed rate and a variable rate.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Fxd", required = true)
	public PercentageRate getFixed() {
		return fixed;
	}

	public void setFixed(PercentageRate fixed) {
		this.fixed = fixed;
	}

	@XmlElement(name = "Fltg", required = true)
	public FloatingInterestRate8 getFloating() {
		return floating;
	}

	public void setFloating(FloatingInterestRate8 floating) {
		this.floating = floating;
	}
}