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
import com.tools20022.repository.datatype.RequestedIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the criteria used to report on the cash balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#TypeIndicator
 * CashBalanceReturnCriteria.TypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#StatusIndicator
 * CashBalanceReturnCriteria.StatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#ValueDateIndicator
 * CashBalanceReturnCriteria.ValueDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#NumberOfPaymentsIndicator
 * CashBalanceReturnCriteria.NumberOfPaymentsIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashBalanceReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on the cash balance."</li>
 * </ul>
 */
public class CashBalanceReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the balance type is requested.
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
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the balance type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashBalanceReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the balance type is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the balance status is requested.
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
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
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
	 * definition} = "Indicates whether the balance status is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute StatusIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashBalanceReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "StsInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIndicator";
			definition = "Indicates whether the balance status is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the value date is requested.
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
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value date is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValueDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashBalanceReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "ValDtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateIndicator";
			definition = "Indicates whether the value date is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the number of payment is requested.
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
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfPmtsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfPaymentsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the number of payment is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NumberOfPaymentsIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashBalanceReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "NbOfPmtsInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfPaymentsIndicator";
			definition = "Indicates whether the number of payment is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceReturnCriteria.TypeIndicator, com.tools20022.repository.msg.CashBalanceReturnCriteria.StatusIndicator,
						com.tools20022.repository.msg.CashBalanceReturnCriteria.ValueDateIndicator, com.tools20022.repository.msg.CashBalanceReturnCriteria.NumberOfPaymentsIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashBalanceReturnCriteria";
				definition = "Defines the criteria used to report on the cash balance.";
			}
		});
		return mmObject_lazy.get();
	}
}