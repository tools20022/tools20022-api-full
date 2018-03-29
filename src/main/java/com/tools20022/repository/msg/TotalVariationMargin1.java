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
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Amount2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Margin required to cover the risk because of the price fluctuations occurred
 * on the unsettled exposures towards the central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalVariationMargin1#mmShortLongIndicator
 * TotalVariationMargin1.mmShortLongIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalVariationMargin1#mmAmountDetails
 * TotalVariationMargin1.mmAmountDetails}</li>
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
 * "TotalVariationMargin1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards the central counterparty."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalVariationMargin1", propOrder = {"shortLongIndicator", "amountDetails"})
public class TotalVariationMargin1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShrtLngInd")
	protected ShortLong1Code shortLongIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLong1Code
	 * ShortLong1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalVariationMargin1
	 * TotalVariationMargin1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLngInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the variation margin position is short or long, that is, wether the balance is a negative or positive balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalVariationMargin1, Optional<ShortLong1Code>> mmShortLongIndicator = new MMMessageAttribute<TotalVariationMargin1, Optional<ShortLong1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalVariationMargin1.mmObject();
			isDerived = false;
			xmlTag = "ShrtLngInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongIndicator";
			definition = "Specifies whether the variation margin position is short or long, that is, wether the balance is a negative or positive balance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}

		@Override
		public Optional<ShortLong1Code> getValue(TotalVariationMargin1 obj) {
			return obj.getShortLongIndicator();
		}

		@Override
		public void setValue(TotalVariationMargin1 obj, Optional<ShortLong1Code> value) {
			obj.setShortLongIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls", required = true)
	protected Amount2 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalVariationMargin1
	 * TotalVariationMargin1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the variation margin amount in the reporting currency and optionally in the original currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalVariationMargin1, Amount2> mmAmountDetails = new MMMessageAssociationEnd<TotalVariationMargin1, Amount2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalVariationMargin1.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides the variation margin amount in the reporting currency and optionally in the original currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public Amount2 getValue(TotalVariationMargin1 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(TotalVariationMargin1 obj, Amount2 value) {
			obj.setAmountDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalVariationMargin1.mmShortLongIndicator, com.tools20022.repository.msg.TotalVariationMargin1.mmAmountDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalVariationMargin1";
				definition = "Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards the central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ShortLong1Code> getShortLongIndicator() {
		return shortLongIndicator == null ? Optional.empty() : Optional.of(shortLongIndicator);
	}

	public TotalVariationMargin1 setShortLongIndicator(ShortLong1Code shortLongIndicator) {
		this.shortLongIndicator = shortLongIndicator;
		return this;
	}

	public Amount2 getAmountDetails() {
		return amountDetails;
	}

	public TotalVariationMargin1 setAmountDetails(Amount2 amountDetails) {
		this.amountDetails = Objects.requireNonNull(amountDetails);
		return this;
	}
}