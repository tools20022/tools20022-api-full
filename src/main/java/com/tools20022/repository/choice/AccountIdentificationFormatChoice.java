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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentification1;
import com.tools20022.repository.msg.AccountIdentification3;
import com.tools20022.repository.msg.AccountIdentificationAndPurpose;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for account identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmSimpleIdentification
 * AccountIdentificationFormatChoice.mmSimpleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmIdentificationAndPurpose
 * AccountIdentificationFormatChoice.mmIdentificationAndPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmIdentificationAsDSS
 * AccountIdentificationFormatChoice.mmIdentificationAsDSS}</li>
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
 * "AccountIdentificationFormatChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for account identification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountIdentificationFormatChoice", propOrder = {"simpleIdentification", "identificationAndPurpose", "identificationAsDSS"})
public class AccountIdentificationFormatChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountIdentification1 simpleIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1
	 * AccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SimpleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSimpleIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentificationFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "SmplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SimpleIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification1.mmObject();
		}
	};
	protected AccountIdentificationAndPurpose identificationAndPurpose;
	/**
	 * Identification of the account expressed with an account number and a
	 * code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose
	 * AccountIdentificationAndPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdAndPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationAndPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account expressed with an account number and a code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentificationAndPurpose = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentificationFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "IdAndPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationAndPurpose";
			definition = "Identification of the account expressed with an account number and a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationAndPurpose.mmObject();
		}
	};
	protected AccountIdentification3 identificationAsDSS;
	/**
	 * Identification of the account expressed with a data source scheme, a code
	 * used within the data source scheme and the account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification3
	 * AccountIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account expressed with a data source scheme, a code used within the data source scheme and the account identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentificationAsDSS = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentificationFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "IdAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationAsDSS";
			definition = "Identification of the account expressed with a data source scheme, a code used within the data source scheme and the account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountIdentificationFormatChoice.mmSimpleIdentification, AccountIdentificationFormatChoice.mmIdentificationAndPurpose, AccountIdentificationFormatChoice.mmIdentificationAsDSS);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentificationFormatChoice";
				definition = "Choice between formats for account identification.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SmplId", required = true)
	public AccountIdentification1 getSimpleIdentification() {
		return simpleIdentification;
	}

	public void setSimpleIdentification(AccountIdentification1 simpleIdentification) {
		this.simpleIdentification = simpleIdentification;
	}

	@XmlElement(name = "IdAndPurp", required = true)
	public AccountIdentificationAndPurpose getIdentificationAndPurpose() {
		return identificationAndPurpose;
	}

	public void setIdentificationAndPurpose(AccountIdentificationAndPurpose identificationAndPurpose) {
		this.identificationAndPurpose = identificationAndPurpose;
	}

	@XmlElement(name = "IdAsDSS", required = true)
	public AccountIdentification3 getIdentificationAsDSS() {
		return identificationAsDSS;
	}

	public void setIdentificationAsDSS(AccountIdentification3 identificationAsDSS) {
		this.identificationAsDSS = identificationAsDSS;
	}
}