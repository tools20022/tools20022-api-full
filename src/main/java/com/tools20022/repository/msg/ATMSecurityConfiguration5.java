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
import com.tools20022.repository.codeset.PINFormat4Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration of the PIN online verification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration5#mmPINFormat
 * ATMSecurityConfiguration5.mmPINFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration5#mmPINLengthCapabilities
 * ATMSecurityConfiguration5.mmPINLengthCapabilities}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSecurityConfiguration5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration of the PIN online verification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4
 * ATMSecurityConfiguration4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMSecurityConfiguration5", propOrder = {"pINFormat", "pINLengthCapabilities"})
public class ATMSecurityConfiguration5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PINFrmt")
	protected List<PINFormat4Code> pINFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration5
	 * ATMSecurityConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PINFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN block format the security module is able to manage for online verification of the PIN."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPINFormat = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "PINFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINFormat";
			definition = "PIN block format the security module is able to manage for online verification of the PIN.";
			minOccurs = 0;
			simpleType_lazy = () -> PINFormat4Code.mmObject();
		}
	};
	@XmlElement(name = "PINLngthCpblties")
	protected Number pINLengthCapabilities;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration5
	 * ATMSecurityConfiguration5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PINLngthCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINLengthCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of digits the security module is able to accept when the cardholder enters its PIN."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPINLengthCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration5.mmObject();
			isDerived = false;
			xmlTag = "PINLngthCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLengthCapabilities";
			definition = "Maximum number of digits the security module is able to accept when the cardholder enters its PIN.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMSecurityConfiguration5.mmPINFormat, com.tools20022.repository.msg.ATMSecurityConfiguration5.mmPINLengthCapabilities);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityConfiguration5";
				definition = "Configuration of the PIN online verification.";
				previousVersion_lazy = () -> ATMSecurityConfiguration4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<PINFormat4Code> getPINFormat() {
		return pINFormat == null ? pINFormat = new ArrayList<>() : pINFormat;
	}

	public ATMSecurityConfiguration5 setPINFormat(List<PINFormat4Code> pINFormat) {
		this.pINFormat = Objects.requireNonNull(pINFormat);
		return this;
	}

	public Optional<Number> getPINLengthCapabilities() {
		return pINLengthCapabilities == null ? Optional.empty() : Optional.of(pINLengthCapabilities);
	}

	public ATMSecurityConfiguration5 setPINLengthCapabilities(Number pINLengthCapabilities) {
		this.pINLengthCapabilities = pINLengthCapabilities;
		return this;
	}
}