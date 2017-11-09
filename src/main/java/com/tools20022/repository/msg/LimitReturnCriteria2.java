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
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the criteria used to report on limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2#mmStartDateTimeIndicator
 * LimitReturnCriteria2.mmStartDateTimeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2#mmStatusIndicator
 * LimitReturnCriteria2.mmStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2#mmUsedAmountIndicator
 * LimitReturnCriteria2.mmUsedAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2#mmUsedPercentageIndicator
 * LimitReturnCriteria2.mmUsedPercentageIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitReturnCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on limit."</li>
 * </ul>
 */
public class LimitReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator startDateTimeIndicator;
	/**
	 * Indicates whether the limit start date time is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2
	 * LimitReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDtTmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDateTimeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the limit start date time is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartDateTimeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LimitReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "StartDtTmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDateTimeIndicator";
			definition = "Indicates whether the limit start date time is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator statusIndicator;
	/**
	 * Indicates whether the limit status is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2
	 * LimitReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the limit status is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LimitReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "StsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIndicator";
			definition = "Indicates whether the limit status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator usedAmountIndicator;
	/**
	 * Indicates whether the limit used amount is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2
	 * LimitReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsdAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the limit used amount is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUsedAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LimitReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "UsdAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountIndicator";
			definition = "Indicates whether the limit used amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator usedPercentageIndicator;
	/**
	 * Indicates whether the limit used percentage is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2
	 * LimitReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsdPctgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedPercentageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the limit used percentage is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUsedPercentageIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LimitReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "UsdPctgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentageIndicator";
			definition = "Indicates whether the limit used percentage is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LimitReturnCriteria2.mmStartDateTimeIndicator, LimitReturnCriteria2.mmStatusIndicator, LimitReturnCriteria2.mmUsedAmountIndicator, LimitReturnCriteria2.mmUsedPercentageIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitReturnCriteria2";
				definition = "Defines the criteria used to report on limit.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getStartDateTimeIndicator() {
		return startDateTimeIndicator;
	}

	public void setStartDateTimeIndicator(RequestedIndicator startDateTimeIndicator) {
		this.startDateTimeIndicator = startDateTimeIndicator;
	}

	public RequestedIndicator getStatusIndicator() {
		return statusIndicator;
	}

	public void setStatusIndicator(RequestedIndicator statusIndicator) {
		this.statusIndicator = statusIndicator;
	}

	public RequestedIndicator getUsedAmountIndicator() {
		return usedAmountIndicator;
	}

	public void setUsedAmountIndicator(RequestedIndicator usedAmountIndicator) {
		this.usedAmountIndicator = usedAmountIndicator;
	}

	public RequestedIndicator getUsedPercentageIndicator() {
		return usedPercentageIndicator;
	}

	public void setUsedPercentageIndicator(RequestedIndicator usedPercentageIndicator) {
		this.usedPercentageIndicator = usedPercentageIndicator;
	}
}