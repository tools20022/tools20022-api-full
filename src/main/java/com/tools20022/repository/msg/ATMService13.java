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
import com.tools20022.repository.codeset.ATMServiceType6Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Deposit service provided by the ATM inside the session.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService13#mmServiceReference
 * ATMService13.mmServiceReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService13#mmATMServiceCode
 * ATMService13.mmATMServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService13#mmHostServiceCode
 * ATMService13.mmHostServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService13#mmServiceType
 * ATMService13.mmServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService13#mmServiceVariantIdentification
 * ATMService13.mmServiceVariantIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService13#mmCashBack
 * ATMService13.mmCashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService13#mmMultiAccount
 * ATMService13.mmMultiAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService13#mmPartialDeposit
 * ATMService13.mmPartialDeposit}</li>
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
 * "ATMService13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Deposit service provided by the ATM inside the session."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMService12
 * ATMService12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMService13", propOrder = {"serviceReference", "ATMServiceCode", "hostServiceCode", "serviceType", "serviceVariantIdentification", "cashBack", "multiAccount", "partialDeposit"})
public class ATMService13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text serviceReference;
	/**
	 * Unique identification of the deposit service provided by the ATM inside
	 * the session.
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
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
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
	 * "Unique identification of the deposit service provided by the ATM inside the session."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService12#mmServiceReference
	 * ATMService12.mmServiceReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "SvcRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceReference";
			definition = "Unique identification of the deposit service provided by the ATM inside the session.";
			previousVersion_lazy = () -> ATMService12.mmServiceReference;
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
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService12#mmATMServiceCode
	 * ATMService12.mmATMServiceCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "ATMSvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMServiceCode";
			definition = "Codification of the type of service for the ATM.";
			previousVersion_lazy = () -> ATMService12.mmATMServiceCode;
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
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService12#mmHostServiceCode
	 * ATMService12.mmHostServiceCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "HstSvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostServiceCode";
			definition = "Codification of the type of service for the host.";
			previousVersion_lazy = () -> ATMService12.mmHostServiceCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ATMServiceType6Code serviceType;
	/**
	 * Describes the type of deposit service selected by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType6Code
	 * ATMServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
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
	 * "Describes the type of deposit service selected by the customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService12#mmServiceType
	 * ATMService12.mmServiceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Describes the type of deposit service selected by the customer.";
			previousVersion_lazy = () -> ATMService12.mmServiceType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMServiceType6Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService12#mmServiceVariantIdentification
	 * ATMService12.mmServiceVariantIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceVariantIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "SvcVarntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceVariantIdentification";
			definition = "Identification of the variant of the service.";
			previousVersion_lazy = () -> ATMService12.mmServiceVariantIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TrueFalseIndicator cashBack;
	/**
	 * True if deposit with cash back transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshBck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True if deposit with cash back transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService12#mmCashBack
	 * ATMService12.mmCashBack}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashBack = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "CshBck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			definition = "True if deposit with cash back transaction.";
			previousVersion_lazy = () -> ATMService12.mmCashBack;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator multiAccount;
	/**
	 * True if the deposit transaction is split in multiple accounts.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MultiAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the deposit transaction is split in multiple accounts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService12#mmMultiAccount
	 * ATMService12.mmMultiAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMultiAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "MultiAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiAccount";
			definition = "True if the deposit transaction is split in multiple accounts.";
			previousVersion_lazy = () -> ATMService12.mmMultiAccount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator partialDeposit;
	/**
	 * True if this is not the final deposit.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMService13 ATMService13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True if this is not the final deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialDeposit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService13.mmObject();
			isDerived = false;
			xmlTag = "PrtlDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDeposit";
			definition = "True if this is not the final deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMService13.mmServiceReference, ATMService13.mmATMServiceCode, ATMService13.mmHostServiceCode, ATMService13.mmServiceType, ATMService13.mmServiceVariantIdentification,
						ATMService13.mmCashBack, ATMService13.mmMultiAccount, ATMService13.mmPartialDeposit);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMService13";
				definition = "Deposit service provided by the ATM inside the session.";
				previousVersion_lazy = () -> ATMService12.mmObject();
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
	public ATMServiceType6Code getServiceType() {
		return serviceType;
	}

	public void setServiceType(ATMServiceType6Code serviceType) {
		this.serviceType = serviceType;
	}

	@XmlElement(name = "SvcVarntId")
	public List<Max35Text> getServiceVariantIdentification() {
		return serviceVariantIdentification;
	}

	public void setServiceVariantIdentification(List<Max35Text> serviceVariantIdentification) {
		this.serviceVariantIdentification = serviceVariantIdentification;
	}

	@XmlElement(name = "CshBck")
	public TrueFalseIndicator getCashBack() {
		return cashBack;
	}

	public void setCashBack(TrueFalseIndicator cashBack) {
		this.cashBack = cashBack;
	}

	@XmlElement(name = "MultiAcct")
	public TrueFalseIndicator getMultiAccount() {
		return multiAccount;
	}

	public void setMultiAccount(TrueFalseIndicator multiAccount) {
		this.multiAccount = multiAccount;
	}

	@XmlElement(name = "PrtlDpst")
	public TrueFalseIndicator getPartialDeposit() {
		return partialDeposit;
	}

	public void setPartialDeposit(TrueFalseIndicator partialDeposit) {
		this.partialDeposit = partialDeposit;
	}
}