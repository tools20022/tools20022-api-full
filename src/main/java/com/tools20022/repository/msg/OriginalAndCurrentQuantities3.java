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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.datatype.RestrictedFINImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Signed face amount and amortised value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3#mmShortLongPosition
 * OriginalAndCurrentQuantities3.mmShortLongPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3#mmFaceAmount
 * OriginalAndCurrentQuantities3.mmFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3#mmAmortisedValue
 * OriginalAndCurrentQuantities3.mmAmortisedValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalAndCurrentQuantities3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Signed face amount and amortised value."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forOriginalAndCurrentQuantities3
 * ConstraintCoexistenceAmountRule.forOriginalAndCurrentQuantities3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalAndCurrentQuantities3", propOrder = {"shortLongPosition", "faceAmount", "amortisedValue"})
public class OriginalAndCurrentQuantities3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShrtLngPos", required = true)
	protected ShortLong1Code shortLongPosition;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3
	 * OriginalAndCurrentQuantities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLngPos"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sign of the quantity of security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalAndCurrentQuantities3, ShortLong1Code> mmShortLongPosition = new MMMessageAttribute<OriginalAndCurrentQuantities3, ShortLong1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalAndCurrentQuantities3.mmObject();
			isDerived = false;
			xmlTag = "ShrtLngPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongPosition";
			definition = "Sign of the quantity of security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}

		@Override
		public ShortLong1Code getValue(OriginalAndCurrentQuantities3 obj) {
			return obj.getShortLongPosition();
		}

		@Override
		public void setValue(OriginalAndCurrentQuantities3 obj, ShortLong1Code value) {
			obj.setShortLongPosition(value);
		}
	};
	@XmlElement(name = "FaceAmt", required = true)
	protected RestrictedFINImpliedCurrencyAndAmount faceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINImpliedCurrencyAndAmount
	 * RestrictedFINImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3
	 * OriginalAndCurrentQuantities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaceAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the face amount, that is, the principal, of a debt instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::4!c//FAMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalAndCurrentQuantities3, RestrictedFINImpliedCurrencyAndAmount> mmFaceAmount = new MMMessageAttribute<OriginalAndCurrentQuantities3, RestrictedFINImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalAndCurrentQuantities3.mmObject();
			isDerived = false;
			xmlTag = "FaceAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::4!c//FAMT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, that is, the principal, of a debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public RestrictedFINImpliedCurrencyAndAmount getValue(OriginalAndCurrentQuantities3 obj) {
			return obj.getFaceAmount();
		}

		@Override
		public void setValue(OriginalAndCurrentQuantities3 obj, RestrictedFINImpliedCurrencyAndAmount value) {
			obj.setFaceAmount(value);
		}
	};
	@XmlElement(name = "AmtsdVal", required = true)
	protected RestrictedFINImpliedCurrencyAndAmount amortisedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINImpliedCurrencyAndAmount
	 * RestrictedFINImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
	 * AssetHolding.mmAmortisedFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3
	 * OriginalAndCurrentQuantities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsdVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::4!c//AMOR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalAndCurrentQuantities3, RestrictedFINImpliedCurrencyAndAmount> mmAmortisedValue = new MMMessageAttribute<OriginalAndCurrentQuantities3, RestrictedFINImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAmortisedFaceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalAndCurrentQuantities3.mmObject();
			isDerived = false;
			xmlTag = "AmtsdVal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::4!c//AMOR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisedValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public RestrictedFINImpliedCurrencyAndAmount getValue(OriginalAndCurrentQuantities3 obj) {
			return obj.getAmortisedValue();
		}

		@Override
		public void setValue(OriginalAndCurrentQuantities3 obj, RestrictedFINImpliedCurrencyAndAmount value) {
			obj.setAmortisedValue(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalAndCurrentQuantities3.mmShortLongPosition, com.tools20022.repository.msg.OriginalAndCurrentQuantities3.mmFaceAmount,
						com.tools20022.repository.msg.OriginalAndCurrentQuantities3.mmAmortisedValue);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forOriginalAndCurrentQuantities3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OriginalAndCurrentQuantities3";
				definition = "Signed face amount and amortised value.";
			}
		});
		return mmObject_lazy.get();
	}

	public ShortLong1Code getShortLongPosition() {
		return shortLongPosition;
	}

	public OriginalAndCurrentQuantities3 setShortLongPosition(ShortLong1Code shortLongPosition) {
		this.shortLongPosition = Objects.requireNonNull(shortLongPosition);
		return this;
	}

	public RestrictedFINImpliedCurrencyAndAmount getFaceAmount() {
		return faceAmount;
	}

	public OriginalAndCurrentQuantities3 setFaceAmount(RestrictedFINImpliedCurrencyAndAmount faceAmount) {
		this.faceAmount = Objects.requireNonNull(faceAmount);
		return this;
	}

	public RestrictedFINImpliedCurrencyAndAmount getAmortisedValue() {
		return amortisedValue;
	}

	public OriginalAndCurrentQuantities3 setAmortisedValue(RestrictedFINImpliedCurrencyAndAmount amortisedValue) {
		this.amortisedValue = Objects.requireNonNull(amortisedValue);
		return this;
	}
}