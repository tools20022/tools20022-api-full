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
import com.tools20022.repository.choice.ChargeTypeFormat3Choice;
import com.tools20022.repository.choice.DiscountTypeFormat1Choice;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Discount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a type of discount or a type of charge.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice#mmChargeType
 * DiscountOrChargeType1Choice.mmChargeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice#mmDiscountType
 * DiscountOrChargeType1Choice.mmDiscountType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DiscountOrChargeType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a type of discount or a type of charge."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DiscountOrChargeType1Choice", propOrder = {"chargeType", "discountType"})
public class DiscountOrChargeType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ChrgTp", required = true)
	protected ChargeTypeFormat3Choice chargeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat3Choice
	 * ChargeTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargeType
	 * Charges.mmChargeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice
	 * DiscountOrChargeType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DiscountOrChargeType1Choice, ChargeTypeFormat3Choice> mmChargeType = new MMMessageAssociationEnd<DiscountOrChargeType1Choice, ChargeTypeFormat3Choice>() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargeType;
			componentContext_lazy = () -> com.tools20022.repository.choice.DiscountOrChargeType1Choice.mmObject();
			isDerived = false;
			xmlTag = "ChrgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeType";
			definition = "Type of charge.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ChargeTypeFormat3Choice.mmObject();
		}

		@Override
		public ChargeTypeFormat3Choice getValue(DiscountOrChargeType1Choice obj) {
			return obj.getChargeType();
		}

		@Override
		public void setValue(DiscountOrChargeType1Choice obj, ChargeTypeFormat3Choice value) {
			obj.setChargeType(value);
		}
	};
	@XmlElement(name = "DscntTp", required = true)
	protected DiscountTypeFormat1Choice discountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DiscountTypeFormat1Choice
	 * DiscountTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountType
	 * Discount.mmDiscountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice
	 * DiscountOrChargeType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of discount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DiscountOrChargeType1Choice, DiscountTypeFormat1Choice> mmDiscountType = new MMMessageAssociationEnd<DiscountOrChargeType1Choice, DiscountTypeFormat1Choice>() {
		{
			businessElementTrace_lazy = () -> Discount.mmDiscountType;
			componentContext_lazy = () -> com.tools20022.repository.choice.DiscountOrChargeType1Choice.mmObject();
			isDerived = false;
			xmlTag = "DscntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountType";
			definition = "Type of discount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DiscountTypeFormat1Choice.mmObject();
		}

		@Override
		public DiscountTypeFormat1Choice getValue(DiscountOrChargeType1Choice obj) {
			return obj.getDiscountType();
		}

		@Override
		public void setValue(DiscountOrChargeType1Choice obj, DiscountTypeFormat1Choice value) {
			obj.setDiscountType(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DiscountOrChargeType1Choice.mmChargeType, com.tools20022.repository.choice.DiscountOrChargeType1Choice.mmDiscountType);
				trace_lazy = () -> Adjustment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DiscountOrChargeType1Choice";
				definition = "Choice between a type of discount or a type of charge.";
			}
		});
		return mmObject_lazy.get();
	}

	public ChargeTypeFormat3Choice getChargeType() {
		return chargeType;
	}

	public DiscountOrChargeType1Choice setChargeType(ChargeTypeFormat3Choice chargeType) {
		this.chargeType = Objects.requireNonNull(chargeType);
		return this;
	}

	public DiscountTypeFormat1Choice getDiscountType() {
		return discountType;
	}

	public DiscountOrChargeType1Choice setDiscountType(DiscountTypeFormat1Choice discountType) {
		this.discountType = Objects.requireNonNull(discountType);
		return this;
	}
}