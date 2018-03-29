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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.IndependentAmountConventionType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.IndependentAmount;
import com.tools20022.repository.entity.IndependentAmountTerm;
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
 * Indicates the independent amount and how it was applied in the calculation.
 * It also provides a description of the amount type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndependentAmount2#mmDescription
 * IndependentAmount2.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndependentAmount2#mmAmount
 * IndependentAmount2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndependentAmount2#mmConvention
 * IndependentAmount2.mmConvention}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IndependentAmount
 * IndependentAmount}</li>
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
 * "IndependentAmount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the independent amount and how it was applied in the calculation. It also provides a description of the amount type."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndependentAmount2", propOrder = {"description", "amount", "convention"})
public class IndependentAmount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Desc")
	protected Max140Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount2
	 * IndependentAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the other amount used in the calculation of the independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndependentAmount2, Optional<Max140Text>> mmDescription = new MMMessageAttribute<IndependentAmount2, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndependentAmount2.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Description of the other amount used in the calculation of the independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(IndependentAmount2 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(IndependentAmount2 obj, Optional<Max140Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount
	 * IndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount2
	 * IndependentAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the independant amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndependentAmount2, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<IndependentAmount2, ActiveCurrencyAndAmount>() {
		{
			businessComponentTrace_lazy = () -> IndependentAmount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndependentAmount2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Provides the independant amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(IndependentAmount2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(IndependentAmount2 obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "Cnvntn", required = true)
	protected IndependentAmountConventionType1Code convention;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code
	 * IndependentAmountConventionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmountTerm#mmConvention
	 * IndependentAmountTerm.mmConvention}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount2
	 * IndependentAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnvntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Convention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determines how the independent amount was applied in the calculation. \r\nIt is either:\r\n- before threshold, effectively acting as an add on to exposure, \r\n- after threshold where the amount is an add on to the credit support amount and forms part of the variation margin requirement,\r\n- segregated where it is treated independently of variation margin for segregation purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndependentAmount2, IndependentAmountConventionType1Code> mmConvention = new MMMessageAttribute<IndependentAmount2, IndependentAmountConventionType1Code>() {
		{
			businessElementTrace_lazy = () -> IndependentAmountTerm.mmConvention;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndependentAmount2.mmObject();
			isDerived = false;
			xmlTag = "Cnvntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Convention";
			definition = "Determines how the independent amount was applied in the calculation. \r\nIt is either:\r\n- before threshold, effectively acting as an add on to exposure, \r\n- after threshold where the amount is an add on to the credit support amount and forms part of the variation margin requirement,\r\n- segregated where it is treated independently of variation margin for segregation purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IndependentAmountConventionType1Code.mmObject();
		}

		@Override
		public IndependentAmountConventionType1Code getValue(IndependentAmount2 obj) {
			return obj.getConvention();
		}

		@Override
		public void setValue(IndependentAmount2 obj, IndependentAmountConventionType1Code value) {
			obj.setConvention(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndependentAmount2.mmDescription, com.tools20022.repository.msg.IndependentAmount2.mmAmount,
						com.tools20022.repository.msg.IndependentAmount2.mmConvention);
				trace_lazy = () -> IndependentAmount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndependentAmount2";
				definition = "Indicates the independent amount and how it was applied in the calculation. It also provides a description of the amount type.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public IndependentAmount2 setDescription(Max140Text description) {
		this.description = description;
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public IndependentAmount2 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public IndependentAmountConventionType1Code getConvention() {
		return convention;
	}

	public IndependentAmount2 setConvention(IndependentAmountConventionType1Code convention) {
		this.convention = Objects.requireNonNull(convention);
		return this;
	}
}