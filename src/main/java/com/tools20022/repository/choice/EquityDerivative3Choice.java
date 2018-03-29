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
import com.tools20022.repository.codeset.UnderlyingEquityType3Code;
import com.tools20022.repository.codeset.UnderlyingEquityType4Code;
import com.tools20022.repository.codeset.UnderlyingEquityType5Code;
import com.tools20022.repository.codeset.UnderlyingEquityType6Code;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Element to define an equity instrument underlying code types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmBasket
 * EquityDerivative3Choice.mmBasket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmIndex
 * EquityDerivative3Choice.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmSingleName
 * EquityDerivative3Choice.mmSingleName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmOther
 * EquityDerivative3Choice.mmOther}</li>
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
 * "EquityDerivative3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Element to define an equity instrument underlying code types."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EquityDerivative3Choice", propOrder = {"basket", "index", "singleName", "other"})
public class EquityDerivative3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Bskt", required = true)
	protected UnderlyingEquityType3Code basket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType3Code
	 * UnderlyingEquityType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
	 * EquityDerivative3Choice}</li>
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
	 * definition} =
	 * "Populated when sub asset class is either swaps or portfolio swaps and the underlying type is a basket."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType3Code> mmBasket = new MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType3Code>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.choice.EquityDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "Bskt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basket";
			definition = "Populated when sub asset class is either swaps or portfolio swaps and the underlying type is a basket.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingEquityType3Code.mmObject();
		}

		@Override
		public UnderlyingEquityType3Code getValue(EquityDerivative3Choice obj) {
			return obj.getBasket();
		}

		@Override
		public void setValue(EquityDerivative3Choice obj, UnderlyingEquityType3Code value) {
			obj.setBasket(value);
		}
	};
	@XmlElement(name = "Indx", required = true)
	protected UnderlyingEquityType4Code index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code
	 * UnderlyingEquityType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
	 * EquityDerivative3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Populated when the sub asset class is either swap or portfolio swap and the underlying type is an index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType4Code> mmIndex = new MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType4Code>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.choice.EquityDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Populated when the sub asset class is either swap or portfolio swap and the underlying type is an index.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingEquityType4Code.mmObject();
		}

		@Override
		public UnderlyingEquityType4Code getValue(EquityDerivative3Choice obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(EquityDerivative3Choice obj, UnderlyingEquityType4Code value) {
			obj.setIndex(value);
		}
	};
	@XmlElement(name = "SnglNm", required = true)
	protected UnderlyingEquityType5Code singleName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code
	 * UnderlyingEquityType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
	 * EquityDerivative3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Populated when sub asset class is either swaps or portfolio swaps and the underlying type is a single name."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType5Code> mmSingleName = new MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType5Code>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.choice.EquityDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "SnglNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleName";
			definition = "Populated when sub asset class is either swaps or portfolio swaps and the underlying type is a single name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingEquityType5Code.mmObject();
		}

		@Override
		public UnderlyingEquityType5Code getValue(EquityDerivative3Choice obj) {
			return obj.getSingleName();
		}

		@Override
		public void setValue(EquityDerivative3Choice obj, UnderlyingEquityType5Code value) {
			obj.setSingleName(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected UnderlyingEquityType6Code other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
	 * EquityDerivative3Choice}</li>
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
	 * definition} =
	 * "Populated when the sub asset class is neither swaps nor portfolio swaps."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType6Code> mmOther = new MMMessageAttribute<EquityDerivative3Choice, UnderlyingEquityType6Code>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.choice.EquityDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Populated when the sub asset class is neither swaps nor portfolio swaps.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingEquityType6Code.mmObject();
		}

		@Override
		public UnderlyingEquityType6Code getValue(EquityDerivative3Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(EquityDerivative3Choice obj, UnderlyingEquityType6Code value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.EquityDerivative3Choice.mmBasket, com.tools20022.repository.choice.EquityDerivative3Choice.mmIndex,
						com.tools20022.repository.choice.EquityDerivative3Choice.mmSingleName, com.tools20022.repository.choice.EquityDerivative3Choice.mmOther);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EquityDerivative3Choice";
				definition = "Element to define an equity instrument underlying code types.";
			}
		});
		return mmObject_lazy.get();
	}

	public UnderlyingEquityType3Code getBasket() {
		return basket;
	}

	public EquityDerivative3Choice setBasket(UnderlyingEquityType3Code basket) {
		this.basket = Objects.requireNonNull(basket);
		return this;
	}

	public UnderlyingEquityType4Code getIndex() {
		return index;
	}

	public EquityDerivative3Choice setIndex(UnderlyingEquityType4Code index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public UnderlyingEquityType5Code getSingleName() {
		return singleName;
	}

	public EquityDerivative3Choice setSingleName(UnderlyingEquityType5Code singleName) {
		this.singleName = Objects.requireNonNull(singleName);
		return this;
	}

	public UnderlyingEquityType6Code getOther() {
		return other;
	}

	public EquityDerivative3Choice setOther(UnderlyingEquityType6Code other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}