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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateStatus3Choice;
import com.tools20022.repository.choice.RateType39Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.Interest;
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
 * Specifies the value expressed as a rate and an amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmRateType
 * RateTypeAndAmountAndStatus29.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmAmount
 * RateTypeAndAmountAndStatus29.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmRateStatus
 * RateTypeAndAmountAndStatus29.mmRateStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateTypeAndAmountAndStatus29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the value expressed as a rate and an amount."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus41
 * RateTypeAndAmountAndStatus41}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14
 * RateTypeAndAmountAndStatus14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RateTypeAndAmountAndStatus29", propOrder = {"rateType", "amount", "rateStatus"})
public class RateTypeAndAmountAndStatus29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RateTp", required = true)
	protected RateType39Choice rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType39Choice
	 * RateType39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29
	 * RateTypeAndAmountAndStatus29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92J::4!c/[8c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus41#mmRateType
	 * RateTypeAndAmountAndStatus41.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#mmRateType
	 * RateTypeAndAmountAndStatus14.mmRateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateTypeAndAmountAndStatus29, RateType39Choice> mmRateType = new MMMessageAssociationEnd<RateTypeAndAmountAndStatus29, RateType39Choice>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92J::4!c/[8c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Value expressed as a rate type.";
			nextVersions_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus41.mmRateType);
			previousVersion_lazy = () -> RateTypeAndAmountAndStatus14.mmRateType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateType39Choice.mmObject();
		}

		@Override
		public RateType39Choice getValue(RateTypeAndAmountAndStatus29 obj) {
			return obj.getRateType();
		}

		@Override
		public void setValue(RateTypeAndAmountAndStatus29 obj, RateType39Choice value) {
			obj.setRateType(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29
	 * RateTypeAndAmountAndStatus29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as an amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus41#mmAmount
	 * RateTypeAndAmountAndStatus41.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#mmAmount
	 * RateTypeAndAmountAndStatus14.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateTypeAndAmountAndStatus29, ActiveCurrencyAnd13DecimalAmount> mmAmount = new MMMessageAttribute<RateTypeAndAmountAndStatus29, ActiveCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			nextVersions_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus41.mmAmount);
			previousVersion_lazy = () -> RateTypeAndAmountAndStatus14.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAnd13DecimalAmount getValue(RateTypeAndAmountAndStatus29 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(RateTypeAndAmountAndStatus29 obj, ActiveCurrencyAnd13DecimalAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "RateSts")
	protected RateStatus3Choice rateStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29
	 * RateTypeAndAmountAndStatus29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus41#mmRateStatus
	 * RateTypeAndAmountAndStatus41.mmRateStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#mmRateStatus
	 * RateTypeAndAmountAndStatus14.mmRateStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateTypeAndAmountAndStatus29, Optional<RateStatus3Choice>> mmRateStatus = new MMMessageAssociationEnd<RateTypeAndAmountAndStatus29, Optional<RateStatus3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmRateStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.mmObject();
			isDerived = false;
			xmlTag = "RateSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateStatus";
			definition = "Value expressed as a rate status.";
			nextVersions_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus41.mmRateStatus);
			previousVersion_lazy = () -> RateTypeAndAmountAndStatus14.mmRateStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateStatus3Choice.mmObject();
		}

		@Override
		public Optional<RateStatus3Choice> getValue(RateTypeAndAmountAndStatus29 obj) {
			return obj.getRateStatus();
		}

		@Override
		public void setValue(RateTypeAndAmountAndStatus29 obj, Optional<RateStatus3Choice> value) {
			obj.setRateStatus(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.mmRateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.mmAmount,
						com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.mmRateStatus);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateTypeAndAmountAndStatus29";
				definition = "Specifies the value expressed as a rate and an amount.";
				nextVersions_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus41.mmObject());
				previousVersion_lazy = () -> RateTypeAndAmountAndStatus14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public RateType39Choice getRateType() {
		return rateType;
	}

	public RateTypeAndAmountAndStatus29 setRateType(RateType39Choice rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public RateTypeAndAmountAndStatus29 setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<RateStatus3Choice> getRateStatus() {
		return rateStatus == null ? Optional.empty() : Optional.of(rateStatus);
	}

	public RateTypeAndAmountAndStatus29 setRateStatus(RateStatus3Choice rateStatus) {
		this.rateStatus = rateStatus;
		return this;
	}
}