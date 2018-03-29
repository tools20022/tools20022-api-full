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
import com.tools20022.repository.choice.AmountOrRate1Choice;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Margin over or under an index that determines the repurchase rate expressed
 * as a rate or an amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SpreadRate1#mmSign
 * SpreadRate1.mmSign}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SpreadRate1#mmRateOrAmount
 * SpreadRate1.mmRateOrAmount}</li>
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
 * "SpreadRate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Margin over or under an index that determines the repurchase rate expressed as a rate or an amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SpreadRate1", propOrder = {"sign", "rateOrAmount"})
public class SpreadRate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sgn", required = true)
	protected PlusOrMinusIndicator sign;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpreadRate1 SpreadRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the sign of the rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SpreadRate1, PlusOrMinusIndicator> mmSign = new MMMessageAttribute<SpreadRate1, PlusOrMinusIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SpreadRate1.mmObject();
			isDerived = false;
			xmlTag = "Sgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sign";
			definition = "Specifies the sign of the rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}

		@Override
		public PlusOrMinusIndicator getValue(SpreadRate1 obj) {
			return obj.getSign();
		}

		@Override
		public void setValue(SpreadRate1 obj, PlusOrMinusIndicator value) {
			obj.setSign(value);
		}
	};
	@XmlElement(name = "RateOrAmt", required = true)
	protected AmountOrRate1Choice rateOrAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AmountOrRate1Choice
	 * AmountOrRate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpreadRate1 SpreadRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateOrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateOrAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the spreadf is expressed as an amount or a rate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SpreadRate1, AmountOrRate1Choice> mmRateOrAmount = new MMMessageAssociationEnd<SpreadRate1, AmountOrRate1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SpreadRate1.mmObject();
			isDerived = false;
			xmlTag = "RateOrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateOrAmount";
			definition = "Specifies if the spreadf is expressed as an amount or a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountOrRate1Choice.mmObject();
		}

		@Override
		public AmountOrRate1Choice getValue(SpreadRate1 obj) {
			return obj.getRateOrAmount();
		}

		@Override
		public void setValue(SpreadRate1 obj, AmountOrRate1Choice value) {
			obj.setRateOrAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SpreadRate1.mmSign, com.tools20022.repository.msg.SpreadRate1.mmRateOrAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SpreadRate1";
				definition = "Margin over or under an index that determines the repurchase rate expressed as a rate or an amount.";
			}
		});
		return mmObject_lazy.get();
	}

	public PlusOrMinusIndicator getSign() {
		return sign;
	}

	public SpreadRate1 setSign(PlusOrMinusIndicator sign) {
		this.sign = Objects.requireNonNull(sign);
		return this;
	}

	public AmountOrRate1Choice getRateOrAmount() {
		return rateOrAmount;
	}

	public SpreadRate1 setRateOrAmount(AmountOrRate1Choice rateOrAmount) {
		this.rateOrAmount = Objects.requireNonNull(rateOrAmount);
		return this;
	}
}