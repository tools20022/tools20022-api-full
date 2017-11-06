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
 * Defines the criteria used to report on a system or a member of the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2#mmSystemIdentificationIndicator
 * SystemReturnCriteria2.mmSystemIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2#mmMemberIdentificationIndicator
 * SystemReturnCriteria2.mmMemberIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2#mmCountryIdentificationIndicator
 * SystemReturnCriteria2.mmCountryIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2#mmAccountIdentificationIndicator
 * SystemReturnCriteria2.mmAccountIdentificationIndicator}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemReturnCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria used to report on a system or a member of the system."</li>
 * </ul>
 */
public class SystemReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator systemIdentificationIndicator;
	/**
	 * Indicates whether the system identification is requested.
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
	 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the system identification is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentificationIndicator";
			definition = "Indicates whether the system identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator memberIdentificationIndicator;
	/**
	 * Indicates whether the member identification is requested.
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
	 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the member identification is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMemberIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "MmbIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberIdentificationIndicator";
			definition = "Indicates whether the member identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator countryIdentificationIndicator;
	/**
	 * Indicates whether the country identification is requested.
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
	 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the country identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CtryIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryIdentificationIndicator";
			definition = "Indicates whether the country identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountIdentificationIndicator;
	/**
	 * Indicates whether the account identification is requested.
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
	 * {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationIndicator";
			definition = "Indicates whether the account identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemReturnCriteria2.mmSystemIdentificationIndicator, com.tools20022.repository.msg.SystemReturnCriteria2.mmMemberIdentificationIndicator,
						com.tools20022.repository.msg.SystemReturnCriteria2.mmCountryIdentificationIndicator, com.tools20022.repository.msg.SystemReturnCriteria2.mmAccountIdentificationIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemReturnCriteria2";
				definition = "Defines the criteria used to report on a system or a member of the system.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getSystemIdentificationIndicator() {
		return systemIdentificationIndicator;
	}

	public void setSystemIdentificationIndicator(RequestedIndicator systemIdentificationIndicator) {
		this.systemIdentificationIndicator = systemIdentificationIndicator;
	}

	public RequestedIndicator getMemberIdentificationIndicator() {
		return memberIdentificationIndicator;
	}

	public void setMemberIdentificationIndicator(RequestedIndicator memberIdentificationIndicator) {
		this.memberIdentificationIndicator = memberIdentificationIndicator;
	}

	public RequestedIndicator getCountryIdentificationIndicator() {
		return countryIdentificationIndicator;
	}

	public void setCountryIdentificationIndicator(RequestedIndicator countryIdentificationIndicator) {
		this.countryIdentificationIndicator = countryIdentificationIndicator;
	}

	public RequestedIndicator getAccountIdentificationIndicator() {
		return accountIdentificationIndicator;
	}

	public void setAccountIdentificationIndicator(RequestedIndicator accountIdentificationIndicator) {
		this.accountIdentificationIndicator = accountIdentificationIndicator;
	}
}