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
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amounts linked to a securities balance, for example, holding value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmHoldingValue
 * BalanceAmounts3.mmHoldingValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmPreviousHoldingValue
 * BalanceAmounts3.mmPreviousHoldingValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmBookValue
 * BalanceAmounts3.mmBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmEligibleCollateralValue
 * BalanceAmounts3.mmEligibleCollateralValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmAccruedInterestAmount
 * BalanceAmounts3.mmAccruedInterestAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AssetHolding
 * AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEligibleCollateralValueRule#forBalanceAmounts3
 * ConstraintEligibleCollateralValueRule.forBalanceAmounts3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceAmounts3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amounts linked to a securities balance, for example, holding value."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceAmounts3", propOrder = {"holdingValue", "previousHoldingValue", "bookValue", "eligibleCollateralValue", "accruedInterestAmount"})
public class BalanceAmounts3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HldgVal")
	protected AmountAndDirection6 holdingValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
	 * AssetHolding.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of an individual financial instrument holding within a safekeeping account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>> mmHoldingValue = new MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts3.mmObject();
			isDerived = false;
			xmlTag = "HldgVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingValue";
			definition = "Value of an individual financial instrument holding within a safekeeping account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(BalanceAmounts3 obj) {
			return obj.getHoldingValue();
		}

		@Override
		public void setValue(BalanceAmounts3 obj, Optional<AmountAndDirection6> value) {
			obj.setHoldingValue(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsHldgVal")
	protected AmountAndDirection6 previousHoldingValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
	 * AssetHolding.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsHldgVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousHoldingValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previous value of an individual financial instrument holding within a safekeeping account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>> mmPreviousHoldingValue = new MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts3.mmObject();
			isDerived = false;
			xmlTag = "PrvsHldgVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousHoldingValue";
			definition = "Previous value of an individual financial instrument holding within a safekeeping account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(BalanceAmounts3 obj) {
			return obj.getPreviousHoldingValue();
		}

		@Override
		public void setValue(BalanceAmounts3 obj, Optional<AmountAndDirection6> value) {
			obj.setPreviousHoldingValue(value.orElse(null));
		}
	};
	@XmlElement(name = "BookVal")
	protected AmountAndDirection6 bookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a financial instrument, as booked/acquired in an account. It may be used to establish capital gain tax liability."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>> mmBookValue = new MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts3.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Value of a financial instrument, as booked/acquired in an account. It may be used to establish capital gain tax liability.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(BalanceAmounts3 obj) {
			return obj.getBookValue();
		}

		@Override
		public void setValue(BalanceAmounts3 obj, Optional<AmountAndDirection6> value) {
			obj.setBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "ElgblCollVal")
	protected AmountAndDirection6 eligibleCollateralValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmEligibleCollateralValue
	 * AssetHolding.mmEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblCollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the position eligible for collateral purposes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>> mmEligibleCollateralValue = new MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmEligibleCollateralValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts3.mmObject();
			isDerived = false;
			xmlTag = "ElgblCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCollateralValue";
			definition = "Value of the position eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(BalanceAmounts3 obj) {
			return obj.getEligibleCollateralValue();
		}

		@Override
		public void setValue(BalanceAmounts3 obj, Optional<AmountAndDirection6> value) {
			obj.setEligibleCollateralValue(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection6 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3
	 * BalanceAmounts3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>> mmAccruedInterestAmount = new MMMessageAttribute<BalanceAmounts3, Optional<AmountAndDirection6>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts3.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(BalanceAmounts3 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(BalanceAmounts3 obj, Optional<AmountAndDirection6> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAmounts3.mmHoldingValue, com.tools20022.repository.msg.BalanceAmounts3.mmPreviousHoldingValue,
						com.tools20022.repository.msg.BalanceAmounts3.mmBookValue, com.tools20022.repository.msg.BalanceAmounts3.mmEligibleCollateralValue, com.tools20022.repository.msg.BalanceAmounts3.mmAccruedInterestAmount);
				trace_lazy = () -> AssetHolding.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEligibleCollateralValueRule.forBalanceAmounts3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceAmounts3";
				definition = "Amounts linked to a securities balance, for example, holding value.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection6> getHoldingValue() {
		return holdingValue == null ? Optional.empty() : Optional.of(holdingValue);
	}

	public BalanceAmounts3 setHoldingValue(AmountAndDirection6 holdingValue) {
		this.holdingValue = holdingValue;
		return this;
	}

	public Optional<AmountAndDirection6> getPreviousHoldingValue() {
		return previousHoldingValue == null ? Optional.empty() : Optional.of(previousHoldingValue);
	}

	public BalanceAmounts3 setPreviousHoldingValue(AmountAndDirection6 previousHoldingValue) {
		this.previousHoldingValue = previousHoldingValue;
		return this;
	}

	public Optional<AmountAndDirection6> getBookValue() {
		return bookValue == null ? Optional.empty() : Optional.of(bookValue);
	}

	public BalanceAmounts3 setBookValue(AmountAndDirection6 bookValue) {
		this.bookValue = bookValue;
		return this;
	}

	public Optional<AmountAndDirection6> getEligibleCollateralValue() {
		return eligibleCollateralValue == null ? Optional.empty() : Optional.of(eligibleCollateralValue);
	}

	public BalanceAmounts3 setEligibleCollateralValue(AmountAndDirection6 eligibleCollateralValue) {
		this.eligibleCollateralValue = eligibleCollateralValue;
		return this;
	}

	public Optional<AmountAndDirection6> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public BalanceAmounts3 setAccruedInterestAmount(AmountAndDirection6 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}
}