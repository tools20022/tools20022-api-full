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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmReplaceConfiguration
 * AcceptorConfigurationContent7.mmReplaceConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmTMSProtocolParameters
 * AcceptorConfigurationContent7.mmTMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent7.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmMerchantParameters
 * AcceptorConfigurationContent7.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmTerminalParameters
 * AcceptorConfigurationContent7.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmApplicationParameters
 * AcceptorConfigurationContent7.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmHostCommunicationParameters
 * AcceptorConfigurationContent7.mmHostCommunicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmSecurityParameters
 * AcceptorConfigurationContent7.mmSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmSaleToPOIParameters
 * AcceptorConfigurationContent7.mmSaleToPOIParameters}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfigurationContent7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the acceptor configuration."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
 * AcceptorConfigurationContent6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorConfigurationContent7", propOrder = {"replaceConfiguration", "tMSProtocolParameters", "acquirerProtocolParameters", "merchantParameters", "terminalParameters", "applicationParameters",
		"hostCommunicationParameters", "securityParameters", "saleToPOIParameters"})
public class AcceptorConfigurationContent7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RplcCfgtn")
	protected TrueFalseIndicator replaceConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RplcCfgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplaceConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the whole configuration related to the terminal manager has to be replaced by the configuration included in the message content."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmReplaceConfiguration
	 * AcceptorConfigurationContent6.mmReplaceConfiguration}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReplaceConfiguration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "RplcCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplaceConfiguration";
			definition = "True if the whole configuration related to the terminal manager has to be replaced by the configuration included in the message content.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmReplaceConfiguration;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "TMSPrtcolParams")
	protected List<com.tools20022.repository.msg.TMSProtocolParameters3> tMSProtocolParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSPrtcolParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters of the TMS protocol between a POI and a terminal manager."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmTMSProtocolParameters
	 * AcceptorConfigurationContent6.mmTMSProtocolParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTMSProtocolParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters of the TMS protocol between a POI and a terminal manager.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmTMSProtocolParameters;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
		}
	};
	@XmlElement(name = "AcqrrPrtcolParams")
	protected List<com.tools20022.repository.msg.AcquirerProtocolParameters11> acquirerProtocolParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11
	 * AcquirerProtocolParameters11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmAcquirerProtocolParameters
	 * AcceptorConfigurationContent6.mmAcquirerProtocolParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerProtocolParameters = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "AcqrrPrtcolParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Acceptor parameters dedicated to an acquirer protocol.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmAcquirerProtocolParameters;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters11.mmObject();
		}
	};
	@XmlElement(name = "MrchntParams")
	protected List<com.tools20022.repository.msg.MerchantConfigurationParameters3> merchantParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmMerchantParameters
	 * AcceptorConfigurationContent6.mmMerchantParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "MrchntParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			definition = "Acceptor parameters dedicated to the merchant.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmMerchantParameters;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters3.mmObject();
		}
	};
	@XmlElement(name = "TermnlParams")
	protected List<com.tools20022.repository.msg.PaymentTerminalParameters5> terminalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters5
	 * PaymentTerminalParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmTerminalParameters
	 * AcceptorConfigurationContent6.mmTerminalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminalParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "TermnlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmTerminalParameters;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters5.mmObject();
		}
	};
	@XmlElement(name = "ApplParams")
	protected List<com.tools20022.repository.msg.ApplicationParameters7> applicationParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ApplicationParameters7
	 * ApplicationParameters7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationParameters
	 * AcceptorConfiguration.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmApplicationParameters
	 * AcceptorConfigurationContent6.mmApplicationParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicationParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationParameters;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "ApplParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			definition = "Acceptor parameters dedicated to a payment application of the point of interaction.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmApplicationParameters;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ApplicationParameters7.mmObject();
		}
	};
	@XmlElement(name = "HstComParams")
	protected List<com.tools20022.repository.msg.HostCommunicationParameter5> hostCommunicationParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5
	 * HostCommunicationParameter5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
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
	 * "Acceptor parameters dedicated to the communication with an acquirer host or a terminal manager host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmHostCommunicationParameters
	 * AcceptorConfigurationContent6.mmHostCommunicationParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostCommunicationParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "HstComParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCommunicationParameters";
			definition = "Acceptor parameters dedicated to the communication with an acquirer host or a terminal manager host.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmHostCommunicationParameters;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter5.mmObject();
		}
	};
	@XmlElement(name = "SctyParams")
	protected List<com.tools20022.repository.msg.SecurityParameters11> securityParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters11
	 * SecurityParameters11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmSecurityParameters
	 * AcceptorConfigurationContent6.mmSecurityParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "SctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			definition = "Point of interaction parameters related to the security of software application and application protocol.";
			previousVersion_lazy = () -> AcceptorConfigurationContent6.mmSecurityParameters;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityParameters11.mmObject();
		}
	};
	@XmlElement(name = "SaleToPOIParams")
	protected List<com.tools20022.repository.msg.SaleToPOIProtocolParameter1> saleToPOIParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1
	 * SaleToPOIProtocolParameter1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
	 * AcceptorConfigurationContent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleToPOIParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleToPOIParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters dedicated to protocols between a sale system and the POI."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSaleToPOIParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent7.mmObject();
			isDerived = false;
			xmlTag = "SaleToPOIParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleToPOIParameters";
			definition = "Parameters dedicated to protocols between a sale system and the POI.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent7.mmReplaceConfiguration, com.tools20022.repository.msg.AcceptorConfigurationContent7.mmTMSProtocolParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent7.mmAcquirerProtocolParameters, com.tools20022.repository.msg.AcceptorConfigurationContent7.mmMerchantParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent7.mmTerminalParameters, com.tools20022.repository.msg.AcceptorConfigurationContent7.mmApplicationParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent7.mmHostCommunicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent7.mmSecurityParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent7.mmSaleToPOIParameters);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AcceptorConfigurationContent7";
				definition = "Content of the acceptor configuration.";
				previousVersion_lazy = () -> AcceptorConfigurationContent6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getReplaceConfiguration() {
		return replaceConfiguration == null ? Optional.empty() : Optional.of(replaceConfiguration);
	}

	public AcceptorConfigurationContent7 setReplaceConfiguration(TrueFalseIndicator replaceConfiguration) {
		this.replaceConfiguration = replaceConfiguration;
		return this;
	}

	public List<TMSProtocolParameters3> getTMSProtocolParameters() {
		return tMSProtocolParameters == null ? tMSProtocolParameters = new ArrayList<>() : tMSProtocolParameters;
	}

	public AcceptorConfigurationContent7 setTMSProtocolParameters(List<com.tools20022.repository.msg.TMSProtocolParameters3> tMSProtocolParameters) {
		this.tMSProtocolParameters = Objects.requireNonNull(tMSProtocolParameters);
		return this;
	}

	public List<AcquirerProtocolParameters11> getAcquirerProtocolParameters() {
		return acquirerProtocolParameters == null ? acquirerProtocolParameters = new ArrayList<>() : acquirerProtocolParameters;
	}

	public AcceptorConfigurationContent7 setAcquirerProtocolParameters(List<com.tools20022.repository.msg.AcquirerProtocolParameters11> acquirerProtocolParameters) {
		this.acquirerProtocolParameters = Objects.requireNonNull(acquirerProtocolParameters);
		return this;
	}

	public List<MerchantConfigurationParameters3> getMerchantParameters() {
		return merchantParameters == null ? merchantParameters = new ArrayList<>() : merchantParameters;
	}

	public AcceptorConfigurationContent7 setMerchantParameters(List<com.tools20022.repository.msg.MerchantConfigurationParameters3> merchantParameters) {
		this.merchantParameters = Objects.requireNonNull(merchantParameters);
		return this;
	}

	public List<PaymentTerminalParameters5> getTerminalParameters() {
		return terminalParameters == null ? terminalParameters = new ArrayList<>() : terminalParameters;
	}

	public AcceptorConfigurationContent7 setTerminalParameters(List<com.tools20022.repository.msg.PaymentTerminalParameters5> terminalParameters) {
		this.terminalParameters = Objects.requireNonNull(terminalParameters);
		return this;
	}

	public List<ApplicationParameters7> getApplicationParameters() {
		return applicationParameters == null ? applicationParameters = new ArrayList<>() : applicationParameters;
	}

	public AcceptorConfigurationContent7 setApplicationParameters(List<com.tools20022.repository.msg.ApplicationParameters7> applicationParameters) {
		this.applicationParameters = Objects.requireNonNull(applicationParameters);
		return this;
	}

	public List<HostCommunicationParameter5> getHostCommunicationParameters() {
		return hostCommunicationParameters == null ? hostCommunicationParameters = new ArrayList<>() : hostCommunicationParameters;
	}

	public AcceptorConfigurationContent7 setHostCommunicationParameters(List<com.tools20022.repository.msg.HostCommunicationParameter5> hostCommunicationParameters) {
		this.hostCommunicationParameters = Objects.requireNonNull(hostCommunicationParameters);
		return this;
	}

	public List<SecurityParameters11> getSecurityParameters() {
		return securityParameters == null ? securityParameters = new ArrayList<>() : securityParameters;
	}

	public AcceptorConfigurationContent7 setSecurityParameters(List<com.tools20022.repository.msg.SecurityParameters11> securityParameters) {
		this.securityParameters = Objects.requireNonNull(securityParameters);
		return this;
	}

	public List<SaleToPOIProtocolParameter1> getSaleToPOIParameters() {
		return saleToPOIParameters == null ? saleToPOIParameters = new ArrayList<>() : saleToPOIParameters;
	}

	public AcceptorConfigurationContent7 setSaleToPOIParameters(List<com.tools20022.repository.msg.SaleToPOIProtocolParameter1> saleToPOIParameters) {
		this.saleToPOIParameters = Objects.requireNonNull(saleToPOIParameters);
		return this;
	}
}