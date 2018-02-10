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
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.CommercialTradeSettlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the payment terms of the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EarlyPaymentsVAT1#mmTaxRate
 * EarlyPaymentsVAT1.mmTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EarlyPaymentsVAT1#mmDiscountTaxType
 * EarlyPaymentsVAT1.mmDiscountTaxType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EarlyPaymentsVAT1#mmDiscountTaxAmount
 * EarlyPaymentsVAT1.mmDiscountTaxAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
 * CommercialTradeSettlement}</li>
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
 * "EarlyPaymentsVAT1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms of the underlying transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EarlyPaymentsVAT1", propOrder = {"taxRate", "discountTaxType", "discountTaxAmount"})
public class EarlyPaymentsVAT1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TaxRate", required = true)
	protected PercentageRate taxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EarlyPaymentsVAT1
	 * EarlyPaymentsVAT1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax rate to be applied for early payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPaymentsVAT1.mmObject();
			isDerived = false;
			xmlTag = "TaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRate";
			definition = "Tax rate to be applied for early payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "DscntTaxTp", required = true)
	protected Max4Text discountTaxType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EarlyPaymentsVAT1
	 * EarlyPaymentsVAT1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntTaxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
	 * constraint} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintR8#forDiscountTaxType
	 * ConstraintR8.forDiscountTaxType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountTaxType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPaymentsVAT1.mmObject();
			isDerived = false;
			xmlTag = "DscntTaxTp";
			constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintR8.forDiscountTaxType);
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountTaxType";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	@XmlElement(name = "DscntTaxAmt", required = true)
	protected CurrencyAndAmount discountTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EarlyPaymentsVAT1
	 * EarlyPaymentsVAT1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Early payment discount tax amount calculated using defined tax rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountTaxAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPaymentsVAT1.mmObject();
			isDerived = false;
			xmlTag = "DscntTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountTaxAmount";
			definition = "Early payment discount tax amount calculated using defined tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EarlyPaymentsVAT1.mmTaxRate, com.tools20022.repository.msg.EarlyPaymentsVAT1.mmDiscountTaxType,
						com.tools20022.repository.msg.EarlyPaymentsVAT1.mmDiscountTaxAmount);
				trace_lazy = () -> CommercialTradeSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EarlyPaymentsVAT1";
				definition = "Specifies the payment terms of the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getTaxRate() {
		return taxRate;
	}

	public EarlyPaymentsVAT1 setTaxRate(PercentageRate taxRate) {
		this.taxRate = Objects.requireNonNull(taxRate);
		return this;
	}

	public Max4Text getDiscountTaxType() {
		return discountTaxType;
	}

	public EarlyPaymentsVAT1 setDiscountTaxType(Max4Text discountTaxType) {
		this.discountTaxType = Objects.requireNonNull(discountTaxType);
		return this;
	}

	public CurrencyAndAmount getDiscountTaxAmount() {
		return discountTaxAmount;
	}

	public EarlyPaymentsVAT1 setDiscountTaxAmount(CurrencyAndAmount discountTaxAmount) {
		this.discountTaxAmount = Objects.requireNonNull(discountTaxAmount);
		return this;
	}
}