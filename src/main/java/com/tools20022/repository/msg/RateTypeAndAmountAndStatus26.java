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
import com.tools20022.repository.choice.RateStatus3Choice;
import com.tools20022.repository.choice.RateType36Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the value expressed as a rate and an amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmRateType
 * RateTypeAndAmountAndStatus26.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmAmount
 * RateTypeAndAmountAndStatus26.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmRateStatus
 * RateTypeAndAmountAndStatus26.mmRateStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
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
 * "RateTypeAndAmountAndStatus26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the value expressed as a rate and an amount."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11
 * RateTypeAndAmountAndStatus11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RateTypeAndAmountAndStatus26", propOrder = {"rateType", "amount", "rateStatus"})
public class RateTypeAndAmountAndStatus26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RateType36Choice rateType;
	/**
	 * Value expressed as a rate type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType36Choice
	 * RateType36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
	 * RateTypeAndAmountAndStatus26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#mmRateType
	 * RateTypeAndAmountAndStatus11.mmRateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> RateTypeAndAmountAndStatus26.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Value expressed as a rate type.";
			previousVersion_lazy = () -> RateTypeAndAmountAndStatus11.mmRateType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateType36Choice.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * Value expressed as an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
	 * RateTypeAndAmountAndStatus26}</li>
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
	 * definition} = "Value expressed as an amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#mmAmount
	 * RateTypeAndAmountAndStatus11.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> RateTypeAndAmountAndStatus26.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			previousVersion_lazy = () -> RateTypeAndAmountAndStatus11.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected RateStatus3Choice rateStatus;
	/**
	 * Value expressed as a rate status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateStatus3Choice
	 * RateStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmRateStatus
	 * CorporateActionStatus.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
	 * RateTypeAndAmountAndStatus26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#mmRateStatus
	 * RateTypeAndAmountAndStatus11.mmRateStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmRateStatus;
			componentContext_lazy = () -> RateTypeAndAmountAndStatus26.mmObject();
			isDerived = false;
			xmlTag = "RateSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateStatus";
			definition = "Value expressed as a rate status.";
			previousVersion_lazy = () -> RateTypeAndAmountAndStatus11.mmRateStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateStatus3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus26.mmRateType, RateTypeAndAmountAndStatus26.mmAmount, RateTypeAndAmountAndStatus26.mmRateStatus);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateTypeAndAmountAndStatus26";
				definition = "Specifies the value expressed as a rate and an amount.";
				previousVersion_lazy = () -> RateTypeAndAmountAndStatus11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RateTp", required = true)
	public RateType36Choice getRateType() {
		return rateType;
	}

	public void setRateType(RateType36Choice rateType) {
		this.rateType = rateType;
	}

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "RateSts")
	public RateStatus3Choice getRateStatus() {
		return rateStatus;
	}

	public void setRateStatus(RateStatus3Choice rateStatus) {
		this.rateStatus = rateStatus;
	}
}