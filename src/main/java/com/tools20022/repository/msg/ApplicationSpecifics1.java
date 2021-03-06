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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.SignatureEnvelope;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Application specific information defined by the service provider.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1#mmSystemUser
 * ApplicationSpecifics1.mmSystemUser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1#mmSignature
 * ApplicationSpecifics1.mmSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1#mmTotalNumberOfDocuments
 * ApplicationSpecifics1.mmTotalNumberOfDocuments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ApplicationSpecifics1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Application specific information defined by the service provider."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ApplicationSpecifics1", propOrder = {"systemUser", "signature", "totalNumberOfDocuments"})
public class ApplicationSpecifics1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysUsr")
	protected Max140Text systemUser;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1
	 * ApplicationSpecifics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysUsr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemUser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A system user is a user account defined in the static data. It represents an individual or an application that interacts with the system administrator (e. g. T2S), triggering the available functions. The set of functions available to each system user stems from the set of privileges for which the system user is grantee. System administrator does not provide any attribute for distinguishing between individuals and applications. \r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ApplicationSpecifics1, Optional<Max140Text>> mmSystemUser = new MMMessageAttribute<ApplicationSpecifics1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ApplicationSpecifics1.mmObject();
			isDerived = false;
			xmlTag = "SysUsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemUser";
			definition = "A system user is a user account defined in the static data. It represents an individual or an application that interacts with the system administrator (e. g. T2S), triggering the available functions. The set of functions available to each system user stems from the set of privileges for which the system user is grantee. System administrator does not provide any attribute for distinguishing between individuals and applications. \r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(ApplicationSpecifics1 obj) {
			return obj.getSystemUser();
		}

		@Override
		public void setValue(ApplicationSpecifics1 obj, Optional<Max140Text> value) {
			obj.setSystemUser(value.orElse(null));
		}
	};
	@XmlElement(name = "Sgntr")
	protected SignatureEnvelope signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.other.SignatureEnvelope
	 * SignatureEnvelope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1
	 * ApplicationSpecifics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the digital signature of the Business Entity authorised to sign this Business File."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ApplicationSpecifics1, Optional<SignatureEnvelope>> mmSignature = new MMMessageAttribute<ApplicationSpecifics1, Optional<SignatureEnvelope>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ApplicationSpecifics1.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Contains the digital signature of the Business Entity authorised to sign this Business File.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignatureEnvelope.mmObject();
		}

		@Override
		public Optional<SignatureEnvelope> getValue(ApplicationSpecifics1 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(ApplicationSpecifics1 obj, Optional<SignatureEnvelope> value) {
			obj.setSignature(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfDocs", required = true)
	protected Number totalNumberOfDocuments;
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
	 * {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1
	 * ApplicationSpecifics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfDocs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Gives the total number of instances (messages) within the file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ApplicationSpecifics1, Number> mmTotalNumberOfDocuments = new MMMessageAttribute<ApplicationSpecifics1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ApplicationSpecifics1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfDocs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfDocuments";
			definition = "Gives the total number of instances (messages) within the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(ApplicationSpecifics1 obj) {
			return obj.getTotalNumberOfDocuments();
		}

		@Override
		public void setValue(ApplicationSpecifics1 obj, Number value) {
			obj.setTotalNumberOfDocuments(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ApplicationSpecifics1.mmSystemUser, com.tools20022.repository.msg.ApplicationSpecifics1.mmSignature,
						com.tools20022.repository.msg.ApplicationSpecifics1.mmTotalNumberOfDocuments);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ApplicationSpecifics1";
				definition = "Application specific information defined by the service provider.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Text> getSystemUser() {
		return systemUser == null ? Optional.empty() : Optional.of(systemUser);
	}

	public ApplicationSpecifics1 setSystemUser(Max140Text systemUser) {
		this.systemUser = systemUser;
		return this;
	}

	public Optional<SignatureEnvelope> getSignature() {
		return signature == null ? Optional.empty() : Optional.of(signature);
	}

	public ApplicationSpecifics1 setSignature(SignatureEnvelope signature) {
		this.signature = signature;
		return this;
	}

	public Number getTotalNumberOfDocuments() {
		return totalNumberOfDocuments;
	}

	public ApplicationSpecifics1 setTotalNumberOfDocuments(Number totalNumberOfDocuments) {
		this.totalNumberOfDocuments = Objects.requireNonNull(totalNumberOfDocuments);
		return this;
	}
}