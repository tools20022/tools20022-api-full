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
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.entity.AcceptorConfiguration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#AcquirerProtocolParameters
 * AcceptorConfigurationContent3.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#MerchantParameters
 * AcceptorConfigurationContent3.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#TerminalParameters
 * AcceptorConfigurationContent3.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#ApplicationParameters
 * AcceptorConfigurationContent3.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#HostCommunicationParameters
 * AcceptorConfigurationContent3.HostCommunicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#SecurityParameters
 * AcceptorConfigurationContent3.SecurityParameters}</li>
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
 * "AcceptorConfigurationContent3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the acceptor configuration."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4
 * AcceptorConfigurationContent4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
 * AcceptorConfigurationContent2}</li>
 * </ul>
 */
public class AcceptorConfigurationContent3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Acceptor parameters dedicated to an acquirer protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#AcquirerProtocolParameters
	 * AcceptorConfigurationContent4.AcquirerProtocolParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#AcquirerProtocolParameters
	 * AcceptorConfigurationContent2.AcquirerProtocolParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AcquirerProtocolParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent3.mmObject();
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			xmlTag = "AcqrrPrtcolParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Acceptor parameters dedicated to an acquirer protocol.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent2.AcquirerProtocolParameters;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent4.AcquirerProtocolParameters);
			minOccurs = 0;
			type_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#RetailerParameters
	 * AcceptorConfiguration.RetailerParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#MerchantParameters
	 * AcceptorConfigurationContent4.MerchantParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#MerchantParameters
	 * AcceptorConfigurationContent2.MerchantParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MerchantParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.RetailerParameters;
			isDerived = false;
			xmlTag = "MrchntParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			definition = "Acceptor parameters dedicated to the merchant.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent2.MerchantParameters;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent4.MerchantParameters);
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Manufacturer configuration parameters of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1
	 * PaymentTerminalParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#TerminalParameters
	 * AcceptorConfigurationContent4.TerminalParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#TerminalParameters
	 * AcceptorConfigurationContent2.TerminalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TerminalParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "TermnlParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent2.TerminalParameters;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent4.TerminalParameters);
			minOccurs = 0;
			complexType_lazy = () -> PaymentTerminalParameters1.mmObject();
		}
	};
	/**
	 * Acceptor parameters dedicated to a payment application of the point of
	 * interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ApplicationParameters3
	 * ApplicationParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ApplicationParameters
	 * AcceptorConfiguration.ApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#ApplicationParameters
	 * AcceptorConfigurationContent4.ApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#ApplicationParameters
	 * AcceptorConfigurationContent2.ApplicationParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ApplicationParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.ApplicationParameters;
			isDerived = false;
			xmlTag = "ApplParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			definition = "Acceptor parameters dedicated to a payment application of the point of interaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent2.ApplicationParameters;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent4.ApplicationParameters);
			minOccurs = 0;
			type_lazy = () -> ApplicationParameters3.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#TerminalManagementSystem
	 * AcceptorConfiguration.TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#HostCommunicationParameters
	 * AcceptorConfigurationContent4.HostCommunicationParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#HostCommunicationParameters
	 * AcceptorConfigurationContent2.HostCommunicationParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd HostCommunicationParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem;
			isDerived = false;
			xmlTag = "HstComParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCommunicationParameters";
			definition = "Acceptor parameters dedicated to the communication with an acquirer host.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent2.HostCommunicationParameters;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent4.HostCommunicationParameters);
			minOccurs = 0;
			type_lazy = () -> HostCommunicationParameter2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Point of interaction parameters related to the security of software
	 * application and application protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2
	 * SecurityParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#SecurityParameters
	 * AcceptorConfigurationContent4.SecurityParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#SecurityParameters
	 * AcceptorConfigurationContent2.SecurityParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SecurityParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "SctyParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			definition = "Point of interaction parameters related to the security of software application and application protocol.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent2.SecurityParameters;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent4.SecurityParameters);
			minOccurs = 0;
			complexType_lazy = () -> SecurityParameters2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent3.AcquirerProtocolParameters, com.tools20022.repository.msg.AcceptorConfigurationContent3.MerchantParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent3.TerminalParameters, com.tools20022.repository.msg.AcceptorConfigurationContent3.ApplicationParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent3.HostCommunicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent3.SecurityParameters);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationContent3";
				definition = "Content of the acceptor configuration.";
				previousVersion_lazy = () -> AcceptorConfigurationContent2.mmObject();
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}