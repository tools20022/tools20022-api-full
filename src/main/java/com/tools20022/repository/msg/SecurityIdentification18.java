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
import com.tools20022.repository.codeset.IdentificationType2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a security by its symbol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification18#mmSecurityIdentificationSource
 * SecurityIdentification18.mmSecurityIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification18#mmSecurityIdentification
 * SecurityIdentification18.mmSecurityIdentification}</li>
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
 * "SecurityIdentification18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a security by its symbol."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification18", propOrder = {"securityIdentificationSource", "securityIdentification"})
public class SecurityIdentification18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyIdSrc", required = true)
	protected IdentificationType2Code securityIdentificationSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code
	 * IdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification18
	 * SecurityIdentification18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyIdSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentificationSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security identification source of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification18, IdentificationType2Code> mmSecurityIdentificationSource = new MMMessageAttribute<SecurityIdentification18, IdentificationType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification18.mmObject();
			isDerived = false;
			xmlTag = "SctyIdSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentificationSource";
			definition = "Security identification source of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IdentificationType2Code.mmObject();
		}

		@Override
		public IdentificationType2Code getValue(SecurityIdentification18 obj) {
			return obj.getSecurityIdentificationSource();
		}

		@Override
		public void setValue(SecurityIdentification18 obj, IdentificationType2Code value) {
			obj.setSecurityIdentificationSource(value);
		}
	};
	@XmlElement(name = "SctyId", required = true)
	protected Max35Text securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification18
	 * SecurityIdentification18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security identification of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification18, Max35Text> mmSecurityIdentification = new MMMessageAttribute<SecurityIdentification18, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification18.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Security identification of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecurityIdentification18 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(SecurityIdentification18 obj, Max35Text value) {
			obj.setSecurityIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification18.mmSecurityIdentificationSource, com.tools20022.repository.msg.SecurityIdentification18.mmSecurityIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification18";
				definition = "Identification of a security by its symbol.";
			}
		});
		return mmObject_lazy.get();
	}

	public IdentificationType2Code getSecurityIdentificationSource() {
		return securityIdentificationSource;
	}

	public SecurityIdentification18 setSecurityIdentificationSource(IdentificationType2Code securityIdentificationSource) {
		this.securityIdentificationSource = Objects.requireNonNull(securityIdentificationSource);
		return this;
	}

	public Max35Text getSecurityIdentification() {
		return securityIdentification;
	}

	public SecurityIdentification18 setSecurityIdentification(Max35Text securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}
}