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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.AdjustmentDirection1Code;
import com.tools20022.repository.codeset.AdjustmentType2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount, surcharge
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmAmountOrRateRule
 * Adjustment3.mmAmountOrRateRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Adjustment3#mmTypeOrOtherAdjustmentTypeRule
 * Adjustment3.mmTypeOrOtherAdjustmentTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmType
 * Adjustment3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Adjustment3#mmOtherAdjustmentType
 * Adjustment3.mmOtherAdjustmentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmAmount
 * Adjustment3.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmRate
 * Adjustment3.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmDirection
 * Adjustment3.mmDirection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Adjustment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification on the value of goods and / or services. For example: rebate, discount, surcharge"
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Adjustment3", propOrder = {"type", "otherAdjustmentType", "amount", "rate", "direction"})
public class Adjustment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AdjustmentType2Code type;
	/**
	 * Specifies the type of adjustment applied to the amount of goods/services
	 * by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentType2Code
	 * AdjustmentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmType
	 * Adjustment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmType;
			componentContext_lazy = () -> Adjustment3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentType2Code.mmObject();
		}
	};
	protected Max35Text otherAdjustmentType;
	/**
	 * Specifies a type of adjustment not present in the code list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmType
	 * Adjustment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAdjstmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAdjustmentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a type of adjustment not present in the code list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherAdjustmentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmType;
			componentContext_lazy = () -> Adjustment3.mmObject();
			isDerived = false;
			xmlTag = "OthrAdjstmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAdjustmentType";
			definition = "Specifies a type of adjustment not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Specifies the monetary amount of the adjustment.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
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
	 * definition} = "Specifies the monetary amount of the adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> Adjustment3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Specifies the monetary amount of the adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate rate;
	/**
	 * Specifies the percentage rate of the adjustment.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the percentage rate of the adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> Adjustment3.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Specifies the percentage rate of the adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected AdjustmentDirection1Code direction;
	/**
	 * Specifies whether the adjustment must be subtracted or added to the total
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirection1Code
	 * AdjustmentDirection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmDirection
	 * Adjustment.mmDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Drctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the adjustment must be subtracted or added to the total amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmDirection;
			componentContext_lazy = () -> Adjustment3.mmObject();
			isDerived = false;
			xmlTag = "Drctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirection1Code.mmObject();
		}
	};
	/**
	 * If Rate is present, then Amount is not allowed. If Rate is not present,
	 * then Amount is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmAmount
	 * Adjustment3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmRate
	 * Adjustment3.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOrRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Rate is present, then Amount is not allowed. If Rate is not present, then Amount is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmAmountOrRateRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOrRateRule";
			definition = "If Rate is present, then Amount is not allowed. If Rate is not present, then Amount is mandatory.";
			messageComponent_lazy = () -> Adjustment3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(Adjustment3.mmAmount, Adjustment3.mmRate);
		}
	};
	/**
	 * If Type is present, then OtherAdjustmentType is not allowed. If Type is
	 * not present, then OtherAdjustmentType is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmType
	 * Adjustment3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment3#mmOtherAdjustmentType
	 * Adjustment3.mmOtherAdjustmentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrOtherAdjustmentTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is present, then OtherAdjustmentType is not allowed. If Type is not present, then OtherAdjustmentType is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmTypeOrOtherAdjustmentTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrOtherAdjustmentTypeRule";
			definition = "If Type is present, then OtherAdjustmentType is not allowed. If Type is not present, then OtherAdjustmentType is mandatory.";
			messageComponent_lazy = () -> Adjustment3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(Adjustment3.mmType, Adjustment3.mmOtherAdjustmentType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Adjustment3.mmType, Adjustment3.mmOtherAdjustmentType, Adjustment3.mmAmount, Adjustment3.mmRate, Adjustment3.mmDirection);
				trace_lazy = () -> Adjustment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Adjustment3";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount, surcharge";
				xors_lazy = () -> Arrays.asList(Adjustment3.mmAmountOrRateRule, Adjustment3.mmTypeOrOtherAdjustmentTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public AdjustmentType2Code getType() {
		return type;
	}

	public void setType(AdjustmentType2Code type) {
		this.type = type;
	}

	@XmlElement(name = "OthrAdjstmntTp", required = true)
	public Max35Text getOtherAdjustmentType() {
		return otherAdjustmentType;
	}

	public void setOtherAdjustmentType(Max35Text otherAdjustmentType) {
		this.otherAdjustmentType = otherAdjustmentType;
	}

	@XmlElement(name = "Amt", required = true)
	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "Rate", required = true)
	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	@XmlElement(name = "Drctn", required = true)
	public AdjustmentDirection1Code getDirection() {
		return direction;
	}

	public void setDirection(AdjustmentDirection1Code direction) {
		this.direction = direction;
	}
}