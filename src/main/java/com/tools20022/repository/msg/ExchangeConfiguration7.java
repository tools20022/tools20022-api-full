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
import com.tools20022.repository.codeset.ExchangePolicy1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProcessRetry2;
import com.tools20022.repository.msg.ProcessTiming4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration parameters of data exchanges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmExchangePolicy
 * ExchangeConfiguration7.mmExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmMaximumNumber
 * ExchangeConfiguration7.mmMaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmMaximumAmount
 * ExchangeConfiguration7.mmMaximumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmReTry
 * ExchangeConfiguration7.mmReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmTimeCondition
 * ExchangeConfiguration7.mmTimeCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmExchangeFailed
 * ExchangeConfiguration7.mmExchangeFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmExchangeDeclined
 * ExchangeConfiguration7.mmExchangeDeclined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangeConfiguration7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters of data exchanges."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
 * ExchangeConfiguration5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExchangeConfiguration7", propOrder = {"exchangePolicy", "maximumNumber", "maximumAmount", "reTry", "timeCondition", "exchangeFailed", "exchangeDeclined"})
public class ExchangeConfiguration7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XchgPlcy", required = true)
	protected List<ExchangePolicy1Code> exchangePolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicy1Code
	 * ExchangePolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmExchangePolicy
	 * AcceptorConfiguration.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgPlcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangePolicy
	 * ExchangeConfiguration5.mmExchangePolicy}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration7, List<ExchangePolicy1Code>> mmExchangePolicy = new MMMessageAttribute<ExchangeConfiguration7, List<ExchangePolicy1Code>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmExchangePolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration7.mmObject();
			isDerived = false;
			xmlTag = "XchgPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			previousVersion_lazy = () -> ExchangeConfiguration5.mmExchangePolicy;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicy1Code.mmObject();
		}

		@Override
		public List<ExchangePolicy1Code> getValue(ExchangeConfiguration7 obj) {
			return obj.getExchangePolicy();
		}

		@Override
		public void setValue(ExchangeConfiguration7 obj, List<ExchangePolicy1Code> value) {
			obj.setExchangePolicy(value);
		}
	};
	@XmlElement(name = "MaxNb")
	protected Number maximumNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumNumber
	 * AcceptorConfiguration.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumNumber
	 * ExchangeConfiguration5.mmMaximumNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration7, Optional<Number>> mmMaximumNumber = new MMMessageAttribute<ExchangeConfiguration7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration7.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			previousVersion_lazy = () -> ExchangeConfiguration5.mmMaximumNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ExchangeConfiguration7 obj) {
			return obj.getMaximumNumber();
		}

		@Override
		public void setValue(ExchangeConfiguration7 obj, Optional<Number> value) {
			obj.setMaximumNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxAmt")
	protected ImpliedCurrencyAndAmount maximumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumAmount
	 * AcceptorConfiguration.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumAmount
	 * ExchangeConfiguration5.mmMaximumAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration7, Optional<ImpliedCurrencyAndAmount>> mmMaximumAmount = new MMMessageAttribute<ExchangeConfiguration7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration7.mmObject();
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			previousVersion_lazy = () -> ExchangeConfiguration5.mmMaximumAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ExchangeConfiguration7 obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(ExchangeConfiguration7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMaximumAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ReTry")
	protected ProcessRetry2 reTry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessRetry2
	 * ProcessRetry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of retry process if activation of an action fails."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmReTry
	 * ExchangeConfiguration5.mmReTry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExchangeConfiguration7, Optional<ProcessRetry2>> mmReTry = new MMMessageAssociationEnd<ExchangeConfiguration7, Optional<ProcessRetry2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration7.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process if activation of an action fails.";
			previousVersion_lazy = () -> ExchangeConfiguration5.mmReTry;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessRetry2.mmObject();
		}

		@Override
		public Optional<ProcessRetry2> getValue(ExchangeConfiguration7 obj) {
			return obj.getReTry();
		}

		@Override
		public void setValue(ExchangeConfiguration7 obj, Optional<ProcessRetry2> value) {
			obj.setReTry(value.orElse(null));
		}
	};
	@XmlElement(name = "TmCond")
	protected ProcessTiming4 timeCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming4
	 * ProcessTiming4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Timing condition for periodic exchanges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmTimeCondition
	 * ExchangeConfiguration5.mmTimeCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExchangeConfiguration7, Optional<ProcessTiming4>> mmTimeCondition = new MMMessageAssociationEnd<ExchangeConfiguration7, Optional<ProcessTiming4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration7.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Timing condition for periodic exchanges.";
			previousVersion_lazy = () -> ExchangeConfiguration5.mmTimeCondition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessTiming4.mmObject();
		}

		@Override
		public Optional<ProcessTiming4> getValue(ExchangeConfiguration7 obj) {
			return obj.getTimeCondition();
		}

		@Override
		public void setValue(ExchangeConfiguration7 obj, Optional<ProcessTiming4> value) {
			obj.setTimeCondition(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgFaild")
	protected TrueFalseIndicator exchangeFailed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgFaild"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Failed transaction must be exchanged.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangeFailed
	 * ExchangeConfiguration5.mmExchangeFailed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration7, Optional<TrueFalseIndicator>> mmExchangeFailed = new MMMessageAttribute<ExchangeConfiguration7, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration7.mmObject();
			isDerived = false;
			xmlTag = "XchgFaild";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeFailed";
			definition = "Failed transaction must be exchanged.\r\n";
			previousVersion_lazy = () -> ExchangeConfiguration5.mmExchangeFailed;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ExchangeConfiguration7 obj) {
			return obj.getExchangeFailed();
		}

		@Override
		public void setValue(ExchangeConfiguration7 obj, Optional<TrueFalseIndicator> value) {
			obj.setExchangeFailed(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgDclnd")
	protected TrueFalseIndicator exchangeDeclined;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgDclnd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that declined transaction must be exchanged."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangeDeclined
	 * ExchangeConfiguration5.mmExchangeDeclined}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration7, Optional<TrueFalseIndicator>> mmExchangeDeclined = new MMMessageAttribute<ExchangeConfiguration7, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration7.mmObject();
			isDerived = false;
			xmlTag = "XchgDclnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeDeclined";
			definition = "Indicates that declined transaction must be exchanged.";
			previousVersion_lazy = () -> ExchangeConfiguration5.mmExchangeDeclined;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ExchangeConfiguration7 obj) {
			return obj.getExchangeDeclined();
		}

		@Override
		public void setValue(ExchangeConfiguration7 obj, Optional<TrueFalseIndicator> value) {
			obj.setExchangeDeclined(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration7.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration7.mmMaximumNumber,
						com.tools20022.repository.msg.ExchangeConfiguration7.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration7.mmReTry, com.tools20022.repository.msg.ExchangeConfiguration7.mmTimeCondition,
						com.tools20022.repository.msg.ExchangeConfiguration7.mmExchangeFailed, com.tools20022.repository.msg.ExchangeConfiguration7.mmExchangeDeclined);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangeConfiguration7";
				definition = "Configuration parameters of data exchanges.";
				previousVersion_lazy = () -> ExchangeConfiguration5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ExchangePolicy1Code> getExchangePolicy() {
		return exchangePolicy == null ? exchangePolicy = new ArrayList<>() : exchangePolicy;
	}

	public ExchangeConfiguration7 setExchangePolicy(List<ExchangePolicy1Code> exchangePolicy) {
		this.exchangePolicy = Objects.requireNonNull(exchangePolicy);
		return this;
	}

	public Optional<Number> getMaximumNumber() {
		return maximumNumber == null ? Optional.empty() : Optional.of(maximumNumber);
	}

	public ExchangeConfiguration7 setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumAmount() {
		return maximumAmount == null ? Optional.empty() : Optional.of(maximumAmount);
	}

	public ExchangeConfiguration7 setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
		return this;
	}

	public Optional<ProcessRetry2> getReTry() {
		return reTry == null ? Optional.empty() : Optional.of(reTry);
	}

	public ExchangeConfiguration7 setReTry(ProcessRetry2 reTry) {
		this.reTry = reTry;
		return this;
	}

	public Optional<ProcessTiming4> getTimeCondition() {
		return timeCondition == null ? Optional.empty() : Optional.of(timeCondition);
	}

	public ExchangeConfiguration7 setTimeCondition(ProcessTiming4 timeCondition) {
		this.timeCondition = timeCondition;
		return this;
	}

	public Optional<TrueFalseIndicator> getExchangeFailed() {
		return exchangeFailed == null ? Optional.empty() : Optional.of(exchangeFailed);
	}

	public ExchangeConfiguration7 setExchangeFailed(TrueFalseIndicator exchangeFailed) {
		this.exchangeFailed = exchangeFailed;
		return this;
	}

	public Optional<TrueFalseIndicator> getExchangeDeclined() {
		return exchangeDeclined == null ? Optional.empty() : Optional.of(exchangeDeclined);
	}

	public ExchangeConfiguration7 setExchangeDeclined(TrueFalseIndicator exchangeDeclined) {
		this.exchangeDeclined = exchangeDeclined;
		return this;
	}
}