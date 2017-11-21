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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CashClearingSystem1Code;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.CashClearingSystem;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information used to identify a cash clearing system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice#mmClearingSystemIdentification
 * SystemIdentificationChoice.mmClearingSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice#mmCountry
 * SystemIdentificationChoice.mmCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashClearingSystem
 * CashClearingSystem}</li>
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
 * "SystemIdentificationChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to identify a cash clearing system."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SystemIdentificationChoice", propOrder = {"clearingSystemIdentification", "country"})
public class SystemIdentificationChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CashClearingSystem1Code clearingSystemIdentification;
	/**
	 * Clearing service selected for a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem1Code
	 * CashClearingSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmIdentification
	 * CashClearingSystem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice
	 * SystemIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing service selected for a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingSystemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystem.mmIdentification;
			componentContext_lazy = () -> SystemIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "ClrSysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemIdentification";
			definition = "Clearing service selected for a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashClearingSystem1Code.mmObject();
		}
	};
	protected CountryCode country;
	/**
	 * Country in which the system is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice
	 * SystemIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the system is located."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> SystemIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country in which the system is located.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SystemIdentificationChoice.mmClearingSystemIdentification, SystemIdentificationChoice.mmCountry);
				trace_lazy = () -> CashClearingSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemIdentificationChoice";
				definition = "Information used to identify a cash clearing system.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ClrSysId", required = true)
	public CashClearingSystem1Code getClearingSystemIdentification() {
		return clearingSystemIdentification;
	}

	public void setClearingSystemIdentification(CashClearingSystem1Code clearingSystemIdentification) {
		this.clearingSystemIdentification = clearingSystemIdentification;
	}

	@XmlElement(name = "Ctry", required = true)
	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}
}