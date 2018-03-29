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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.EquityDerivative3Choice;
import com.tools20022.repository.codeset.EquityReturnParameter1Code;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Element to define an equity instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EquityDerivative2#mmUnderlyingType
 * EquityDerivative2.mmUnderlyingType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EquityDerivative2#mmParameter
 * EquityDerivative2.mmParameter}</li>
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
 * "EquityDerivative2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Element to define an equity instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EquityDerivative2", propOrder = {"underlyingType", "parameter"})
public class EquityDerivative2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UndrlygTp", required = true)
	protected EquityDerivative3Choice underlyingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
	 * EquityDerivative3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EquityDerivative2
	 * EquityDerivative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying type of the equity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EquityDerivative2, EquityDerivative3Choice> mmUnderlyingType = new MMMessageAssociationEnd<EquityDerivative2, EquityDerivative3Choice>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.EquityDerivative2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingType";
			definition = "Underlying type of the equity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EquityDerivative3Choice.mmObject();
		}

		@Override
		public EquityDerivative3Choice getValue(EquityDerivative2 obj) {
			return obj.getUnderlyingType();
		}

		@Override
		public void setValue(EquityDerivative2 obj, EquityDerivative3Choice value) {
			obj.setUnderlyingType(value);
		}
	};
	@XmlElement(name = "Param")
	protected EquityReturnParameter1Code parameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EquityDerivative2
	 * EquityDerivative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Param"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return parameter for the equity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EquityDerivative2, Optional<EquityReturnParameter1Code>> mmParameter = new MMMessageAttribute<EquityDerivative2, Optional<EquityReturnParameter1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EquityDerivative2.mmObject();
			isDerived = false;
			xmlTag = "Param";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameter";
			definition = "Return parameter for the equity derivative.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EquityReturnParameter1Code.mmObject();
		}

		@Override
		public Optional<EquityReturnParameter1Code> getValue(EquityDerivative2 obj) {
			return obj.getParameter();
		}

		@Override
		public void setValue(EquityDerivative2 obj, Optional<EquityReturnParameter1Code> value) {
			obj.setParameter(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquityDerivative2.mmUnderlyingType, com.tools20022.repository.msg.EquityDerivative2.mmParameter);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EquityDerivative2";
				definition = "Element to define an equity instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public EquityDerivative3Choice getUnderlyingType() {
		return underlyingType;
	}

	public EquityDerivative2 setUnderlyingType(EquityDerivative3Choice underlyingType) {
		this.underlyingType = Objects.requireNonNull(underlyingType);
		return this;
	}

	public Optional<EquityReturnParameter1Code> getParameter() {
		return parameter == null ? Optional.empty() : Optional.of(parameter);
	}

	public EquityDerivative2 setParameter(EquityReturnParameter1Code parameter) {
		this.parameter = parameter;
		return this;
	}
}