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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.BBANIdentifier;
import com.tools20022.repository.datatype.IBANIdentifier;
import com.tools20022.repository.datatype.UPICIdentifier;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SimpleIdentificationInformation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique identifier of an account as assigned by the account servicer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmIBAN
 * AccountIdentification3Choice.mmIBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmBBAN
 * AccountIdentification3Choice.mmBBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmUPIC
 * AccountIdentification3Choice.mmUPIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmProprietaryAccount
 * AccountIdentification3Choice.mmProprietaryAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountIdentification
 * AccountIdentification}</li>
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
 * "AccountIdentification3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique identifier of an account as assigned by the account servicer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountIdentification3Choice", propOrder = {"IBAN", "BBAN", "UPIC", "proprietaryAccount"})
public class AccountIdentification3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected IBANIdentifier iBAN;
	/**
	 * International Bank Account Number (IBAN) - identifier used
	 * internationally by financial institutions to uniquely identify the
	 * account of a customer. Further specifications of the format and content
	 * of the IBAN can be found in the standard ISO 13616
	 * "Banking and related financial services - International Bank Account Number (IBAN)"
	 * version 1997-10-01, or later revisions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IBANIdentifier
	 * IBANIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmIBAN
	 * AccountIdentification.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice
	 * AccountIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIBAN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmIBAN;
			componentContext_lazy = () -> AccountIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "IBAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IBANIdentifier.mmObject();
		}
	};
	protected BBANIdentifier bBAN;
	/**
	 * Basic Bank Account Number (BBAN) - identifier used nationally by
	 * financial institutions, ie, in individual countries, generally as part of
	 * a National Account Numbering Scheme(s), to uniquely identify the account
	 * of a customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BBANIdentifier
	 * BBANIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmBBAN
	 * AccountIdentification.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice
	 * AccountIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBBAN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmBBAN;
			componentContext_lazy = () -> AccountIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "BBAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBAN";
			definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BBANIdentifier.mmObject();
		}
	};
	protected UPICIdentifier uPIC;
	/**
	 * Universal Payment Identification Code (UPIC) - identifier used by the New
	 * York Clearing House to mask confidential data, such as bank accounts and
	 * bank routing numbers. UPIC numbers remain with business customers,
	 * regardless of banking relationship changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UPICIdentifier
	 * UPICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmUPIC
	 * AccountIdentification.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice
	 * AccountIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUPIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmUPIC;
			componentContext_lazy = () -> AccountIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "UPIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UPIC";
			definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UPICIdentifier.mmObject();
		}
	};
	protected SimpleIdentificationInformation2 proprietaryAccount;
	/**
	 * Account number used by financial institutions in individual countries to
	 * identify an account of a customer, but not necessarily the bank and
	 * branch of the financial institution in which the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation2
	 * SimpleIdentificationInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice
	 * AccountIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number used by financial institutions in individual countries to identify an account of a customer, but not necessarily the bank and branch of the financial institution in which the account is held."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmProprietaryIdentification;
			componentContext_lazy = () -> AccountIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryAccount";
			definition = "Account number used by financial institutions in individual countries to identify an account of a customer, but not necessarily the bank and branch of the financial institution in which the account is held.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SimpleIdentificationInformation2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountIdentification3Choice.mmIBAN, AccountIdentification3Choice.mmBBAN, AccountIdentification3Choice.mmUPIC, AccountIdentification3Choice.mmProprietaryAccount);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification3Choice";
				definition = "Unique identifier of an account as assigned by the account servicer.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IBAN", required = true)
	public IBANIdentifier getIBAN() {
		return iBAN;
	}

	public void setIBAN(IBANIdentifier iBAN) {
		this.iBAN = iBAN;
	}

	@XmlElement(name = "BBAN", required = true)
	public BBANIdentifier getBBAN() {
		return bBAN;
	}

	public void setBBAN(BBANIdentifier bBAN) {
		this.bBAN = bBAN;
	}

	@XmlElement(name = "UPIC", required = true)
	public UPICIdentifier getUPIC() {
		return uPIC;
	}

	public void setUPIC(UPICIdentifier uPIC) {
		this.uPIC = uPIC;
	}

	@XmlElement(name = "PrtryAcct", required = true)
	public SimpleIdentificationInformation2 getProprietaryAccount() {
		return proprietaryAccount;
	}

	public void setProprietaryAccount(SimpleIdentificationInformation2 proprietaryAccount) {
		this.proprietaryAccount = proprietaryAccount;
	}
}