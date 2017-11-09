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
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Content of the acceptor configuration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent2.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmMerchantParameters
 * AcceptorConfigurationContent2.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmTerminalParameters
 * AcceptorConfigurationContent2.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmApplicationParameters
 * AcceptorConfigurationContent2.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmHostCommunicationParameters
 * AcceptorConfigurationContent2.mmHostCommunicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmSecurityParameters
 * AcceptorConfigurationContent2.mmSecurityParameters}</li>
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
 * "AcceptorConfigurationContent2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the acceptor configuration."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
 * AcceptorConfigurationContent3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1
 * AcceptorConfigurationContent1}</li>
 * </ul>
 */
public class AcceptorConfigurationContent2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.AcquirerProtocolParameters3> acquirerProtocolParameters;
	/**
	 * Acceptor parameters dedicated to an acquirer protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
	 * AcceptorConfigurationContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrPrtcolParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to an acquirer protocol."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmAcquirerProtocolParameters
	 * AcceptorConfigurationContent3.mmAcquirerProtocolParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerProtocolParameters = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> AcceptorConfigurationContent2.mmObject();
			isDerived = false;
			xmlTag = "AcqrrPrtcolParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Acceptor parameters dedicated to an acquirer protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent3.mmAcquirerProtocolParameters);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
		}
	};
	protected List<Max10000Binary> merchantParameters;
	/**
	 * Acceptor parameters dedicated to the merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmRetailerParameters
	 * AcceptorConfiguration.mmRetailerParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
	 * AcceptorConfigurationContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to the merchant."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmMerchantParameters
	 * AcceptorConfigurationContent3.mmMerchantParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantParameters = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmRetailerParameters;
			componentContext_lazy = () -> AcceptorConfigurationContent2.mmObject();
			isDerived = false;
			xmlTag = "MrchntParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			definition = "Acceptor parameters dedicated to the merchant.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent3.mmMerchantParameters);
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	protected List<Max10000Binary> terminalParameters;
	/**
	 * Manufacturer configuration parameters of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
	 * AcceptorConfigurationContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manufacturer configuration parameters of the point of interaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmTerminalParameters
	 * AcceptorConfigurationContent3.mmTerminalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminalParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent2.mmObject();
			isDerived = false;
			xmlTag = "TermnlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent3.mmTerminalParameters);
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ApplicationParameters2> applicationParameters;
	/**
	 * Acceptor parameters dedicated to a payment application of the point of
	 * interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ApplicationParameters2
	 * ApplicationParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationParameters
	 * AcceptorConfiguration.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
	 * AcceptorConfigurationContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters dedicated to a payment application of the point of interaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmApplicationParameters
	 * AcceptorConfigurationContent3.mmApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicationParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationParameters;
			componentContext_lazy = () -> AcceptorConfigurationContent2.mmObject();
			isDerived = false;
			xmlTag = "ApplParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			definition = "Acceptor parameters dedicated to a payment application of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent3.mmApplicationParameters);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ApplicationParameters2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.HostCommunicationParameter2> hostCommunicationParameters;
	/**
	 * Acceptor parameters dedicated to the communication with an acquirer host.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter2
	 * HostCommunicationParameter2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
	 * AcceptorConfigurationContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstComParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCommunicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters dedicated to the communication with an acquirer host."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmHostCommunicationParameters
	 * AcceptorConfigurationContent3.mmHostCommunicationParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostCommunicationParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> AcceptorConfigurationContent2.mmObject();
			isDerived = false;
			xmlTag = "HstComParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCommunicationParameters";
			definition = "Acceptor parameters dedicated to the communication with an acquirer host.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent3.mmHostCommunicationParameters);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecurityParameters1> securityParameters;
	/**
	 * Point of interaction parameters related to the security of software
	 * application and application protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters1
	 * SecurityParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
	 * AcceptorConfigurationContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters related to the security of software application and application protocol."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmSecurityParameters
	 * AcceptorConfigurationContent3.mmSecurityParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent2.mmObject();
			isDerived = false;
			xmlTag = "SctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			definition = "Point of interaction parameters related to the security of software application and application protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent3.mmSecurityParameters);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityParameters1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcceptorConfigurationContent2.mmAcquirerProtocolParameters, AcceptorConfigurationContent2.mmMerchantParameters, AcceptorConfigurationContent2.mmTerminalParameters,
						AcceptorConfigurationContent2.mmApplicationParameters, AcceptorConfigurationContent2.mmHostCommunicationParameters, AcceptorConfigurationContent2.mmSecurityParameters);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationContent2";
				definition = "Content of the acceptor configuration.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent3.mmObject());
				previousVersion_lazy = () -> AcceptorConfigurationContent1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AcquirerProtocolParameters3> getAcquirerProtocolParameters() {
		return acquirerProtocolParameters;
	}

	public void setAcquirerProtocolParameters(List<com.tools20022.repository.msg.AcquirerProtocolParameters3> acquirerProtocolParameters) {
		this.acquirerProtocolParameters = acquirerProtocolParameters;
	}

	public List<Max10000Binary> getMerchantParameters() {
		return merchantParameters;
	}

	public void setMerchantParameters(List<Max10000Binary> merchantParameters) {
		this.merchantParameters = merchantParameters;
	}

	public List<Max10000Binary> getTerminalParameters() {
		return terminalParameters;
	}

	public void setTerminalParameters(List<Max10000Binary> terminalParameters) {
		this.terminalParameters = terminalParameters;
	}

	public List<ApplicationParameters2> getApplicationParameters() {
		return applicationParameters;
	}

	public void setApplicationParameters(List<com.tools20022.repository.msg.ApplicationParameters2> applicationParameters) {
		this.applicationParameters = applicationParameters;
	}

	public List<HostCommunicationParameter2> getHostCommunicationParameters() {
		return hostCommunicationParameters;
	}

	public void setHostCommunicationParameters(List<com.tools20022.repository.msg.HostCommunicationParameter2> hostCommunicationParameters) {
		this.hostCommunicationParameters = hostCommunicationParameters;
	}

	public List<SecurityParameters1> getSecurityParameters() {
		return securityParameters;
	}

	public void setSecurityParameters(List<com.tools20022.repository.msg.SecurityParameters1> securityParameters) {
		this.securityParameters = securityParameters;
	}
}