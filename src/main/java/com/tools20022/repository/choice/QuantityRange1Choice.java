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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FromToQuantityRange1;
import com.tools20022.repository.msg.QuantityRangeBoundary1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between ranges of values in which a quantity is considered valid or a
 * specified quantity value which has to be matched or unmatched to be valid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice#mmFromQuantity
 * QuantityRange1Choice.mmFromQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice#mmToQuantity
 * QuantityRange1Choice.mmToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice#mmFromToQuantity
 * QuantityRange1Choice.mmFromToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice#mmEqualQuantity
 * QuantityRange1Choice.mmEqualQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice#mmNotEqualQuantity
 * QuantityRange1Choice.mmNotEqualQuantity}</li>
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
 * "QuantityRange1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ranges of values in which a quantity is considered valid or a specified quantity value which has to be matched or unmatched to be valid."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuantityRange1Choice", propOrder = {"fromQuantity", "toQuantity", "fromToQuantity", "equalQuantity", "notEqualQuantity"})
public class QuantityRange1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrQty", required = true)
	protected QuantityRangeBoundary1 fromQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityRangeBoundary1
	 * QuantityRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice
	 * QuantityRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower boundary of a range of quantity values."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityRange1Choice, QuantityRangeBoundary1> mmFromQuantity = new MMMessageAssociationEnd<QuantityRange1Choice, QuantityRangeBoundary1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.QuantityRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromQuantity";
			definition = "Lower boundary of a range of quantity values.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityRangeBoundary1.mmObject();
		}

		@Override
		public QuantityRangeBoundary1 getValue(QuantityRange1Choice obj) {
			return obj.getFromQuantity();
		}

		@Override
		public void setValue(QuantityRange1Choice obj, QuantityRangeBoundary1 value) {
			obj.setFromQuantity(value);
		}
	};
	@XmlElement(name = "ToQty", required = true)
	protected QuantityRangeBoundary1 toQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityRangeBoundary1
	 * QuantityRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice
	 * QuantityRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Upper boundary of a range of quantity values."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityRange1Choice, QuantityRangeBoundary1> mmToQuantity = new MMMessageAssociationEnd<QuantityRange1Choice, QuantityRangeBoundary1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.QuantityRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "ToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToQuantity";
			definition = "Upper boundary of a range of quantity values.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityRangeBoundary1.mmObject();
		}

		@Override
		public QuantityRangeBoundary1 getValue(QuantityRange1Choice obj) {
			return obj.getToQuantity();
		}

		@Override
		public void setValue(QuantityRange1Choice obj, QuantityRangeBoundary1 value) {
			obj.setToQuantity(value);
		}
	};
	@XmlElement(name = "FrToQty", required = true)
	protected FromToQuantityRange1 fromToQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FromToQuantityRange1
	 * FromToQuantityRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice
	 * QuantityRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of valid quantity values."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityRange1Choice, FromToQuantityRange1> mmFromToQuantity = new MMMessageAttribute<QuantityRange1Choice, FromToQuantityRange1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.QuantityRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToQuantity";
			definition = "Range of valid quantity values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FromToQuantityRange1.mmObject();
		}

		@Override
		public FromToQuantityRange1 getValue(QuantityRange1Choice obj) {
			return obj.getFromToQuantity();
		}

		@Override
		public void setValue(QuantityRange1Choice obj, FromToQuantityRange1 value) {
			obj.setFromToQuantity(value);
		}
	};
	@XmlElement(name = "EQQty", required = true)
	protected DecimalNumber equalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice
	 * QuantityRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exact value a quantity must match to be considered valid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityRange1Choice, DecimalNumber> mmEqualQuantity = new MMMessageAttribute<QuantityRange1Choice, DecimalNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.QuantityRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "EQQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualQuantity";
			definition = "Exact value a quantity must match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(QuantityRange1Choice obj) {
			return obj.getEqualQuantity();
		}

		@Override
		public void setValue(QuantityRange1Choice obj, DecimalNumber value) {
			obj.setEqualQuantity(value);
		}
	};
	@XmlElement(name = "NEQQty", required = true)
	protected DecimalNumber notEqualQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice
	 * QuantityRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value that a quantity must not match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityRange1Choice, DecimalNumber> mmNotEqualQuantity = new MMMessageAttribute<QuantityRange1Choice, DecimalNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.QuantityRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "NEQQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualQuantity";
			definition = "Value that a quantity must not match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(QuantityRange1Choice obj) {
			return obj.getNotEqualQuantity();
		}

		@Override
		public void setValue(QuantityRange1Choice obj, DecimalNumber value) {
			obj.setNotEqualQuantity(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.QuantityRange1Choice.mmFromQuantity, com.tools20022.repository.choice.QuantityRange1Choice.mmToQuantity,
								com.tools20022.repository.choice.QuantityRange1Choice.mmFromToQuantity, com.tools20022.repository.choice.QuantityRange1Choice.mmEqualQuantity,
								com.tools20022.repository.choice.QuantityRange1Choice.mmNotEqualQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuantityRange1Choice";
				definition = "Choice between ranges of values in which a quantity is considered valid or a specified quantity value which has to be matched or unmatched to be valid.";
			}
		});
		return mmObject_lazy.get();
	}

	public QuantityRangeBoundary1 getFromQuantity() {
		return fromQuantity;
	}

	public QuantityRange1Choice setFromQuantity(QuantityRangeBoundary1 fromQuantity) {
		this.fromQuantity = Objects.requireNonNull(fromQuantity);
		return this;
	}

	public QuantityRangeBoundary1 getToQuantity() {
		return toQuantity;
	}

	public QuantityRange1Choice setToQuantity(QuantityRangeBoundary1 toQuantity) {
		this.toQuantity = Objects.requireNonNull(toQuantity);
		return this;
	}

	public FromToQuantityRange1 getFromToQuantity() {
		return fromToQuantity;
	}

	public QuantityRange1Choice setFromToQuantity(FromToQuantityRange1 fromToQuantity) {
		this.fromToQuantity = Objects.requireNonNull(fromToQuantity);
		return this;
	}

	public DecimalNumber getEqualQuantity() {
		return equalQuantity;
	}

	public QuantityRange1Choice setEqualQuantity(DecimalNumber equalQuantity) {
		this.equalQuantity = Objects.requireNonNull(equalQuantity);
		return this;
	}

	public DecimalNumber getNotEqualQuantity() {
		return notEqualQuantity;
	}

	public QuantityRange1Choice setNotEqualQuantity(DecimalNumber notEqualQuantity) {
		this.notEqualQuantity = Objects.requireNonNull(notEqualQuantity);
		return this;
	}
}