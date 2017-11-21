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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmHoldingValue
 * BalanceAmounts1.mmHoldingValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmPreviousHoldingValue
 * BalanceAmounts1.mmPreviousHoldingValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmBookValue
 * BalanceAmounts1.mmBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmUnrealisedGainLoss
 * BalanceAmounts1.mmUnrealisedGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmAccruedInterestAmount
 * BalanceAmounts1.mmAccruedInterestAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AssetHolding
 * AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceAmounts1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BalanceAmounts1", propOrder = {"holdingValue", "previousHoldingValue", "bookValue", "unrealisedGainLoss", "accruedInterestAmount"})
public class BalanceAmounts1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection6 holdingValue;
	/**
	 * Value of an individual financial instrument holding within a safekeeping
	 * account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
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
	public static final MMMessageAttribute mmHoldingValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> BalanceAmounts1.mmObject();
			isDerived = false;
			xmlTag = "HldgVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingValue";
			definition = "Value of an individual financial instrument holding within a safekeeping account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 previousHoldingValue;
	/**
	 * Previous value of an individual financial instrument holding within a
	 * safekeeping account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
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
	public static final MMMessageAttribute mmPreviousHoldingValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> BalanceAmounts1.mmObject();
			isDerived = false;
			xmlTag = "PrvsHldgVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousHoldingValue";
			definition = "Previous value of an individual financial instrument holding within a safekeeping account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 bookValue;
	/**
	 * Value of a financial instrument, as booked/acquired in an account. It may
	 * be used to establish capital gain tax liability.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
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
	public static final MMMessageAttribute mmBookValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> BalanceAmounts1.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Value of a financial instrument, as booked/acquired in an account. It may be used to establish capital gain tax liability.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 unrealisedGainLoss;
	/**
	 * Difference between holding value and the book value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedGainOrLoss
	 * AssetHolding.mmUnrealisedGainOrLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
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
	public static final MMMessageAttribute mmUnrealisedGainLoss = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmUnrealisedGainOrLoss;
			componentContext_lazy = () -> BalanceAmounts1.mmObject();
			isDerived = false;
			xmlTag = "UrlsdGnLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrealisedGainLoss";
			definition = "Difference between holding value and the book value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between coupon payment periods.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1
	 * BalanceAmounts1}</li>
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
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> BalanceAmounts1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BalanceAmounts1.mmHoldingValue, BalanceAmounts1.mmPreviousHoldingValue, BalanceAmounts1.mmBookValue, BalanceAmounts1.mmUnrealisedGainLoss, BalanceAmounts1.mmAccruedInterestAmount);
				trace_lazy = () -> AssetHolding.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceAmounts1";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "HldgVal", required = true)
	public AmountAndDirection6 getHoldingValue() {
		return holdingValue;
	}

	public void setHoldingValue(com.tools20022.repository.msg.AmountAndDirection6 holdingValue) {
		this.holdingValue = holdingValue;
	}

	@XmlElement(name = "PrvsHldgVal")
	public AmountAndDirection6 getPreviousHoldingValue() {
		return previousHoldingValue;
	}

	public void setPreviousHoldingValue(com.tools20022.repository.msg.AmountAndDirection6 previousHoldingValue) {
		this.previousHoldingValue = previousHoldingValue;
	}

	@XmlElement(name = "BookVal")
	public AmountAndDirection6 getBookValue() {
		return bookValue;
	}

	public void setBookValue(com.tools20022.repository.msg.AmountAndDirection6 bookValue) {
		this.bookValue = bookValue;
	}

	@XmlElement(name = "UrlsdGnLoss")
	public AmountAndDirection6 getUnrealisedGainLoss() {
		return unrealisedGainLoss;
	}

	public void setUnrealisedGainLoss(com.tools20022.repository.msg.AmountAndDirection6 unrealisedGainLoss) {
		this.unrealisedGainLoss = unrealisedGainLoss;
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public AmountAndDirection6 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection6 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}
}