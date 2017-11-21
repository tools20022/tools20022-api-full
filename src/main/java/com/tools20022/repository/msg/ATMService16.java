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
import com.tools20022.repository.codeset.ATMServiceType3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Service provided by the ATM inside the session.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService16#mmServiceReference
 * ATMService16.mmServiceReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService16#mmATMServiceCode
 * ATMService16.mmATMServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService16#mmHostServiceCode
 * ATMService16.mmHostServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService16#mmServiceType
 * ATMService16.mmServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService16#mmServiceVariantIdentification
 * ATMService16.mmServiceVariantIdentification}</li>
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
 * "ATMService16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Service provided by the ATM inside the session."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService18 ATMService18}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMService16", propOrder = {"serviceReference", "ATMServiceCode", "hostServiceCode", "serviceType", "serviceVariantIdentification"})
public class ATMService16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text serviceReference;
	/**
	 * Unique identification of the withdrawal service provided by the ATM
	 * inside the session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the withdrawal service provided by the ATM inside the session."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService18#mmIdentification
	 * ATMService18.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService16.mmObject();
			isDerived = false;
			xmlTag = "SvcRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceReference";
			definition = "Unique identification of the withdrawal service provided by the ATM inside the session.";
			nextVersions_lazy = () -> Arrays.asList(ATMService18.mmIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text aTMServiceCode;
	/**
	 * Codification of the type of service for the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMSvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification of the type of service for the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMService18#mmLabel
	 * ATMService18.mmLabel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService16.mmObject();
			isDerived = false;
			xmlTag = "ATMSvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMServiceCode";
			definition = "Codification of the type of service for the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMService18.mmLabel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text hostServiceCode;
	/**
	 * Codification of the type of service for the host.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstSvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification of the type of service for the host."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService16.mmObject();
			isDerived = false;
			xmlTag = "HstSvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostServiceCode";
			definition = "Codification of the type of service for the host.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ATMServiceType3Code serviceType;
	/**
	 * Describes the type of withdrawal selected by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of withdrawal selected by the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService16.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Describes the type of withdrawal selected by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMServiceType3Code.mmObject();
		}
	};
	protected List<Max35Text> serviceVariantIdentification;
	/**
	 * Identification of the variant of the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcVarntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceVariantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the variant of the service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceVariantIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService16.mmObject();
			isDerived = false;
			xmlTag = "SvcVarntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceVariantIdentification";
			definition = "Identification of the variant of the service.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMService16.mmServiceReference, ATMService16.mmATMServiceCode, ATMService16.mmHostServiceCode, ATMService16.mmServiceType, ATMService16.mmServiceVariantIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMService16";
				definition = "Service provided by the ATM inside the session.";
				nextVersions_lazy = () -> Arrays.asList(ATMService18.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SvcRef")
	public Max35Text getServiceReference() {
		return serviceReference;
	}

	public void setServiceReference(Max35Text serviceReference) {
		this.serviceReference = serviceReference;
	}

	@XmlElement(name = "ATMSvcCd")
	public Max35Text getATMServiceCode() {
		return aTMServiceCode;
	}

	public void setATMServiceCode(Max35Text aTMServiceCode) {
		this.aTMServiceCode = aTMServiceCode;
	}

	@XmlElement(name = "HstSvcCd")
	public Max35Text getHostServiceCode() {
		return hostServiceCode;
	}

	public void setHostServiceCode(Max35Text hostServiceCode) {
		this.hostServiceCode = hostServiceCode;
	}

	@XmlElement(name = "SvcTp", required = true)
	public ATMServiceType3Code getServiceType() {
		return serviceType;
	}

	public void setServiceType(ATMServiceType3Code serviceType) {
		this.serviceType = serviceType;
	}

	@XmlElement(name = "SvcVarntId")
	public List<Max35Text> getServiceVariantIdentification() {
		return serviceVariantIdentification;
	}

	public void setServiceVariantIdentification(List<Max35Text> serviceVariantIdentification) {
		this.serviceVariantIdentification = serviceVariantIdentification;
	}
}