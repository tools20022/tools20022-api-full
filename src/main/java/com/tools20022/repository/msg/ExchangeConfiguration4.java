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
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProcessRetry2;
import com.tools20022.repository.msg.ProcessTiming3;
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
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmExchangePolicy
 * ExchangeConfiguration4.mmExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmMaximumNumber
 * ExchangeConfiguration4.mmMaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmMaximumAmount
 * ExchangeConfiguration4.mmMaximumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmReTry
 * ExchangeConfiguration4.mmReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmTimeCondition
 * ExchangeConfiguration4.mmTimeCondition}</li>
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
 * "ExchangeConfiguration4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters of data exchanges."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration6
 * ExchangeConfiguration6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2
 * ExchangeConfiguration2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExchangeConfiguration4", propOrder = {"exchangePolicy", "maximumNumber", "maximumAmount", "reTry", "timeCondition"})
public class ExchangeConfiguration4 {

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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmExchangePolicy
	 * ExchangeConfiguration6.mmExchangePolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmExchangePolicy
	 * ExchangeConfiguration2.mmExchangePolicy}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration4, List<ExchangePolicy1Code>> mmExchangePolicy = new MMMessageAttribute<ExchangeConfiguration4, List<ExchangePolicy1Code>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmExchangePolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "XchgPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration6.mmExchangePolicy);
			previousVersion_lazy = () -> ExchangeConfiguration2.mmExchangePolicy;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicy1Code.mmObject();
		}

		@Override
		public List<ExchangePolicy1Code> getValue(ExchangeConfiguration4 obj) {
			return obj.getExchangePolicy();
		}

		@Override
		public void setValue(ExchangeConfiguration4 obj, List<ExchangePolicy1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmMaximumNumber
	 * ExchangeConfiguration6.mmMaximumNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmMaximumNumber
	 * ExchangeConfiguration2.mmMaximumNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration4, Optional<Number>> mmMaximumNumber = new MMMessageAttribute<ExchangeConfiguration4, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration6.mmMaximumNumber);
			previousVersion_lazy = () -> ExchangeConfiguration2.mmMaximumNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ExchangeConfiguration4 obj) {
			return obj.getMaximumNumber();
		}

		@Override
		public void setValue(ExchangeConfiguration4 obj, Optional<Number> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmMaximumAmount
	 * ExchangeConfiguration6.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmMaximumAmount
	 * ExchangeConfiguration2.mmMaximumAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeConfiguration4, Optional<ImpliedCurrencyAndAmount>> mmMaximumAmount = new MMMessageAttribute<ExchangeConfiguration4, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration6.mmMaximumAmount);
			previousVersion_lazy = () -> ExchangeConfiguration2.mmMaximumAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ExchangeConfiguration4 obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(ExchangeConfiguration4 obj, Optional<ImpliedCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmReTry
	 * ExchangeConfiguration6.mmReTry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExchangeConfiguration4, Optional<ProcessRetry2>> mmReTry = new MMMessageAssociationEnd<ExchangeConfiguration4, Optional<ProcessRetry2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process if activation of an action fails.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration6.mmReTry);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessRetry2.mmObject();
		}

		@Override
		public Optional<ProcessRetry2> getValue(ExchangeConfiguration4 obj) {
			return obj.getReTry();
		}

		@Override
		public void setValue(ExchangeConfiguration4 obj, Optional<ProcessRetry2> value) {
			obj.setReTry(value.orElse(null));
		}
	};
	@XmlElement(name = "TmCond")
	protected ProcessTiming3 timeCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming3
	 * ProcessTiming3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmTimeCondition
	 * ExchangeConfiguration6.mmTimeCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmTimeCondition
	 * ExchangeConfiguration2.mmTimeCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExchangeConfiguration4, Optional<ProcessTiming3>> mmTimeCondition = new MMMessageAssociationEnd<ExchangeConfiguration4, Optional<ProcessTiming3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Timing condition for periodic exchanges.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration6.mmTimeCondition);
			previousVersion_lazy = () -> ExchangeConfiguration2.mmTimeCondition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessTiming3.mmObject();
		}

		@Override
		public Optional<ProcessTiming3> getValue(ExchangeConfiguration4 obj) {
			return obj.getTimeCondition();
		}

		@Override
		public void setValue(ExchangeConfiguration4 obj, Optional<ProcessTiming3> value) {
			obj.setTimeCondition(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration4.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration4.mmMaximumNumber,
						com.tools20022.repository.msg.ExchangeConfiguration4.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration4.mmReTry, com.tools20022.repository.msg.ExchangeConfiguration4.mmTimeCondition);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangeConfiguration4";
				definition = "Configuration parameters of data exchanges.";
				nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration6.mmObject());
				previousVersion_lazy = () -> ExchangeConfiguration2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ExchangePolicy1Code> getExchangePolicy() {
		return exchangePolicy == null ? exchangePolicy = new ArrayList<>() : exchangePolicy;
	}

	public ExchangeConfiguration4 setExchangePolicy(List<ExchangePolicy1Code> exchangePolicy) {
		this.exchangePolicy = Objects.requireNonNull(exchangePolicy);
		return this;
	}

	public Optional<Number> getMaximumNumber() {
		return maximumNumber == null ? Optional.empty() : Optional.of(maximumNumber);
	}

	public ExchangeConfiguration4 setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumAmount() {
		return maximumAmount == null ? Optional.empty() : Optional.of(maximumAmount);
	}

	public ExchangeConfiguration4 setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
		return this;
	}

	public Optional<ProcessRetry2> getReTry() {
		return reTry == null ? Optional.empty() : Optional.of(reTry);
	}

	public ExchangeConfiguration4 setReTry(ProcessRetry2 reTry) {
		this.reTry = reTry;
		return this;
	}

	public Optional<ProcessTiming3> getTimeCondition() {
		return timeCondition == null ? Optional.empty() : Optional.of(timeCondition);
	}

	public ExchangeConfiguration4 setTimeCondition(ProcessTiming3 timeCondition) {
		this.timeCondition = timeCondition;
		return this;
	}
}