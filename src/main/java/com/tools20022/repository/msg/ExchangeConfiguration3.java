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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmExchangePolicy
 * ExchangeConfiguration3.mmExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmMaximumNumber
 * ExchangeConfiguration3.mmMaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmMaximumAmount
 * ExchangeConfiguration3.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmTimeCondition
 * ExchangeConfiguration3.mmTimeCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmExchangeFailed
 * ExchangeConfiguration3.mmExchangeFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmExchangeDeclined
 * ExchangeConfiguration3.mmExchangeDeclined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
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
 * "ExchangeConfiguration3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters of data exchanges."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
 * ExchangeConfiguration5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2
 * ExchangeConfiguration2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ExchangeConfiguration3", propOrder = {"exchangePolicy", "maximumNumber", "maximumAmount", "timeCondition", "exchangeFailed", "exchangeDeclined"})
public class ExchangeConfiguration3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ExchangePolicy1Code> exchangePolicy;
	/**
	 * Exchange policy between parties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
	 * ExchangeConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangePolicy
	 * ExchangeConfiguration5.mmExchangePolicy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangePolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmExchangePolicy;
			componentContext_lazy = () -> ExchangeConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "XchgPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration5.mmExchangePolicy);
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicy1Code.mmObject();
		}
	};
	protected Number maximumNumber;
	/**
	 * Maximum number of transactions without exchange.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
	 * ExchangeConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumNumber
	 * ExchangeConfiguration5.mmMaximumNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumNumber;
			componentContext_lazy = () -> ExchangeConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration5.mmMaximumNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumAmount;
	/**
	 * Maximum cumulative amount of the transactions without exchange.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
	 * ExchangeConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumAmount
	 * ExchangeConfiguration5.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmMaximumAmount;
			componentContext_lazy = () -> ExchangeConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration5.mmMaximumAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ProcessTiming2 timeCondition;
	/**
	 * Timing condition for periodic exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming2
	 * ProcessTiming2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
	 * ExchangeConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Timing condition for periodic exchanges."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmTimeCondition
	 * ExchangeConfiguration5.mmTimeCondition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTimeCondition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ExchangeConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Timing condition for periodic exchanges.";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration5.mmTimeCondition);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessTiming2.mmObject();
		}
	};
	protected TrueFalseIndicator exchangeFailed;
	/**
	 * Failed transaction must be exchanged.<br>
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
	 * ExchangeConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgFaild"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Failed transaction must be exchanged.\r\n"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangeFailed
	 * ExchangeConfiguration5.mmExchangeFailed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeFailed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ExchangeConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "XchgFaild";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeFailed";
			definition = "Failed transaction must be exchanged.\r\n";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration5.mmExchangeFailed);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator exchangeDeclined;
	/**
	 * Indicates that declined transaction must be exchanged
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
	 * ExchangeConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgDclnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that declined transaction must be exchanged"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangeDeclined
	 * ExchangeConfiguration5.mmExchangeDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeDeclined = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ExchangeConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "XchgDclnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeDeclined";
			definition = "Indicates that declined transaction must be exchanged";
			nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration5.mmExchangeDeclined);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ExchangeConfiguration3.mmExchangePolicy, ExchangeConfiguration3.mmMaximumNumber, ExchangeConfiguration3.mmMaximumAmount, ExchangeConfiguration3.mmTimeCondition,
						ExchangeConfiguration3.mmExchangeFailed, ExchangeConfiguration3.mmExchangeDeclined);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangeConfiguration3";
				definition = "Configuration parameters of data exchanges.";
				nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration5.mmObject());
				previousVersion_lazy = () -> ExchangeConfiguration2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "XchgPlcy", required = true)
	public List<ExchangePolicy1Code> getExchangePolicy() {
		return exchangePolicy;
	}

	public void setExchangePolicy(List<ExchangePolicy1Code> exchangePolicy) {
		this.exchangePolicy = exchangePolicy;
	}

	@XmlElement(name = "MaxNb")
	public Number getMaximumNumber() {
		return maximumNumber;
	}

	public void setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
	}

	@XmlElement(name = "MaxAmt")
	public ImpliedCurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	@XmlElement(name = "TmCond")
	public ProcessTiming2 getTimeCondition() {
		return timeCondition;
	}

	public void setTimeCondition(com.tools20022.repository.msg.ProcessTiming2 timeCondition) {
		this.timeCondition = timeCondition;
	}

	@XmlElement(name = "XchgFaild")
	public TrueFalseIndicator getExchangeFailed() {
		return exchangeFailed;
	}

	public void setExchangeFailed(TrueFalseIndicator exchangeFailed) {
		this.exchangeFailed = exchangeFailed;
	}

	@XmlElement(name = "XchgDclnd")
	public TrueFalseIndicator getExchangeDeclined() {
		return exchangeDeclined;
	}

	public void setExchangeDeclined(TrueFalseIndicator exchangeDeclined) {
		this.exchangeDeclined = exchangeDeclined;
	}
}