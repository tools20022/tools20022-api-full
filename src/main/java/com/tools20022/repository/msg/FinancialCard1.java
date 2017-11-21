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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card used to represent a financial account for the purpose of payment
 * settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialCard1#mmCreditLimitAmount
 * FinancialCard1.mmCreditLimitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialCard1#mmCreditAvailableAmount
 * FinancialCard1.mmCreditAvailableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialCard1#mmInterestRatePercent
 * FinancialCard1.mmInterestRatePercent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
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
 * "FinancialCard1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card used to represent a financial account for the purpose of payment settlement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialCard1", propOrder = {"creditLimitAmount", "creditAvailableAmount", "interestRatePercent"})
public class FinancialCard1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CurrencyAndAmount> creditLimitAmount;
	/**
	 * Monetary value of the credit limit for this financial card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1 FinancialCard1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtLmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLimitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the credit limit for this financial card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditLimitAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> FinancialCard1.mmObject();
			isDerived = false;
			xmlTag = "CdtLmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLimitAmount";
			definition = "Monetary value of the credit limit for this financial card.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> creditAvailableAmount;
	/**
	 * Monetary value of the credit available for this financial card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCreditAvailableAmount
	 * PaymentCard.mmCreditAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1 FinancialCard1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtAvlblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the credit available for this financial card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditAvailableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCreditAvailableAmount;
			componentContext_lazy = () -> FinancialCard1.mmObject();
			isDerived = false;
			xmlTag = "CdtAvlblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAvailableAmount";
			definition = "Monetary value of the credit available for this financial card.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate interestRatePercent;
	/**
	 * Interest rate expressed as a percentage for this financial card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1 FinancialCard1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRatePct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRatePercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate expressed as a percentage for this financial card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestRatePercent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> FinancialCard1.mmObject();
			isDerived = false;
			xmlTag = "IntrstRatePct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRatePercent";
			definition = "Interest rate expressed as a percentage for this financial card.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialCard1.mmCreditLimitAmount, FinancialCard1.mmCreditAvailableAmount, FinancialCard1.mmInterestRatePercent);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialCard1";
				definition = "Card used to represent a financial account for the purpose of payment settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CdtLmtAmt")
	public List<CurrencyAndAmount> getCreditLimitAmount() {
		return creditLimitAmount;
	}

	public void setCreditLimitAmount(List<CurrencyAndAmount> creditLimitAmount) {
		this.creditLimitAmount = creditLimitAmount;
	}

	@XmlElement(name = "CdtAvlblAmt")
	public List<CurrencyAndAmount> getCreditAvailableAmount() {
		return creditAvailableAmount;
	}

	public void setCreditAvailableAmount(List<CurrencyAndAmount> creditAvailableAmount) {
		this.creditAvailableAmount = creditAvailableAmount;
	}

	@XmlElement(name = "IntrstRatePct")
	public PercentageRate getInterestRatePercent() {
		return interestRatePercent;
	}

	public void setInterestRatePercent(PercentageRate interestRatePercent) {
		this.interestRatePercent = interestRatePercent;
	}
}