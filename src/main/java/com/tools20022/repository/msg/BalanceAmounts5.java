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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection14;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmHoldingValue
 * BalanceAmounts5.mmHoldingValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmPreviousHoldingValue
 * BalanceAmounts5.mmPreviousHoldingValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmBookValue
 * BalanceAmounts5.mmBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmUnrealisedGainLoss
 * BalanceAmounts5.mmUnrealisedGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmAccruedInterestAmount
 * BalanceAmounts5.mmAccruedInterestAmount}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceAmounts5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceAmounts5", propOrder = {"holdingValue", "previousHoldingValue", "bookValue", "unrealisedGainLoss", "accruedInterestAmount"})
public class BalanceAmounts5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HldgVal", required = true)
	protected AmountAndDirection14 holdingValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
	 * AssetHolding.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
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
	public static final MMMessageAssociationEnd<BalanceAmounts5, AmountAndDirection14> mmHoldingValue = new MMMessageAssociationEnd<BalanceAmounts5, AmountAndDirection14>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
			isDerived = false;
			xmlTag = "HldgVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingValue";
			definition = "Value of an individual financial instrument holding within a safekeeping account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection14.mmObject();
		}

		@Override
		public AmountAndDirection14 getValue(BalanceAmounts5 obj) {
			return obj.getHoldingValue();
		}

		@Override
		public void setValue(BalanceAmounts5 obj, AmountAndDirection14 value) {
			obj.setHoldingValue(value);
		}
	};
	@XmlElement(name = "PrvsHldgVal")
	protected AmountAndDirection14 previousHoldingValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
	 * AssetHolding.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
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
	public static final MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>> mmPreviousHoldingValue = new MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
			isDerived = false;
			xmlTag = "PrvsHldgVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousHoldingValue";
			definition = "Previous value of an individual financial instrument holding within a safekeeping account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection14.mmObject();
		}

		@Override
		public Optional<AmountAndDirection14> getValue(BalanceAmounts5 obj) {
			return obj.getPreviousHoldingValue();
		}

		@Override
		public void setValue(BalanceAmounts5 obj, Optional<AmountAndDirection14> value) {
			obj.setPreviousHoldingValue(value.orElse(null));
		}
	};
	@XmlElement(name = "BookVal")
	protected AmountAndDirection14 bookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
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
	public static final MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>> mmBookValue = new MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Value of a financial instrument, as booked/acquired in an account. It may be used to establish capital gain tax liability.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection14.mmObject();
		}

		@Override
		public Optional<AmountAndDirection14> getValue(BalanceAmounts5 obj) {
			return obj.getBookValue();
		}

		@Override
		public void setValue(BalanceAmounts5 obj, Optional<AmountAndDirection14> value) {
			obj.setBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "UrlsdGnLoss")
	protected AmountAndDirection14 unrealisedGainLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedGainOrLoss
	 * AssetHolding.mmUnrealisedGainOrLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UrlsdGnLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedGainLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Difference between holding value and the book value."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>> mmUnrealisedGainLoss = new MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmUnrealisedGainOrLoss;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
			isDerived = false;
			xmlTag = "UrlsdGnLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrealisedGainLoss";
			definition = "Difference between holding value and the book value.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection14.mmObject();
		}

		@Override
		public Optional<AmountAndDirection14> getValue(BalanceAmounts5 obj) {
			return obj.getUnrealisedGainLoss();
		}

		@Override
		public void setValue(BalanceAmounts5 obj, Optional<AmountAndDirection14> value) {
			obj.setUnrealisedGainLoss(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection14 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5
	 * BalanceAmounts5}</li>
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
	public static final MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>> mmAccruedInterestAmount = new MMMessageAssociationEnd<BalanceAmounts5, Optional<AmountAndDirection14>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAmounts5.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection14.mmObject();
		}

		@Override
		public Optional<AmountAndDirection14> getValue(BalanceAmounts5 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(BalanceAmounts5 obj, Optional<AmountAndDirection14> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAmounts5.mmHoldingValue, com.tools20022.repository.msg.BalanceAmounts5.mmPreviousHoldingValue,
						com.tools20022.repository.msg.BalanceAmounts5.mmBookValue, com.tools20022.repository.msg.BalanceAmounts5.mmUnrealisedGainLoss, com.tools20022.repository.msg.BalanceAmounts5.mmAccruedInterestAmount);
				trace_lazy = () -> AssetHolding.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceAmounts5";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection14 getHoldingValue() {
		return holdingValue;
	}

	public BalanceAmounts5 setHoldingValue(AmountAndDirection14 holdingValue) {
		this.holdingValue = Objects.requireNonNull(holdingValue);
		return this;
	}

	public Optional<AmountAndDirection14> getPreviousHoldingValue() {
		return previousHoldingValue == null ? Optional.empty() : Optional.of(previousHoldingValue);
	}

	public BalanceAmounts5 setPreviousHoldingValue(AmountAndDirection14 previousHoldingValue) {
		this.previousHoldingValue = previousHoldingValue;
		return this;
	}

	public Optional<AmountAndDirection14> getBookValue() {
		return bookValue == null ? Optional.empty() : Optional.of(bookValue);
	}

	public BalanceAmounts5 setBookValue(AmountAndDirection14 bookValue) {
		this.bookValue = bookValue;
		return this;
	}

	public Optional<AmountAndDirection14> getUnrealisedGainLoss() {
		return unrealisedGainLoss == null ? Optional.empty() : Optional.of(unrealisedGainLoss);
	}

	public BalanceAmounts5 setUnrealisedGainLoss(AmountAndDirection14 unrealisedGainLoss) {
		this.unrealisedGainLoss = unrealisedGainLoss;
		return this;
	}

	public Optional<AmountAndDirection14> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public BalanceAmounts5 setAccruedInterestAmount(AmountAndDirection14 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}
}