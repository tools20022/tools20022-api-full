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
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration parameters to communicate with a sale system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1#mmActionType
 * SaleToPOIProtocolParameter1.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1#mmMerchantIdentification
 * SaleToPOIProtocolParameter1.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1#mmVersion
 * SaleToPOIProtocolParameter1.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1#mmHostIdentification
 * SaleToPOIProtocolParameter1.mmHostIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1#mmMerchantPOIIdentification
 * SaleToPOIProtocolParameter1.mmMerchantPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1#mmSaleIdentification
 * SaleToPOIProtocolParameter1.mmSaleIdentification}</li>
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
 * "SaleToPOIProtocolParameter1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters to communicate with a sale system."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SaleToPOIProtocolParameter1", propOrder = {"actionType", "merchantIdentification", "version", "hostIdentification", "merchantPOIIdentification", "saleIdentification"})
public class SaleToPOIProtocolParameter1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction3Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1
	 * SaleToPOIProtocolParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	@XmlElement(name = "MrchntId")
	protected Organisation26 merchantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation26
	 * Organisation26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1
	 * SaleToPOIProtocolParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the merchant."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchantIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation26.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1
	 * SaleToPOIProtocolParameter1}</li>
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
	 * definition} = "Version of the parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "HstId", required = true)
	protected Max35Text hostIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1
	 * SaleToPOIProtocolParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used to retrieve HostCommunicationParameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmObject();
			isDerived = false;
			xmlTag = "HstId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostIdentification";
			definition = "Identification used to retrieve HostCommunicationParameters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "MrchntPOIId")
	protected Max35Text merchantPOIIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1
	 * SaleToPOIProtocolParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntPOIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantPOIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI during communication with sale system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantPOIIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmObject();
			isDerived = false;
			xmlTag = "MrchntPOIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantPOIIdentification";
			definition = "Identification of the POI during communication with sale system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SaleId")
	protected Max35Text saleIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SaleToPOIProtocolParameter1
	 * SaleToPOIProtocolParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the SaleSystem connected to the POI."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmObject();
			isDerived = false;
			xmlTag = "SaleId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleIdentification";
			definition = "Identification of the SaleSystem connected to the POI.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmActionType, com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmMerchantIdentification,
						com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmVersion, com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmHostIdentification,
						com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmMerchantPOIIdentification, com.tools20022.repository.msg.SaleToPOIProtocolParameter1.mmSaleIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SaleToPOIProtocolParameter1";
				definition = "Configuration parameters to communicate with a sale system.";
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public SaleToPOIProtocolParameter1 setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Optional<Organisation26> getMerchantIdentification() {
		return merchantIdentification == null ? Optional.empty() : Optional.of(merchantIdentification);
	}

	public SaleToPOIProtocolParameter1 setMerchantIdentification(com.tools20022.repository.msg.Organisation26 merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
		return this;
	}

	public Max256Text getVersion() {
		return version;
	}

	public SaleToPOIProtocolParameter1 setVersion(Max256Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public Max35Text getHostIdentification() {
		return hostIdentification;
	}

	public SaleToPOIProtocolParameter1 setHostIdentification(Max35Text hostIdentification) {
		this.hostIdentification = Objects.requireNonNull(hostIdentification);
		return this;
	}

	public Optional<Max35Text> getMerchantPOIIdentification() {
		return merchantPOIIdentification == null ? Optional.empty() : Optional.of(merchantPOIIdentification);
	}

	public SaleToPOIProtocolParameter1 setMerchantPOIIdentification(Max35Text merchantPOIIdentification) {
		this.merchantPOIIdentification = merchantPOIIdentification;
		return this;
	}

	public Optional<Max35Text> getSaleIdentification() {
		return saleIdentification == null ? Optional.empty() : Optional.of(saleIdentification);
	}

	public SaleToPOIProtocolParameter1 setSaleIdentification(Max35Text saleIdentification) {
		this.saleIdentification = saleIdentification;
		return this;
	}
}