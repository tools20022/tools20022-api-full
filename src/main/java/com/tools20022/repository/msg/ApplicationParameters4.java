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
import com.tools20022.repository.datatype.Max100KBinary;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acceptor parameters dedicated to a payment application of the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4#mmApplicationIdentification
 * ApplicationParameters4.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4#mmVersion
 * ApplicationParameters4.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4#mmParameters
 * ApplicationParameters4.mmParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4#mmEncryptedParameters
 * ApplicationParameters4.mmEncryptedParameters}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ApplicationParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acceptor parameters dedicated to a payment application of the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters5
 * ApplicationParameters5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ApplicationParameters3
 * ApplicationParameters3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ApplicationParameters4", propOrder = {"applicationIdentification", "version", "parameters", "encryptedParameters"})
public class ApplicationParameters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ApplId", required = true)
	protected Max35Text applicationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationIdentification
	 * AcceptorConfiguration.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4
	 * ApplicationParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the payment application."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters5#mmApplicationIdentification
	 * ApplicationParameters5.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters3#mmApplicationIdentification
	 * ApplicationParameters3.mmApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ApplicationParameters4.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application.";
			nextVersions_lazy = () -> Arrays.asList(ApplicationParameters5.mmApplicationIdentification);
			previousVersion_lazy = () -> ApplicationParameters3.mmApplicationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Vrsn", required = true)
	protected Max256Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4
	 * ApplicationParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the payment application configuration parameters."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters5#mmVersion
	 * ApplicationParameters5.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters3#mmVersion
	 * ApplicationParameters3.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ApplicationParameters4.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the payment application configuration parameters.";
			nextVersions_lazy = () -> Arrays.asList(ApplicationParameters5.mmVersion);
			previousVersion_lazy = () -> ApplicationParameters3.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "Params")
	protected List<Max100KBinary> parameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100KBinary
	 * Max100KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4
	 * ApplicationParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Params"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters used by the related payment application."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters5#mmParameters
	 * ApplicationParameters5.mmParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters3#mmParameters
	 * ApplicationParameters3.mmParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ApplicationParameters4.mmObject();
			isDerived = false;
			xmlTag = "Params";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Configuration parameters used by the related payment application.";
			nextVersions_lazy = () -> Arrays.asList(ApplicationParameters5.mmParameters);
			previousVersion_lazy = () -> ApplicationParameters3.mmParameters;
			minOccurs = 0;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}
	};
	@XmlElement(name = "NcrptdParams")
	protected ContentInformationType10 encryptedParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4
	 * ApplicationParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive parameters (sequence of parameters including the envelope) encrypted with a cryptographic key."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters5#mmEncryptedParameters
	 * ApplicationParameters5.mmEncryptedParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters3#mmEncryptedParameters
	 * ApplicationParameters3.mmEncryptedParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncryptedParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ApplicationParameters4.mmObject();
			isDerived = false;
			xmlTag = "NcrptdParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedParameters";
			definition = "Sensitive parameters (sequence of parameters including the envelope) encrypted with a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(ApplicationParameters5.mmEncryptedParameters);
			previousVersion_lazy = () -> ApplicationParameters3.mmEncryptedParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ApplicationParameters4.mmApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters4.mmVersion,
						com.tools20022.repository.msg.ApplicationParameters4.mmParameters, com.tools20022.repository.msg.ApplicationParameters4.mmEncryptedParameters);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ApplicationParameters4";
				definition = "Acceptor parameters dedicated to a payment application of the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(ApplicationParameters5.mmObject());
				previousVersion_lazy = () -> ApplicationParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicationIdentification() {
		return applicationIdentification;
	}

	public ApplicationParameters4 setApplicationIdentification(Max35Text applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public Max256Text getVersion() {
		return version;
	}

	public ApplicationParameters4 setVersion(Max256Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public List<Max100KBinary> getParameters() {
		return parameters == null ? parameters = new ArrayList<>() : parameters;
	}

	public ApplicationParameters4 setParameters(List<Max100KBinary> parameters) {
		this.parameters = Objects.requireNonNull(parameters);
		return this;
	}

	public Optional<ContentInformationType10> getEncryptedParameters() {
		return encryptedParameters == null ? Optional.empty() : Optional.of(encryptedParameters);
	}

	public ApplicationParameters4 setEncryptedParameters(com.tools20022.repository.msg.ContentInformationType10 encryptedParameters) {
		this.encryptedParameters = encryptedParameters;
		return this;
	}
}